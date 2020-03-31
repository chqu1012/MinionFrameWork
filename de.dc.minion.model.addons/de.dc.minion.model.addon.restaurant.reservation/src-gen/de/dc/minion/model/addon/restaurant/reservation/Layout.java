/**
 */
package de.dc.minion.model.addon.restaurant.reservation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.Layout#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.minion.model.addon.restaurant.reservation.LayoutItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getLayout_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<LayoutItem> getItems();

} // Layout
