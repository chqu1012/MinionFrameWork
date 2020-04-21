/**
 */
package de.dc.minion.model.addon.snapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloom Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.BloomEffect#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBloomEffect()
 * @model
 * @generated
 */
public interface BloomEffect extends FXEffect {
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBloomEffect_Threshold()
	 * @model unique="false"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.BloomEffect#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

} // BloomEffect
