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
 * <em><b>Classifier</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getClassifier()
 * @model
 * @generated
 */
public enum Classifier implements Enumerator {
    /**
         * The '<em><b>KNN</b></em>' literal object.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #KNN_VALUE
         * @generated
         * @ordered
         */
    KNN(0, "KNN", "KNN"),

    /**
         * The '<em><b>Naive Bayes</b></em>' literal object.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see #NAIVE_BAYES_VALUE
         * @generated
         * @ordered
         */
    NAIVE_BAYES(1, "Naive_Bayes", "Naive Bayes"),

    /**
         * The '<em><b>Decision trees</b></em>' literal object.
         * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
         * @see #DECISION_TREES_VALUE
         * @generated
         * @ordered
         */
    DECISION_TREES(2, "Decision_trees", "Decision trees"),

    /**
     * The '<em><b>Ensemble classifier</b></em>' literal object. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #ENSEMBLE_CLASSIFIER_VALUE
     * @generated
     * @ordered
     */
    ENSEMBLE_CLASSIFIER(3, "Ensemble_classifier", "Ensemble classifier");

    /**
         * The '<em><b>KNN</b></em>' literal value.
         * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>KNN</b></em>' literal object isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @see #KNN
         * @model
         * @generated
         * @ordered
         */
    public static final int KNN_VALUE = 0;

    /**
         * The '<em><b>Naive Bayes</b></em>' literal value.
         * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Naive Bayes</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @see #NAIVE_BAYES
         * @model name="Naive_Bayes" literal="Naive Bayes"
         * @generated
         * @ordered
         */
    public static final int NAIVE_BAYES_VALUE = 1;

    /**
         * The '<em><b>Decision trees</b></em>' literal value.
         * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of '<em><b>Decision trees</b></em>' literal object isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @see #DECISION_TREES
         * @model name="Decision_trees" literal="Decision trees"
         * @generated
         * @ordered
         */
    public static final int DECISION_TREES_VALUE = 2;

    /**
     * The '<em><b>Ensemble classifier</b></em>' literal value. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ensemble classifier</b></em>' literal object
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #ENSEMBLE_CLASSIFIER
     * @model name="Ensemble_classifier" literal="Ensemble classifier"
     * @generated
     * @ordered
     */
    public static final int ENSEMBLE_CLASSIFIER_VALUE = 3;

    /**
     * An array of all the '<em><b>Classifier</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final Classifier[] VALUES_ARRAY = new Classifier[] {
                        KNN,
                        NAIVE_BAYES,
                        DECISION_TREES,
                        ENSEMBLE_CLASSIFIER,
                };

    /**
         * A public read-only list of all the '<em><b>Classifier</b></em>' enumerators.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static final List<Classifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
         * Returns the '<em><b>Classifier</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static Classifier get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Classifier result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

    /**
         * Returns the '<em><b>Classifier</b></em>' literal with the specified name.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static Classifier getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Classifier result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

    /**
         * Returns the '<em><b>Classifier</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static Classifier get(int value) {
                switch (value) {
                        case KNN_VALUE: return KNN;
                        case NAIVE_BAYES_VALUE: return NAIVE_BAYES;
                        case DECISION_TREES_VALUE: return DECISION_TREES;
                        case ENSEMBLE_CLASSIFIER_VALUE: return ENSEMBLE_CLASSIFIER;
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
    private Classifier(int value, String name, String literal) {
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

} // Classifier
