/**
 */
package de.dc.minion.model.addon.restaurant.reservation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styled Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.StyledElement#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getStyledElement()
 * @model abstract="true"
 * @generated
 */
public interface StyledElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.minion.model.addon.restaurant.reservation.Style}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getStyledElement_Styles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Style> getStyles();

} // StyledElement
