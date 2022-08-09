/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.patterns.BuilderPattern;
import designPatternsMDD.patterns.PatternsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.patterns.impl.BuilderPatternImpl#getBuilderClasses <em>Builder Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuilderPatternImpl extends MinimalEObjectImpl.Container implements BuilderPattern {
	/**
	 * The cached value of the '{@link #getBuilderClasses() <em>Builder Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> builderClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuilderPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.BUILDER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getBuilderClasses() {
		if (builderClasses == null) {
			builderClasses = new EObjectResolvingEList<EClass>(EClass.class, this,
					PatternsPackage.BUILDER_PATTERN__BUILDER_CLASSES);
		}
		return builderClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PatternsPackage.BUILDER_PATTERN__BUILDER_CLASSES:
			return getBuilderClasses();
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
		case PatternsPackage.BUILDER_PATTERN__BUILDER_CLASSES:
			getBuilderClasses().clear();
			getBuilderClasses().addAll((Collection<? extends EClass>) newValue);
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
		case PatternsPackage.BUILDER_PATTERN__BUILDER_CLASSES:
			getBuilderClasses().clear();
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
		case PatternsPackage.BUILDER_PATTERN__BUILDER_CLASSES:
			return builderClasses != null && !builderClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuilderPatternImpl
