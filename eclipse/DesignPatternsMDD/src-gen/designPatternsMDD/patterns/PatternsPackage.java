/**
 */
package designPatternsMDD.patterns;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see designPatternsMDD.patterns.PatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patterns";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/designPatternsMDD/patterns";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patterns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsPackage eINSTANCE = designPatternsMDD.patterns.impl.PatternsPackageImpl.init();

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.PatternRootImpl <em>Pattern Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.PatternRootImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getPatternRoot()
	 * @generated
	 */
	int PATTERN_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Observer Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__OBSERVER_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Singleton Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__SINGLETON_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Builder Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__BUILDER_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Factory Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__FACTORY_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>State Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT__STATE_PATTERN = 4;

	/**
	 * The number of structural features of the '<em>Pattern Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pattern Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.ObserverPatternImpl <em>Observer Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.ObserverPatternImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getObserverPattern()
	 * @generated
	 */
	int OBSERVER_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Obsever Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN__OBSEVER_PAIRS = 0;

	/**
	 * The number of structural features of the '<em>Observer Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Observer Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.SingletonPatternImpl <em>Singleton Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.SingletonPatternImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getSingletonPattern()
	 * @generated
	 */
	int SINGLETON_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Singleton Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_PATTERN__SINGLETON_CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Singleton Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Singleton Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.BuilderPatternImpl <em>Builder Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.BuilderPatternImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getBuilderPattern()
	 * @generated
	 */
	int BUILDER_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Builder Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_PATTERN__BUILDER_CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Builder Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Builder Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.ObserverPairImpl <em>Observer Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.ObserverPairImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getObserverPair()
	 * @generated
	 */
	int OBSERVER_PAIR = 4;

	/**
	 * The feature id for the '<em><b>Observable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PAIR__OBSERVABLE = 0;

	/**
	 * The feature id for the '<em><b>Observers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PAIR__OBSERVERS = 1;

	/**
	 * The number of structural features of the '<em>Observer Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Observer Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVER_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.FactoryPatternImpl <em>Factory Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.FactoryPatternImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getFactoryPattern()
	 * @generated
	 */
	int FACTORY_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Factory Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PATTERN__FACTORY_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Factory Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Factory Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.StatePatternImpl <em>State Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.StatePatternImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getStatePattern()
	 * @generated
	 */
	int STATE_PATTERN = 6;

	/**
	 * The feature id for the '<em><b>State Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PATTERN__STATE_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>State Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.FactoryGroupImpl <em>Factory Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.FactoryGroupImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getFactoryGroup()
	 * @generated
	 */
	int FACTORY_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GROUP__GROUP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Factory Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GROUP__FACTORY_CLASSES = 1;

	/**
	 * The number of structural features of the '<em>Factory Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Factory Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link designPatternsMDD.patterns.impl.StateGroupImpl <em>State Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see designPatternsMDD.patterns.impl.StateGroupImpl
	 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getStateGroup()
	 * @generated
	 */
	int STATE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Main Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__MAIN_CLASS = 0;

	/**
	 * The feature id for the '<em><b>State Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP__STATE_CLASSES = 1;

	/**
	 * The number of structural features of the '<em>State Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_GROUP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.PatternRoot <em>Pattern Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Root</em>'.
	 * @see designPatternsMDD.patterns.PatternRoot
	 * @generated
	 */
	EClass getPatternRoot();

	/**
	 * Returns the meta object for the containment reference '{@link designPatternsMDD.patterns.PatternRoot#getObserverPattern <em>Observer Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observer Pattern</em>'.
	 * @see designPatternsMDD.patterns.PatternRoot#getObserverPattern()
	 * @see #getPatternRoot()
	 * @generated
	 */
	EReference getPatternRoot_ObserverPattern();

	/**
	 * Returns the meta object for the containment reference '{@link designPatternsMDD.patterns.PatternRoot#getSingletonPattern <em>Singleton Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Singleton Pattern</em>'.
	 * @see designPatternsMDD.patterns.PatternRoot#getSingletonPattern()
	 * @see #getPatternRoot()
	 * @generated
	 */
	EReference getPatternRoot_SingletonPattern();

	/**
	 * Returns the meta object for the containment reference '{@link designPatternsMDD.patterns.PatternRoot#getBuilderPattern <em>Builder Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Builder Pattern</em>'.
	 * @see designPatternsMDD.patterns.PatternRoot#getBuilderPattern()
	 * @see #getPatternRoot()
	 * @generated
	 */
	EReference getPatternRoot_BuilderPattern();

	/**
	 * Returns the meta object for the containment reference '{@link designPatternsMDD.patterns.PatternRoot#getFactoryPattern <em>Factory Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factory Pattern</em>'.
	 * @see designPatternsMDD.patterns.PatternRoot#getFactoryPattern()
	 * @see #getPatternRoot()
	 * @generated
	 */
	EReference getPatternRoot_FactoryPattern();

	/**
	 * Returns the meta object for the containment reference '{@link designPatternsMDD.patterns.PatternRoot#getStatePattern <em>State Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Pattern</em>'.
	 * @see designPatternsMDD.patterns.PatternRoot#getStatePattern()
	 * @see #getPatternRoot()
	 * @generated
	 */
	EReference getPatternRoot_StatePattern();

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.ObserverPattern <em>Observer Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer Pattern</em>'.
	 * @see designPatternsMDD.patterns.ObserverPattern
	 * @generated
	 */
	EClass getObserverPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link designPatternsMDD.patterns.ObserverPattern#getObseverPairs <em>Obsever Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obsever Pairs</em>'.
	 * @see designPatternsMDD.patterns.ObserverPattern#getObseverPairs()
	 * @see #getObserverPattern()
	 * @generated
	 */
	EReference getObserverPattern_ObseverPairs();

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.SingletonPattern <em>Singleton Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Pattern</em>'.
	 * @see designPatternsMDD.patterns.SingletonPattern
	 * @generated
	 */
	EClass getSingletonPattern();

	/**
	 * Returns the meta object for the reference list '{@link designPatternsMDD.patterns.SingletonPattern#getSingletonClasses <em>Singleton Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Singleton Classes</em>'.
	 * @see designPatternsMDD.patterns.SingletonPattern#getSingletonClasses()
	 * @see #getSingletonPattern()
	 * @generated
	 */
	EReference getSingletonPattern_SingletonClasses();

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.BuilderPattern <em>Builder Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Pattern</em>'.
	 * @see designPatternsMDD.patterns.BuilderPattern
	 * @generated
	 */
	EClass getBuilderPattern();

	/**
	 * Returns the meta object for the reference list '{@link designPatternsMDD.patterns.BuilderPattern#getBuilderClasses <em>Builder Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Builder Classes</em>'.
	 * @see designPatternsMDD.patterns.BuilderPattern#getBuilderClasses()
	 * @see #getBuilderPattern()
	 * @generated
	 */
	EReference getBuilderPattern_BuilderClasses();

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.ObserverPair <em>Observer Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observer Pair</em>'.
	 * @see designPatternsMDD.patterns.ObserverPair
	 * @generated
	 */
	EClass getObserverPair();

	/**
	 * Returns the meta object for the reference '{@link designPatternsMDD.patterns.ObserverPair#getObservable <em>Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observable</em>'.
	 * @see designPatternsMDD.patterns.ObserverPair#getObservable()
	 * @see #getObserverPair()
	 * @generated
	 */
	EReference getObserverPair_Observable();

	/**
	 * Returns the meta object for the reference list '{@link designPatternsMDD.patterns.ObserverPair#getObservers <em>Observers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Observers</em>'.
	 * @see designPatternsMDD.patterns.ObserverPair#getObservers()
	 * @see #getObserverPair()
	 * @generated
	 */
	EReference getObserverPair_Observers();

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.FactoryPattern <em>Factory Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Pattern</em>'.
	 * @see designPatternsMDD.patterns.FactoryPattern
	 * @generated
	 */
	EClass getFactoryPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link designPatternsMDD.patterns.FactoryPattern#getFactoryGroups <em>Factory Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factory Groups</em>'.
	 * @see designPatternsMDD.patterns.FactoryPattern#getFactoryGroups()
	 * @see #getFactoryPattern()
	 * @generated
	 */
	EReference getFactoryPattern_FactoryGroups();

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.StatePattern <em>State Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Pattern</em>'.
	 * @see designPatternsMDD.patterns.StatePattern
	 * @generated
	 */
	EClass getStatePattern();

	/**
	 * Returns the meta object for the containment reference list '{@link designPatternsMDD.patterns.StatePattern#getStateGroups <em>State Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Groups</em>'.
	 * @see designPatternsMDD.patterns.StatePattern#getStateGroups()
	 * @see #getStatePattern()
	 * @generated
	 */
	EReference getStatePattern_StateGroups();

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.FactoryGroup <em>Factory Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Group</em>'.
	 * @see designPatternsMDD.patterns.FactoryGroup
	 * @generated
	 */
	EClass getFactoryGroup();

	/**
	 * Returns the meta object for the attribute '{@link designPatternsMDD.patterns.FactoryGroup#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see designPatternsMDD.patterns.FactoryGroup#getGroupName()
	 * @see #getFactoryGroup()
	 * @generated
	 */
	EAttribute getFactoryGroup_GroupName();

	/**
	 * Returns the meta object for the reference list '{@link designPatternsMDD.patterns.FactoryGroup#getFactoryClasses <em>Factory Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Factory Classes</em>'.
	 * @see designPatternsMDD.patterns.FactoryGroup#getFactoryClasses()
	 * @see #getFactoryGroup()
	 * @generated
	 */
	EReference getFactoryGroup_FactoryClasses();

	/**
	 * Returns the meta object for class '{@link designPatternsMDD.patterns.StateGroup <em>State Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Group</em>'.
	 * @see designPatternsMDD.patterns.StateGroup
	 * @generated
	 */
	EClass getStateGroup();

	/**
	 * Returns the meta object for the reference '{@link designPatternsMDD.patterns.StateGroup#getMainClass <em>Main Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Class</em>'.
	 * @see designPatternsMDD.patterns.StateGroup#getMainClass()
	 * @see #getStateGroup()
	 * @generated
	 */
	EReference getStateGroup_MainClass();

	/**
	 * Returns the meta object for the reference list '{@link designPatternsMDD.patterns.StateGroup#getStateClasses <em>State Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Classes</em>'.
	 * @see designPatternsMDD.patterns.StateGroup#getStateClasses()
	 * @see #getStateGroup()
	 * @generated
	 */
	EReference getStateGroup_StateClasses();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternsFactory getPatternsFactory();

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
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.PatternRootImpl <em>Pattern Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.PatternRootImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getPatternRoot()
		 * @generated
		 */
		EClass PATTERN_ROOT = eINSTANCE.getPatternRoot();

		/**
		 * The meta object literal for the '<em><b>Observer Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ROOT__OBSERVER_PATTERN = eINSTANCE.getPatternRoot_ObserverPattern();

		/**
		 * The meta object literal for the '<em><b>Singleton Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ROOT__SINGLETON_PATTERN = eINSTANCE.getPatternRoot_SingletonPattern();

		/**
		 * The meta object literal for the '<em><b>Builder Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ROOT__BUILDER_PATTERN = eINSTANCE.getPatternRoot_BuilderPattern();

		/**
		 * The meta object literal for the '<em><b>Factory Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ROOT__FACTORY_PATTERN = eINSTANCE.getPatternRoot_FactoryPattern();

		/**
		 * The meta object literal for the '<em><b>State Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ROOT__STATE_PATTERN = eINSTANCE.getPatternRoot_StatePattern();

		/**
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.ObserverPatternImpl <em>Observer Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.ObserverPatternImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getObserverPattern()
		 * @generated
		 */
		EClass OBSERVER_PATTERN = eINSTANCE.getObserverPattern();

		/**
		 * The meta object literal for the '<em><b>Obsever Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PATTERN__OBSEVER_PAIRS = eINSTANCE.getObserverPattern_ObseverPairs();

		/**
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.SingletonPatternImpl <em>Singleton Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.SingletonPatternImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getSingletonPattern()
		 * @generated
		 */
		EClass SINGLETON_PATTERN = eINSTANCE.getSingletonPattern();

		/**
		 * The meta object literal for the '<em><b>Singleton Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLETON_PATTERN__SINGLETON_CLASSES = eINSTANCE.getSingletonPattern_SingletonClasses();

		/**
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.BuilderPatternImpl <em>Builder Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.BuilderPatternImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getBuilderPattern()
		 * @generated
		 */
		EClass BUILDER_PATTERN = eINSTANCE.getBuilderPattern();

		/**
		 * The meta object literal for the '<em><b>Builder Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_PATTERN__BUILDER_CLASSES = eINSTANCE.getBuilderPattern_BuilderClasses();

		/**
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.ObserverPairImpl <em>Observer Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.ObserverPairImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getObserverPair()
		 * @generated
		 */
		EClass OBSERVER_PAIR = eINSTANCE.getObserverPair();

		/**
		 * The meta object literal for the '<em><b>Observable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PAIR__OBSERVABLE = eINSTANCE.getObserverPair_Observable();

		/**
		 * The meta object literal for the '<em><b>Observers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVER_PAIR__OBSERVERS = eINSTANCE.getObserverPair_Observers();

		/**
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.FactoryPatternImpl <em>Factory Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.FactoryPatternImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getFactoryPattern()
		 * @generated
		 */
		EClass FACTORY_PATTERN = eINSTANCE.getFactoryPattern();

		/**
		 * The meta object literal for the '<em><b>Factory Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PATTERN__FACTORY_GROUPS = eINSTANCE.getFactoryPattern_FactoryGroups();

		/**
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.StatePatternImpl <em>State Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.StatePatternImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getStatePattern()
		 * @generated
		 */
		EClass STATE_PATTERN = eINSTANCE.getStatePattern();

		/**
		 * The meta object literal for the '<em><b>State Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_PATTERN__STATE_GROUPS = eINSTANCE.getStatePattern_StateGroups();

		/**
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.FactoryGroupImpl <em>Factory Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.FactoryGroupImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getFactoryGroup()
		 * @generated
		 */
		EClass FACTORY_GROUP = eINSTANCE.getFactoryGroup();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_GROUP__GROUP_NAME = eINSTANCE.getFactoryGroup_GroupName();

		/**
		 * The meta object literal for the '<em><b>Factory Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_GROUP__FACTORY_CLASSES = eINSTANCE.getFactoryGroup_FactoryClasses();

		/**
		 * The meta object literal for the '{@link designPatternsMDD.patterns.impl.StateGroupImpl <em>State Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see designPatternsMDD.patterns.impl.StateGroupImpl
		 * @see designPatternsMDD.patterns.impl.PatternsPackageImpl#getStateGroup()
		 * @generated
		 */
		EClass STATE_GROUP = eINSTANCE.getStateGroup();

		/**
		 * The meta object literal for the '<em><b>Main Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_GROUP__MAIN_CLASS = eINSTANCE.getStateGroup_MainClass();

		/**
		 * The meta object literal for the '<em><b>State Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_GROUP__STATE_CLASSES = eINSTANCE.getStateGroup_StateClasses();

	}

} //PatternsPackage
