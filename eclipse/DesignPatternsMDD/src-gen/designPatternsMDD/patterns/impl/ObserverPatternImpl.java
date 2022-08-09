/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.ObserverPair;
import designPatternsMDD.patterns.ObserverPattern;
import designPatternsMDD.patterns.PatternsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observer Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.ObserverPatternImpl#getObseverPairs <em>Obsever Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObserverPatternImpl extends MinimalEObjectImpl.Container implements ObserverPattern {
	/**
	 * The cached value of the '{@link #getObseverPairs() <em>Obsever Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObseverPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<ObserverPair> obseverPairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.OBSERVER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObserverPair> getObseverPairs() {
		if (obseverPairs == null) {
			obseverPairs = new EObjectContainmentEList<ObserverPair>(ObserverPair.class, this,
					PatternsPackage.OBSERVER_PATTERN__OBSEVER_PAIRS);
		}
		return obseverPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PatternsPackage.OBSERVER_PATTERN__OBSEVER_PAIRS:
			return ((InternalEList<?>) getObseverPairs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsPackage.OBSERVER_PATTERN__OBSEVER_PAIRS:
			return getObseverPairs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PatternsPackage.OBSERVER_PATTERN__OBSEVER_PAIRS:
			getObseverPairs().clear();
			getObseverPairs().addAll((Collection<? extends ObserverPair>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case PatternsPackage.OBSERVER_PATTERN__OBSEVER_PAIRS:
			getObseverPairs().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PatternsPackage.OBSERVER_PATTERN__OBSEVER_PAIRS:
			return obseverPairs != null && !obseverPairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObserverPatternImpl
