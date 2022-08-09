/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.PatternsPackage;
import designPatternsMDD.patterns.SingletonPattern;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.SingletonPatternImpl#getSingletonClasses <em>Singleton Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingletonPatternImpl extends MinimalEObjectImpl.Container implements SingletonPattern {
	/**
	 * The cached value of the '{@link #getSingletonClasses() <em>Singleton Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> singletonClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingletonPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.SINGLETON_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getSingletonClasses() {
		if (singletonClasses == null) {
			singletonClasses = new EObjectResolvingEList<EClass>(EClass.class, this,
					PatternsPackage.SINGLETON_PATTERN__SINGLETON_CLASSES);
		}
		return singletonClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsPackage.SINGLETON_PATTERN__SINGLETON_CLASSES:
			return getSingletonClasses();
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
		case PatternsPackage.SINGLETON_PATTERN__SINGLETON_CLASSES:
			getSingletonClasses().clear();
			getSingletonClasses().addAll((Collection<? extends EClass>) newValue);
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
		case PatternsPackage.SINGLETON_PATTERN__SINGLETON_CLASSES:
			getSingletonClasses().clear();
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
		case PatternsPackage.SINGLETON_PATTERN__SINGLETON_CLASSES:
			return singletonClasses != null && !singletonClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SingletonPatternImpl
