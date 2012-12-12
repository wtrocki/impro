/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Phase</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getPhase()
 * @model
 * @generated
 */
public enum Phase implements Enumerator {
        /**
         * The '<em><b>Input</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #INPUT_VALUE
         * @generated
         * @ordered
         */
        INPUT(0, "Input", "Input"),

        /**
         * The '<em><b>Preprocessing</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PREPROCESSING_VALUE
         * @generated
         * @ordered
         */
        PREPROCESSING(1, "Preprocessing", "Preprocessing"),

        /**
         * The '<em><b>Segmentation</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #SEGMENTATION_VALUE
         * @generated
         * @ordered
         */
        SEGMENTATION(2, "Segmentation", "Segmentation"),

        /**
         * The '<em><b>Feature Extraction</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #FEATURE_EXTRACTION_VALUE
         * @generated
         * @ordered
         */
        FEATURE_EXTRACTION(3, "FeatureExtraction", "Features Extraction"),

        /**
         * The '<em><b>Features Selection</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #FEATURES_SELECTION_VALUE
         * @generated
         * @ordered
         */
        FEATURES_SELECTION(4, "FeaturesSelection", "Features Selection"), /**
         * The '<em><b>Classification</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #CLASSIFICATION_VALUE
         * @generated
         * @ordered
         */
        CLASSIFICATION(5, "Classification", "Classification"),

        /**
         * The '<em><b>UNKNOWN</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #UNKNOWN_VALUE
         * @generated
         * @ordered
         */
        UNKNOWN(6, "UNKNOWN", "UNKNOWN");

        /**
         * The '<em><b>Input</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Input</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #INPUT
         * @model name="Input"
         * @generated
         * @ordered
         */
        public static final int INPUT_VALUE = 0;

        /**
         * The '<em><b>Preprocessing</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Preprocessing</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PREPROCESSING
         * @model name="Preprocessing"
         * @generated
         * @ordered
         */
        public static final int PREPROCESSING_VALUE = 1;

        /**
         * The '<em><b>Segmentation</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Segmentation</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #SEGMENTATION
         * @model name="Segmentation"
         * @generated
         * @ordered
         */
        public static final int SEGMENTATION_VALUE = 2;

        /**
         * The '<em><b>Feature Extraction</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Feature Extraction</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #FEATURE_EXTRACTION
         * @model name="FeatureExtraction" literal="Features Extraction"
         * @generated
         * @ordered
         */
        public static final int FEATURE_EXTRACTION_VALUE = 3;

        /**
         * The '<em><b>Features Selection</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Features Selection</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #FEATURES_SELECTION
         * @model name="FeaturesSelection" literal="Features Selection"
         * @generated
         * @ordered
         */
        public static final int FEATURES_SELECTION_VALUE = 4;

        /**
         * The '<em><b>Classification</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Classification</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #CLASSIFICATION
         * @model name="Classification"
         * @generated
         * @ordered
         */
        public static final int CLASSIFICATION_VALUE = 5;

        /**
         * The '<em><b>UNKNOWN</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #UNKNOWN
         * @model
         * @generated
         * @ordered
         */
        public static final int UNKNOWN_VALUE = 6;

        /**
         * An array of all the '<em><b>Phase</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final Phase[] VALUES_ARRAY =
                new Phase[] {
                        INPUT,
                        PREPROCESSING,
                        SEGMENTATION,
                        FEATURE_EXTRACTION,
                        FEATURES_SELECTION,
                        CLASSIFICATION,
                        UNKNOWN,
                };

        /**
         * A public read-only list of all the '<em><b>Phase</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<Phase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Phase</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static Phase get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Phase result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Phase</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static Phase getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Phase result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Phase</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static Phase get(int value) {
                switch (value) {
                        case INPUT_VALUE: return INPUT;
                        case PREPROCESSING_VALUE: return PREPROCESSING;
                        case SEGMENTATION_VALUE: return SEGMENTATION;
                        case FEATURE_EXTRACTION_VALUE: return FEATURE_EXTRACTION;
                        case FEATURES_SELECTION_VALUE: return FEATURES_SELECTION;
                        case CLASSIFICATION_VALUE: return CLASSIFICATION;
                        case UNKNOWN_VALUE: return UNKNOWN;
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
        private Phase(int value, String name, String literal) {
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
        
} //Phase
