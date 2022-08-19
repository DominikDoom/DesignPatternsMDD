/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.PatternsPackage;
import designPatternsMDD.patterns.StatePattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.StatePatternImpl#getStateClasses <em>State Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatePatternImpl extends MinimalEObjectImpl.Container implements StatePattern {
	/**
	 * The cached value of the '{@link #getStateClasses() <em>State Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> stateClasses;

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
	public EList<EClass> getStateClasses() {
		if (stateClasses == null) {
			stateClasses = new EObjectResolvingEList<EClass>(EClass.class, this,
					PatternsPackage.STATE_PATTERN__STATE_CLASSES);
		}
		return stateClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsPackage.STATE_PATTERN__STATE_CLASSES:
			return getStateClasses();
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
		case PatternsPackage.STATE_PATTERN__STATE_CLASSES:
			getStateClasses().clear();
			getStateClasses().addAll((Collection<? extends EClass>) newValue);
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
		case PatternsPackage.STATE_PATTERN__STATE_CLASSES:
			getStateClasses().clear();
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
		case PatternsPackage.STATE_PATTERN__STATE_CLASSES:
			return stateClasses != null && !stateClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatePatternImpl
