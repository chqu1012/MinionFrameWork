/**
 */
package de.dc.minion.model.addon.snapshot.impl;

import de.dc.minion.model.addon.snapshot.DisplacementMapEffect;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Displacement Map Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DisplacementMapEffectImpl#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DisplacementMapEffectImpl#getOffsetY <em>Offset Y</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DisplacementMapEffectImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DisplacementMapEffectImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DisplacementMapEffectImpl#isWrap <em>Wrap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplacementMapEffectImpl extends FXEffectImpl implements DisplacementMapEffect {
	/**
	 * The default value of the '{@link #getOffsetX() <em>Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetX()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffsetX() <em>Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetX()
	 * @generated
	 * @ordered
	 */
	protected double offsetX = OFFSET_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetY() <em>Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetY()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffsetY() <em>Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetY()
	 * @generated
	 * @ordered
	 */
	protected double offsetY = OFFSET_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected double scaleX = SCALE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected double scaleY = SCALE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #isWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRAP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrap()
	 * @generated
	 * @ordered
	 */
	protected boolean wrap = WRAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplacementMapEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnapshotPackage.Literals.DISPLACEMENT_MAP_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOffsetX() {
		return offsetX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffsetX(double newOffsetX) {
		double oldOffsetX = offsetX;
		offsetX = newOffsetX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_X,
					oldOffsetX, offsetX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOffsetY() {
		return offsetY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffsetY(double newOffsetY) {
		double oldOffsetY = offsetY;
		offsetY = newOffsetY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_Y,
					oldOffsetY, offsetY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScaleX() {
		return scaleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleX(double newScaleX) {
		double oldScaleX = scaleX;
		scaleX = newScaleX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_X,
					oldScaleX, scaleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScaleY() {
		return scaleY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleY(double newScaleY) {
		double oldScaleY = scaleY;
		scaleY = newScaleY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_Y,
					oldScaleY, scaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWrap() {
		return wrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrap(boolean newWrap) {
		boolean oldWrap = wrap;
		wrap = newWrap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DISPLACEMENT_MAP_EFFECT__WRAP,
					oldWrap, wrap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_X:
			return getOffsetX();
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_Y:
			return getOffsetY();
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_X:
			return getScaleX();
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_Y:
			return getScaleY();
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__WRAP:
			return isWrap();
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
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_X:
			setOffsetX((Double) newValue);
			return;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_Y:
			setOffsetY((Double) newValue);
			return;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_X:
			setScaleX((Double) newValue);
			return;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_Y:
			setScaleY((Double) newValue);
			return;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__WRAP:
			setWrap((Boolean) newValue);
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
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_X:
			setOffsetX(OFFSET_X_EDEFAULT);
			return;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_Y:
			setOffsetY(OFFSET_Y_EDEFAULT);
			return;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_X:
			setScaleX(SCALE_X_EDEFAULT);
			return;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_Y:
			setScaleY(SCALE_Y_EDEFAULT);
			return;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__WRAP:
			setWrap(WRAP_EDEFAULT);
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
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_X:
			return offsetX != OFFSET_X_EDEFAULT;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__OFFSET_Y:
			return offsetY != OFFSET_Y_EDEFAULT;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_X:
			return scaleX != SCALE_X_EDEFAULT;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__SCALE_Y:
			return scaleY != SCALE_Y_EDEFAULT;
		case SnapshotPackage.DISPLACEMENT_MAP_EFFECT__WRAP:
			return wrap != WRAP_EDEFAULT;
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
		result.append(" (offsetX: ");
		result.append(offsetX);
		result.append(", offsetY: ");
		result.append(offsetY);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", wrap: ");
		result.append(wrap);
		result.append(')');
		return result.toString();
	}

} //DisplacementMapEffectImpl
