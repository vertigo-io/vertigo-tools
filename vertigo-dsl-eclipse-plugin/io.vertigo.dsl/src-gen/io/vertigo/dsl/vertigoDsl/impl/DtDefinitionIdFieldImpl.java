/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl.impl;

import io.vertigo.dsl.vertigoDsl.DtDefinitionIdField;
import io.vertigo.dsl.vertigoDsl.DtDefinitionIdString;
import io.vertigo.dsl.vertigoDsl.KEYWORDID;
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dt Definition Id Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.DtDefinitionIdFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.DtDefinitionIdFieldImpl#getIdString <em>Id String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DtDefinitionIdFieldImpl extends MinimalEObjectImpl.Container implements DtDefinitionIdField
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected KEYWORDID name;

  /**
   * The cached value of the '{@link #getIdString() <em>Id String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdString()
   * @generated
   * @ordered
   */
  protected DtDefinitionIdString idString;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DtDefinitionIdFieldImpl()
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
    return VertigoDslPackage.Literals.DT_DEFINITION_ID_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public KEYWORDID getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(KEYWORDID newName, NotificationChain msgs)
  {
    KEYWORDID oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME, oldName, newName);
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
  public void setName(KEYWORDID newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DtDefinitionIdString getIdString()
  {
    return idString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdString(DtDefinitionIdString newIdString, NotificationChain msgs)
  {
    DtDefinitionIdString oldIdString = idString;
    idString = newIdString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING, oldIdString, newIdString);
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
  public void setIdString(DtDefinitionIdString newIdString)
  {
    if (newIdString != idString)
    {
      NotificationChain msgs = null;
      if (idString != null)
        msgs = ((InternalEObject)idString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING, null, msgs);
      if (newIdString != null)
        msgs = ((InternalEObject)newIdString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING, null, msgs);
      msgs = basicSetIdString(newIdString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING, newIdString, newIdString));
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
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME:
        return basicSetName(null, msgs);
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING:
        return basicSetIdString(null, msgs);
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
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME:
        return getName();
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING:
        return getIdString();
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
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME:
        setName((KEYWORDID)newValue);
        return;
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING:
        setIdString((DtDefinitionIdString)newValue);
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
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME:
        setName((KEYWORDID)null);
        return;
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING:
        setIdString((DtDefinitionIdString)null);
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
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__NAME:
        return name != null;
      case VertigoDslPackage.DT_DEFINITION_ID_FIELD__ID_STRING:
        return idString != null;
    }
    return super.eIsSet(featureID);
  }

} //DtDefinitionIdFieldImpl
