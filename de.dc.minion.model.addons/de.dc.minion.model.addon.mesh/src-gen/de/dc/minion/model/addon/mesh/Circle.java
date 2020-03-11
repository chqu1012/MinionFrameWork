/**
 */
package de.dc.minion.model.addon.mesh;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.mesh.Circle#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.mesh.MeshPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Shape {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(Integer)
	 * @see de.dc.minion.model.addon.mesh.MeshPackage#getCircle_Radius()
	 * @model default="20" unique="false"
	 * @generated
	 */
	Integer getRadius();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.mesh.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Integer value);

} // Circle
