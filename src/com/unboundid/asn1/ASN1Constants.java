/*
 * Copyright 2007-2017 UnboundID Corp.
 * All Rights Reserved.
 */
/*
 * Copyright (C) 2008-2017 UnboundID Corp.
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
package com.unboundid.asn1;



import com.unboundid.util.InternalUseOnly;
import com.unboundid.util.ThreadSafety;
import com.unboundid.util.ThreadSafetyLevel;



/**
 * This class defines a number of constants that are used in the course of
 * processing ASN.1 BER elements.  It is intended for internal use only and
 * should not be referenced by classes outside of the LDAP SDK.
 */
@InternalUseOnly()
@ThreadSafety(level=ThreadSafetyLevel.COMPLETELY_THREADSAFE)
public final class ASN1Constants
{
  /**
   * Prevent this class from being instantiated.
   */
  private ASN1Constants()
  {
    // No implementation is required.
  }



  /**
   * A pre-allocated array of zero elements, which can be used for sequence or
   * set elements that do not encapsulate any other elements.
   */
  static final ASN1Element[] NO_ELEMENTS = new ASN1Element[0];



  /**
   * A byte array that should be used as the default value for an ASN.1 Boolean
   * element with a boolean value of "FALSE".
   */
  static final byte[] BOOLEAN_VALUE_FALSE = { (byte) 0x00 };



  /**
   * A byte array that should be used as the default value for an ASN.1 Boolean
   * element with a boolean value of "TRUE".
   */
  static final byte[] BOOLEAN_VALUE_TRUE = { (byte) 0xFF };



  /**
   * The pre-encoded length array to use for a length of 0 bytes.
   */
  static final byte[] LENGTH_0 = { 0 };



  /**
   * The pre-encoded length array to use for a length of 1 byte.
   */
  static final byte[] LENGTH_1 = { 1 };



  /**
   * The pre-encoded length array to use for a length of 2 bytes.
   */
  static final byte[] LENGTH_2 = { 2 };



  /**
   * The pre-encoded length array to use for a length of 3 bytes.
   */
  static final byte[] LENGTH_3 = { 3 };



  /**
   * The pre-encoded length array to use for a length of 4 bytes.
   */
  static final byte[] LENGTH_4 = { 4 };



  /**
   * The pre-encoded length array to use for a length of 5 bytes.
   */
  static final byte[] LENGTH_5 = { 5 };



  /**
   * The pre-encoded length array to use for a length of 6 bytes.
   */
  static final byte[] LENGTH_6 = { 6 };



  /**
   * The pre-encoded length array to use for a length of 7 bytes.
   */
  static final byte[] LENGTH_7 = { 7 };



  /**
   * The pre-encoded length array to use for a length of 8 bytes.
   */
  static final byte[] LENGTH_8 = { 8 };



  /**
   * The pre-encoded length array to use for a length of 9 bytes.
   */
  static final byte[] LENGTH_9 = { 9 };



  /**
   * The pre-encoded length array to use for a length of 10 bytes.
   */
  static final byte[] LENGTH_10 = { 10 };



  /**
   * The pre-encoded length array to use for a length of 11 bytes.
   */
  static final byte[] LENGTH_11 = { 11 };



  /**
   * The pre-encoded length array to use for a length of 12 bytes.
   */
  static final byte[] LENGTH_12 = { 12 };



  /**
   * The pre-encoded length array to use for a length of 13 bytes.
   */
  static final byte[] LENGTH_13 = { 13 };



  /**
   * The pre-encoded length array to use for a length of 14 bytes.
   */
  static final byte[] LENGTH_14 = { 14 };



  /**
   * The pre-encoded length array to use for a length of 15 bytes.
   */
  static final byte[] LENGTH_15 = { 15 };



  /**
   * The pre-encoded length array to use for a length of 16 bytes.
   */
  static final byte[] LENGTH_16 = { 16 };



  /**
   * The pre-encoded length array to use for a length of 17 bytes.
   */
  static final byte[] LENGTH_17 = { 17 };



  /**
   * The pre-encoded length array to use for a length of 18 bytes.
   */
  static final byte[] LENGTH_18 = { 18 };



  /**
   * The pre-encoded length array to use for a length of 19 bytes.
   */
  static final byte[] LENGTH_19 = { 19 };



  /**
   * The pre-encoded length array to use for a length of 20 bytes.
   */
  static final byte[] LENGTH_20 = { 20 };



  /**
   * The pre-encoded length array to use for a length of 21 bytes.
   */
  static final byte[] LENGTH_21 = { 21 };



  /**
   * The pre-encoded length array to use for a length of 22 bytes.
   */
  static final byte[] LENGTH_22 = { 22 };



  /**
   * The pre-encoded length array to use for a length of 23 bytes.
   */
  static final byte[] LENGTH_23 = { 23 };



  /**
   * The pre-encoded length array to use for a length of 24 bytes.
   */
  static final byte[] LENGTH_24 = { 24 };



  /**
   * The pre-encoded length array to use for a length of 25 bytes.
   */
  static final byte[] LENGTH_25 = { 25 };



  /**
   * The pre-encoded length array to use for a length of 26 bytes.
   */
  static final byte[] LENGTH_26 = { 26 };



  /**
   * The pre-encoded length array to use for a length of 27 bytes.
   */
  static final byte[] LENGTH_27 = { 27 };



  /**
   * The pre-encoded length array to use for a length of 28 bytes.
   */
  static final byte[] LENGTH_28 = { 28 };



  /**
   * The pre-encoded length array to use for a length of 29 bytes.
   */
  static final byte[] LENGTH_29 = { 29 };



  /**
   * The pre-encoded length array to use for a length of 30 bytes.
   */
  static final byte[] LENGTH_30 = { 30 };



  /**
   * The pre-encoded length array to use for a length of 31 bytes.
   */
  static final byte[] LENGTH_31 = { 31 };



  /**
   * The pre-encoded length array to use for a length of 32 bytes.
   */
  static final byte[] LENGTH_32 = { 32 };



  /**
   * The pre-encoded length array to use for a length of 33 bytes.
   */
  static final byte[] LENGTH_33 = { 33 };



  /**
   * The pre-encoded length array to use for a length of 34 bytes.
   */
  static final byte[] LENGTH_34 = { 34 };



  /**
   * The pre-encoded length array to use for a length of 35 bytes.
   */
  static final byte[] LENGTH_35 = { 35 };



  /**
   * The pre-encoded length array to use for a length of 36 bytes.
   */
  static final byte[] LENGTH_36 = { 36 };



  /**
   * The pre-encoded length array to use for a length of 37 bytes.
   */
  static final byte[] LENGTH_37 = { 37 };



  /**
   * The pre-encoded length array to use for a length of 38 bytes.
   */
  static final byte[] LENGTH_38 = { 38 };



  /**
   * The pre-encoded length array to use for a length of 39 bytes.
   */
  static final byte[] LENGTH_39 = { 39 };



  /**
   * The pre-encoded length array to use for a length of 40 bytes.
   */
  static final byte[] LENGTH_40 = { 40 };



  /**
   * The pre-encoded length array to use for a length of 41 bytes.
   */
  static final byte[] LENGTH_41 = { 41 };



  /**
   * The pre-encoded length array to use for a length of 42 bytes.
   */
  static final byte[] LENGTH_42 = { 42 };



  /**
   * The pre-encoded length array to use for a length of 43 bytes.
   */
  static final byte[] LENGTH_43 = { 43 };



  /**
   * The pre-encoded length array to use for a length of 44 bytes.
   */
  static final byte[] LENGTH_44 = { 44 };



  /**
   * The pre-encoded length array to use for a length of 45 bytes.
   */
  static final byte[] LENGTH_45 = { 45 };



  /**
   * The pre-encoded length array to use for a length of 46 bytes.
   */
  static final byte[] LENGTH_46 = { 46 };



  /**
   * The pre-encoded length array to use for a length of 47 bytes.
   */
  static final byte[] LENGTH_47 = { 47 };



  /**
   * The pre-encoded length array to use for a length of 48 bytes.
   */
  static final byte[] LENGTH_48 = { 48 };



  /**
   * The pre-encoded length array to use for a length of 49 bytes.
   */
  static final byte[] LENGTH_49 = { 49 };



  /**
   * The pre-encoded length array to use for a length of 50 bytes.
   */
  static final byte[] LENGTH_50 = { 50 };



  /**
   * The pre-encoded length array to use for a length of 51 bytes.
   */
  static final byte[] LENGTH_51 = { 51 };



  /**
   * The pre-encoded length array to use for a length of 52 bytes.
   */
  static final byte[] LENGTH_52 = { 52 };



  /**
   * The pre-encoded length array to use for a length of 53 bytes.
   */
  static final byte[] LENGTH_53 = { 53 };



  /**
   * The pre-encoded length array to use for a length of 54 bytes.
   */
  static final byte[] LENGTH_54 = { 54 };



  /**
   * The pre-encoded length array to use for a length of 55 bytes.
   */
  static final byte[] LENGTH_55 = { 55 };



  /**
   * The pre-encoded length array to use for a length of 56 bytes.
   */
  static final byte[] LENGTH_56 = { 56 };



  /**
   * The pre-encoded length array to use for a length of 57 bytes.
   */
  static final byte[] LENGTH_57 = { 57 };



  /**
   * The pre-encoded length array to use for a length of 58 bytes.
   */
  static final byte[] LENGTH_58 = { 58 };



  /**
   * The pre-encoded length array to use for a length of 59 bytes.
   */
  static final byte[] LENGTH_59 = { 59 };



  /**
   * The pre-encoded length array to use for a length of 60 bytes.
   */
  static final byte[] LENGTH_60 = { 60 };



  /**
   * The pre-encoded length array to use for a length of 61 bytes.
   */
  static final byte[] LENGTH_61 = { 61 };



  /**
   * The pre-encoded length array to use for a length of 62 bytes.
   */
  static final byte[] LENGTH_62 = { 62 };



  /**
   * The pre-encoded length array to use for a length of 63 bytes.
   */
  static final byte[] LENGTH_63 = { 63 };



  /**
   * The pre-encoded length array to use for a length of 64 bytes.
   */
  static final byte[] LENGTH_64 = { 64 };



  /**
   * The pre-encoded length array to use for a length of 65 bytes.
   */
  static final byte[] LENGTH_65 = { 65 };



  /**
   * The pre-encoded length array to use for a length of 66 bytes.
   */
  static final byte[] LENGTH_66 = { 66 };



  /**
   * The pre-encoded length array to use for a length of 67 bytes.
   */
  static final byte[] LENGTH_67 = { 67 };



  /**
   * The pre-encoded length array to use for a length of 68 bytes.
   */
  static final byte[] LENGTH_68 = { 68 };



  /**
   * The pre-encoded length array to use for a length of 69 bytes.
   */
  static final byte[] LENGTH_69 = { 69 };



  /**
   * The pre-encoded length array to use for a length of 70 bytes.
   */
  static final byte[] LENGTH_70 = { 70 };



  /**
   * The pre-encoded length array to use for a length of 71 bytes.
   */
  static final byte[] LENGTH_71 = { 71 };



  /**
   * The pre-encoded length array to use for a length of 72 bytes.
   */
  static final byte[] LENGTH_72 = { 72 };



  /**
   * The pre-encoded length array to use for a length of 73 bytes.
   */
  static final byte[] LENGTH_73 = { 73 };



  /**
   * The pre-encoded length array to use for a length of 74 bytes.
   */
  static final byte[] LENGTH_74 = { 74 };



  /**
   * The pre-encoded length array to use for a length of 75 bytes.
   */
  static final byte[] LENGTH_75 = { 75 };



  /**
   * The pre-encoded length array to use for a length of 76 bytes.
   */
  static final byte[] LENGTH_76 = { 76 };



  /**
   * The pre-encoded length array to use for a length of 77 bytes.
   */
  static final byte[] LENGTH_77 = { 77 };



  /**
   * The pre-encoded length array to use for a length of 78 bytes.
   */
  static final byte[] LENGTH_78 = { 78 };



  /**
   * The pre-encoded length array to use for a length of 79 bytes.
   */
  static final byte[] LENGTH_79 = { 79 };



  /**
   * The pre-encoded length array to use for a length of 80 bytes.
   */
  static final byte[] LENGTH_80 = { 80 };



  /**
   * The pre-encoded length array to use for a length of 81 bytes.
   */
  static final byte[] LENGTH_81 = { 81 };



  /**
   * The pre-encoded length array to use for a length of 82 bytes.
   */
  static final byte[] LENGTH_82 = { 82 };



  /**
   * The pre-encoded length array to use for a length of 83 bytes.
   */
  static final byte[] LENGTH_83 = { 83 };



  /**
   * The pre-encoded length array to use for a length of 84 bytes.
   */
  static final byte[] LENGTH_84 = { 84 };



  /**
   * The pre-encoded length array to use for a length of 85 bytes.
   */
  static final byte[] LENGTH_85 = { 85 };



  /**
   * The pre-encoded length array to use for a length of 86 bytes.
   */
  static final byte[] LENGTH_86 = { 86 };



  /**
   * The pre-encoded length array to use for a length of 87 bytes.
   */
  static final byte[] LENGTH_87 = { 87 };



  /**
   * The pre-encoded length array to use for a length of 88 bytes.
   */
  static final byte[] LENGTH_88 = { 88 };



  /**
   * The pre-encoded length array to use for a length of 89 bytes.
   */
  static final byte[] LENGTH_89 = { 89 };



  /**
   * The pre-encoded length array to use for a length of 90 bytes.
   */
  static final byte[] LENGTH_90 = { 90 };



  /**
   * The pre-encoded length array to use for a length of 91 bytes.
   */
  static final byte[] LENGTH_91 = { 91 };



  /**
   * The pre-encoded length array to use for a length of 92 bytes.
   */
  static final byte[] LENGTH_92 = { 92 };



  /**
   * The pre-encoded length array to use for a length of 93 bytes.
   */
  static final byte[] LENGTH_93 = { 93 };



  /**
   * The pre-encoded length array to use for a length of 94 bytes.
   */
  static final byte[] LENGTH_94 = { 94 };



  /**
   * The pre-encoded length array to use for a length of 95 bytes.
   */
  static final byte[] LENGTH_95 = { 95 };



  /**
   * The pre-encoded length array to use for a length of 96 bytes.
   */
  static final byte[] LENGTH_96 = { 96 };



  /**
   * The pre-encoded length array to use for a length of 97 bytes.
   */
  static final byte[] LENGTH_97 = { 97 };



  /**
   * The pre-encoded length array to use for a length of 98 bytes.
   */
  static final byte[] LENGTH_98 = { 98 };



  /**
   * The pre-encoded length array to use for a length of 99 bytes.
   */
  static final byte[] LENGTH_99 = { 99 };



  /**
   * The pre-encoded length array to use for a length of 100 bytes.
   */
  static final byte[] LENGTH_100 = { 100 };



  /**
   * The pre-encoded length array to use for a length of 101 bytes.
   */
  static final byte[] LENGTH_101 = { 101 };



  /**
   * The pre-encoded length array to use for a length of 102 bytes.
   */
  static final byte[] LENGTH_102 = { 102 };



  /**
   * The pre-encoded length array to use for a length of 103 bytes.
   */
  static final byte[] LENGTH_103 = { 103 };



  /**
   * The pre-encoded length array to use for a length of 104 bytes.
   */
  static final byte[] LENGTH_104 = { 104 };



  /**
   * The pre-encoded length array to use for a length of 105 bytes.
   */
  static final byte[] LENGTH_105 = { 105 };



  /**
   * The pre-encoded length array to use for a length of 106 bytes.
   */
  static final byte[] LENGTH_106 = { 106 };



  /**
   * The pre-encoded length array to use for a length of 107 bytes.
   */
  static final byte[] LENGTH_107 = { 107 };



  /**
   * The pre-encoded length array to use for a length of 108 bytes.
   */
  static final byte[] LENGTH_108 = { 108 };



  /**
   * The pre-encoded length array to use for a length of 109 bytes.
   */
  static final byte[] LENGTH_109 = { 109 };



  /**
   * The pre-encoded length array to use for a length of 110 bytes.
   */
  static final byte[] LENGTH_110 = { 110 };



  /**
   * The pre-encoded length array to use for a length of 111 bytes.
   */
  static final byte[] LENGTH_111 = { 111 };



  /**
   * The pre-encoded length array to use for a length of 112 bytes.
   */
  static final byte[] LENGTH_112 = { 112 };



  /**
   * The pre-encoded length array to use for a length of 113 bytes.
   */
  static final byte[] LENGTH_113 = { 113 };



  /**
   * The pre-encoded length array to use for a length of 114 bytes.
   */
  static final byte[] LENGTH_114 = { 114 };



  /**
   * The pre-encoded length array to use for a length of 115 bytes.
   */
  static final byte[] LENGTH_115 = { 115 };



  /**
   * The pre-encoded length array to use for a length of 116 bytes.
   */
  static final byte[] LENGTH_116 = { 116 };



  /**
   * The pre-encoded length array to use for a length of 117 bytes.
   */
  static final byte[] LENGTH_117 = { 117 };



  /**
   * The pre-encoded length array to use for a length of 118 bytes.
   */
  static final byte[] LENGTH_118 = { 118 };



  /**
   * The pre-encoded length array to use for a length of 119 bytes.
   */
  static final byte[] LENGTH_119 = { 119 };



  /**
   * The pre-encoded length array to use for a length of 120 bytes.
   */
  static final byte[] LENGTH_120 = { 120 };



  /**
   * The pre-encoded length array to use for a length of 121 bytes.
   */
  static final byte[] LENGTH_121 = { 121 };



  /**
   * The pre-encoded length array to use for a length of 122 bytes.
   */
  static final byte[] LENGTH_122 = { 122 };



  /**
   * The pre-encoded length array to use for a length of 123 bytes.
   */
  static final byte[] LENGTH_123 = { 123 };



  /**
   * The pre-encoded length array to use for a length of 124 bytes.
   */
  static final byte[] LENGTH_124 = { 124 };



  /**
   * The pre-encoded length array to use for a length of 125 bytes.
   */
  static final byte[] LENGTH_125 = { 125 };



  /**
   * The pre-encoded length array to use for a length of 126 bytes.
   */
  static final byte[] LENGTH_126 = { 126 };



  /**
   * The pre-encoded length array to use for a length of 127 bytes.
   */
  static final byte[] LENGTH_127 = { 127 };



  /**
   * The BER type for the universal Boolean element.
   */
  public static final byte UNIVERSAL_BOOLEAN_TYPE = 0x01;



  /**
   * The BER type for the universal integer element.
   */
  public static final byte UNIVERSAL_INTEGER_TYPE = 0x02;



  /**
   * The BER type for the universal octet string element.
   */
  public static final byte UNIVERSAL_OCTET_STRING_TYPE = 0x04;



  /**
   * The BER type for the universal null element.
   */
  public static final byte UNIVERSAL_NULL_TYPE = 0x05;



  /**
   * The BER type for the universal enumerated element.
   */
  public static final byte UNIVERSAL_ENUMERATED_TYPE = 0x0A;



  /**
   * The BER type for the universal sequence element.
   */
  public static final byte UNIVERSAL_SEQUENCE_TYPE = 0x30;



  /**
   * The BER type for the universal set element.
   */
  public static final byte UNIVERSAL_SET_TYPE = 0x31;



  /**
   * A byte array that should be used as the value for an ASN.1 element if it
   * does not have a value (i.e., the value length is zero bytes).
   */
  public static final byte[] NO_VALUE = new byte[0];



  /**
   * A mask that may be used when building a BER type in the universal class.
   * To build the type, perform a bitwise OR with one of the
   * {@code TYPE_MASK_*_CLASS} constants, one of the
   * {@code TYPE_MASK_PC_*} constants, and a byte that represents the desired
   * tag number.  Note that this method only works for tag numbers between zero
   * and thirty, since tag numbers greater than thirty require a multi-byte
   * type, but none of the LDAP specifications attempt to use a tag number
   * greater than twenty-five, so it is highly unlikely that you will ever
   * encounter the need for a multi-byte type in LDAP.
   */
  public static final byte TYE_MASK_UNIVERSAL_CLASS = 0x00;



  /**
   * A mask that may be used when building a BER type in the application class.
   * To build the type, perform a bitwise OR with one of the
   * {@code TYPE_MASK_*_CLASS} constants, one of the
   * {@code TYPE_MASK_PC_*} constants, and a byte that represents the desired
   * tag number.  Note that this method only works for tag numbers between zero
   * and thirty, since tag numbers greater than thirty require a multi-byte
   * type, but none of the LDAP specifications attempt to use a tag number
   * greater than twenty-five, so it is highly unlikely that you will ever
   * encounter the need for a multi-byte type in LDAP.
   */
  public static final byte TYE_MASK_APPLICATION_CLASS = 0x04;



  /**
   * A mask that may be used when building a BER type in the context-specific
   * class.  To build the type, perform a bitwise OR with one of the
   * {@code TYPE_MASK_*_CLASS} constants, one of the
   * {@code TYPE_MASK_PC_*} constants, and a byte that represents the desired
   * tag number.  Note that this method only works for tag numbers between zero
   * and thirty, since tag numbers greater than thirty require a multi-byte
   * type, but none of the LDAP specifications attempt to use a tag number
   * greater than twenty-five, so it is highly unlikely that you will ever
   * encounter the need for a multi-byte type in LDAP.
   */
  public static final byte TYE_MASK_CONTEXT_SPECIFIC_CLASS = (byte) 0x80;



  /**
   * A mask that may be used when building a BER type in the private class.  To
   * build the type, perform a bitwise OR with one of the
   * {@code TYPE_MASK_*_CLASS} constants, one of the
   * {@code TYPE_MASK_PC_*} constants, and a byte that represents the desired
   * tag number.  Note that this method only works for tag numbers between zero
   * and thirty, since tag numbers greater than thirty require a multi-byte
   * type, but none of the LDAP specifications attempt to use a tag number
   * greater than twenty-five, so it is highly unlikely that you will ever
   * encounter the need for a multi-byte type in LDAP.
   */
  public static final byte TYE_MASK_PRIVATE_CLASS = (byte) 0xC0;



  /**
   * A mask that may be used when building a BER type with a primitive value
   * (i.e., a value that is not known to be comprised of a concatenation of the
   * encoded representations of zero or more BER elements).  To build the type,
   * perform a bitwise OR with one of the {@code TYPE_MASK_*_CLASS} constants,
   * one of the {@code TYPE_MASK_PC_*} constants, and a byte that represents the
   * desired tag number.  Note that this method only works for tag numbers
   * between zero and thirty, since tag numbers greater than thirty require a
   * multi-byte type, but none of the LDAP specifications attempt to use a tag
   * number greater than twenty-five, so it is highly unlikely that you will
   * ever encounter the need for a multi-byte type in LDAP.
   */
  public static final byte TYE_MASK_PC_PRIMITIVE = 0x00;



  /**
   * A mask that may be used when building a BER type with a constructed value
   * (i.e., a value that is comprised of a concatenation of the encoded
   * representations of zero or more BER elements).  To build the type, perform
   * a bitwise OR with one of the {@code TYPE_MASK_*_CLASS} constants, one of
   * the {@code TYPE_MASK_PC_*} constants, and a byte that represents the
   * desired tag number.  Note that this method only works for tag numbers
   * between zero and thirty, since tag numbers greater than thirty require a
   * multi-byte type, but none of the LDAP specifications attempt to use a tag
   * number greater than twenty-five, so it is highly unlikely that you will
   * ever encounter the need for a multi-byte type in LDAP.
   */
  public static final byte TYE_MASK_PC_CONSTRUCTED = 0x20;
}
