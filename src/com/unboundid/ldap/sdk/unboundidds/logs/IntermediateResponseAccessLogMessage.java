/*
 * Copyright 2010-2017 UnboundID Corp.
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
package com.unboundid.ldap.sdk.unboundidds.logs;



import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import com.unboundid.util.NotMutable;
import com.unboundid.util.ThreadSafety;
import com.unboundid.util.ThreadSafetyLevel;



/**
 * This class provides a data structure that holds information about a log
 * message that may appear in the Directory Server access log about an
 * intermediate response returned to a client.
 * <BR>
 * <BLOCKQUOTE>
 *   <B>NOTE:</B>  This class is part of the Commercial Edition of the UnboundID
 *   LDAP SDK for Java.  It is not available for use in applications that
 *   include only the Standard Edition of the LDAP SDK, and is not supported for
 *   use in conjunction with non-UnboundID products.
 * </BLOCKQUOTE>
 */
@NotMutable()
@ThreadSafety(level=ThreadSafetyLevel.COMPLETELY_THREADSAFE)
public final class IntermediateResponseAccessLogMessage
       extends OperationRequestAccessLogMessage
{
  /**
   * The serial version UID for this serializable class.
   */
  private static final long serialVersionUID = 4480365381503945078L;



  // The operation type for this access log message.
  private final AccessLogOperationType operationType;

  // The list of response control OIDs for the operation.
  private final List<String> responseControlOIDs;

  // A human-readable version of the intermediate response name.
  private final String name;

  // The OID of the intermediate response.
  private final String oid;

  // A human-readable version of the intermediate response value.
  private final String value;



  /**
   * Creates a new intermediate response access log message from the provided
   * message string.
   *
   * @param  s  The string to be parsed as an intermediate response access log
   *            message.
   *
   * @throws  LogException  If the provided string cannot be parsed as a valid
   *                        log message.
   */
  public IntermediateResponseAccessLogMessage(final String s)
         throws LogException
  {
    this(new LogMessage(s));
  }



  /**
   * Creates a new intermediate response access log message from the provided
   * log message.
   *
   * @param  m  The log message to be parsed as an intermediate response access
   *            log message.
   */
  public IntermediateResponseAccessLogMessage(final LogMessage m)
  {
    super(m);

    oid   = getNamedValue("oid");
    name  = getNamedValue("name");
    value = getNamedValue("value");

    final String controlStr = getNamedValue("responseControls");
    if (controlStr == null)
    {
      responseControlOIDs = Collections.emptyList();
    }
    else
    {
      final LinkedList<String> controlList = new LinkedList<String>();
      final StringTokenizer t = new StringTokenizer(controlStr, ",");
      while (t.hasMoreTokens())
      {
        controlList.add(t.nextToken());
      }
      responseControlOIDs = Collections.unmodifiableList(controlList);
    }

    if (m.hasUnnamedValue(AccessLogOperationType.ADD.getLogIdentifier()))
    {
      operationType = AccessLogOperationType.ADD;
    }
    else if (m.hasUnnamedValue(AccessLogOperationType.BIND.getLogIdentifier()))
    {
      operationType = AccessLogOperationType.BIND;
    }
    else if (m.hasUnnamedValue(AccessLogOperationType.
         COMPARE.getLogIdentifier()))
    {
      operationType = AccessLogOperationType.COMPARE;
    }
    else if (m.hasUnnamedValue(AccessLogOperationType.
         DELETE.getLogIdentifier()))
    {
      operationType = AccessLogOperationType.DELETE;
    }
    else if (m.hasUnnamedValue(AccessLogOperationType.
         EXTENDED.getLogIdentifier()))
    {
      operationType = AccessLogOperationType.EXTENDED;
    }
    else if (m.hasUnnamedValue(AccessLogOperationType.
         MODIFY.getLogIdentifier()))
    {
      operationType = AccessLogOperationType.MODIFY;
    }
    else if (m.hasUnnamedValue(AccessLogOperationType.MODDN.getLogIdentifier()))
    {
      operationType = AccessLogOperationType.MODDN;
    }
    else if (m.hasUnnamedValue(
         AccessLogOperationType.SEARCH.getLogIdentifier()))
    {
      operationType = AccessLogOperationType.SEARCH;
    }
    else
    {
      // This shouldn't happen, but we'll assume it's extended.
      operationType = AccessLogOperationType.EXTENDED;
    }
  }



  /**
   * Retrieves the OID of the intermediate response.
   *
   * @return  The OID of the intermediate response, or {@code null} if it is
   *          not included in the log message.
   */
  public String getOID()
  {
    return oid;
  }



  /**
   * Retrieves a human-readable name for the intermediate response.
   *
   * @return  A human-readable name for the intermediate response, or
   *          {@code null} if it is not included in the log message.
   */
  public String getIntermediateResponseName()
  {
    return name;
  }



  /**
   * Retrieves a human-readable representation of the intermediate response
   * value.
   *
   * @return  A human-readable representation of the intermediate response
   *          value, or {@code null} if it is not included in the log message.
   */
  public String getValueString()
  {
    return value;
  }



  /**
   * Retrieves the OIDs of any response controls contained in the log message.
   *
   * @return  The OIDs of any response controls contained in the log message, or
   *          an empty list if it is not included in the log message.
   */
  public List<String> getResponseControlOIDs()
  {
    return responseControlOIDs;
  }



  /**
   * {@inheritDoc}
   */
  @Override()
  public AccessLogMessageType getMessageType()
  {
    return AccessLogMessageType.INTERMEDIATE_RESPONSE;
  }



  /**
   * {@inheritDoc}
   */
  @Override()
  public AccessLogOperationType getOperationType()
  {
    return operationType;
  }
}
