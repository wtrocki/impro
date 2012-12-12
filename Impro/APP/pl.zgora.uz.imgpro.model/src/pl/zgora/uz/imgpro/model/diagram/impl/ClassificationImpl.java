/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.ClassificationStyle;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.Features;
import pl.zgora.uz.imgpro.model.diagram.Phase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Classification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ClassificationImpl#getClassificationStyle <em>Classification Style</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ClassificationImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationImpl extends DiagramElementImpl implements
	Classification {
    /**
         * The default value of the '{@link #getClassificationStyle() <em>Classification Style</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getClassificationStyle()
         * @generated
         * @ordered
         */
        protected static final ClassificationStyle CLASSIFICATION_STYLE_EDEFAULT = ClassificationStyle.BASIC;
        /**
         * The cached value of the '{@link #getClassificationStyle() <em>Classification Style</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getClassificationStyle()
         * @generated
         * @ordered
         */
        protected ClassificationStyle classificationStyle = CLASSIFICATION_STYLE_EDEFAULT;
        /**
         * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFeatures()
         * @generated
         * @ordered
         */
        protected EList<Features> features;

/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected ClassificationImpl() {
	super();
	setPhase(Phase.CLASSIFICATION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.CLASSIFICATION;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ClassificationStyle getClassificationStyle() {
                return classificationStyle;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setClassificationStyle(ClassificationStyle newClassificationStyle) {
                ClassificationStyle oldClassificationStyle = classificationStyle;
                classificationStyle = newClassificationStyle == null ? CLASSIFICATION_STYLE_EDEFAULT : newClassificationStyle;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.CLASSIFICATION__CLASSIFICATION_STYLE, oldClassificationStyle, classificationStyle));
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Features> getFeatures() {
                if (features == null) {
                        features = new EDataTypeUniqueEList<Features>(Features.class, this, DiagramPackage.CLASSIFICATION__FEATURES);
                }
                return features;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.CLASSIFICATION__CLASSIFICATION_STYLE:
                                return getClassificationStyle();
                        case DiagramPackage.CLASSIFICATION__FEATURES:
                                return getFeatures();
                }
                return super.eGet(featureID, resolve, coreType);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DiagramPackage.CLASSIFICATION__CLASSIFICATION_STYLE:
                                setClassificationStyle((ClassificationStyle)newValue);
                                return;
                        case DiagramPackage.CLASSIFICATION__FEATURES:
                                getFeatures().clear();
                                getFeatures().addAll((Collection<? extends Features>)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case DiagramPackage.CLASSIFICATION__CLASSIFICATION_STYLE:
                                setClassificationStyle(CLASSIFICATION_STYLE_EDEFAULT);
                                return;
                        case DiagramPackage.CLASSIFICATION__FEATURES:
                                getFeatures().clear();
                                return;
                }
                super.eUnset(featureID);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case DiagramPackage.CLASSIFICATION__CLASSIFICATION_STYLE:
                                return classificationStyle != CLASSIFICATION_STYLE_EDEFAULT;
                        case DiagramPackage.CLASSIFICATION__FEATURES:
                                return features != null && !features.isEmpty();
                }
                return super.eIsSet(featureID);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (classificationStyle: ");
                result.append(classificationStyle);
                result.append(", features: ");
                result.append(features);
                result.append(')');
                return result.toString();
        }


    public void initIOContainers() {
	createInputWithName("Features");
    }

} // ClassificationImpl
