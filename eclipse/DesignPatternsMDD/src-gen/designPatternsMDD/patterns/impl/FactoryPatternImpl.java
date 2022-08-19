/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.FactoryGroup;
import designPatternsMDD.patterns.FactoryPattern;
import designPatternsMDD.patterns.PatternsPackage;
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
 * An implementation of the model object '<em><b>Factory Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.FactoryPatternImpl#getFactoryGroups <em>Factory Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryPatternImpl extends MinimalEObjectImpl.Container implements FactoryPattern {
	/**
	 * The cached value of the '{@link #getFactoryGroups() <em>Factory Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<FactoryGroup> factoryGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.FACTORY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactoryGroup> getFactoryGroups() {
		if (factoryGroups == null) {
			factoryGroups = new EObjectContainmentEList<FactoryGroup>(FactoryGroup.class, this,
					PatternsPackage.FACTORY_PATTERN__FACTORY_GROUPS);
		}
		return factoryGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PatternsPackage.FACTORY_PATTERN__FACTORY_GROUPS:
			return ((InternalEList<?>) getFactoryGroups()).basicRemove(otherEnd, msgs);
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
		case PatternsPackage.FACTORY_PATTERN__FACTORY_GROUPS:
			return getFactoryGroups();
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
		case PatternsPackage.FACTORY_PATTERN__FACTORY_GROUPS:
			getFactoryGroups().clear();
			getFactoryGroups().addAll((Collection<? extends FactoryGroup>) newValue);
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
		case PatternsPackage.FACTORY_PATTERN__FACTORY_GROUPS:
			getFactoryGroups().clear();
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
		case PatternsPackage.FACTORY_PATTERN__FACTORY_GROUPS:
			return factoryGroups != null && !factoryGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactoryPatternImpl
