/**
 */
package de.dc.minion.model.addon.snapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sepia Tone Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.snapshot.SepiaToneEffect#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getSepiaToneEffect()
 * @model
 * @generated
 */
public interface SepiaToneEffect extends FXEffect {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(double)
	 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getSepiaToneEffect_Level()
	 * @model unique="false"
	 * @generated
	 */
	double getLevel();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.snapshot.SepiaToneEffect#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(double value);

} // SepiaToneEffect
