/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.FactoryGroup;
import designPatternsMDD.patterns.PatternsPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.FactoryGroupImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link designPatternsMDD.patterns.impl.FactoryGroupImpl#getFactoryClasses <em>Factory Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryGroupImpl extends MinimalEObjectImpl.Container implements FactoryGroup {
	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFactoryClasses() <em>Factory Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> factoryClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.FACTORY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.FACTORY_GROUP__GROUP_NAME,
					oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getFactoryClasses() {
		if (factoryClasses == null) {
			factoryClasses = new EObjectResolvingEList<EClass>(EClass.class, this,
					PatternsPackage.FACTORY_GROUP__FACTORY_CLASSES);
		}
		return factoryClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsPackage.FACTORY_GROUP__GROUP_NAME:
			return getGroupName();
		case PatternsPackage.FACTORY_GROUP__FACTORY_CLASSES:
			return getFactoryClasses();
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
		case PatternsPackage.FACTORY_GROUP__GROUP_NAME:
			setGroupName((String) newValue);
			return;
		case PatternsPackage.FACTORY_GROUP__FACTORY_CLASSES:
			getFactoryClasses().clear();
			getFactoryClasses().addAll((Collection<? extends EClass>) newValue);
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
		case PatternsPackage.FACTORY_GROUP__GROUP_NAME:
			setGroupName(GROUP_NAME_EDEFAULT);
			return;
		case PatternsPackage.FACTORY_GROUP__FACTORY_CLASSES:
			getFactoryClasses().clear();
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
		case PatternsPackage.FACTORY_GROUP__GROUP_NAME:
			return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
		case PatternsPackage.FACTORY_GROUP__FACTORY_CLASSES:
			return factoryClasses != null && !factoryClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (GroupName: ");
		result.append(groupName);
		result.append(')');
		return result.toString();
	}

} //FactoryGroupImpl
