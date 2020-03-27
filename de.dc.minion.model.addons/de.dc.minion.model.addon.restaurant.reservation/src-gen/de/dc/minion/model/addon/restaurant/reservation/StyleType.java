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
	 * The '<em><b>BACKGROUND COLOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_COLOR_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_COLOR(0, "BACKGROUND_COLOR", "-fx-background-color"),

	/**
	 * The '<em><b>BACKGROUND RADIUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_RADIUS_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND_RADIUS(0, "BACKGROUND_RADIUS", "-fx-background-radius"),

	/**
	 * The '<em><b>BORDER COLOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_COLOR_VALUE
	 * @generated
	 * @ordered
	 */
	BORDER_COLOR(0, "BORDER_COLOR", "-fx-border-color"),

	/**
	 * The '<em><b>TEXT FILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_FILL_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_FILL(0, "TEXT_FILL", "-fx-text-fill"),

	/**
	 * The '<em><b>STROKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_VALUE
	 * @generated
	 * @ordered
	 */
	STROKE(0, "STROKE", "-fx-stroke"),

	/**
	 * The '<em><b>STROKE WIDTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_WIDTH_VALUE
	 * @generated
	 * @ordered
	 */
	STROKE_WIDTH(0, "STROKE_WIDTH", "-fx-stroke-width"),

	/**
	 * The '<em><b>STROKE DASH ARRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_DASH_ARRAY_VALUE
	 * @generated
	 * @ordered
	 */
	STROKE_DASH_ARRAY(0, "STROKE_DASH_ARRAY", "-fx-stroke-dash-array"),

	/**
	 * The '<em><b>STROKE DASH OFFSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_DASH_OFFSET_VALUE
	 * @generated
	 * @ordered
	 */
	STROKE_DASH_OFFSET(0, "STROKE_DASH_OFFSET", "-fx-stroke-dash-offset"),

	/**
	 * The '<em><b>STROKE LINE CAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_LINE_CAP_VALUE
	 * @generated
	 * @ordered
	 */
	STROKE_LINE_CAP(0, "STROKE_LINE_CAP", "-fx-stroke-line-cap");

	/**
	 * The '<em><b>BACKGROUND COLOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_COLOR
	 * @model literal="-fx-background-color"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_COLOR_VALUE = 0;

	/**
	 * The '<em><b>BACKGROUND RADIUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_RADIUS
	 * @model literal="-fx-background-radius"
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_RADIUS_VALUE = 0;

	/**
	 * The '<em><b>BORDER COLOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_COLOR
	 * @model literal="-fx-border-color"
	 * @generated
	 * @ordered
	 */
	public static final int BORDER_COLOR_VALUE = 0;

	/**
	 * The '<em><b>TEXT FILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_FILL
	 * @model literal="-fx-text-fill"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_FILL_VALUE = 0;

	/**
	 * The '<em><b>STROKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE
	 * @model literal="-fx-stroke"
	 * @generated
	 * @ordered
	 */
	public static final int STROKE_VALUE = 0;

	/**
	 * The '<em><b>STROKE WIDTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_WIDTH
	 * @model literal="-fx-stroke-width"
	 * @generated
	 * @ordered
	 */
	public static final int STROKE_WIDTH_VALUE = 0;

	/**
	 * The '<em><b>STROKE DASH ARRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_DASH_ARRAY
	 * @model literal="-fx-stroke-dash-array"
	 * @generated
	 * @ordered
	 */
	public static final int STROKE_DASH_ARRAY_VALUE = 0;

	/**
	 * The '<em><b>STROKE DASH OFFSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_DASH_OFFSET
	 * @model literal="-fx-stroke-dash-offset"
	 * @generated
	 * @ordered
	 */
	public static final int STROKE_DASH_OFFSET_VALUE = 0;

	/**
	 * The '<em><b>STROKE LINE CAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STROKE_LINE_CAP
	 * @model literal="-fx-stroke-line-cap"
	 * @generated
	 * @ordered
	 */
	public static final int STROKE_LINE_CAP_VALUE = 0;

	/**
	 * An array of all the '<em><b>Style Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StyleType[] VALUES_ARRAY = new StyleType[] { BACKGROUND_COLOR, BACKGROUND_RADIUS, BORDER_COLOR,
			TEXT_FILL, STROKE, STROKE_WIDTH, STROKE_DASH_ARRAY, STROKE_DASH_OFFSET, STROKE_LINE_CAP, };

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
		case BACKGROUND_COLOR_VALUE:
			return BACKGROUND_COLOR;
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
