/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.PatternsPackage;
import designPatternsMDD.patterns.StateGroup;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.StateGroupImpl#getMainClass <em>Main Class</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.impl.StateGroupImpl#getStateClasses <em>State Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateGroupImpl extends MinimalEObjectImpl.Container implements StateGroup {
	/**
	 * The cached value of the '{@link #getMainClass() <em>Main Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainClass()
	 * @generated
	 * @ordered
	 */
	protected EClass mainClass;

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
	protected StateGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.STATE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainClass() {
		if (mainClass != null && mainClass.eIsProxy()) {
			InternalEObject oldMainClass = (InternalEObject) mainClass;
			mainClass = (EClass) eResolveProxy(oldMainClass);
			if (mainClass != oldMainClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.STATE_GROUP__MAIN_CLASS,
							oldMainClass, mainClass));
			}
		}
		return mainClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetMainClass() {
		return mainClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainClass(EClass newMainClass) {
		EClass oldMainClass = mainClass;
		mainClass = newMainClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.STATE_GROUP__MAIN_CLASS, oldMainClass,
					mainClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getStateClasses() {
		if (stateClasses == null) {
			stateClasses = new EObjectResolvingEList<EClass>(EClass.class, this,
					PatternsPackage.STATE_GROUP__STATE_CLASSES);
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
		case PatternsPackage.STATE_GROUP__MAIN_CLASS:
			if (resolve)
				return getMainClass();
			return basicGetMainClass();
		case PatternsPackage.STATE_GROUP__STATE_CLASSES:
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
		case PatternsPackage.STATE_GROUP__MAIN_CLASS:
			setMainClass((EClass) newValue);
			return;
		case PatternsPackage.STATE_GROUP__STATE_CLASSES:
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
		case PatternsPackage.STATE_GROUP__MAIN_CLASS:
			setMainClass((EClass) null);
			return;
		case PatternsPackage.STATE_GROUP__STATE_CLASSES:
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
		case PatternsPackage.STATE_GROUP__MAIN_CLASS:
			return mainClass != null;
		case PatternsPackage.STATE_GROUP__STATE_CLASSES:
			return stateClasses != null && !stateClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateGroupImpl
