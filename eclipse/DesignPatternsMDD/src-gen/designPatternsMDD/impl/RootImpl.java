/**
 */
package designPatternsMDD.impl;

import designPatternsMDD.DesignPatternsMDDPackage;
import designPatternsMDD.Root;

import designPatternsMDD.packages.PackagesRoot;

import designPatternsMDD.patterns.PatternRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link designPatternsMDD.impl.RootImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link designPatternsMDD.impl.RootImpl#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected PackagesRoot packages;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected PatternRoot patterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignPatternsMDDPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesRoot getPackages() {
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackages(PackagesRoot newPackages, NotificationChain msgs) {
		PackagesRoot oldPackages = packages;
		packages = newPackages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DesignPatternsMDDPackage.ROOT__PACKAGES, oldPackages, newPackages);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackages(PackagesRoot newPackages) {
		if (newPackages != packages) {
			NotificationChain msgs = null;
			if (packages != null)
				msgs = ((InternalEObject) packages).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DesignPatternsMDDPackage.ROOT__PACKAGES, null, msgs);
			if (newPackages != null)
				msgs = ((InternalEObject) newPackages).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DesignPatternsMDDPackage.ROOT__PACKAGES, null, msgs);
			msgs = basicSetPackages(newPackages, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsMDDPackage.ROOT__PACKAGES, newPackages,
					newPackages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternRoot getPatterns() {
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatterns(PatternRoot newPatterns, NotificationChain msgs) {
		PatternRoot oldPatterns = patterns;
		patterns = newPatterns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DesignPatternsMDDPackage.ROOT__PATTERNS, oldPatterns, newPatterns);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatterns(PatternRoot newPatterns) {
		if (newPatterns != patterns) {
			NotificationChain msgs = null;
			if (patterns != null)
				msgs = ((InternalEObject) patterns).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DesignPatternsMDDPackage.ROOT__PATTERNS, null, msgs);
			if (newPatterns != null)
				msgs = ((InternalEObject) newPatterns).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DesignPatternsMDDPackage.ROOT__PATTERNS, null, msgs);
			msgs = basicSetPatterns(newPatterns, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPatternsMDDPackage.ROOT__PATTERNS, newPatterns,
					newPatterns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DesignPatternsMDDPackage.ROOT__PACKAGES:
			return basicSetPackages(null, msgs);
		case DesignPatternsMDDPackage.ROOT__PATTERNS:
			return basicSetPatterns(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DesignPatternsMDDPackage.ROOT__PACKAGES:
			return getPackages();
		case DesignPatternsMDDPackage.ROOT__PATTERNS:
			return getPatterns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DesignPatternsMDDPackage.ROOT__PACKAGES:
			setPackages((PackagesRoot) newValue);
			return;
		case DesignPatternsMDDPackage.ROOT__PATTERNS:
			setPatterns((PatternRoot) newValue);
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
		case DesignPatternsMDDPackage.ROOT__PACKAGES:
			setPackages((PackagesRoot) null);
			return;
		case DesignPatternsMDDPackage.ROOT__PATTERNS:
			setPatterns((PatternRoot) null);
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
		case DesignPatternsMDDPackage.ROOT__PACKAGES:
			return packages != null;
		case DesignPatternsMDDPackage.ROOT__PATTERNS:
			return patterns != null;
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
