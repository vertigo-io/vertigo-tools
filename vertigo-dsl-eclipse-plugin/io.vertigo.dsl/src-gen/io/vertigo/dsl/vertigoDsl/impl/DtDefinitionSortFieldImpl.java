/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl.impl;

import io.vertigo.dsl.vertigoDsl.DtDefinitionSortField;
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dt Definition Sort Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.DtDefinitionSortFieldImpl#getSortField <em>Sort Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DtDefinitionSortFieldImpl extends MinimalEObjectImpl.Container implements DtDefinitionSortField
{
  /**
   * The default value of the '{@link #getSortField() <em>Sort Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortField()
   * @generated
   * @ordered
   */
  protected static final String SORT_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSortField() <em>Sort Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortField()
   * @generated
   * @ordered
   */
  protected String sortField = SORT_FIELD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DtDefinitionSortFieldImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VertigoDslPackage.Literals.DT_DEFINITION_SORT_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSortField()
  {
    return sortField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSortField(String newSortField)
  {
    String oldSortField = sortField;
    sortField = newSortField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.DT_DEFINITION_SORT_FIELD__SORT_FIELD, oldSortField, sortField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VertigoDslPackage.DT_DEFINITION_SORT_FIELD__SORT_FIELD:
        return getSortField();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VertigoDslPackage.DT_DEFINITION_SORT_FIELD__SORT_FIELD:
        setSortField((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VertigoDslPackage.DT_DEFINITION_SORT_FIELD__SORT_FIELD:
        setSortField(SORT_FIELD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VertigoDslPackage.DT_DEFINITION_SORT_FIELD__SORT_FIELD:
        return SORT_FIELD_EDEFAULT == null ? sortField != null : !SORT_FIELD_EDEFAULT.equals(sortField);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (sortField: ");
    result.append(sortField);
    result.append(')');
    return result.toString();
  }

} //DtDefinitionSortFieldImpl
