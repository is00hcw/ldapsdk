/*
 * Copyright 2008-2017 UnboundID Corp.
 * All Rights Reserved.
 */
/*
 * Copyright (C) 2015-2017 UnboundID Corp.
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
package com.unboundid.ldap.sdk.unboundidds.controls;



import com.unboundid.asn1.ASN1OctetString;
import com.unboundid.ldap.sdk.Control;
import com.unboundid.ldap.sdk.DecodeableControl;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.LDAPResult;
import com.unboundid.ldap.sdk.ResultCode;
import com.unboundid.ldap.sdk.SearchResultEntry;
import com.unboundid.ldap.sdk.SearchResultReference;
import com.unboundid.util.NotMutable;
import com.unboundid.util.ThreadSafety;
import com.unboundid.util.ThreadSafetyLevel;
import com.unboundid.util.Validator;

import static com.unboundid.ldap.sdk.unboundidds.controls.ControlMessages.*;



/**
 * This class provides a response control that may be used to provide the server
 * ID of the Directory Server instance that processed the associated request.
 * For search operations, each entry and reference returned will include the
 * server ID of the server that provided that entry or reference.  For all other
 * types of operations, it will be in the {@code LDAPResult} (or appropriate
 * subclass) returned for that operation.
 * <BR>
 * <BLOCKQUOTE>
 *   <B>NOTE:</B>  This class is part of the Commercial Edition of the UnboundID
 *   LDAP SDK for Java.  It is not available for use in applications that
 *   include only the Standard Edition of the LDAP SDK, and is not supported for
 *   use in conjunction with non-UnboundID products.
 * </BLOCKQUOTE>
 * <BR>
 * This control must have a value, which will simply be the string
 * representation of the server ID of the associated server.  The criticality
 * should be {@code false}.
 */
@NotMutable()
@ThreadSafety(level=ThreadSafetyLevel.COMPLETELY_THREADSAFE)
public final class GetServerIDResponseControl
       extends Control
       implements DecodeableControl
{
  /**
   * The OID (1.3.6.1.4.1.30221.2.5.15) for the get server ID response control.
   */
  public static final String GET_SERVER_ID_RESPONSE_OID =
       "1.3.6.1.4.1.30221.2.5.15";


  /**
   * The serial version UID for this serializable class.
   */
  private static final long serialVersionUID = 5271084342514677677L;



  // The server ID of the server that processed the associated request.
  private final String serverID;



  /**
   * Creates a new empty control instance that is intended to be used only for
   * decoding controls via the {@code DecodeableControl} interface.
   */
  GetServerIDResponseControl()
  {
    serverID = null;
  }



  /**
   * Creates a new get server ID response control with the provided server ID.
   *
   * @param  serverID  The server ID of the server that processed the associated
   *                   request.  It must not be {@code null}.
   */
  public GetServerIDResponseControl(final String serverID)
  {
    super(GET_SERVER_ID_RESPONSE_OID, false, new ASN1OctetString(serverID));

    Validator.ensureNotNull(serverID);

    this.serverID = serverID;
  }



  /**
   * Creates a new get server ID response control decoded from the given generic
   * control contents.
   *
   * @param  oid         The OID for the control.
   * @param  isCritical  Indicates whether this control should be marked
   *                     critical.
   * @param  value       The value for the control.  It may be {@code null} if
   *                     the control to decode does not have a value.
   *
   * @throws  LDAPException  If a problem occurs while attempting to decode the
   *                         generic control as a get server ID response
   *                         control.
   */
  public GetServerIDResponseControl(final String oid, final boolean isCritical,
                                    final ASN1OctetString value)
         throws LDAPException
  {
    super(oid, isCritical, value);

    if (value == null)
    {
      throw new LDAPException(ResultCode.DECODING_ERROR,
           ERR_GET_SERVER_ID_RESPONSE_MISSING_VALUE.get());
    }

    serverID = value.stringValue();
  }



  /**
   * {@inheritDoc}
   */
  public GetServerIDResponseControl decodeControl(final String oid,
                                                  final boolean isCritical,
                                                  final ASN1OctetString value)
         throws LDAPException
  {
    return new GetServerIDResponseControl(oid, isCritical, value);
  }



  /**
   * Extracts a get server ID response control from the provided result.
   *
   * @param  result  The result from which to retrieve the get server ID
   *                 response control.
   *
   * @return  The get server ID response control contained in the provided
   *          result, or {@code null} if the result did not contain a get server
   *          ID response control.
   *
   * @throws  LDAPException  If a problem is encountered while attempting to
   *                         decode the get server ID response control contained
   *                         in the provided result.
   */
  public static GetServerIDResponseControl get(final LDAPResult result)
         throws LDAPException
  {
    final Control c = result.getResponseControl(GET_SERVER_ID_RESPONSE_OID);
    if (c == null)
    {
      return null;
    }

    if (c instanceof GetServerIDResponseControl)
    {
      return (GetServerIDResponseControl) c;
    }
    else
    {
      return new GetServerIDResponseControl(c.getOID(), c.isCritical(),
           c.getValue());
    }
  }



  /**
   * Extracts a get server ID response control from the provided search result
   * entry.
   *
   * @param  entry  The search result entry from which to retrieve the get
   *                server ID response control.
   *
   * @return  The get server ID response control contained in the provided
   *          search result entry, or {@code null} if the entry did not contain
   *          a get server ID response control.
   *
   * @throws  LDAPException  If a problem is encountered while attempting to
   *                         decode the get server ID response control contained
   *                         in the provided entry.
   */
  public static GetServerIDResponseControl get(final SearchResultEntry entry)
         throws LDAPException
  {
    final Control c = entry.getControl(GET_SERVER_ID_RESPONSE_OID);
    if (c == null)
    {
      return null;
    }

    if (c instanceof GetServerIDResponseControl)
    {
      return (GetServerIDResponseControl) c;
    }
    else
    {
      return new GetServerIDResponseControl(c.getOID(), c.isCritical(),
           c.getValue());
    }
  }



  /**
   * Extracts a get server ID response control from the provided search result
   * reference.
   *
   * @param  ref  The search result reference from which to retrieve the get
   *              server ID response control.
   *
   * @return  The get server ID response control contained in the provided
   *          search result reference, or {@code null} if the reference did not
   *          contain a get server ID response control.
   *
   * @throws  LDAPException  If a problem is encountered while attempting to
   *                         decode the get server ID response control contained
   *                         in the provided reference.
   */
  public static GetServerIDResponseControl get(final SearchResultReference ref)
         throws LDAPException
  {
    final Control c = ref.getControl(GET_SERVER_ID_RESPONSE_OID);
    if (c == null)
    {
      return null;
    }

    if (c instanceof GetServerIDResponseControl)
    {
      return (GetServerIDResponseControl) c;
    }
    else
    {
      return new GetServerIDResponseControl(c.getOID(), c.isCritical(),
           c.getValue());
    }
  }



  /**
   * Retrieves the server ID of the server that actually processed the
   * associated request.
   *
   * @return  The server ID of the server that actually processed the associated
   *          request.
   */
  public String getServerID()
  {
    return serverID;
  }



  /**
   * {@inheritDoc}
   */
  @Override()
  public String getControlName()
  {
    return INFO_CONTROL_NAME_GET_SERVER_ID_RESPONSE.get();
  }



  /**
   * {@inheritDoc}
   */
  @Override()
  public void toString(final StringBuilder buffer)
  {
    buffer.append("GetServerIDResponseControl(serverID='");
    buffer.append(serverID);
    buffer.append("')");
  }
}
