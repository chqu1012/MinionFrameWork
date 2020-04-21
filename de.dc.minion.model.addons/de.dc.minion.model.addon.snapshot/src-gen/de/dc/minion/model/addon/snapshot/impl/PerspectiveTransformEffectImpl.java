/**
 */
package de.dc.minion.model.addon.snapshot.impl;

import de.dc.minion.model.addon.snapshot.PerspectiveTransformEffect;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Transform Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.PerspectiveTransformEffectImpl#getLlx <em>Llx</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.PerspectiveTransformEffectImpl#getLly <em>Lly</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.PerspectiveTransformEffectImpl#getLrx <em>Lrx</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.PerspectiveTransformEffectImpl#getLry <em>Lry</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.PerspectiveTransformEffectImpl#getUlx <em>Ulx</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.PerspectiveTransformEffectImpl#getUly <em>Uly</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.PerspectiveTransformEffectImpl#getUrx <em>Urx</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.PerspectiveTransformEffectImpl#getUry <em>Ury</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveTransformEffectImpl extends FXEffectImpl implements PerspectiveTransformEffect {
	/**
	 * The default value of the '{@link #getLlx() <em>Llx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLlx()
	 * @generated
	 * @ordered
	 */
	protected static final double LLX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLlx() <em>Llx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLlx()
	 * @generated
	 * @ordered
	 */
	protected double llx = LLX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLly() <em>Lly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLly()
	 * @generated
	 * @ordered
	 */
	protected static final double LLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLly() <em>Lly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLly()
	 * @generated
	 * @ordered
	 */
	protected double lly = LLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLrx() <em>Lrx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLrx()
	 * @generated
	 * @ordered
	 */
	protected static final double LRX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLrx() <em>Lrx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLrx()
	 * @generated
	 * @ordered
	 */
	protected double lrx = LRX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLry() <em>Lry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLry()
	 * @generated
	 * @ordered
	 */
	protected static final double LRY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLry() <em>Lry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLry()
	 * @generated
	 * @ordered
	 */
	protected double lry = LRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUlx() <em>Ulx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUlx()
	 * @generated
	 * @ordered
	 */
	protected static final double ULX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUlx() <em>Ulx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUlx()
	 * @generated
	 * @ordered
	 */
	protected double ulx = ULX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUly() <em>Uly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUly()
	 * @generated
	 * @ordered
	 */
	protected static final double ULY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUly() <em>Uly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUly()
	 * @generated
	 * @ordered
	 */
	protected double uly = ULY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrx() <em>Urx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrx()
	 * @generated
	 * @ordered
	 */
	protected static final double URX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUrx() <em>Urx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrx()
	 * @generated
	 * @ordered
	 */
	protected double urx = URX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUry() <em>Ury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUry()
	 * @generated
	 * @ordered
	 */
	protected static final double URY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUry() <em>Ury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUry()
	 * @generated
	 * @ordered
	 */
	protected double ury = URY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveTransformEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnapshotPackage.Literals.PERSPECTIVE_TRANSFORM_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLlx() {
		return llx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLlx(double newLlx) {
		double oldLlx = llx;
		llx = newLlx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLX,
					oldLlx, llx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLly() {
		return lly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLly(double newLly) {
		double oldLly = lly;
		lly = newLly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLY,
					oldLly, lly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLrx() {
		return lrx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLrx(double newLrx) {
		double oldLrx = lrx;
		lrx = newLrx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRX,
					oldLrx, lrx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLry() {
		return lry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLry(double newLry) {
		double oldLry = lry;
		lry = newLry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRY,
					oldLry, lry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUlx() {
		return ulx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUlx(double newUlx) {
		double oldUlx = ulx;
		ulx = newUlx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULX,
					oldUlx, ulx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUly() {
		return uly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUly(double newUly) {
		double oldUly = uly;
		uly = newUly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULY,
					oldUly, uly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUrx() {
		return urx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrx(double newUrx) {
		double oldUrx = urx;
		urx = newUrx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URX,
					oldUrx, urx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUry() {
		return ury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUry(double newUry) {
		double oldUry = ury;
		ury = newUry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URY,
					oldUry, ury));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLX:
			return getLlx();
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLY:
			return getLly();
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRX:
			return getLrx();
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRY:
			return getLry();
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULX:
			return getUlx();
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULY:
			return getUly();
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URX:
			return getUrx();
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URY:
			return getUry();
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
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLX:
			setLlx((Double) newValue);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLY:
			setLly((Double) newValue);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRX:
			setLrx((Double) newValue);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRY:
			setLry((Double) newValue);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULX:
			setUlx((Double) newValue);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULY:
			setUly((Double) newValue);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URX:
			setUrx((Double) newValue);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URY:
			setUry((Double) newValue);
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
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLX:
			setLlx(LLX_EDEFAULT);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLY:
			setLly(LLY_EDEFAULT);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRX:
			setLrx(LRX_EDEFAULT);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRY:
			setLry(LRY_EDEFAULT);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULX:
			setUlx(ULX_EDEFAULT);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULY:
			setUly(ULY_EDEFAULT);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URX:
			setUrx(URX_EDEFAULT);
			return;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URY:
			setUry(URY_EDEFAULT);
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
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLX:
			return llx != LLX_EDEFAULT;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LLY:
			return lly != LLY_EDEFAULT;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRX:
			return lrx != LRX_EDEFAULT;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__LRY:
			return lry != LRY_EDEFAULT;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULX:
			return ulx != ULX_EDEFAULT;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__ULY:
			return uly != ULY_EDEFAULT;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URX:
			return urx != URX_EDEFAULT;
		case SnapshotPackage.PERSPECTIVE_TRANSFORM_EFFECT__URY:
			return ury != URY_EDEFAULT;
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
		result.append(" (llx: ");
		result.append(llx);
		result.append(", lly: ");
		result.append(lly);
		result.append(", lrx: ");
		result.append(lrx);
		result.append(", lry: ");
		result.append(lry);
		result.append(", ulx: ");
		result.append(ulx);
		result.append(", uly: ");
		result.append(uly);
		result.append(", urx: ");
		result.append(urx);
		result.append(", ury: ");
		result.append(ury);
		result.append(')');
		return result.toString();
	}

} //PerspectiveTransformEffectImpl
