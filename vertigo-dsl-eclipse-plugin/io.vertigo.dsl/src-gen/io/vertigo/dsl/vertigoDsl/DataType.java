/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator
{
  /**
   * The '<em><b>INTEGER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(0, "INTEGER", "Integer"),

  /**
   * The '<em><b>DOUBLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_VALUE
   * @generated
   * @ordered
   */
  DOUBLE(1, "DOUBLE", "Double"),

  /**
   * The '<em><b>BOOLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(2, "BOOLEAN", "Boolean"),

  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(3, "STRING", "String"),

  /**
   * The '<em><b>LOCAL DATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOCAL_DATE_VALUE
   * @generated
   * @ordered
   */
  LOCAL_DATE(4, "LOCAL_DATE", "LocalDate"),

  /**
   * The '<em><b>INSTANT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTANT_VALUE
   * @generated
   * @ordered
   */
  INSTANT(5, "INSTANT", "Instant"),

  /**
   * The '<em><b>BIG DECIMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIG_DECIMAL_VALUE
   * @generated
   * @ordered
   */
  BIG_DECIMAL(6, "BIG_DECIMAL", "BigDecimal"),

  /**
   * The '<em><b>LONG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONG_VALUE
   * @generated
   * @ordered
   */
  LONG(7, "LONG", "Long"),

  /**
   * The '<em><b>DATA STREAM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_STREAM_VALUE
   * @generated
   * @ordered
   */
  DATA_STREAM(8, "DATA_STREAM", "DataStream"),

  /**
   * The '<em><b>VALUE OBJECT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALUE_OBJECT_VALUE
   * @generated
   * @ordered
   */
  VALUE_OBJECT(9, "VALUE_OBJECT", "ValueObject");

  /**
   * The '<em><b>INTEGER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model literal="Integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 0;

  /**
   * The '<em><b>DOUBLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE
   * @model literal="Double"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_VALUE = 1;

  /**
   * The '<em><b>BOOLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model literal="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 2;

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING
   * @model literal="String"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 3;

  /**
   * The '<em><b>LOCAL DATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOCAL_DATE
   * @model literal="LocalDate"
   * @generated
   * @ordered
   */
  public static final int LOCAL_DATE_VALUE = 4;

  /**
   * The '<em><b>INSTANT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTANT
   * @model literal="Instant"
   * @generated
   * @ordered
   */
  public static final int INSTANT_VALUE = 5;

  /**
   * The '<em><b>BIG DECIMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIG_DECIMAL
   * @model literal="BigDecimal"
   * @generated
   * @ordered
   */
  public static final int BIG_DECIMAL_VALUE = 6;

  /**
   * The '<em><b>LONG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONG
   * @model literal="Long"
   * @generated
   * @ordered
   */
  public static final int LONG_VALUE = 7;

  /**
   * The '<em><b>DATA STREAM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_STREAM
   * @model literal="DataStream"
   * @generated
   * @ordered
   */
  public static final int DATA_STREAM_VALUE = 8;

  /**
   * The '<em><b>VALUE OBJECT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALUE_OBJECT
   * @model literal="ValueObject"
   * @generated
   * @ordered
   */
  public static final int VALUE_OBJECT_VALUE = 9;

  /**
   * An array of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DataType[] VALUES_ARRAY =
    new DataType[]
    {
      INTEGER,
      DOUBLE,
      BOOLEAN,
      STRING,
      LOCAL_DATE,
      INSTANT,
      BIG_DECIMAL,
      LONG,
      DATA_STREAM,
      VALUE_OBJECT,
    };

  /**
   * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DataType get(int value)
  {
    switch (value)
    {
      case INTEGER_VALUE: return INTEGER;
      case DOUBLE_VALUE: return DOUBLE;
      case BOOLEAN_VALUE: return BOOLEAN;
      case STRING_VALUE: return STRING;
      case LOCAL_DATE_VALUE: return LOCAL_DATE;
      case INSTANT_VALUE: return INSTANT;
      case BIG_DECIMAL_VALUE: return BIG_DECIMAL;
      case LONG_VALUE: return LONG;
      case DATA_STREAM_VALUE: return DATA_STREAM;
      case VALUE_OBJECT_VALUE: return VALUE_OBJECT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DataType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DataType
