/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.zgora.uz.imgpro.model.diagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pl.zgora.uz.imgpro.model.CommonInputOutputConstants;
import pl.zgora.uz.imgpro.model.diagram.CrossValidationType;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.Features;
import pl.zgora.uz.imgpro.model.diagram.FullSelection;
import pl.zgora.uz.imgpro.model.diagram.Phase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Full Selection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.FullSelectionImpl#getCrossValidationType <em>Cross Validation Type</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.FullSelectionImpl#getMinimumFeatures <em>Minimum Features</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.FullSelectionImpl#getMaximumFeatures <em>Maximum Features</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.FullSelectionImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FullSelectionImpl extends DiagramElementImpl implements
	FullSelection {
    /**
         * The default value of the '{@link #getCrossValidationType() <em>Cross Validation Type</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getCrossValidationType()
         * @generated
         * @ordered
         */
    protected static final CrossValidationType CROSS_VALIDATION_TYPE_EDEFAULT = CrossValidationType.IMAGE;

    /**
         * The cached value of the '{@link #getCrossValidationType() <em>Cross Validation Type</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getCrossValidationType()
         * @generated
         * @ordered
         */
    protected CrossValidationType crossValidationType = CROSS_VALIDATION_TYPE_EDEFAULT;

    /**
         * The default value of the '{@link #getMinimumFeatures() <em>Minimum Features</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getMinimumFeatures()
         * @generated
         * @ordered
         */
    protected static final int MINIMUM_FEATURES_EDEFAULT = 2;

    /**
         * The cached value of the '{@link #getMinimumFeatures() <em>Minimum Features</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getMinimumFeatures()
         * @generated
         * @ordered
         */
    protected int minimumFeatures = MINIMUM_FEATURES_EDEFAULT;

    /**
         * The default value of the '{@link #getMaximumFeatures() <em>Maximum Features</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getMaximumFeatures()
         * @generated
         * @ordered
         */
    protected static final int MAXIMUM_FEATURES_EDEFAULT = 3;

    /**
         * The cached value of the '{@link #getMaximumFeatures() <em>Maximum Features</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getMaximumFeatures()
         * @generated
         * @ordered
         */
    protected int maximumFeatures = MAXIMUM_FEATURES_EDEFAULT;

    /**
         * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute list.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getFeatures()
         * @generated
         * @ordered
         */
    protected EList<Features> features;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected FullSelectionImpl() {
	super();
	setPhase(Phase.FEATURES_SELECTION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.FULL_SELECTION;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public CrossValidationType getCrossValidationType() {
                return crossValidationType;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setCrossValidationType(
	    CrossValidationType newCrossValidationType) {
                CrossValidationType oldCrossValidationType = crossValidationType;
                crossValidationType = newCrossValidationType == null ? CROSS_VALIDATION_TYPE_EDEFAULT : newCrossValidationType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FULL_SELECTION__CROSS_VALIDATION_TYPE, oldCrossValidationType, crossValidationType));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EList<Features> getFeatures() {
                if (features == null) {
                        features = new EDataTypeUniqueEList<Features>(Features.class, this, DiagramPackage.FULL_SELECTION__FEATURES);
                }
                return features;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public int getMinimumFeatures() {
                return minimumFeatures;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setMinimumFeatures(int newMinimumFeatures) {
                int oldMinimumFeatures = minimumFeatures;
                minimumFeatures = newMinimumFeatures;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FULL_SELECTION__MINIMUM_FEATURES, oldMinimumFeatures, minimumFeatures));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public int getMaximumFeatures() {
                return maximumFeatures;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setMaximumFeatures(int newMaximumFeatures) {
                int oldMaximumFeatures = maximumFeatures;
                maximumFeatures = newMaximumFeatures;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FULL_SELECTION__MAXIMUM_FEATURES, oldMaximumFeatures, maximumFeatures));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.FULL_SELECTION__CROSS_VALIDATION_TYPE:
                                return getCrossValidationType();
                        case DiagramPackage.FULL_SELECTION__MINIMUM_FEATURES:
                                return getMinimumFeatures();
                        case DiagramPackage.FULL_SELECTION__MAXIMUM_FEATURES:
                                return getMaximumFeatures();
                        case DiagramPackage.FULL_SELECTION__FEATURES:
                                return getFeatures();
                }
                return super.eGet(featureID, resolve, coreType);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @SuppressWarnings("unchecked")
@Override
    
    public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DiagramPackage.FULL_SELECTION__CROSS_VALIDATION_TYPE:
                                setCrossValidationType((CrossValidationType)newValue);
                                return;
                        case DiagramPackage.FULL_SELECTION__MINIMUM_FEATURES:
                                setMinimumFeatures((Integer)newValue);
                                return;
                        case DiagramPackage.FULL_SELECTION__MAXIMUM_FEATURES:
                                setMaximumFeatures((Integer)newValue);
                                return;
                        case DiagramPackage.FULL_SELECTION__FEATURES:
                                getFeatures().clear();
                                getFeatures().addAll((Collection<? extends Features>)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public void eUnset(int featureID) {
                switch (featureID) {
                        case DiagramPackage.FULL_SELECTION__CROSS_VALIDATION_TYPE:
                                setCrossValidationType(CROSS_VALIDATION_TYPE_EDEFAULT);
                                return;
                        case DiagramPackage.FULL_SELECTION__MINIMUM_FEATURES:
                                setMinimumFeatures(MINIMUM_FEATURES_EDEFAULT);
                                return;
                        case DiagramPackage.FULL_SELECTION__MAXIMUM_FEATURES:
                                setMaximumFeatures(MAXIMUM_FEATURES_EDEFAULT);
                                return;
                        case DiagramPackage.FULL_SELECTION__FEATURES:
                                getFeatures().clear();
                                return;
                }
                super.eUnset(featureID);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case DiagramPackage.FULL_SELECTION__CROSS_VALIDATION_TYPE:
                                return crossValidationType != CROSS_VALIDATION_TYPE_EDEFAULT;
                        case DiagramPackage.FULL_SELECTION__MINIMUM_FEATURES:
                                return minimumFeatures != MINIMUM_FEATURES_EDEFAULT;
                        case DiagramPackage.FULL_SELECTION__MAXIMUM_FEATURES:
                                return maximumFeatures != MAXIMUM_FEATURES_EDEFAULT;
                        case DiagramPackage.FULL_SELECTION__FEATURES:
                                return features != null && !features.isEmpty();
                }
                return super.eIsSet(featureID);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (crossValidationType: ");
                result.append(crossValidationType);
                result.append(", minimumFeatures: ");
                result.append(minimumFeatures);
                result.append(", maximumFeatures: ");
                result.append(maximumFeatures);
                result.append(", features: ");
                result.append(features);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.FEATURES_LIST);
	createOutputWithName(CommonInputOutputConstants.FEATURES_LIST);
    }
} // FullSelectionImpl
