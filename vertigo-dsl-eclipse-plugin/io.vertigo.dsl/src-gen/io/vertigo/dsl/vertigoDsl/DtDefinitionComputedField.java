/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dt Definition Computed Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.DtDefinitionComputedField#getName <em>Name</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.DtDefinitionComputedField#getComputedFieldString <em>Computed Field String</em>}</li>
 * </ul>
 *
 * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDtDefinitionComputedField()
 * @model
 * @generated
 */
public interface DtDefinitionComputedField extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(KEYWORDID)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDtDefinitionComputedField_Name()
   * @model containment="true"
   * @generated
   */
  KEYWORDID getName();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.DtDefinitionComputedField#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(KEYWORDID value);

  /**
   * Returns the value of the '<em><b>Computed Field String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Computed Field String</em>' containment reference.
   * @see #setComputedFieldString(DtDefinitionComputedFieldString)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDtDefinitionComputedField_ComputedFieldString()
   * @model containment="true"
   * @generated
   */
  DtDefinitionComputedFieldString getComputedFieldString();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.DtDefinitionComputedField#getComputedFieldString <em>Computed Field String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Computed Field String</em>' containment reference.
   * @see #getComputedFieldString()
   * @generated
   */
  void setComputedFieldString(DtDefinitionComputedFieldString value);

} // DtDefinitionComputedField
