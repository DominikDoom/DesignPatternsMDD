/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.PatternsPackage;
import designPatternsMDD.patterns.StateGroup;
import designPatternsMDD.patterns.StatePattern;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.StatePatternImpl#getStateGroups <em>State Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatePatternImpl extends MinimalEObjectImpl.Container implements StatePattern {
	/**
	 * The cached value of the '{@link #getStateGroups() <em>State Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<StateGroup> stateGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.STATE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateGroup> getStateGroups() {
		if (stateGroups == null) {
			stateGroups = new EObjectContainmentEList<StateGroup>(StateGroup.class, this,
					PatternsPackage.STATE_PATTERN__STATE_GROUPS);
		}
		return stateGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PatternsPackage.STATE_PATTERN__STATE_GROUPS:
			return ((InternalEList<?>) getStateGroups()).basicRemove(otherEnd, msgs);
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
		case PatternsPackage.STATE_PATTERN__STATE_GROUPS:
			return getStateGroups();
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
		case PatternsPackage.STATE_PATTERN__STATE_GROUPS:
			getStateGroups().clear();
			getStateGroups().addAll((Collection<? extends StateGroup>) newValue);
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
		case PatternsPackage.STATE_PATTERN__STATE_GROUPS:
			getStateGroups().clear();
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
		case PatternsPackage.STATE_PATTERN__STATE_GROUPS:
			return stateGroups != null && !stateGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatePatternImpl
