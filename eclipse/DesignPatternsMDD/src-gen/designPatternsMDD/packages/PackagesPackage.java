/**
 */
package designPatternsMDD.packages;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see designPatternsMDD.packages.PackagesFactory
 * @model kind="package"
 * @generated
 */
public interface PackagesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "packages";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/designPatternsMDD/packages";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "packages";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagesPackage eINSTANCE = designPatternsMDD.packages.impl.PackagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link designPatternsMDD.packages.impl.PackagesRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.packages.impl.PackagesRootImpl
	 * @see designPatternsMDD.packages.impl.PackagesPackageImpl#getPackagesRoot()
	 * @generated
	 */
	int PACKAGES_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_ROOT__PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_ROOT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.packages.PackagesRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see designPatternsMDD.packages.PackagesRoot
	 * @generated
	 */
	EClass getPackagesRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link designPatternsMDD.packages.PackagesRoot#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see designPatternsMDD.packages.PackagesRoot#getPackages()
	 * @see #getPackagesRoot()
	 * @generated
	 */
	EReference getPackagesRoot_Packages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackagesFactory getPackagesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link designPatternsMDD.packages.impl.PackagesRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.packages.impl.PackagesRootImpl
		 * @see designPatternsMDD.packages.impl.PackagesPackageImpl#getPackagesRoot()
		 * @generated
		 */
		EClass PACKAGES_ROOT = eINSTANCE.getPackagesRoot();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGES_ROOT__PACKAGES = eINSTANCE.getPackagesRoot_Packages();

	}

} //PackagesPackage
