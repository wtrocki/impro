/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.zgora.uz.imgpro.model.diagram;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Features</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getFeatures()
 * @model
 * @generated
 */
public enum Features implements Enumerator {
    /**
         * The '<em><b>Area mean</b></em>' literal object.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see #AREA_MEAN_VALUE
         * @generated
         * @ordered
         */
    AREA_MEAN(0, "Area_mean", "Area_mean"),

    /**
         * The '<em><b>Area var</b></em>' literal object.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see #AREA_VAR_VALUE
         * @generated
         * @ordered
         */
    AREA_VAR(1, "Area_var", "Area_var"),

    /**
         * The '<em><b>Perimeter mean</b></em>' literal object.
         * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
         * @see #PERIMETER_MEAN_VALUE
         * @generated
         * @ordered
         */
    PERIMETER_MEAN(2, "Perimeter_mean", "Perimeter_mean"),

    /**
         * The '<em><b>Perimeter var</b></em>' literal object.
         * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
         * @see #PERIMETER_VAR_VALUE
         * @generated
         * @ordered
         */
    PERIMETER_VAR(3, "Perimeter_var", "Perimeter_var"),

    /**
     * The '<em><b>Eccentricity mean</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ECCENTRICITY_MEAN_VALUE
     * @generated
     * @ordered
     */
    ECCENTRICITY_MEAN(4, "Eccentricity_mean", "Eccentricity_mean"),

    /**
     * The '<em><b>Eccentricity var</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ECCENTRICITY_VAR_VALUE
     * @generated
     * @ordered
     */
    ECCENTRICITY_VAR(5, "Eccentricity_var", "Eccentricity_var"),

    /**
     * The '<em><b>Major Axis Length mean</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #MAJOR_AXIS_LENGTH_MEAN_VALUE
     * @generated
     * @ordered
     */
    MAJOR_AXIS_LENGTH_MEAN(6, "MajorAxisLength_mean", "MajorAxisLength_mean"),

    /**
     * The '<em><b>Major Axis Length var</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #MAJOR_AXIS_LENGTH_VAR_VALUE
     * @generated
     * @ordered
     */
    MAJOR_AXIS_LENGTH_VAR(7, "MajorAxisLength_var", "MajorAxisLength_var"),

    /**
     * The '<em><b>Minor Axis Length mean</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #MINOR_AXIS_LENGTH_MEAN_VALUE
     * @generated
     * @ordered
     */
    MINOR_AXIS_LENGTH_MEAN(8, "MinorAxisLength_mean", "MinorAxisLength_mean"),

    /**
     * The '<em><b>Minor Axis Length var</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #MINOR_AXIS_LENGTH_VAR_VALUE
     * @generated
     * @ordered
     */
    MINOR_AXIS_LENGTH_VAR(9, "MinorAxisLength_var", "MinorAxisLength_var"),

    /**
     * The '<em><b>Luminance Mean mean</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #LUMINANCE_MEAN_MEAN_VALUE
     * @generated
     * @ordered
     */
    LUMINANCE_MEAN_MEAN(10, "LuminanceMean_mean", "LuminanceMean_mean"),

    /**
     * The '<em><b>Luminance Mean var</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #LUMINANCE_MEAN_VAR_VALUE
     * @generated
     * @ordered
     */
    LUMINANCE_MEAN_VAR(11, "LuminanceMean_var", "LuminanceMean_var"),

    /**
     * The '<em><b>Luminance Variance mean</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #LUMINANCE_VARIANCE_MEAN_VALUE
     * @generated
     * @ordered
     */
    LUMINANCE_VARIANCE_MEAN(12, "LuminanceVariance_mean",
	    "LuminanceVariance_mean"),

    /**
     * The '<em><b>Luminance Variance var</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #LUMINANCE_VARIANCE_VAR_VALUE
     * @generated
     * @ordered
     */
    LUMINANCE_VARIANCE_VAR(13, "LuminanceVariance_var", "LuminanceVariance_var"),

    /**
     * The '<em><b>Dist To Centroid mean</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #DIST_TO_CENTROID_MEAN_VALUE
     * @generated
     * @ordered
     */
    DIST_TO_CENTROID_MEAN(14, "DistToCentroid_mean", "DistToCentroid_mean"),

    /**
     * The '<em><b>Dist To Centroid var</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #DIST_TO_CENTROID_VAR_VALUE
     * @generated
     * @ordered
     */
    DIST_TO_CENTROID_VAR(15, "DistToCentroid_var", "DistToCentroid_var");

    /**
         * The '<em><b>Area mean</b></em>' literal value.
         * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Area mean</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @see #AREA_MEAN
         * @model name="Area_mean"
         * @generated
         * @ordered
         */
    public static final int AREA_MEAN_VALUE = 0;

    /**
         * The '<em><b>Area var</b></em>' literal value.
         * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Area var</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @see #AREA_VAR
         * @model name="Area_var"
         * @generated
         * @ordered
         */
    public static final int AREA_VAR_VALUE = 1;

    /**
         * The '<em><b>Perimeter mean</b></em>' literal value.
         * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Perimeter mean</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @see #PERIMETER_MEAN
         * @model name="Perimeter_mean"
         * @generated
         * @ordered
         */
    public static final int PERIMETER_MEAN_VALUE = 2;

    /**
         * The '<em><b>Perimeter var</b></em>' literal value.
         * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Perimeter var</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @see #PERIMETER_VAR
         * @model name="Perimeter_var"
         * @generated
         * @ordered
         */
    public static final int PERIMETER_VAR_VALUE = 3;

    /**
     * The '<em><b>Eccentricity mean</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Eccentricity mean</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #ECCENTRICITY_MEAN
     * @model name="Eccentricity_mean"
     * @generated
     * @ordered
     */
    public static final int ECCENTRICITY_MEAN_VALUE = 4;

    /**
         * The '<em><b>Eccentricity var</b></em>' literal value.
         * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Eccentricity var</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @see #ECCENTRICITY_VAR
         * @model name="Eccentricity_var"
         * @generated
         * @ordered
         */
    public static final int ECCENTRICITY_VAR_VALUE = 5;

    /**
     * The '<em><b>Major Axis Length mean</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Major Axis Length mean</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #MAJOR_AXIS_LENGTH_MEAN
     * @model name="MajorAxisLength_mean"
     * @generated
     * @ordered
     */
    public static final int MAJOR_AXIS_LENGTH_MEAN_VALUE = 6;

    /**
     * The '<em><b>Major Axis Length var</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Major Axis Length var</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #MAJOR_AXIS_LENGTH_VAR
     * @model name="MajorAxisLength_var"
     * @generated
     * @ordered
     */
    public static final int MAJOR_AXIS_LENGTH_VAR_VALUE = 7;

    /**
     * The '<em><b>Minor Axis Length mean</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minor Axis Length mean</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #MINOR_AXIS_LENGTH_MEAN
     * @model name="MinorAxisLength_mean"
     * @generated
     * @ordered
     */
    public static final int MINOR_AXIS_LENGTH_MEAN_VALUE = 8;

    /**
     * The '<em><b>Minor Axis Length var</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minor Axis Length var</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #MINOR_AXIS_LENGTH_VAR
     * @model name="MinorAxisLength_var"
     * @generated
     * @ordered
     */
    public static final int MINOR_AXIS_LENGTH_VAR_VALUE = 9;

    /**
     * The '<em><b>Luminance Mean mean</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Luminance Mean mean</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #LUMINANCE_MEAN_MEAN
     * @model name="LuminanceMean_mean"
     * @generated
     * @ordered
     */
    public static final int LUMINANCE_MEAN_MEAN_VALUE = 10;

    /**
     * The '<em><b>Luminance Mean var</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Luminance Mean var</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #LUMINANCE_MEAN_VAR
     * @model name="LuminanceMean_var"
     * @generated
     * @ordered
     */
    public static final int LUMINANCE_MEAN_VAR_VALUE = 11;

    /**
     * The '<em><b>Luminance Variance mean</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Luminance Variance mean</b></em>' literal
     * object isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #LUMINANCE_VARIANCE_MEAN
     * @model name="LuminanceVariance_mean"
     * @generated
     * @ordered
     */
    public static final int LUMINANCE_VARIANCE_MEAN_VALUE = 12;

    /**
     * The '<em><b>Luminance Variance var</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Luminance Variance var</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #LUMINANCE_VARIANCE_VAR
     * @model name="LuminanceVariance_var"
     * @generated
     * @ordered
     */
    public static final int LUMINANCE_VARIANCE_VAR_VALUE = 13;

    /**
     * The '<em><b>Dist To Centroid mean</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dist To Centroid mean</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #DIST_TO_CENTROID_MEAN
     * @model name="DistToCentroid_mean"
     * @generated
     * @ordered
     */
    public static final int DIST_TO_CENTROID_MEAN_VALUE = 14;

    /**
     * The '<em><b>Dist To Centroid var</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dist To Centroid var</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #DIST_TO_CENTROID_VAR
     * @model name="DistToCentroid_var"
     * @generated
     * @ordered
     */
    public static final int DIST_TO_CENTROID_VAR_VALUE = 15;

    /**
     * An array of all the '<em><b>Features</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final Features[] VALUES_ARRAY = new Features[] {
                        AREA_MEAN,
                        AREA_VAR,
                        PERIMETER_MEAN,
                        PERIMETER_VAR,
                        ECCENTRICITY_MEAN,
                        ECCENTRICITY_VAR,
                        MAJOR_AXIS_LENGTH_MEAN,
                        MAJOR_AXIS_LENGTH_VAR,
                        MINOR_AXIS_LENGTH_MEAN,
                        MINOR_AXIS_LENGTH_VAR,
                        LUMINANCE_MEAN_MEAN,
                        LUMINANCE_MEAN_VAR,
                        LUMINANCE_VARIANCE_MEAN,
                        LUMINANCE_VARIANCE_VAR,
                        DIST_TO_CENTROID_MEAN,
                        DIST_TO_CENTROID_VAR,
                };

    /**
         * A public read-only list of all the '<em><b>Features</b></em>' enumerators.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static final List<Features> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
         * Returns the '<em><b>Features</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static Features get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Features result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

    /**
         * Returns the '<em><b>Features</b></em>' literal with the specified name.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static Features getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Features result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

    /**
         * Returns the '<em><b>Features</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static Features get(int value) {
                switch (value) {
                        case AREA_MEAN_VALUE: return AREA_MEAN;
                        case AREA_VAR_VALUE: return AREA_VAR;
                        case PERIMETER_MEAN_VALUE: return PERIMETER_MEAN;
                        case PERIMETER_VAR_VALUE: return PERIMETER_VAR;
                        case ECCENTRICITY_MEAN_VALUE: return ECCENTRICITY_MEAN;
                        case ECCENTRICITY_VAR_VALUE: return ECCENTRICITY_VAR;
                        case MAJOR_AXIS_LENGTH_MEAN_VALUE: return MAJOR_AXIS_LENGTH_MEAN;
                        case MAJOR_AXIS_LENGTH_VAR_VALUE: return MAJOR_AXIS_LENGTH_VAR;
                        case MINOR_AXIS_LENGTH_MEAN_VALUE: return MINOR_AXIS_LENGTH_MEAN;
                        case MINOR_AXIS_LENGTH_VAR_VALUE: return MINOR_AXIS_LENGTH_VAR;
                        case LUMINANCE_MEAN_MEAN_VALUE: return LUMINANCE_MEAN_MEAN;
                        case LUMINANCE_MEAN_VAR_VALUE: return LUMINANCE_MEAN_VAR;
                        case LUMINANCE_VARIANCE_MEAN_VALUE: return LUMINANCE_VARIANCE_MEAN;
                        case LUMINANCE_VARIANCE_VAR_VALUE: return LUMINANCE_VARIANCE_VAR;
                        case DIST_TO_CENTROID_MEAN_VALUE: return DIST_TO_CENTROID_MEAN;
                        case DIST_TO_CENTROID_VAR_VALUE: return DIST_TO_CENTROID_VAR;
                }
                return null;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private final int value;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private final String name;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private final String literal;

    /**
         * Only this class can construct instances.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @generated
         */
    private Features(int value, String name, String literal) {
                this.value = value;
                this.name = name;
                this.literal = literal;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public int getValue() {
          return value;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public String getName() {
          return name;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public String getLiteral() {
          return literal;
        }

    /**
         * Returns the literal value of the enumerator, which is its string representation.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public String toString() {
                return literal;
        }

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
	    this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
	propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName,
	    PropertyChangeListener listener) {
	propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
	propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(String propertyName,
	    PropertyChangeListener listener) {
	propertyChangeSupport.removePropertyChangeListener(propertyName,
		listener);
    }

    protected void firePropertyChange(String propertyName, Object oldValue,
	    Object newValue) {
	propertyChangeSupport.firePropertyChange(propertyName, oldValue,
		newValue);
    }
} // Features

