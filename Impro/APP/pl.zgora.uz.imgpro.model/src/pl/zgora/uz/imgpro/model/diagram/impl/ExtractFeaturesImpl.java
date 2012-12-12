/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pl.zgora.uz.imgpro.model.CommonInputOutputConstants;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.ExtractFeatures;
import pl.zgora.uz.imgpro.model.diagram.Phase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Extract Features</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ExtractFeaturesImpl#getClassificationGroup <em>Classification Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractFeaturesImpl extends DiagramElementImpl implements
	ExtractFeatures {
    /**
         * The default value of the '{@link #getClassificationGroup() <em>Classification Group</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getClassificationGroup()
         * @generated
         * @ordered
         */
    protected static final String CLASSIFICATION_GROUP_EDEFAULT = "";
    /**
         * The cached value of the '{@link #getClassificationGroup() <em>Classification Group</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getClassificationGroup()
         * @generated
         * @ordered
         */
    protected String classificationGroup = CLASSIFICATION_GROUP_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected ExtractFeaturesImpl() {
	super();
	setPhase(Phase.FEATURE_EXTRACTION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.EXTRACT_FEATURES;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public String getClassificationGroup() {
                return classificationGroup;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setClassificationGroup(String newClassificationGroup) {
                String oldClassificationGroup = classificationGroup;
                classificationGroup = newClassificationGroup;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.EXTRACT_FEATURES__CLASSIFICATION_GROUP, oldClassificationGroup, classificationGroup));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.EXTRACT_FEATURES__CLASSIFICATION_GROUP:
                                return getClassificationGroup();
                }
                return super.eGet(featureID, resolve, coreType);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DiagramPackage.EXTRACT_FEATURES__CLASSIFICATION_GROUP:
                                setClassificationGroup((String)newValue);
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
                        case DiagramPackage.EXTRACT_FEATURES__CLASSIFICATION_GROUP:
                                setClassificationGroup(CLASSIFICATION_GROUP_EDEFAULT);
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
                        case DiagramPackage.EXTRACT_FEATURES__CLASSIFICATION_GROUP:
                                return CLASSIFICATION_GROUP_EDEFAULT == null ? classificationGroup != null : !CLASSIFICATION_GROUP_EDEFAULT.equals(classificationGroup);
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
                result.append(" (classificationGroup: ");
                result.append(classificationGroup);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
	createOutputWithName(CommonInputOutputConstants.FEATURES_LIST);
    }

} // ExtractFeaturesImpl
