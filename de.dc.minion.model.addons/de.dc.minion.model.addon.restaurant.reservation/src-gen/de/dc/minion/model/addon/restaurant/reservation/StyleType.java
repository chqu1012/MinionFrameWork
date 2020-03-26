/**
 */
package de.dc.minion.model.addon.restaurant.reservation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Style Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.minion.model.addon.restaurant.reservation.ReservationPackage#getStyleType()
 * @model
 * @generated
 */
public enum StyleType implements Enumerator {
	/**
	 * The '<em><b>COLOR BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_BACKGROUND(0, "COLOR_BACKGROUND", "-fx-background-color"),

	/**
	 * The '<em><b>COLOR FOREGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_FOREGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_FOREGROUND(0, "COLOR_FOREGROUND", "-fx-text-fill"),

	/**
	 * The '<em><b>COLOR BORDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_BORDER_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_BORDER(0, "COLOR_BORDER", "-fx-border-color");

	/**
	 * The '<em><b>COLOR BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_BACKGROUND
	 * @model literal="-fx-background-color"
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_BACKGROUND_VALUE = 0;

	/**
	 * The '<em><b>COLOR FOREGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_FOREGROUND
	 * @model literal="-fx-text-fill"
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_FOREGROUND_VALUE = 0;

	/**
	 * The '<em><b>COLOR BORDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_BORDER
	 * @model literal="-fx-border-color"
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_BORDER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StyleType[] VALUES_ARRAY = new StyleType[] { COLOR_BACKGROUND, COLOR_FOREGROUND,
			COLOR_BORDER, };

	/**
	 * A public read-only list of all the '<em><b>Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StyleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Style Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StyleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StyleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StyleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StyleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StyleType get(int value) {
		switch (value) {
		case COLOR_BACKGROUND_VALUE:
			return COLOR_BACKGROUND;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StyleType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //StyleType
