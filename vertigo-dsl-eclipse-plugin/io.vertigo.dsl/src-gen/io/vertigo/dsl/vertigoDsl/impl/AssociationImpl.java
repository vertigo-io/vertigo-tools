/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl.impl;

import io.vertigo.dsl.vertigoDsl.Association;
import io.vertigo.dsl.vertigoDsl.AssociationTypeString;
import io.vertigo.dsl.vertigoDsl.BooleanString;
import io.vertigo.dsl.vertigoDsl.DtDefinitionType;
import io.vertigo.dsl.vertigoDsl.MultiplicityString;
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getFkFieldName <em>Fk Field Name</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getDtDefinitionA <em>Dt Definition A</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getDtDefinitionB <em>Dt Definition B</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getNavigabilityA <em>Navigability A</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getNavigabilityB <em>Navigability B</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getMultiplicityA <em>Multiplicity A</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getMultiplicityB <em>Multiplicity B</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getLabelA <em>Label A</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getLabelB <em>Label B</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getRoleA <em>Role A</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getRoleB <em>Role B</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.AssociationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends ElementImpl implements Association
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFkFieldName() <em>Fk Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkFieldName()
   * @generated
   * @ordered
   */
  protected static final String FK_FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFkFieldName() <em>Fk Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkFieldName()
   * @generated
   * @ordered
   */
  protected String fkFieldName = FK_FIELD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDtDefinitionA() <em>Dt Definition A</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDtDefinitionA()
   * @generated
   * @ordered
   */
  protected DtDefinitionType dtDefinitionA;

  /**
   * The cached value of the '{@link #getDtDefinitionB() <em>Dt Definition B</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDtDefinitionB()
   * @generated
   * @ordered
   */
  protected DtDefinitionType dtDefinitionB;

  /**
   * The default value of the '{@link #getNavigabilityA() <em>Navigability A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigabilityA()
   * @generated
   * @ordered
   */
  protected static final BooleanString NAVIGABILITY_A_EDEFAULT = BooleanString.TRUE;

  /**
   * The cached value of the '{@link #getNavigabilityA() <em>Navigability A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigabilityA()
   * @generated
   * @ordered
   */
  protected BooleanString navigabilityA = NAVIGABILITY_A_EDEFAULT;

  /**
   * The default value of the '{@link #getNavigabilityB() <em>Navigability B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigabilityB()
   * @generated
   * @ordered
   */
  protected static final BooleanString NAVIGABILITY_B_EDEFAULT = BooleanString.TRUE;

  /**
   * The cached value of the '{@link #getNavigabilityB() <em>Navigability B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigabilityB()
   * @generated
   * @ordered
   */
  protected BooleanString navigabilityB = NAVIGABILITY_B_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiplicityA() <em>Multiplicity A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicityA()
   * @generated
   * @ordered
   */
  protected static final MultiplicityString MULTIPLICITY_A_EDEFAULT = MultiplicityString.ZERO_ONE;

  /**
   * The cached value of the '{@link #getMultiplicityA() <em>Multiplicity A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicityA()
   * @generated
   * @ordered
   */
  protected MultiplicityString multiplicityA = MULTIPLICITY_A_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiplicityB() <em>Multiplicity B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicityB()
   * @generated
   * @ordered
   */
  protected static final MultiplicityString MULTIPLICITY_B_EDEFAULT = MultiplicityString.ZERO_ONE;

  /**
   * The cached value of the '{@link #getMultiplicityB() <em>Multiplicity B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicityB()
   * @generated
   * @ordered
   */
  protected MultiplicityString multiplicityB = MULTIPLICITY_B_EDEFAULT;

  /**
   * The default value of the '{@link #getLabelA() <em>Label A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelA()
   * @generated
   * @ordered
   */
  protected static final String LABEL_A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabelA() <em>Label A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelA()
   * @generated
   * @ordered
   */
  protected String labelA = LABEL_A_EDEFAULT;

  /**
   * The default value of the '{@link #getLabelB() <em>Label B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelB()
   * @generated
   * @ordered
   */
  protected static final String LABEL_B_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabelB() <em>Label B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelB()
   * @generated
   * @ordered
   */
  protected String labelB = LABEL_B_EDEFAULT;

  /**
   * The default value of the '{@link #getRoleA() <em>Role A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleA()
   * @generated
   * @ordered
   */
  protected static final String ROLE_A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRoleA() <em>Role A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleA()
   * @generated
   * @ordered
   */
  protected String roleA = ROLE_A_EDEFAULT;

  /**
   * The default value of the '{@link #getRoleB() <em>Role B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleB()
   * @generated
   * @ordered
   */
  protected static final String ROLE_B_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRoleB() <em>Role B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleB()
   * @generated
   * @ordered
   */
  protected String roleB = ROLE_B_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final AssociationTypeString TYPE_EDEFAULT = AssociationTypeString.ONE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AssociationTypeString type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssociationImpl()
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
    return VertigoDslPackage.Literals.ASSOCIATION;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFkFieldName()
  {
    return fkFieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFkFieldName(String newFkFieldName)
  {
    String oldFkFieldName = fkFieldName;
    fkFieldName = newFkFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__FK_FIELD_NAME, oldFkFieldName, fkFieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DtDefinitionType getDtDefinitionA()
  {
    if (dtDefinitionA != null && dtDefinitionA.eIsProxy())
    {
      InternalEObject oldDtDefinitionA = (InternalEObject)dtDefinitionA;
      dtDefinitionA = (DtDefinitionType)eResolveProxy(oldDtDefinitionA);
      if (dtDefinitionA != oldDtDefinitionA)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VertigoDslPackage.ASSOCIATION__DT_DEFINITION_A, oldDtDefinitionA, dtDefinitionA));
      }
    }
    return dtDefinitionA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DtDefinitionType basicGetDtDefinitionA()
  {
    return dtDefinitionA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDtDefinitionA(DtDefinitionType newDtDefinitionA)
  {
    DtDefinitionType oldDtDefinitionA = dtDefinitionA;
    dtDefinitionA = newDtDefinitionA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__DT_DEFINITION_A, oldDtDefinitionA, dtDefinitionA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DtDefinitionType getDtDefinitionB()
  {
    if (dtDefinitionB != null && dtDefinitionB.eIsProxy())
    {
      InternalEObject oldDtDefinitionB = (InternalEObject)dtDefinitionB;
      dtDefinitionB = (DtDefinitionType)eResolveProxy(oldDtDefinitionB);
      if (dtDefinitionB != oldDtDefinitionB)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VertigoDslPackage.ASSOCIATION__DT_DEFINITION_B, oldDtDefinitionB, dtDefinitionB));
      }
    }
    return dtDefinitionB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DtDefinitionType basicGetDtDefinitionB()
  {
    return dtDefinitionB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDtDefinitionB(DtDefinitionType newDtDefinitionB)
  {
    DtDefinitionType oldDtDefinitionB = dtDefinitionB;
    dtDefinitionB = newDtDefinitionB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__DT_DEFINITION_B, oldDtDefinitionB, dtDefinitionB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanString getNavigabilityA()
  {
    return navigabilityA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNavigabilityA(BooleanString newNavigabilityA)
  {
    BooleanString oldNavigabilityA = navigabilityA;
    navigabilityA = newNavigabilityA == null ? NAVIGABILITY_A_EDEFAULT : newNavigabilityA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__NAVIGABILITY_A, oldNavigabilityA, navigabilityA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanString getNavigabilityB()
  {
    return navigabilityB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNavigabilityB(BooleanString newNavigabilityB)
  {
    BooleanString oldNavigabilityB = navigabilityB;
    navigabilityB = newNavigabilityB == null ? NAVIGABILITY_B_EDEFAULT : newNavigabilityB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__NAVIGABILITY_B, oldNavigabilityB, navigabilityB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicityString getMultiplicityA()
  {
    return multiplicityA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMultiplicityA(MultiplicityString newMultiplicityA)
  {
    MultiplicityString oldMultiplicityA = multiplicityA;
    multiplicityA = newMultiplicityA == null ? MULTIPLICITY_A_EDEFAULT : newMultiplicityA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__MULTIPLICITY_A, oldMultiplicityA, multiplicityA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicityString getMultiplicityB()
  {
    return multiplicityB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMultiplicityB(MultiplicityString newMultiplicityB)
  {
    MultiplicityString oldMultiplicityB = multiplicityB;
    multiplicityB = newMultiplicityB == null ? MULTIPLICITY_B_EDEFAULT : newMultiplicityB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__MULTIPLICITY_B, oldMultiplicityB, multiplicityB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLabelA()
  {
    return labelA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLabelA(String newLabelA)
  {
    String oldLabelA = labelA;
    labelA = newLabelA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__LABEL_A, oldLabelA, labelA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLabelB()
  {
    return labelB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLabelB(String newLabelB)
  {
    String oldLabelB = labelB;
    labelB = newLabelB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__LABEL_B, oldLabelB, labelB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRoleA()
  {
    return roleA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRoleA(String newRoleA)
  {
    String oldRoleA = roleA;
    roleA = newRoleA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__ROLE_A, oldRoleA, roleA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRoleB()
  {
    return roleB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRoleB(String newRoleB)
  {
    String oldRoleB = roleB;
    roleB = newRoleB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__ROLE_B, oldRoleB, roleB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssociationTypeString getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(AssociationTypeString newType)
  {
    AssociationTypeString oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.ASSOCIATION__TYPE, oldType, type));
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
      case VertigoDslPackage.ASSOCIATION__NAME:
        return getName();
      case VertigoDslPackage.ASSOCIATION__FK_FIELD_NAME:
        return getFkFieldName();
      case VertigoDslPackage.ASSOCIATION__DT_DEFINITION_A:
        if (resolve) return getDtDefinitionA();
        return basicGetDtDefinitionA();
      case VertigoDslPackage.ASSOCIATION__DT_DEFINITION_B:
        if (resolve) return getDtDefinitionB();
        return basicGetDtDefinitionB();
      case VertigoDslPackage.ASSOCIATION__NAVIGABILITY_A:
        return getNavigabilityA();
      case VertigoDslPackage.ASSOCIATION__NAVIGABILITY_B:
        return getNavigabilityB();
      case VertigoDslPackage.ASSOCIATION__MULTIPLICITY_A:
        return getMultiplicityA();
      case VertigoDslPackage.ASSOCIATION__MULTIPLICITY_B:
        return getMultiplicityB();
      case VertigoDslPackage.ASSOCIATION__LABEL_A:
        return getLabelA();
      case VertigoDslPackage.ASSOCIATION__LABEL_B:
        return getLabelB();
      case VertigoDslPackage.ASSOCIATION__ROLE_A:
        return getRoleA();
      case VertigoDslPackage.ASSOCIATION__ROLE_B:
        return getRoleB();
      case VertigoDslPackage.ASSOCIATION__TYPE:
        return getType();
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
      case VertigoDslPackage.ASSOCIATION__NAME:
        setName((String)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__FK_FIELD_NAME:
        setFkFieldName((String)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__DT_DEFINITION_A:
        setDtDefinitionA((DtDefinitionType)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__DT_DEFINITION_B:
        setDtDefinitionB((DtDefinitionType)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__NAVIGABILITY_A:
        setNavigabilityA((BooleanString)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__NAVIGABILITY_B:
        setNavigabilityB((BooleanString)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__MULTIPLICITY_A:
        setMultiplicityA((MultiplicityString)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__MULTIPLICITY_B:
        setMultiplicityB((MultiplicityString)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__LABEL_A:
        setLabelA((String)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__LABEL_B:
        setLabelB((String)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__ROLE_A:
        setRoleA((String)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__ROLE_B:
        setRoleB((String)newValue);
        return;
      case VertigoDslPackage.ASSOCIATION__TYPE:
        setType((AssociationTypeString)newValue);
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
      case VertigoDslPackage.ASSOCIATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__FK_FIELD_NAME:
        setFkFieldName(FK_FIELD_NAME_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__DT_DEFINITION_A:
        setDtDefinitionA((DtDefinitionType)null);
        return;
      case VertigoDslPackage.ASSOCIATION__DT_DEFINITION_B:
        setDtDefinitionB((DtDefinitionType)null);
        return;
      case VertigoDslPackage.ASSOCIATION__NAVIGABILITY_A:
        setNavigabilityA(NAVIGABILITY_A_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__NAVIGABILITY_B:
        setNavigabilityB(NAVIGABILITY_B_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__MULTIPLICITY_A:
        setMultiplicityA(MULTIPLICITY_A_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__MULTIPLICITY_B:
        setMultiplicityB(MULTIPLICITY_B_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__LABEL_A:
        setLabelA(LABEL_A_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__LABEL_B:
        setLabelB(LABEL_B_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__ROLE_A:
        setRoleA(ROLE_A_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__ROLE_B:
        setRoleB(ROLE_B_EDEFAULT);
        return;
      case VertigoDslPackage.ASSOCIATION__TYPE:
        setType(TYPE_EDEFAULT);
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
      case VertigoDslPackage.ASSOCIATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VertigoDslPackage.ASSOCIATION__FK_FIELD_NAME:
        return FK_FIELD_NAME_EDEFAULT == null ? fkFieldName != null : !FK_FIELD_NAME_EDEFAULT.equals(fkFieldName);
      case VertigoDslPackage.ASSOCIATION__DT_DEFINITION_A:
        return dtDefinitionA != null;
      case VertigoDslPackage.ASSOCIATION__DT_DEFINITION_B:
        return dtDefinitionB != null;
      case VertigoDslPackage.ASSOCIATION__NAVIGABILITY_A:
        return navigabilityA != NAVIGABILITY_A_EDEFAULT;
      case VertigoDslPackage.ASSOCIATION__NAVIGABILITY_B:
        return navigabilityB != NAVIGABILITY_B_EDEFAULT;
      case VertigoDslPackage.ASSOCIATION__MULTIPLICITY_A:
        return multiplicityA != MULTIPLICITY_A_EDEFAULT;
      case VertigoDslPackage.ASSOCIATION__MULTIPLICITY_B:
        return multiplicityB != MULTIPLICITY_B_EDEFAULT;
      case VertigoDslPackage.ASSOCIATION__LABEL_A:
        return LABEL_A_EDEFAULT == null ? labelA != null : !LABEL_A_EDEFAULT.equals(labelA);
      case VertigoDslPackage.ASSOCIATION__LABEL_B:
        return LABEL_B_EDEFAULT == null ? labelB != null : !LABEL_B_EDEFAULT.equals(labelB);
      case VertigoDslPackage.ASSOCIATION__ROLE_A:
        return ROLE_A_EDEFAULT == null ? roleA != null : !ROLE_A_EDEFAULT.equals(roleA);
      case VertigoDslPackage.ASSOCIATION__ROLE_B:
        return ROLE_B_EDEFAULT == null ? roleB != null : !ROLE_B_EDEFAULT.equals(roleB);
      case VertigoDslPackage.ASSOCIATION__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", fkFieldName: ");
    result.append(fkFieldName);
    result.append(", navigabilityA: ");
    result.append(navigabilityA);
    result.append(", navigabilityB: ");
    result.append(navigabilityB);
    result.append(", multiplicityA: ");
    result.append(multiplicityA);
    result.append(", multiplicityB: ");
    result.append(multiplicityB);
    result.append(", labelA: ");
    result.append(labelA);
    result.append(", labelB: ");
    result.append(labelB);
    result.append(", roleA: ");
    result.append(roleA);
    result.append(", roleB: ");
    result.append(roleB);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //AssociationImpl
