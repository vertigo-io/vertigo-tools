/**
 * generated by Xtext 2.21.0
 */
package io.vertigo.dsl.vertigoDsl.impl;

import io.vertigo.dsl.vertigoDsl.FacetedQueryDefinitionAction;
import io.vertigo.dsl.vertigoDsl.FacetedQueryDefinitionDomainCriteria;
import io.vertigo.dsl.vertigoDsl.FacetedQueryDefinitionFacets;
import io.vertigo.dsl.vertigoDsl.FacetedQueryDefinitionGeoSearchQuery;
import io.vertigo.dsl.vertigoDsl.FacetedQueryDefinitionKeyConcept;
import io.vertigo.dsl.vertigoDsl.FacetedQueryDefinitionListFilterBuilderClass;
import io.vertigo.dsl.vertigoDsl.FacetedQueryDefinitionListFilterBuilderQuery;
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faceted Query Definition Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.FacetedQueryDefinitionActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.FacetedQueryDefinitionActionImpl#getFacetedQueryDefinitionKeyConcept <em>Faceted Query Definition Key Concept</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.FacetedQueryDefinitionActionImpl#getFacetedQueryDefinitionDomainCriteria <em>Faceted Query Definition Domain Criteria</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.FacetedQueryDefinitionActionImpl#getFacetedQueryDefinitionListFilterBuilderQuery <em>Faceted Query Definition List Filter Builder Query</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.FacetedQueryDefinitionActionImpl#getFacetedQueryDefinitionGeoSearchQuery <em>Faceted Query Definition Geo Search Query</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.FacetedQueryDefinitionActionImpl#getFacetedQueryDefinitionListFilterBuilderClass <em>Faceted Query Definition List Filter Builder Class</em>}</li>
 *   <li>{@link io.vertigo.dsl.vertigoDsl.impl.FacetedQueryDefinitionActionImpl#getFacetedQueryDefinitionFacets <em>Faceted Query Definition Facets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetedQueryDefinitionActionImpl extends FacetedQueryDefinitionImpl implements FacetedQueryDefinitionAction
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
   * The cached value of the '{@link #getFacetedQueryDefinitionKeyConcept() <em>Faceted Query Definition Key Concept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetedQueryDefinitionKeyConcept()
   * @generated
   * @ordered
   */
  protected FacetedQueryDefinitionKeyConcept facetedQueryDefinitionKeyConcept;

  /**
   * The cached value of the '{@link #getFacetedQueryDefinitionDomainCriteria() <em>Faceted Query Definition Domain Criteria</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetedQueryDefinitionDomainCriteria()
   * @generated
   * @ordered
   */
  protected FacetedQueryDefinitionDomainCriteria facetedQueryDefinitionDomainCriteria;

  /**
   * The cached value of the '{@link #getFacetedQueryDefinitionListFilterBuilderQuery() <em>Faceted Query Definition List Filter Builder Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetedQueryDefinitionListFilterBuilderQuery()
   * @generated
   * @ordered
   */
  protected FacetedQueryDefinitionListFilterBuilderQuery facetedQueryDefinitionListFilterBuilderQuery;

  /**
   * The cached value of the '{@link #getFacetedQueryDefinitionGeoSearchQuery() <em>Faceted Query Definition Geo Search Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetedQueryDefinitionGeoSearchQuery()
   * @generated
   * @ordered
   */
  protected FacetedQueryDefinitionGeoSearchQuery facetedQueryDefinitionGeoSearchQuery;

  /**
   * The cached value of the '{@link #getFacetedQueryDefinitionListFilterBuilderClass() <em>Faceted Query Definition List Filter Builder Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetedQueryDefinitionListFilterBuilderClass()
   * @generated
   * @ordered
   */
  protected FacetedQueryDefinitionListFilterBuilderClass facetedQueryDefinitionListFilterBuilderClass;

  /**
   * The cached value of the '{@link #getFacetedQueryDefinitionFacets() <em>Faceted Query Definition Facets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacetedQueryDefinitionFacets()
   * @generated
   * @ordered
   */
  protected FacetedQueryDefinitionFacets facetedQueryDefinitionFacets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetedQueryDefinitionActionImpl()
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
    return VertigoDslPackage.Literals.FACETED_QUERY_DEFINITION_ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FacetedQueryDefinitionKeyConcept getFacetedQueryDefinitionKeyConcept()
  {
    return facetedQueryDefinitionKeyConcept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacetedQueryDefinitionKeyConcept(FacetedQueryDefinitionKeyConcept newFacetedQueryDefinitionKeyConcept, NotificationChain msgs)
  {
    FacetedQueryDefinitionKeyConcept oldFacetedQueryDefinitionKeyConcept = facetedQueryDefinitionKeyConcept;
    facetedQueryDefinitionKeyConcept = newFacetedQueryDefinitionKeyConcept;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT, oldFacetedQueryDefinitionKeyConcept, newFacetedQueryDefinitionKeyConcept);
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
  public void setFacetedQueryDefinitionKeyConcept(FacetedQueryDefinitionKeyConcept newFacetedQueryDefinitionKeyConcept)
  {
    if (newFacetedQueryDefinitionKeyConcept != facetedQueryDefinitionKeyConcept)
    {
      NotificationChain msgs = null;
      if (facetedQueryDefinitionKeyConcept != null)
        msgs = ((InternalEObject)facetedQueryDefinitionKeyConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT, null, msgs);
      if (newFacetedQueryDefinitionKeyConcept != null)
        msgs = ((InternalEObject)newFacetedQueryDefinitionKeyConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT, null, msgs);
      msgs = basicSetFacetedQueryDefinitionKeyConcept(newFacetedQueryDefinitionKeyConcept, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT, newFacetedQueryDefinitionKeyConcept, newFacetedQueryDefinitionKeyConcept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FacetedQueryDefinitionDomainCriteria getFacetedQueryDefinitionDomainCriteria()
  {
    return facetedQueryDefinitionDomainCriteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacetedQueryDefinitionDomainCriteria(FacetedQueryDefinitionDomainCriteria newFacetedQueryDefinitionDomainCriteria, NotificationChain msgs)
  {
    FacetedQueryDefinitionDomainCriteria oldFacetedQueryDefinitionDomainCriteria = facetedQueryDefinitionDomainCriteria;
    facetedQueryDefinitionDomainCriteria = newFacetedQueryDefinitionDomainCriteria;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA, oldFacetedQueryDefinitionDomainCriteria, newFacetedQueryDefinitionDomainCriteria);
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
  public void setFacetedQueryDefinitionDomainCriteria(FacetedQueryDefinitionDomainCriteria newFacetedQueryDefinitionDomainCriteria)
  {
    if (newFacetedQueryDefinitionDomainCriteria != facetedQueryDefinitionDomainCriteria)
    {
      NotificationChain msgs = null;
      if (facetedQueryDefinitionDomainCriteria != null)
        msgs = ((InternalEObject)facetedQueryDefinitionDomainCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA, null, msgs);
      if (newFacetedQueryDefinitionDomainCriteria != null)
        msgs = ((InternalEObject)newFacetedQueryDefinitionDomainCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA, null, msgs);
      msgs = basicSetFacetedQueryDefinitionDomainCriteria(newFacetedQueryDefinitionDomainCriteria, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA, newFacetedQueryDefinitionDomainCriteria, newFacetedQueryDefinitionDomainCriteria));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FacetedQueryDefinitionListFilterBuilderQuery getFacetedQueryDefinitionListFilterBuilderQuery()
  {
    return facetedQueryDefinitionListFilterBuilderQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacetedQueryDefinitionListFilterBuilderQuery(FacetedQueryDefinitionListFilterBuilderQuery newFacetedQueryDefinitionListFilterBuilderQuery, NotificationChain msgs)
  {
    FacetedQueryDefinitionListFilterBuilderQuery oldFacetedQueryDefinitionListFilterBuilderQuery = facetedQueryDefinitionListFilterBuilderQuery;
    facetedQueryDefinitionListFilterBuilderQuery = newFacetedQueryDefinitionListFilterBuilderQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY, oldFacetedQueryDefinitionListFilterBuilderQuery, newFacetedQueryDefinitionListFilterBuilderQuery);
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
  public void setFacetedQueryDefinitionListFilterBuilderQuery(FacetedQueryDefinitionListFilterBuilderQuery newFacetedQueryDefinitionListFilterBuilderQuery)
  {
    if (newFacetedQueryDefinitionListFilterBuilderQuery != facetedQueryDefinitionListFilterBuilderQuery)
    {
      NotificationChain msgs = null;
      if (facetedQueryDefinitionListFilterBuilderQuery != null)
        msgs = ((InternalEObject)facetedQueryDefinitionListFilterBuilderQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY, null, msgs);
      if (newFacetedQueryDefinitionListFilterBuilderQuery != null)
        msgs = ((InternalEObject)newFacetedQueryDefinitionListFilterBuilderQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY, null, msgs);
      msgs = basicSetFacetedQueryDefinitionListFilterBuilderQuery(newFacetedQueryDefinitionListFilterBuilderQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY, newFacetedQueryDefinitionListFilterBuilderQuery, newFacetedQueryDefinitionListFilterBuilderQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FacetedQueryDefinitionGeoSearchQuery getFacetedQueryDefinitionGeoSearchQuery()
  {
    return facetedQueryDefinitionGeoSearchQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacetedQueryDefinitionGeoSearchQuery(FacetedQueryDefinitionGeoSearchQuery newFacetedQueryDefinitionGeoSearchQuery, NotificationChain msgs)
  {
    FacetedQueryDefinitionGeoSearchQuery oldFacetedQueryDefinitionGeoSearchQuery = facetedQueryDefinitionGeoSearchQuery;
    facetedQueryDefinitionGeoSearchQuery = newFacetedQueryDefinitionGeoSearchQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY, oldFacetedQueryDefinitionGeoSearchQuery, newFacetedQueryDefinitionGeoSearchQuery);
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
  public void setFacetedQueryDefinitionGeoSearchQuery(FacetedQueryDefinitionGeoSearchQuery newFacetedQueryDefinitionGeoSearchQuery)
  {
    if (newFacetedQueryDefinitionGeoSearchQuery != facetedQueryDefinitionGeoSearchQuery)
    {
      NotificationChain msgs = null;
      if (facetedQueryDefinitionGeoSearchQuery != null)
        msgs = ((InternalEObject)facetedQueryDefinitionGeoSearchQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY, null, msgs);
      if (newFacetedQueryDefinitionGeoSearchQuery != null)
        msgs = ((InternalEObject)newFacetedQueryDefinitionGeoSearchQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY, null, msgs);
      msgs = basicSetFacetedQueryDefinitionGeoSearchQuery(newFacetedQueryDefinitionGeoSearchQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY, newFacetedQueryDefinitionGeoSearchQuery, newFacetedQueryDefinitionGeoSearchQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FacetedQueryDefinitionListFilterBuilderClass getFacetedQueryDefinitionListFilterBuilderClass()
  {
    return facetedQueryDefinitionListFilterBuilderClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacetedQueryDefinitionListFilterBuilderClass(FacetedQueryDefinitionListFilterBuilderClass newFacetedQueryDefinitionListFilterBuilderClass, NotificationChain msgs)
  {
    FacetedQueryDefinitionListFilterBuilderClass oldFacetedQueryDefinitionListFilterBuilderClass = facetedQueryDefinitionListFilterBuilderClass;
    facetedQueryDefinitionListFilterBuilderClass = newFacetedQueryDefinitionListFilterBuilderClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS, oldFacetedQueryDefinitionListFilterBuilderClass, newFacetedQueryDefinitionListFilterBuilderClass);
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
  public void setFacetedQueryDefinitionListFilterBuilderClass(FacetedQueryDefinitionListFilterBuilderClass newFacetedQueryDefinitionListFilterBuilderClass)
  {
    if (newFacetedQueryDefinitionListFilterBuilderClass != facetedQueryDefinitionListFilterBuilderClass)
    {
      NotificationChain msgs = null;
      if (facetedQueryDefinitionListFilterBuilderClass != null)
        msgs = ((InternalEObject)facetedQueryDefinitionListFilterBuilderClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS, null, msgs);
      if (newFacetedQueryDefinitionListFilterBuilderClass != null)
        msgs = ((InternalEObject)newFacetedQueryDefinitionListFilterBuilderClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS, null, msgs);
      msgs = basicSetFacetedQueryDefinitionListFilterBuilderClass(newFacetedQueryDefinitionListFilterBuilderClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS, newFacetedQueryDefinitionListFilterBuilderClass, newFacetedQueryDefinitionListFilterBuilderClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FacetedQueryDefinitionFacets getFacetedQueryDefinitionFacets()
  {
    return facetedQueryDefinitionFacets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacetedQueryDefinitionFacets(FacetedQueryDefinitionFacets newFacetedQueryDefinitionFacets, NotificationChain msgs)
  {
    FacetedQueryDefinitionFacets oldFacetedQueryDefinitionFacets = facetedQueryDefinitionFacets;
    facetedQueryDefinitionFacets = newFacetedQueryDefinitionFacets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS, oldFacetedQueryDefinitionFacets, newFacetedQueryDefinitionFacets);
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
  public void setFacetedQueryDefinitionFacets(FacetedQueryDefinitionFacets newFacetedQueryDefinitionFacets)
  {
    if (newFacetedQueryDefinitionFacets != facetedQueryDefinitionFacets)
    {
      NotificationChain msgs = null;
      if (facetedQueryDefinitionFacets != null)
        msgs = ((InternalEObject)facetedQueryDefinitionFacets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS, null, msgs);
      if (newFacetedQueryDefinitionFacets != null)
        msgs = ((InternalEObject)newFacetedQueryDefinitionFacets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS, null, msgs);
      msgs = basicSetFacetedQueryDefinitionFacets(newFacetedQueryDefinitionFacets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS, newFacetedQueryDefinitionFacets, newFacetedQueryDefinitionFacets));
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT:
        return basicSetFacetedQueryDefinitionKeyConcept(null, msgs);
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA:
        return basicSetFacetedQueryDefinitionDomainCriteria(null, msgs);
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY:
        return basicSetFacetedQueryDefinitionListFilterBuilderQuery(null, msgs);
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY:
        return basicSetFacetedQueryDefinitionGeoSearchQuery(null, msgs);
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS:
        return basicSetFacetedQueryDefinitionListFilterBuilderClass(null, msgs);
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS:
        return basicSetFacetedQueryDefinitionFacets(null, msgs);
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__NAME:
        return getName();
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT:
        return getFacetedQueryDefinitionKeyConcept();
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA:
        return getFacetedQueryDefinitionDomainCriteria();
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY:
        return getFacetedQueryDefinitionListFilterBuilderQuery();
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY:
        return getFacetedQueryDefinitionGeoSearchQuery();
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS:
        return getFacetedQueryDefinitionListFilterBuilderClass();
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS:
        return getFacetedQueryDefinitionFacets();
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__NAME:
        setName((String)newValue);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT:
        setFacetedQueryDefinitionKeyConcept((FacetedQueryDefinitionKeyConcept)newValue);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA:
        setFacetedQueryDefinitionDomainCriteria((FacetedQueryDefinitionDomainCriteria)newValue);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY:
        setFacetedQueryDefinitionListFilterBuilderQuery((FacetedQueryDefinitionListFilterBuilderQuery)newValue);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY:
        setFacetedQueryDefinitionGeoSearchQuery((FacetedQueryDefinitionGeoSearchQuery)newValue);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS:
        setFacetedQueryDefinitionListFilterBuilderClass((FacetedQueryDefinitionListFilterBuilderClass)newValue);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS:
        setFacetedQueryDefinitionFacets((FacetedQueryDefinitionFacets)newValue);
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT:
        setFacetedQueryDefinitionKeyConcept((FacetedQueryDefinitionKeyConcept)null);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA:
        setFacetedQueryDefinitionDomainCriteria((FacetedQueryDefinitionDomainCriteria)null);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY:
        setFacetedQueryDefinitionListFilterBuilderQuery((FacetedQueryDefinitionListFilterBuilderQuery)null);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY:
        setFacetedQueryDefinitionGeoSearchQuery((FacetedQueryDefinitionGeoSearchQuery)null);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS:
        setFacetedQueryDefinitionListFilterBuilderClass((FacetedQueryDefinitionListFilterBuilderClass)null);
        return;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS:
        setFacetedQueryDefinitionFacets((FacetedQueryDefinitionFacets)null);
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
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_KEY_CONCEPT:
        return facetedQueryDefinitionKeyConcept != null;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_DOMAIN_CRITERIA:
        return facetedQueryDefinitionDomainCriteria != null;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_QUERY:
        return facetedQueryDefinitionListFilterBuilderQuery != null;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_GEO_SEARCH_QUERY:
        return facetedQueryDefinitionGeoSearchQuery != null;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_LIST_FILTER_BUILDER_CLASS:
        return facetedQueryDefinitionListFilterBuilderClass != null;
      case VertigoDslPackage.FACETED_QUERY_DEFINITION_ACTION__FACETED_QUERY_DEFINITION_FACETS:
        return facetedQueryDefinitionFacets != null;
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
    result.append(')');
    return result.toString();
  }

} //FacetedQueryDefinitionActionImpl
