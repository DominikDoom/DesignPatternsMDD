/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.BuilderPattern;
import designPatternsMDD.patterns.ObserverPattern;
import designPatternsMDD.patterns.PatternRoot;
import designPatternsMDD.patterns.PatternsPackage;
import designPatternsMDD.patterns.SingletonPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.PatternRootImpl#getObserverPattern <em>Observer Pattern</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.impl.PatternRootImpl#getSingletonPattern <em>Singleton Pattern</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.impl.PatternRootImpl#getBuilderPattern <em>Builder Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternRootImpl extends MinimalEObjectImpl.Container implements PatternRoot {
	/**
	 * The cached value of the '{@link #getObserverPattern() <em>Observer Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserverPattern()
	 * @generated
	 * @ordered
	 */
	protected ObserverPattern observerPattern;

	/**
	 * The cached value of the '{@link #getSingletonPattern() <em>Singleton Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonPattern()
	 * @generated
	 * @ordered
	 */
	protected SingletonPattern singletonPattern;

	/**
	 * The cached value of the '{@link #getBuilderPattern() <em>Builder Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderPattern()
	 * @generated
	 * @ordered
	 */
	protected BuilderPattern builderPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PATTERN_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverPattern getObserverPattern() {
		return observerPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObserverPattern(ObserverPattern newObserverPattern, NotificationChain msgs) {
		ObserverPattern oldObserverPattern = observerPattern;
		observerPattern = newObserverPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN, oldObserverPattern, newObserverPattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserverPattern(ObserverPattern newObserverPattern) {
		if (newObserverPattern != observerPattern) {
			NotificationChain msgs = null;
			if (observerPattern != null)
				msgs = ((InternalEObject) observerPattern).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN, null, msgs);
			if (newObserverPattern != null)
				msgs = ((InternalEObject) newObserverPattern).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN, null, msgs);
			msgs = basicSetObserverPattern(newObserverPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN,
					newObserverPattern, newObserverPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonPattern getSingletonPattern() {
		return singletonPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingletonPattern(SingletonPattern newSingletonPattern, NotificationChain msgs) {
		SingletonPattern oldSingletonPattern = singletonPattern;
		singletonPattern = newSingletonPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN, oldSingletonPattern, newSingletonPattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonPattern(SingletonPattern newSingletonPattern) {
		if (newSingletonPattern != singletonPattern) {
			NotificationChain msgs = null;
			if (singletonPattern != null)
				msgs = ((InternalEObject) singletonPattern).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN, null, msgs);
			if (newSingletonPattern != null)
				msgs = ((InternalEObject) newSingletonPattern).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN, null, msgs);
			msgs = basicSetSingletonPattern(newSingletonPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN,
					newSingletonPattern, newSingletonPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderPattern getBuilderPattern() {
		return builderPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuilderPattern(BuilderPattern newBuilderPattern, NotificationChain msgs) {
		BuilderPattern oldBuilderPattern = builderPattern;
		builderPattern = newBuilderPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN, oldBuilderPattern, newBuilderPattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuilderPattern(BuilderPattern newBuilderPattern) {
		if (newBuilderPattern != builderPattern) {
			NotificationChain msgs = null;
			if (builderPattern != null)
				msgs = ((InternalEObject) builderPattern).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN, null, msgs);
			if (newBuilderPattern != null)
				msgs = ((InternalEObject) newBuilderPattern).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN, null, msgs);
			msgs = basicSetBuilderPattern(newBuilderPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN,
					newBuilderPattern, newBuilderPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN:
			return basicSetObserverPattern(null, msgs);
		case PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN:
			return basicSetSingletonPattern(null, msgs);
		case PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN:
			return basicSetBuilderPattern(null, msgs);
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
		case PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN:
			return getObserverPattern();
		case PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN:
			return getSingletonPattern();
		case PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN:
			return getBuilderPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN:
			setObserverPattern((ObserverPattern) newValue);
			return;
		case PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN:
			setSingletonPattern((SingletonPattern) newValue);
			return;
		case PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN:
			setBuilderPattern((BuilderPattern) newValue);
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
		case PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN:
			setObserverPattern((ObserverPattern) null);
			return;
		case PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN:
			setSingletonPattern((SingletonPattern) null);
			return;
		case PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN:
			setBuilderPattern((BuilderPattern) null);
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
		case PatternsPackage.PATTERN_ROOT__OBSERVER_PATTERN:
			return observerPattern != null;
		case PatternsPackage.PATTERN_ROOT__SINGLETON_PATTERN:
			return singletonPattern != null;
		case PatternsPackage.PATTERN_ROOT__BUILDER_PATTERN:
			return builderPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //PatternRootImpl
