/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.ObserverPair;
import designPatternsMDD.patterns.PatternsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observer Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.ObserverPairImpl#getObservable <em>Observable</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.impl.ObserverPairImpl#getObservers <em>Observers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObserverPairImpl extends MinimalEObjectImpl.Container implements ObserverPair {
	/**
	 * The cached value of the '{@link #getObservable() <em>Observable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservable()
	 * @generated
	 * @ordered
	 */
	protected EClass observable;

	/**
	 * The cached value of the '{@link #getObservers() <em>Observers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservers()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> observers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.OBSERVER_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservable() {
		if (observable != null && observable.eIsProxy()) {
			InternalEObject oldObservable = (InternalEObject) observable;
			observable = (EClass) eResolveProxy(oldObservable);
			if (observable != oldObservable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.OBSERVER_PAIR__OBSERVABLE,
							oldObservable, observable));
			}
		}
		return observable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetObservable() {
		return observable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservable(EClass newObservable) {
		EClass oldObservable = observable;
		observable = newObservable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBSERVER_PAIR__OBSERVABLE,
					oldObservable, observable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getObservers() {
		if (observers == null) {
			observers = new EObjectResolvingEList<EClass>(EClass.class, this, PatternsPackage.OBSERVER_PAIR__OBSERVERS);
		}
		return observers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsPackage.OBSERVER_PAIR__OBSERVABLE:
			if (resolve)
				return getObservable();
			return basicGetObservable();
		case PatternsPackage.OBSERVER_PAIR__OBSERVERS:
			return getObservers();
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
		case PatternsPackage.OBSERVER_PAIR__OBSERVABLE:
			setObservable((EClass) newValue);
			return;
		case PatternsPackage.OBSERVER_PAIR__OBSERVERS:
			getObservers().clear();
			getObservers().addAll((Collection<? extends EClass>) newValue);
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
		case PatternsPackage.OBSERVER_PAIR__OBSERVABLE:
			setObservable((EClass) null);
			return;
		case PatternsPackage.OBSERVER_PAIR__OBSERVERS:
			getObservers().clear();
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
		case PatternsPackage.OBSERVER_PAIR__OBSERVABLE:
			return observable != null;
		case PatternsPackage.OBSERVER_PAIR__OBSERVERS:
			return observers != null && !observers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObserverPairImpl
