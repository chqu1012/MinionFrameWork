/**
 */
package de.dc.minion.model.addon.snapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blend Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.BlendEffect#getMode <em>Mode</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.snapshot.BlendEffect#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBlendEffect()
 * @model
 * @generated
 */
public interface BlendEffect extends FXEffect {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.minion.model.addon.snapshot.BlendMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see de.dc.minion.model.addon.snapshot.BlendMode
	 * @see #setMode(BlendMode)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBlendEffect_Mode()
	 * @model unique="false"
	 * @generated
	 */
	BlendMode getMode();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.BlendEffect#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see de.dc.minion.model.addon.snapshot.BlendMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(BlendMode value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBlendEffect_Opacity()
	 * @model unique="false"
	 * @generated
	 */
	double getOpacity();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.BlendEffect#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(double value);

} // BlendEffect
