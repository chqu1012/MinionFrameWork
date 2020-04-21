/**
 */
package de.dc.minion.model.addon.snapshot.impl;

import de.dc.minion.model.addon.snapshot.BlurType;
import de.dc.minion.model.addon.snapshot.ShadowEffect;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shadow Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ShadowEffectImpl#getBlurType <em>Blur Type</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ShadowEffectImpl#isChangeIsLocal <em>Change Is Local</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ShadowEffectImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ShadowEffectImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ShadowEffectImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.ShadowEffectImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShadowEffectImpl extends FXEffectImpl implements ShadowEffect {
	/**
	 * The default value of the '{@link #getBlurType() <em>Blur Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurType()
	 * @generated
	 * @ordered
	 */
	protected static final BlurType BLUR_TYPE_EDEFAULT = BlurType.GAUSSIAN;

	/**
	 * The cached value of the '{@link #getBlurType() <em>Blur Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurType()
	 * @generated
	 * @ordered
	 */
	protected BlurType blurType = BLUR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isChangeIsLocal() <em>Change Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeIsLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGE_IS_LOCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChangeIsLocal() <em>Change Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeIsLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean changeIsLocal = CHANGE_IS_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShadowEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnapshotPackage.Literals.SHADOW_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlurType getBlurType() {
		return blurType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlurType(BlurType newBlurType) {
		BlurType oldBlurType = blurType;
		blurType = newBlurType == null ? BLUR_TYPE_EDEFAULT : newBlurType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.SHADOW_EFFECT__BLUR_TYPE, oldBlurType,
					blurType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChangeIsLocal() {
		return changeIsLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeIsLocal(boolean newChangeIsLocal) {
		boolean oldChangeIsLocal = changeIsLocal;
		changeIsLocal = newChangeIsLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.SHADOW_EFFECT__CHANGE_IS_LOCAL,
					oldChangeIsLocal, changeIsLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.SHADOW_EFFECT__COLOR, oldColor,
					color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.SHADOW_EFFECT__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.SHADOW_EFFECT__RADIUS, oldRadius,
					radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.SHADOW_EFFECT__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SnapshotPackage.SHADOW_EFFECT__BLUR_TYPE:
			return getBlurType();
		case SnapshotPackage.SHADOW_EFFECT__CHANGE_IS_LOCAL:
			return isChangeIsLocal();
		case SnapshotPackage.SHADOW_EFFECT__COLOR:
			return getColor();
		case SnapshotPackage.SHADOW_EFFECT__HEIGHT:
			return getHeight();
		case SnapshotPackage.SHADOW_EFFECT__RADIUS:
			return getRadius();
		case SnapshotPackage.SHADOW_EFFECT__WIDTH:
			return getWidth();
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
		case SnapshotPackage.SHADOW_EFFECT__BLUR_TYPE:
			setBlurType((BlurType) newValue);
			return;
		case SnapshotPackage.SHADOW_EFFECT__CHANGE_IS_LOCAL:
			setChangeIsLocal((Boolean) newValue);
			return;
		case SnapshotPackage.SHADOW_EFFECT__COLOR:
			setColor((String) newValue);
			return;
		case SnapshotPackage.SHADOW_EFFECT__HEIGHT:
			setHeight((Double) newValue);
			return;
		case SnapshotPackage.SHADOW_EFFECT__RADIUS:
			setRadius((Double) newValue);
			return;
		case SnapshotPackage.SHADOW_EFFECT__WIDTH:
			setWidth((Double) newValue);
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
		case SnapshotPackage.SHADOW_EFFECT__BLUR_TYPE:
			setBlurType(BLUR_TYPE_EDEFAULT);
			return;
		case SnapshotPackage.SHADOW_EFFECT__CHANGE_IS_LOCAL:
			setChangeIsLocal(CHANGE_IS_LOCAL_EDEFAULT);
			return;
		case SnapshotPackage.SHADOW_EFFECT__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case SnapshotPackage.SHADOW_EFFECT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case SnapshotPackage.SHADOW_EFFECT__RADIUS:
			setRadius(RADIUS_EDEFAULT);
			return;
		case SnapshotPackage.SHADOW_EFFECT__WIDTH:
			setWidth(WIDTH_EDEFAULT);
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
		case SnapshotPackage.SHADOW_EFFECT__BLUR_TYPE:
			return blurType != BLUR_TYPE_EDEFAULT;
		case SnapshotPackage.SHADOW_EFFECT__CHANGE_IS_LOCAL:
			return changeIsLocal != CHANGE_IS_LOCAL_EDEFAULT;
		case SnapshotPackage.SHADOW_EFFECT__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case SnapshotPackage.SHADOW_EFFECT__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case SnapshotPackage.SHADOW_EFFECT__RADIUS:
			return radius != RADIUS_EDEFAULT;
		case SnapshotPackage.SHADOW_EFFECT__WIDTH:
			return width != WIDTH_EDEFAULT;
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
		result.append(" (blurType: ");
		result.append(blurType);
		result.append(", changeIsLocal: ");
		result.append(changeIsLocal);
		result.append(", color: ");
		result.append(color);
		result.append(", height: ");
		result.append(height);
		result.append(", radius: ");
		result.append(radius);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //ShadowEffectImpl
