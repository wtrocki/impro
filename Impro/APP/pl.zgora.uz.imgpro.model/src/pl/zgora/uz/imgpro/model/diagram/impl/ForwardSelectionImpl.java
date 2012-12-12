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
import pl.zgora.uz.imgpro.model.diagram.Classifier;
import pl.zgora.uz.imgpro.model.diagram.CrossValidationType;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.Features;
import pl.zgora.uz.imgpro.model.diagram.ForwardSelection;
import pl.zgora.uz.imgpro.model.diagram.Phase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Forward Selection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ForwardSelectionImpl#getCrossValidationType <em>Cross Validation Type</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ForwardSelectionImpl#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ForwardSelectionImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForwardSelectionImpl extends DiagramElementImpl implements
	ForwardSelection {
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
         * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' attribute list.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getClassifiers()
         * @generated
         * @ordered
         */
    protected EList<Classifier> classifiers;

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
     * 
     */
    protected ForwardSelectionImpl() {
	super();
	setPhase(Phase.FEATURES_SELECTION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.FORWARD_SELECTION;
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
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FORWARD_SELECTION__CROSS_VALIDATION_TYPE, oldCrossValidationType, crossValidationType));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EList<Features> getFeatures() {
                if (features == null) {
                        features = new EDataTypeUniqueEList<Features>(Features.class, this, DiagramPackage.FORWARD_SELECTION__FEATURES);
                }
                return features;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EList<Classifier> getClassifiers() {
                if (classifiers == null) {
                        classifiers = new EDataTypeUniqueEList<Classifier>(Classifier.class, this, DiagramPackage.FORWARD_SELECTION__CLASSIFIERS);
                }
                return classifiers;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.FORWARD_SELECTION__CROSS_VALIDATION_TYPE:
                                return getCrossValidationType();
                        case DiagramPackage.FORWARD_SELECTION__CLASSIFIERS:
                                return getClassifiers();
                        case DiagramPackage.FORWARD_SELECTION__FEATURES:
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
                        case DiagramPackage.FORWARD_SELECTION__CROSS_VALIDATION_TYPE:
                                setCrossValidationType((CrossValidationType)newValue);
                                return;
                        case DiagramPackage.FORWARD_SELECTION__CLASSIFIERS:
                                getClassifiers().clear();
                                getClassifiers().addAll((Collection<? extends Classifier>)newValue);
                                return;
                        case DiagramPackage.FORWARD_SELECTION__FEATURES:
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
                        case DiagramPackage.FORWARD_SELECTION__CROSS_VALIDATION_TYPE:
                                setCrossValidationType(CROSS_VALIDATION_TYPE_EDEFAULT);
                                return;
                        case DiagramPackage.FORWARD_SELECTION__CLASSIFIERS:
                                getClassifiers().clear();
                                return;
                        case DiagramPackage.FORWARD_SELECTION__FEATURES:
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
                        case DiagramPackage.FORWARD_SELECTION__CROSS_VALIDATION_TYPE:
                                return crossValidationType != CROSS_VALIDATION_TYPE_EDEFAULT;
                        case DiagramPackage.FORWARD_SELECTION__CLASSIFIERS:
                                return classifiers != null && !classifiers.isEmpty();
                        case DiagramPackage.FORWARD_SELECTION__FEATURES:
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
                result.append(", classifiers: ");
                result.append(classifiers);
                result.append(", features: ");
                result.append(features);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.FEATURES_LIST);
	createOutputWithName(CommonInputOutputConstants.FEATURES_LIST);
    }

} // ForwardSelectionImpl
