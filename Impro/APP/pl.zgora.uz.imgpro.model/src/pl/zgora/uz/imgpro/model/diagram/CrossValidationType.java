/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.zgora.uz.imgpro.model.diagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cross Validation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getCrossValidationType()
 * @model
 * @generated
 */
public enum CrossValidationType implements Enumerator {
        /**
         * The '<em><b>Image</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #IMAGE_VALUE
         * @generated
         * @ordered
         */
        IMAGE(0, "image", "image"),

        /**
         * The '<em><b>Patient</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PATIENT_VALUE
         * @generated
         * @ordered
         */
        PATIENT(1, "patient", "patient");

        /**
         * The '<em><b>Image</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Image</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #IMAGE
         * @model name="image"
         * @generated
         * @ordered
         */
        public static final int IMAGE_VALUE = 0;

        /**
         * The '<em><b>Patient</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Patient</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PATIENT
         * @model name="patient"
         * @generated
         * @ordered
         */
        public static final int PATIENT_VALUE = 1;

        /**
         * An array of all the '<em><b>Cross Validation Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final CrossValidationType[] VALUES_ARRAY =
                new CrossValidationType[] {
                        IMAGE,
                        PATIENT,
                };

        /**
         * A public read-only list of all the '<em><b>Cross Validation Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<CrossValidationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Cross Validation Type</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static CrossValidationType get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        CrossValidationType result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Cross Validation Type</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static CrossValidationType getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        CrossValidationType result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Cross Validation Type</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static CrossValidationType get(int value) {
                switch (value) {
                        case IMAGE_VALUE: return IMAGE;
                        case PATIENT_VALUE: return PATIENT;
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
        private CrossValidationType(int value, String name, String literal) {
                this.value = value;
                this.name = name;
                this.literal = literal;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getValue() {
          return value;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getName() {
          return name;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
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
        
} //CrossValidationType
