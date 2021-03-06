/*
 * Copyright 2016-2017 UnboundID Corp.
 * All Rights Reserved.
 */
/*
 * Copyright (C) 2016-2017 UnboundID Corp.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (GPLv2 only)
 * or the terms of the GNU Lesser General Public License (LGPLv2.1 only)
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 */
package com.unboundid.ldap.sdk.experimental;



import com.unboundid.ldap.sdk.Entry;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.OperationType;
import com.unboundid.ldap.sdk.ResultCode;
import com.unboundid.util.Debug;
import com.unboundid.util.NotMutable;
import com.unboundid.util.StaticUtils;
import com.unboundid.util.ThreadSafety;
import com.unboundid.util.ThreadSafetyLevel;

import static com.unboundid.ldap.sdk.experimental.ExperimentalMessages.*;



/**
 * This class represents an entry that holds information about a bind operation
 * processed by an LDAP server, as per the specification described in
 * draft-chu-ldap-logschema-00.
 */
@NotMutable()
@ThreadSafety(level=ThreadSafetyLevel.COMPLETELY_THREADSAFE)
public final class DraftChuLDAPLogSchema00BindEntry
       extends DraftChuLDAPLogSchema00Entry
{
  /**
   * The name of the attribute used to hold the bind request method.
   */
  public static final String ATTR_BIND_METHOD = "reqMethod";



  /**
   * The name of the attribute used to hold the LDAP protocol version specified
   * in the bind request.
   */
  public static final String ATTR_PROTOCOL_VERSION = "reqVersion";



  /**
   * The serial version UID for this serializable class.
   */
  private static final long serialVersionUID = 864660009992589945L;



  // The LDAP protocol version from the bind request.
  private final int protocolVersion;

  // The base name of the bind request method.
  private final String bindMethod;

  // The name of the SASL mechanism, if available.
  private final String saslMechanism;



  /**
   * Creates a new instance of this bind access log entry from the provided
   * entry.
   *
   * @param  entry  The entry used to create this bind access log entry.
   *
   * @throws  LDAPException  If the provided entry cannot be decoded as a valid
   *                         bind access log entry as per the specification
   *                         contained in draft-chu-ldap-logschema-00.
   */
  public DraftChuLDAPLogSchema00BindEntry(final Entry entry)
         throws LDAPException
  {
    super(entry, OperationType.BIND);


    // Get the protocol version.
    final String versionString = entry.getAttributeValue(ATTR_PROTOCOL_VERSION);
    if (versionString == null)
    {
      throw new LDAPException(ResultCode.DECODING_ERROR,
           ERR_LOGSCHEMA_DECODE_MISSING_REQUIRED_ATTR.get(entry.getDN(),
                ATTR_PROTOCOL_VERSION));
    }
    else
    {
      try
      {
        protocolVersion = Integer.parseInt(versionString);
      }
      catch (final Exception e)
      {
        Debug.debugException(e);
        throw new LDAPException(ResultCode.DECODING_ERROR,
             ERR_LOGSCHEMA_DECODE_BIND_VERSION_ERROR.get(entry.getDN(),
                  ATTR_PROTOCOL_VERSION, versionString),
             e);
      }
    }


    // Get the bind method.  If it starts with "SASL/", then separate out the
    // SASL mechanism name.
    final String rawMethod = entry.getAttributeValue(ATTR_BIND_METHOD);
    if (rawMethod == null)
    {
      throw new LDAPException(ResultCode.DECODING_ERROR,
           ERR_LOGSCHEMA_DECODE_MISSING_REQUIRED_ATTR.get(entry.getDN(),
                ATTR_BIND_METHOD));
    }

    final String lowerMethod = StaticUtils.toLowerCase(rawMethod);
    if (lowerMethod.equals("simple"))
    {
      bindMethod = "SIMPLE";
      saslMechanism = null;
    }
    else if (lowerMethod.startsWith("sasl/"))
    {
      bindMethod = "SASL";
      saslMechanism = rawMethod.substring(5);
    }
    else
    {
      bindMethod = rawMethod;
      saslMechanism = null;
    }
  }



  /**
   * Retrieves the LDAP protocol version for the bind request described by this
   * bind access log entry.
   *
   * @return  The LDAP protocol version for the bind request described by this
   *          bind access log entry.
   */
  public int getProtocolVersion()
  {
    return protocolVersion;
  }



  /**
   * Retrieves the name of the bind method for the bind request described by
   * this bind access log entry.  It is expected to be one of "SIMPLE" or
   * "SASL".
   *
   * @return  The name of the bind method for the bind request described by this
   *          bind access log entry.
   */
  public String getBindMethod()
  {
    return bindMethod;
  }



  /**
   * Retrieves the name of the SASL mechanism name for the bind request
   * described by this bind access log entry, if appropriate.
   *
   * @return  The name of the SASL mechanism for the bind request described by
   *          this bind access log entry, or {@code null} if the bind method is
   *          not "SASL".
   */
  public String getSASLMechanism()
  {
    return saslMechanism;
  }
}
