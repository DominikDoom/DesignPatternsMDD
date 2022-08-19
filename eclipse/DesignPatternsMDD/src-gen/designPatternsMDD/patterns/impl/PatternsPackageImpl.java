/**
 */
package designPatternsMDD.patterns.impl;

import designPatternsMDD.DesignPatternsMDDPackage;
import designPatternsMDD.impl.DesignPatternsMDDPackageImpl;
import designPatternsMDD.packages.PackagesPackage;
import designPatternsMDD.packages.impl.PackagesPackageImpl;
import designPatternsMDD.patterns.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observerPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observerPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryGroupEClass = null;

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
	 * @see designPatternsMDD.patterns.PatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternsPackageImpl() {
		super(eNS_URI, PatternsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternsPackage init() {
		if (isInited)
			return (PatternsPackage) EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPatternsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PatternsPackageImpl thePatternsPackage = registeredPatternsPackage instanceof PatternsPackageImpl
				? (PatternsPackageImpl) registeredPatternsPackage
				: new PatternsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DesignPatternsMDDPackage.eNS_URI);
		DesignPatternsMDDPackageImpl theDesignPatternsMDDPackage = (DesignPatternsMDDPackageImpl) (registeredPackage instanceof DesignPatternsMDDPackageImpl
				? registeredPackage
				: DesignPatternsMDDPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl) (registeredPackage instanceof PackagesPackageImpl
				? registeredPackage
				: PackagesPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternsPackage.createPackageContents();
		theDesignPatternsMDDPackage.createPackageContents();
		thePackagesPackage.createPackageContents();

		// Initialize created meta-data
		thePatternsPackage.initializePackageContents();
		theDesignPatternsMDDPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
		return thePatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternRoot() {
		return patternRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternRoot_ObserverPattern() {
		return (EReference) patternRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternRoot_SingletonPattern() {
		return (EReference) patternRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternRoot_BuilderPattern() {
		return (EReference) patternRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternRoot_FactoryPattern() {
		return (EReference) patternRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternRoot_StatePattern() {
		return (EReference) patternRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserverPattern() {
		return observerPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPattern_ObseverPairs() {
		return (EReference) observerPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonPattern() {
		return singletonPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingletonPattern_SingletonClasses() {
		return (EReference) singletonPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderPattern() {
		return builderPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderPattern_BuilderClasses() {
		return (EReference) builderPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserverPair() {
		return observerPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPair_Observable() {
		return (EReference) observerPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverPair_Observers() {
		return (EReference) observerPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryPattern() {
		return factoryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryPattern_FactoryGroups() {
		return (EReference) factoryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatePattern() {
		return statePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatePattern_StateClasses() {
		return (EReference) statePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryGroup() {
		return factoryGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryGroup_GroupName() {
		return (EAttribute) factoryGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryGroup_FactoryClasses() {
		return (EReference) factoryGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactory getPatternsFactory() {
		return (PatternsFactory) getEFactoryInstance();
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
		patternRootEClass = createEClass(PATTERN_ROOT);
		createEReference(patternRootEClass, PATTERN_ROOT__OBSERVER_PATTERN);
		createEReference(patternRootEClass, PATTERN_ROOT__SINGLETON_PATTERN);
		createEReference(patternRootEClass, PATTERN_ROOT__BUILDER_PATTERN);
		createEReference(patternRootEClass, PATTERN_ROOT__FACTORY_PATTERN);
		createEReference(patternRootEClass, PATTERN_ROOT__STATE_PATTERN);

		observerPatternEClass = createEClass(OBSERVER_PATTERN);
		createEReference(observerPatternEClass, OBSERVER_PATTERN__OBSEVER_PAIRS);

		singletonPatternEClass = createEClass(SINGLETON_PATTERN);
		createEReference(singletonPatternEClass, SINGLETON_PATTERN__SINGLETON_CLASSES);

		builderPatternEClass = createEClass(BUILDER_PATTERN);
		createEReference(builderPatternEClass, BUILDER_PATTERN__BUILDER_CLASSES);

		observerPairEClass = createEClass(OBSERVER_PAIR);
		createEReference(observerPairEClass, OBSERVER_PAIR__OBSERVABLE);
		createEReference(observerPairEClass, OBSERVER_PAIR__OBSERVERS);

		factoryPatternEClass = createEClass(FACTORY_PATTERN);
		createEReference(factoryPatternEClass, FACTORY_PATTERN__FACTORY_GROUPS);

		statePatternEClass = createEClass(STATE_PATTERN);
		createEReference(statePatternEClass, STATE_PATTERN__STATE_CLASSES);

		factoryGroupEClass = createEClass(FACTORY_GROUP);
		createEAttribute(factoryGroupEClass, FACTORY_GROUP__GROUP_NAME);
		createEReference(factoryGroupEClass, FACTORY_GROUP__FACTORY_CLASSES);
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
		initEClass(patternRootEClass, PatternRoot.class, "PatternRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternRoot_ObserverPattern(), this.getObserverPattern(), null, "observerPattern", null, 0, 1,
				PatternRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternRoot_SingletonPattern(), this.getSingletonPattern(), null, "singletonPattern", null, 0,
				1, PatternRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternRoot_BuilderPattern(), this.getBuilderPattern(), null, "builderPattern", null, 0, 1,
				PatternRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternRoot_FactoryPattern(), this.getFactoryPattern(), null, "factoryPattern", null, 0, 1,
				PatternRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternRoot_StatePattern(), this.getStatePattern(), null, "statePattern", null, 0, 1,
				PatternRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observerPatternEClass, ObserverPattern.class, "ObserverPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObserverPattern_ObseverPairs(), this.getObserverPair(), null, "ObseverPairs", null, 1, -1,
				ObserverPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonPatternEClass, SingletonPattern.class, "SingletonPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingletonPattern_SingletonClasses(), theEcorePackage.getEClass(), null, "SingletonClasses",
				null, 1, -1, SingletonPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderPatternEClass, BuilderPattern.class, "BuilderPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilderPattern_BuilderClasses(), theEcorePackage.getEClass(), null, "BuilderClasses", null, 1,
				-1, BuilderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observerPairEClass, ObserverPair.class, "ObserverPair", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObserverPair_Observable(), theEcorePackage.getEClass(), null, "Observable", null, 1, 1,
				ObserverPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverPair_Observers(), theEcorePackage.getEClass(), null, "Observers", null, 1, -1,
				ObserverPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryPatternEClass, FactoryPattern.class, "FactoryPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactoryPattern_FactoryGroups(), this.getFactoryGroup(), null, "FactoryGroups", null, 1, -1,
				FactoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statePatternEClass, StatePattern.class, "StatePattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatePattern_StateClasses(), theEcorePackage.getEClass(), null, "StateClasses", null, 1, -1,
				StatePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryGroupEClass, FactoryGroup.class, "FactoryGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactoryGroup_GroupName(), theEcorePackage.getEString(), "GroupName", null, 0, 1,
				FactoryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryGroup_FactoryClasses(), theEcorePackage.getEClass(), null, "FactoryClasses", null, 1,
				-1, FactoryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PatternsPackageImpl
