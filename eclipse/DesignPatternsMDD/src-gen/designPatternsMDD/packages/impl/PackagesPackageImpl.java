/**
 */
package designPatternsMDD.packages.impl;

import designPatternsMDD.DesignPatternsMDDPackage;

import designPatternsMDD.impl.DesignPatternsMDDPackageImpl;

import designPatternsMDD.packages.PackagesFactory;
import designPatternsMDD.packages.PackagesPackage;
import designPatternsMDD.packages.PackagesRoot;

import designPatternsMDD.patterns.PatternsPackage;

import designPatternsMDD.patterns.impl.PatternsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagesPackageImpl extends EPackageImpl implements PackagesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagesRootEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see designPatternsMDD.packages.PackagesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackagesPackageImpl() {
		super(eNS_URI, PackagesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PackagesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PackagesPackage init() {
		if (isInited)
			return (PackagesPackage) EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPackagesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PackagesPackageImpl thePackagesPackage = registeredPackagesPackage instanceof PackagesPackageImpl
				? (PackagesPackageImpl) registeredPackagesPackage
				: new PackagesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DesignPatternsMDDPackage.eNS_URI);
		DesignPatternsMDDPackageImpl theDesignPatternsMDDPackage = (DesignPatternsMDDPackageImpl) (registeredPackage instanceof DesignPatternsMDDPackageImpl
				? registeredPackage
				: DesignPatternsMDDPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (registeredPackage instanceof PatternsPackageImpl
				? registeredPackage
				: PatternsPackage.eINSTANCE);

		// Create package meta-data objects
		thePackagesPackage.createPackageContents();
		theDesignPatternsMDDPackage.createPackageContents();
		thePatternsPackage.createPackageContents();

		// Initialize created meta-data
		thePackagesPackage.initializePackageContents();
		theDesignPatternsMDDPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePackagesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PackagesPackage.eNS_URI, thePackagesPackage);
		return thePackagesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackagesRoot() {
		return packagesRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackagesRoot_Packages() {
		return (EReference) packagesRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesFactory getPackagesFactory() {
		return (PackagesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		packagesRootEClass = createEClass(PACKAGES_ROOT);
		createEReference(packagesRootEClass, PACKAGES_ROOT__PACKAGES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(packagesRootEClass, PackagesRoot.class, "PackagesRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackagesRoot_Packages(), theEcorePackage.getEPackage(), null, "Packages", null, 0, -1,
				PackagesRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PackagesPackageImpl
