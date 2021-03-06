/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl.impl;

import io.vertigo.dsl.vertigoDsl.IndexDefinitionIndexCopyTo;
import io.vertigo.dsl.vertigoDsl.IndexDefinitionIndexCopyToString;
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
 * An implementation of the model object '<em><b>Index Definition Index Copy To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.IndexDefinitionIndexCopyToImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.IndexDefinitionIndexCopyToImpl#getIndexDefinitionIndexCopyToString <em>Index Definition Index Copy To String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexDefinitionIndexCopyToImpl extends MinimalEObjectImpl.Container implements IndexDefinitionIndexCopyTo
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
   * The cached value of the '{@link #getIndexDefinitionIndexCopyToString() <em>Index Definition Index Copy To String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexDefinitionIndexCopyToString()
   * @generated
   * @ordered
   */
  protected IndexDefinitionIndexCopyToString indexDefinitionIndexCopyToString;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndexDefinitionIndexCopyToImpl()
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
    return VertigoDslPackage.Literals.INDEX_DEFINITION_INDEX_COPY_TO;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndexDefinitionIndexCopyToString getIndexDefinitionIndexCopyToString()
  {
    return indexDefinitionIndexCopyToString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexDefinitionIndexCopyToString(IndexDefinitionIndexCopyToString newIndexDefinitionIndexCopyToString, NotificationChain msgs)
  {
    IndexDefinitionIndexCopyToString oldIndexDefinitionIndexCopyToString = indexDefinitionIndexCopyToString;
    indexDefinitionIndexCopyToString = newIndexDefinitionIndexCopyToString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING, oldIndexDefinitionIndexCopyToString, newIndexDefinitionIndexCopyToString);
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
  public void setIndexDefinitionIndexCopyToString(IndexDefinitionIndexCopyToString newIndexDefinitionIndexCopyToString)
  {
    if (newIndexDefinitionIndexCopyToString != indexDefinitionIndexCopyToString)
    {
      NotificationChain msgs = null;
      if (indexDefinitionIndexCopyToString != null)
        msgs = ((InternalEObject)indexDefinitionIndexCopyToString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING, null, msgs);
      if (newIndexDefinitionIndexCopyToString != null)
        msgs = ((InternalEObject)newIndexDefinitionIndexCopyToString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING, null, msgs);
      msgs = basicSetIndexDefinitionIndexCopyToString(newIndexDefinitionIndexCopyToString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING, newIndexDefinitionIndexCopyToString, newIndexDefinitionIndexCopyToString));
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
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME:
        return basicSetName(null, msgs);
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING:
        return basicSetIndexDefinitionIndexCopyToString(null, msgs);
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
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME:
        return getName();
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING:
        return getIndexDefinitionIndexCopyToString();
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
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME:
        setName((KEYWORDID)newValue);
        return;
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING:
        setIndexDefinitionIndexCopyToString((IndexDefinitionIndexCopyToString)newValue);
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
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME:
        setName((KEYWORDID)null);
        return;
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING:
        setIndexDefinitionIndexCopyToString((IndexDefinitionIndexCopyToString)null);
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
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__NAME:
        return name != null;
      case VertigoDslPackage.INDEX_DEFINITION_INDEX_COPY_TO__INDEX_DEFINITION_INDEX_COPY_TO_STRING:
        return indexDefinitionIndexCopyToString != null;
    }
    return super.eIsSet(featureID);
  }

} //IndexDefinitionIndexCopyToImpl
