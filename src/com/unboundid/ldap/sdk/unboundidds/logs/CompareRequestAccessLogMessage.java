/*
 * Copyright 2009-2017 UnboundID Corp.
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



import com.unboundid.util.NotExtensible;
import com.unboundid.util.NotMutable;
import com.unboundid.util.ThreadSafety;
import com.unboundid.util.ThreadSafetyLevel;



/**
 * This class provides a data structure that holds information about a log
 * message that may appear in the Directory Server access log about a compare
 * request received from a client.
 * <BR>
 * <BLOCKQUOTE>
 *   <B>NOTE:</B>  This class is part of the Commercial Edition of the UnboundID
 *   LDAP SDK for Java.  It is not available for use in applications that
 *   include only the Standard Edition of the LDAP SDK, and is not supported for
 *   use in conjunction with non-UnboundID products.
 * </BLOCKQUOTE>
 */
@NotExtensible()
@NotMutable()
@ThreadSafety(level=ThreadSafetyLevel.COMPLETELY_THREADSAFE)
public class CompareRequestAccessLogMessage
       extends OperationRequestAccessLogMessage
{
  /**
   * The serial version UID for this serializable class.
   */
  private static final long serialVersionUID = 5478010218343234128L;



  // The name of the attribute for which the compare is to be performed.
  private final String attributeName;

  // The DN of the entry for which the compare is to be performed.
  private final String dn;



  /**
   * Creates a new compare request access log message from the provided message
   * string.
   *
   * @param  s  The string to be parsed as a compare request access log message.
   *
   * @throws  LogException  If the provided string cannot be parsed as a valid
   *                        log message.
   */
  public CompareRequestAccessLogMessage(final String s)
         throws LogException
  {
    this(new LogMessage(s));
  }



  /**
   * Creates a new compare request access log message from the provided log
   * message.
   *
   * @param  m  The log message to be parsed as a compare request access log
   *            message.
   */
  public CompareRequestAccessLogMessage(final LogMessage m)
  {
    super(m);

    dn            = getNamedValue("dn");
    attributeName = getNamedValue("attr");
  }



  /**
   * Retrieves the DN of the entry for which the compare is to be performed.
   *
   * @return  The DN of the entry for which the compare is to be performed, or
   *          {@code null} if it is not included in the log message.
   */
  public final String getDN()
  {
    return dn;
  }



  /**
   * Retrieves the name of the attribute for which the compare is to be
   * performed.
   *
   * @return  The name of the attribute for which the compare is to be
   *          performed, or {@code null} if it is not included in the log
   *          message.
   */
  public final String getAttributeName()
  {
    return attributeName;
  }



  /**
   * {@inheritDoc}
   */
  @Override()
  public final AccessLogOperationType getOperationType()
  {
    return AccessLogOperationType.COMPARE;
  }
}
