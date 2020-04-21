/**
 */
package de.dc.minion.model.addon.snapshot.impl;

import de.dc.minion.model.addon.snapshot.ColorAdjustEffect;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Adjust Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ColorAdjustEffectImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ColorAdjustEffectImpl#getContrast <em>Contrast</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ColorAdjustEffectImpl#getHue <em>Hue</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ColorAdjustEffectImpl#getSaturation <em>Saturation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorAdjustEffectImpl extends FXEffectImpl implements ColorAdjustEffect {
	/**
	 * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final double BRIGHTNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected double brightness = BRIGHTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContrast() <em>Contrast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrast()
	 * @generated
	 * @ordered
	 */
	protected static final double CONTRAST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getContrast() <em>Contrast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrast()
	 * @generated
	 * @ordered
	 */
	protected double contrast = CONTRAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHue() <em>Hue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHue()
	 * @generated
	 * @ordered
	 */
	protected static final double HUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHue() <em>Hue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHue()
	 * @generated
	 * @ordered
	 */
	protected double hue = HUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaturation() <em>Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturation()
	 * @generated
	 * @ordered
	 */
	protected static final double SATURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSaturation() <em>Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturation()
	 * @generated
	 * @ordered
	 */
	protected double saturation = SATURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorAdjustEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnapshotPackage.Literals.COLOR_ADJUST_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrightness(double newBrightness) {
		double oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.COLOR_ADJUST_EFFECT__BRIGHTNESS,
					oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getContrast() {
		return contrast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContrast(double newContrast) {
		double oldContrast = contrast;
		contrast = newContrast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.COLOR_ADJUST_EFFECT__CONTRAST,
					oldContrast, contrast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHue() {
		return hue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHue(double newHue) {
		double oldHue = hue;
		hue = newHue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.COLOR_ADJUST_EFFECT__HUE, oldHue,
					hue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSaturation() {
		return saturation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaturation(double newSaturation) {
		double oldSaturation = saturation;
		saturation = newSaturation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.COLOR_ADJUST_EFFECT__SATURATION,
					oldSaturation, saturation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SnapshotPackage.COLOR_ADJUST_EFFECT__BRIGHTNESS:
			return getBrightness();
		case SnapshotPackage.COLOR_ADJUST_EFFECT__CONTRAST:
			return getContrast();
		case SnapshotPackage.COLOR_ADJUST_EFFECT__HUE:
			return getHue();
		case SnapshotPackage.COLOR_ADJUST_EFFECT__SATURATION:
			return getSaturation();
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
		case SnapshotPackage.COLOR_ADJUST_EFFECT__BRIGHTNESS:
			setBrightness((Double) newValue);
			return;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__CONTRAST:
			setContrast((Double) newValue);
			return;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__HUE:
			setHue((Double) newValue);
			return;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__SATURATION:
			setSaturation((Double) newValue);
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
		case SnapshotPackage.COLOR_ADJUST_EFFECT__BRIGHTNESS:
			setBrightness(BRIGHTNESS_EDEFAULT);
			return;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__CONTRAST:
			setContrast(CONTRAST_EDEFAULT);
			return;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__HUE:
			setHue(HUE_EDEFAULT);
			return;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__SATURATION:
			setSaturation(SATURATION_EDEFAULT);
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
		case SnapshotPackage.COLOR_ADJUST_EFFECT__BRIGHTNESS:
			return brightness != BRIGHTNESS_EDEFAULT;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__CONTRAST:
			return contrast != CONTRAST_EDEFAULT;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__HUE:
			return hue != HUE_EDEFAULT;
		case SnapshotPackage.COLOR_ADJUST_EFFECT__SATURATION:
			return saturation != SATURATION_EDEFAULT;
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
		result.append(" (brightness: ");
		result.append(brightness);
		result.append(", contrast: ");
		result.append(contrast);
		result.append(", hue: ");
		result.append(hue);
		result.append(", saturation: ");
		result.append(saturation);
		result.append(')');
		return result.toString();
	}

} //ColorAdjustEffectImpl
