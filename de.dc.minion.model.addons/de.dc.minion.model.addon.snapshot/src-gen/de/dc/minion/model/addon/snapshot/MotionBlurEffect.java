/**
 */
package de.dc.minion.model.addon.snapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motion Blur Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.MotionBlurEffect#getAngle <em>Angle</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.MotionBlurEffect#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getMotionBlurEffect()
 * @model
 * @generated
 */
public interface MotionBlurEffect extends FXEffect {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getMotionBlurEffect_Angle()
	 * @model unique="false"
	 * @generated
	 */
	double getAngle();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.MotionBlurEffect#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(double value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getMotionBlurEffect_Radius()
	 * @model unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.MotionBlurEffect#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // MotionBlurEffect
