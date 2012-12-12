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
 * A representation of the literals of the enumeration '<em><b>Classification Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getClassificationStyle()
 * @model
 * @generated
 */
public enum ClassificationStyle implements Enumerator {
        /**
         * The '<em><b>Basic</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #BASIC_VALUE
         * @generated
         * @ordered
         */
        BASIC(0, "basic", "basic"),

        /**
         * The '<em><b>Standard</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #STANDARD_VALUE
         * @generated
         * @ordered
         */
        STANDARD(1, "standard", "standard"),

        /**
         * The '<em><b>Extended</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #EXTENDED_VALUE
         * @generated
         * @ordered
         */
        EXTENDED(2, "extended", "extended"),

        /**
         * The '<em><b>Full</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #FULL_VALUE
         * @generated
         * @ordered
         */
        FULL(3, "full", "full");

        /**
         * The '<em><b>Basic</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Basic</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #BASIC
         * @model name="basic"
         * @generated
         * @ordered
         */
        public static final int BASIC_VALUE = 0;

        /**
         * The '<em><b>Standard</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Standard</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #STANDARD
         * @model name="standard"
         * @generated
         * @ordered
         */
        public static final int STANDARD_VALUE = 1;

        /**
         * The '<em><b>Extended</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Extended</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #EXTENDED
         * @model name="extended"
         * @generated
         * @ordered
         */
        public static final int EXTENDED_VALUE = 2;

        /**
         * The '<em><b>Full</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Full</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #FULL
         * @model name="full"
         * @generated
         * @ordered
         */
        public static final int FULL_VALUE = 3;

        /**
         * An array of all the '<em><b>Classification Style</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final ClassificationStyle[] VALUES_ARRAY =
                new ClassificationStyle[] {
                        BASIC,
                        STANDARD,
                        EXTENDED,
                        FULL,
                };

        /**
         * A public read-only list of all the '<em><b>Classification Style</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<ClassificationStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Classification Style</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ClassificationStyle get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        ClassificationStyle result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Classification Style</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ClassificationStyle getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        ClassificationStyle result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Classification Style</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static ClassificationStyle get(int value) {
                switch (value) {
                        case BASIC_VALUE: return BASIC;
                        case STANDARD_VALUE: return STANDARD;
                        case EXTENDED_VALUE: return EXTENDED;
                        case FULL_VALUE: return FULL;
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
        private ClassificationStyle(int value, String name, String literal) {
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
        
} //ClassificationStyle
