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
import pl.zgora.uz.imgpro.model.diagram.Phase;
import pl.zgora.uz.imgpro.model.diagram.SegCLN;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Seg CLN</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegCLNImpl#getClnLearningEpochs <em>Cln Learning Epochs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegCLNImpl extends DiagramElementImpl implements SegCLN {
    /**
         * The default value of the '{@link #getClnLearningEpochs() <em>Cln Learning Epochs</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getClnLearningEpochs()
         * @generated
         * @ordered
         */
    protected static final int CLN_LEARNING_EPOCHS_EDEFAULT = 100;
    /**
         * The cached value of the '{@link #getClnLearningEpochs() <em>Cln Learning Epochs</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getClnLearningEpochs()
         * @generated
         * @ordered
         */
    protected int clnLearningEpochs = CLN_LEARNING_EPOCHS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected SegCLNImpl() {
	super();
	setPhase(Phase.SEGMENTATION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.SEG_CLN;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public int getClnLearningEpochs() {
                return clnLearningEpochs;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setClnLearningEpochs(int newClnLearningEpochs) {
                int oldClnLearningEpochs = clnLearningEpochs;
                clnLearningEpochs = newClnLearningEpochs;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_CLN__CLN_LEARNING_EPOCHS, oldClnLearningEpochs, clnLearningEpochs));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.SEG_CLN__CLN_LEARNING_EPOCHS:
                                return getClnLearningEpochs();
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
                        case DiagramPackage.SEG_CLN__CLN_LEARNING_EPOCHS:
                                setClnLearningEpochs((Integer)newValue);
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
                        case DiagramPackage.SEG_CLN__CLN_LEARNING_EPOCHS:
                                setClnLearningEpochs(CLN_LEARNING_EPOCHS_EDEFAULT);
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
                        case DiagramPackage.SEG_CLN__CLN_LEARNING_EPOCHS:
                                return clnLearningEpochs != CLN_LEARNING_EPOCHS_EDEFAULT;
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
                result.append(" (clnLearningEpochs: ");
                result.append(clnLearningEpochs);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.FILE_LIST_ARG);
	createOutputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
    }
} // SegCLNImpl
