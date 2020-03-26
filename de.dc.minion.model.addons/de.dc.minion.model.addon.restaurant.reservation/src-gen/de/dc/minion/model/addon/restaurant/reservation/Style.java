/**
 */
package de.dc.minion.model.addon.restaurant.reservation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.Style#getStyleType <em>Style Type</em>}</li>
 *   <li>{@link de.dc.minion.model.addon.restaurant.reservation.Style#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends EObject {
	/**
	 * Returns the value of the '<em><b>Style Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.minion.model.addon.restaurant.reservation.StyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Type</em>' attribute.
	 * @see de.dc.minion.model.addon.restaurant.reservation.StyleType
	 * @see #setStyleType(StyleType)
	 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getStyle_StyleType()
	 * @model unique="false"
	 * @generated
	 */
	StyleType getStyleType();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.restaurant.reservation.Style#getStyleType <em>Style Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Type</em>' attribute.
	 * @see de.dc.minion.model.addon.restaurant.reservation.StyleType
	 * @see #getStyleType()
	 * @generated
	 */
	void setStyleType(StyleType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getStyle_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dc.minion.model.addon.restaurant.reservation.Style#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Style
