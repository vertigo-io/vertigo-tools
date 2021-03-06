/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Definition Dt Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.IndexDefinitionDtIndex#getDtDefinition <em>Dt Definition</em>}</li>
 * </ul>
 *
 * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getIndexDefinitionDtIndex()
 * @model
 * @generated
 */
public interface IndexDefinitionDtIndex extends EObject
{
  /**
   * Returns the value of the '<em><b>Dt Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dt Definition</em>' reference.
   * @see #setDtDefinition(DtDefinitionType)
   * @see io.vertigo.dsl.vertigoDsl.VertigoDslPackage#getIndexDefinitionDtIndex_DtDefinition()
   * @model
   * @generated
   */
  DtDefinitionType getDtDefinition();

  /**
   * Sets the value of the '{@link io.vertigo.dsl.vertigoDsl.IndexDefinitionDtIndex#getDtDefinition <em>Dt Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dt Definition</em>' reference.
   * @see #getDtDefinition()
   * @generated
   */
  void setDtDefinition(DtDefinitionType value);

} // IndexDefinitionDtIndex
