/**
 */
package designPatternsMDD.impl;

import designPatternsMDD.DesignPatternsMDDFactory;
import designPatternsMDD.DesignPatternsMDDPackage;
import designPatternsMDD.Root;

import designPatternsMDD.packages.PackagesPackage;

import designPatternsMDD.packages.impl.PackagesPackageImpl;

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
public class DesignPatternsMDDPackageImpl extends EPackageImpl implements DesignPatternsMDDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

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
	 * @see designPatternsMDD.DesignPatternsMDDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DesignPatternsMDDPackageImpl() {
		super(eNS_URI, DesignPatternsMDDFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DesignPatternsMDDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DesignPatternsMDDPackage init() {
		if (isInited)
			return (DesignPatternsMDDPackage) EPackage.Registry.INSTANCE.getEPackage(DesignPatternsMDDPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDesignPatternsMDDPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DesignPatternsMDDPackageImpl theDesignPatternsMDDPackage = registeredDesignPatternsMDDPackage instanceof DesignPatternsMDDPackageImpl
				? (DesignPatternsMDDPackageImpl) registeredDesignPatternsMDDPackage
				: new DesignPatternsMDDPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl) (registeredPackage instanceof PackagesPackageImpl
				? registeredPackage
				: PackagesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (registeredPackage instanceof PatternsPackageImpl
				? registeredPackage
				: PatternsPackage.eINSTANCE);

		// Create package meta-data objects
		theDesignPatternsMDDPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		thePatternsPackage.createPackageContents();

		// Initialize created meta-data
		theDesignPatternsMDDPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDesignPatternsMDDPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DesignPatternsMDDPackage.eNS_URI, theDesignPatternsMDDPackage);
		return theDesignPatternsMDDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Packages() {
		return (EReference) rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Patterns() {
		return (EReference) rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPatternsMDDFactory getDesignPatternsMDDFactory() {
		return (DesignPatternsMDDFactory) getEFactoryInstance();
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
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__PACKAGES);
		createEReference(rootEClass, ROOT__PATTERNS);
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
		PackagesPackage thePackagesPackage = (PackagesPackage) EPackage.Registry.INSTANCE
				.getEPackage(PackagesPackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage) EPackage.Registry.INSTANCE
				.getEPackage(PatternsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePackagesPackage);
		getESubpackages().add(thePatternsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Packages(), thePackagesPackage.getPackagesRoot(), null, "Packages", null, 1, 1,
				Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Patterns(), thePatternsPackage.getPatternRoot(), null, "Patterns", null, 1, 1,
				Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DesignPatternsMDDPackageImpl
