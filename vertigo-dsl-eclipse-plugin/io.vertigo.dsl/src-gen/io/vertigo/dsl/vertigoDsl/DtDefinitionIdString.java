/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dt Definition Id String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.DtDefinitionIdString#getRefToDomainType <em>Ref To Domain Type</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.DtDefinitionIdString#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDtDefinitionIdString()
 * @model
 * @generated
 */
public interface DtDefinitionIdString extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref To Domain Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref To Domain Type</em>' containment reference.
   * @see #setRefToDomainType(RefToDomainType)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDtDefinitionIdString_RefToDomainType()
   * @model containment="true"
   * @generated
   */
  RefToDomainType getRefToDomainType();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.DtDefinitionIdString#getRefToDomainType <em>Ref To Domain Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref To Domain Type</em>' containment reference.
   * @see #getRefToDomainType()
   * @generated
   */
  void setRefToDomainType(RefToDomainType value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getDtDefinitionIdString_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.DtDefinitionIdString#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

} // DtDefinitionIdString
