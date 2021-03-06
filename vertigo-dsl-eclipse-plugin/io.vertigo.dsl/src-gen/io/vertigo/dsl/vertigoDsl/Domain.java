/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.Domain#getName <em>Name</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.Domain#getDataType <em>Data Type</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.Domain#isType <em>Type</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.Domain#isStoreType <em>Store Type</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.Domain#isIndexType <em>Index Type</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.Domain#isUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends Element, DomainType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDomain_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.Domain#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' attribute.
   * The literals are from the enumeration {@link io.vertigo.dsl.vertigoDsl.DataType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' attribute.
   * @see io.vertigo.dsl.vertigoDsl.DataType
   * @see #setDataType(DataType)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDomain_DataType()
   * @model
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.Domain#getDataType <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' attribute.
   * @see io.vertigo.dsl.vertigoDsl.DataType
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(boolean)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDomain_Type()
   * @model
   * @generated
   */
  boolean isType();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.Domain#isType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #isType()
   * @generated
   */
  void setType(boolean value);

  /**
   * Returns the value of the '<em><b>Store Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Store Type</em>' attribute.
   * @see #setStoreType(boolean)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDomain_StoreType()
   * @model
   * @generated
   */
  boolean isStoreType();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.Domain#isStoreType <em>Store Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Store Type</em>' attribute.
   * @see #isStoreType()
   * @generated
   */
  void setStoreType(boolean value);

  /**
   * Returns the value of the '<em><b>Index Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Type</em>' attribute.
   * @see #setIndexType(boolean)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDomain_IndexType()
   * @model
   * @generated
   */
  boolean isIndexType();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.Domain#isIndexType <em>Index Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Type</em>' attribute.
   * @see #isIndexType()
   * @generated
   */
  void setIndexType(boolean value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(boolean)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDomain_Unit()
   * @model
   * @generated
   */
  boolean isUnit();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.Domain#isUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #isUnit()
   * @generated
   */
  void setUnit(boolean value);

} // Domain
