/**
 */
package de.dc.minion.model.addon.snapshot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Blur Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.minion.model.addon.snapshot.SnapshotPackage#getBlurType()
 * @model
 * @generated
 */
public enum BlurType implements Enumerator {
	/**
	 * The '<em><b>GAUSSIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAUSSIAN_VALUE
	 * @generated
	 * @ordered
	 */
	GAUSSIAN(0, "GAUSSIAN", "GAUSSIAN"),

	/**
	 * The '<em><b>ONE PASS BOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_PASS_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_PASS_BOX(0, "ONE_PASS_BOX", "ONE_PASS_BOX"),

	/**
	 * The '<em><b>THREE PASS BOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_PASS_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_PASS_BOX(0, "THREE_PASS_BOX", "THREE_PASS_BOX"),

	/**
	 * The '<em><b>TWO PASS BOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_PASS_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_PASS_BOX(0, "TWO_PASS_BOX", "TWO_PASS_BOX");

	/**
	 * The '<em><b>GAUSSIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAUSSIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAUSSIAN_VALUE = 0;

	/**
	 * The '<em><b>ONE PASS BOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_PASS_BOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_PASS_BOX_VALUE = 0;

	/**
	 * The '<em><b>THREE PASS BOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_PASS_BOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREE_PASS_BOX_VALUE = 0;

	/**
	 * The '<em><b>TWO PASS BOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_PASS_BOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_PASS_BOX_VALUE = 0;

	/**
	 * An array of all the '<em><b>Blur Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BlurType[] VALUES_ARRAY = new BlurType[] { GAUSSIAN, ONE_PASS_BOX, THREE_PASS_BOX,
			TWO_PASS_BOX, };

	/**
	 * A public read-only list of all the '<em><b>Blur Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BlurType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Blur Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlurType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BlurType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Blur Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlurType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BlurType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Blur Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BlurType get(int value) {
		switch (value) {
		case GAUSSIAN_VALUE:
			return GAUSSIAN;
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
	private BlurType(int value, String name, String literal) {
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

} //BlurType
