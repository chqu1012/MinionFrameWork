/**
 */
package de.dc.minion.model.addon.snapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Adjust Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.ColorAdjustEffect#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.ColorAdjustEffect#getContrast <em>Contrast</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.ColorAdjustEffect#getHue <em>Hue</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.ColorAdjustEffect#getSaturation <em>Saturation</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getColorAdjustEffect()
 * @model
 * @generated
 */
public interface ColorAdjustEffect extends FXEffect {
	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see #setBrightness(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getColorAdjustEffect_Brightness()
	 * @model unique="false"
	 * @generated
	 */
	double getBrightness();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.ColorAdjustEffect#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(double value);

	/**
	 * Returns the value of the '<em><b>Contrast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrast</em>' attribute.
	 * @see #setContrast(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getColorAdjustEffect_Contrast()
	 * @model unique="false"
	 * @generated
	 */
	double getContrast();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.ColorAdjustEffect#getContrast <em>Contrast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrast</em>' attribute.
	 * @see #getContrast()
	 * @generated
	 */
	void setContrast(double value);

	/**
	 * Returns the value of the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hue</em>' attribute.
	 * @see #setHue(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getColorAdjustEffect_Hue()
	 * @model unique="false"
	 * @generated
	 */
	double getHue();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.ColorAdjustEffect#getHue <em>Hue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hue</em>' attribute.
	 * @see #getHue()
	 * @generated
	 */
	void setHue(double value);

	/**
	 * Returns the value of the '<em><b>Saturation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saturation</em>' attribute.
	 * @see #setSaturation(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getColorAdjustEffect_Saturation()
	 * @model unique="false"
	 * @generated
	 */
	double getSaturation();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.ColorAdjustEffect#getSaturation <em>Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saturation</em>' attribute.
	 * @see #getSaturation()
	 * @generated
	 */
	void setSaturation(double value);

} // ColorAdjustEffect
