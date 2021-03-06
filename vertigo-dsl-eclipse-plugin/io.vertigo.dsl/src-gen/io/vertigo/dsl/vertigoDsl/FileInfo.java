/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.FileInfo#getName <em>Name</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.FileInfo#getStoreName <em>Store Name</em>}</li>
 * </ul>
 *
 * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getFileInfo()
 * @model
 * @generated
 */
public interface FileInfo extends Element
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getFileInfo_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.FileInfo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Store Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Store Name</em>' attribute.
   * @see #setStoreName(String)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getFileInfo_StoreName()
   * @model
   * @generated
   */
  String getStoreName();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.FileInfo#getStoreName <em>Store Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Store Name</em>' attribute.
   * @see #getStoreName()
   * @generated
   */
  void setStoreName(String value);

} // FileInfo
