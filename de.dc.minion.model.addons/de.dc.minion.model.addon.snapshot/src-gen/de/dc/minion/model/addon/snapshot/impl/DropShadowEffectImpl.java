/**
 */
package de.dc.minion.model.addon.snapshot.impl;

import de.dc.minion.model.addon.snapshot.BlurType;
import de.dc.minion.model.addon.snapshot.DropShadowEffect;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Shadow Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#getBlurType <em>Blur Type</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#isChangeIsLocal <em>Change Is Local</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#getOffsetY <em>Offset Y</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#getSpread <em>Spread</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.impl.DropShadowEffectImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropShadowEffectImpl extends FXEffectImpl implements DropShadowEffect {
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
	 * The default value of the '{@link #getSpread() <em>Spread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpread()
	 * @generated
	 * @ordered
	 */
	protected static final double SPREAD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpread() <em>Spread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpread()
	 * @generated
	 * @ordered
	 */
	protected double spread = SPREAD_EDEFAULT;

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
	protected DropShadowEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnapshotPackage.Literals.DROP_SHADOW_EFFECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__BLUR_TYPE,
					oldBlurType, blurType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__CHANGE_IS_LOCAL,
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
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__COLOR, oldColor,
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
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__HEIGHT, oldHeight,
					height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_X,
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
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_Y,
					oldOffsetY, offsetY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__RADIUS, oldRadius,
					radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSpread() {
		return spread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpread(double newSpread) {
		double oldSpread = spread;
		spread = newSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__SPREAD, oldSpread,
					spread));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SnapshotPackage.DROP_SHADOW_EFFECT__WIDTH, oldWidth,
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
		case SnapshotPackage.DROP_SHADOW_EFFECT__BLUR_TYPE:
			return getBlurType();
		case SnapshotPackage.DROP_SHADOW_EFFECT__CHANGE_IS_LOCAL:
			return isChangeIsLocal();
		case SnapshotPackage.DROP_SHADOW_EFFECT__COLOR:
			return getColor();
		case SnapshotPackage.DROP_SHADOW_EFFECT__HEIGHT:
			return getHeight();
		case SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_X:
			return getOffsetX();
		case SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_Y:
			return getOffsetY();
		case SnapshotPackage.DROP_SHADOW_EFFECT__RADIUS:
			return getRadius();
		case SnapshotPackage.DROP_SHADOW_EFFECT__SPREAD:
			return getSpread();
		case SnapshotPackage.DROP_SHADOW_EFFECT__WIDTH:
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
		case SnapshotPackage.DROP_SHADOW_EFFECT__BLUR_TYPE:
			setBlurType((BlurType) newValue);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__CHANGE_IS_LOCAL:
			setChangeIsLocal((Boolean) newValue);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__COLOR:
			setColor((String) newValue);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__HEIGHT:
			setHeight((Double) newValue);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_X:
			setOffsetX((Double) newValue);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_Y:
			setOffsetY((Double) newValue);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__RADIUS:
			setRadius((Double) newValue);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__SPREAD:
			setSpread((Double) newValue);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__WIDTH:
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
		case SnapshotPackage.DROP_SHADOW_EFFECT__BLUR_TYPE:
			setBlurType(BLUR_TYPE_EDEFAULT);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__CHANGE_IS_LOCAL:
			setChangeIsLocal(CHANGE_IS_LOCAL_EDEFAULT);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_X:
			setOffsetX(OFFSET_X_EDEFAULT);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_Y:
			setOffsetY(OFFSET_Y_EDEFAULT);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__RADIUS:
			setRadius(RADIUS_EDEFAULT);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__SPREAD:
			setSpread(SPREAD_EDEFAULT);
			return;
		case SnapshotPackage.DROP_SHADOW_EFFECT__WIDTH:
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
		case SnapshotPackage.DROP_SHADOW_EFFECT__BLUR_TYPE:
			return blurType != BLUR_TYPE_EDEFAULT;
		case SnapshotPackage.DROP_SHADOW_EFFECT__CHANGE_IS_LOCAL:
			return changeIsLocal != CHANGE_IS_LOCAL_EDEFAULT;
		case SnapshotPackage.DROP_SHADOW_EFFECT__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case SnapshotPackage.DROP_SHADOW_EFFECT__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_X:
			return offsetX != OFFSET_X_EDEFAULT;
		case SnapshotPackage.DROP_SHADOW_EFFECT__OFFSET_Y:
			return offsetY != OFFSET_Y_EDEFAULT;
		case SnapshotPackage.DROP_SHADOW_EFFECT__RADIUS:
			return radius != RADIUS_EDEFAULT;
		case SnapshotPackage.DROP_SHADOW_EFFECT__SPREAD:
			return spread != SPREAD_EDEFAULT;
		case SnapshotPackage.DROP_SHADOW_EFFECT__WIDTH:
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
		result.append(", offsetX: ");
		result.append(offsetX);
		result.append(", offsetY: ");
		result.append(offsetY);
		result.append(", radius: ");
		result.append(radius);
		result.append(", spread: ");
		result.append(spread);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //DropShadowEffectImpl
