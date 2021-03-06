/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl.impl;

import io.vertigo.dsl.vertigoDsl.FacetedQueryDefinitionDomainCriteria;
import io.vertigo.dsl.vertigoDsl.RefToDomainType;
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faceted Query Definition Domain Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.FacetedQueryDefinitionDomainCriteriaImpl#getRefToDomainType <em>Ref To Domain Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetedQueryDefinitionDomainCriteriaImpl extends MinimalEObjectImpl.Container implements FacetedQueryDefinitionDomainCriteria
{
  /**
   * The cached value of the '{@link #getRefToDomainType() <em>Ref To Domain Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefToDomainType()
   * @generated
   * @ordered
   */
  protected RefToDomainType refToDomainType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetedQueryDefinitionDomainCriteriaImpl()
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
    return VertigoDslPackage.Literals.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RefToDomainType getRefToDomainType()
  {
    return refToDomainType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefToDomainType(RefToDomainType newRefToDomainType, NotificationChain msgs)
  {
    RefToDomainType oldRefToDomainType = refToDomainType;
    refToDomainType = newRefToDomainType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE, oldRefToDomainType, newRefToDomainType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRefToDomainType(RefToDomainType newRefToDomainType)
  {
    if (newRefToDomainType != refToDomainType)
    {
      NotificationChain msgs = null;
      if (refToDomainType != null)
        msgs = ((InternalEObject)refToDomainType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE, null, msgs);
      if (newRefToDomainType != null)
        msgs = ((InternalEObject)newRefToDomainType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE, null, msgs);
      msgs = basicSetRefToDomainType(newRefToDomainType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE, newRefToDomainType, newRefToDomainType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE:
        return basicSetRefToDomainType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE:
        return getRefToDomainType();
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE:
        setRefToDomainType((RefToDomainType)newValue);
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE:
        setRefToDomainType((RefToDomainType)null);
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA__REF_TO_DOMAIN_TYPE:
        return refToDomainType != null;
    }
    return super.eIsSet(featureID);
  }

} //FacetedQueryDefinitionDomainCriteriaImpl
