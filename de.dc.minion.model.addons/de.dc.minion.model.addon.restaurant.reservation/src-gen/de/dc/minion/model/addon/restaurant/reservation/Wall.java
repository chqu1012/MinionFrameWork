/**
 */
package de.dc.minion.model.addon.restaurant.reservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.Wall#getStartx <em>Startx</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.Wall#getStartY <em>Start Y</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.Wall#getEndx <em>Endx</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.Wall#getEndY <em>End Y</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getWall()
 * @model
 * @generated
 */
public interface Wall extends LayoutItem {
	/**
	 * Returns the value of the '<em><b>Startx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startx</em>' attribute.
	 * @see #setStartx(Double)
	 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getWall_Startx()
	 * @model unique="false"
	 * @generated
	 */
	Double getStartx();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.restaurant.reservation.Wall#getStartx <em>Startx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startx</em>' attribute.
	 * @see #getStartx()
	 * @generated
	 */
	void setStartx(Double value);

	/**
	 * Returns the value of the '<em><b>Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Y</em>' attribute.
	 * @see #setStartY(Double)
	 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getWall_StartY()
	 * @model unique="false"
	 * @generated
	 */
	Double getStartY();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.restaurant.reservation.Wall#getStartY <em>Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Y</em>' attribute.
	 * @see #getStartY()
	 * @generated
	 */
	void setStartY(Double value);

	/**
	 * Returns the value of the '<em><b>Endx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endx</em>' attribute.
	 * @see #setEndx(Double)
	 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getWall_Endx()
	 * @model unique="false"
	 * @generated
	 */
	Double getEndx();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.restaurant.reservation.Wall#getEndx <em>Endx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endx</em>' attribute.
	 * @see #getEndx()
	 * @generated
	 */
	void setEndx(Double value);

	/**
	 * Returns the value of the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Y</em>' attribute.
	 * @see #setEndY(Double)
	 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getWall_EndY()
	 * @model unique="false"
	 * @generated
	 */
	Double getEndY();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.restaurant.reservation.Wall#getEndY <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Y</em>' attribute.
	 * @see #getEndY()
	 * @generated
	 */
	void setEndY(Double value);

} // Wall
