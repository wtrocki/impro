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
import pl.zgora.uz.imgpro.model.diagram.SegFCM;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Seg FCM</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMImpl#getFcm_clusters <em>Fcm clusters</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMImpl#getFcm_options <em>Fcm options</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMImpl#getFcm_threshold <em>Fcm threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegFCMImpl extends DiagramElementImpl implements SegFCM {
    /**
         * The default value of the '{@link #getFcm_clusters() <em>Fcm clusters</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_clusters()
         * @generated
         * @ordered
         */
    protected static final int FCM_CLUSTERS_EDEFAULT = 3;
    /**
         * The cached value of the '{@link #getFcm_clusters() <em>Fcm clusters</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getFcm_clusters()
         * @generated
         * @ordered
         */
    protected int fcm_clusters = FCM_CLUSTERS_EDEFAULT;
    /**
         * The default value of the '{@link #getFcm_options() <em>Fcm options</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getFcm_options()
         * @generated
         * @ordered
         */
    protected static final String FCM_OPTIONS_EDEFAULT = "[2 100 0.00001 0]";
    /**
         * The cached value of the '{@link #getFcm_options() <em>Fcm options</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getFcm_options()
         * @generated
         * @ordered
         */
    protected String fcm_options = FCM_OPTIONS_EDEFAULT;
    /**
         * The default value of the '{@link #getFcm_threshold() <em>Fcm threshold</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_threshold()
         * @generated
         * @ordered
         */
    protected static final float FCM_THRESHOLD_EDEFAULT = 0.8F;
    /**
         * The cached value of the '{@link #getFcm_threshold() <em>Fcm threshold</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_threshold()
         * @generated
         * @ordered
         */
    protected float fcm_threshold = FCM_THRESHOLD_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected SegFCMImpl() {
	super();
	setPhase(Phase.SEGMENTATION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.SEG_FCM;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public int getFcm_clusters() {
                return fcm_clusters;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setFcm_clusters(int newFcm_clusters) {
                int oldFcm_clusters = fcm_clusters;
                fcm_clusters = newFcm_clusters;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_FCM__FCM_CLUSTERS, oldFcm_clusters, fcm_clusters));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public String getFcm_options() {
                return fcm_options;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setFcm_options(String newFcm_options) {
                String oldFcm_options = fcm_options;
                fcm_options = newFcm_options;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_FCM__FCM_OPTIONS, oldFcm_options, fcm_options));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public float getFcm_threshold() {
                return fcm_threshold;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setFcm_threshold(float newFcm_threshold) {
                float oldFcm_threshold = fcm_threshold;
                fcm_threshold = newFcm_threshold;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_FCM__FCM_THRESHOLD, oldFcm_threshold, fcm_threshold));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.SEG_FCM__FCM_CLUSTERS:
                                return getFcm_clusters();
                        case DiagramPackage.SEG_FCM__FCM_OPTIONS:
                                return getFcm_options();
                        case DiagramPackage.SEG_FCM__FCM_THRESHOLD:
                                return getFcm_threshold();
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
                        case DiagramPackage.SEG_FCM__FCM_CLUSTERS:
                                setFcm_clusters((Integer)newValue);
                                return;
                        case DiagramPackage.SEG_FCM__FCM_OPTIONS:
                                setFcm_options((String)newValue);
                                return;
                        case DiagramPackage.SEG_FCM__FCM_THRESHOLD:
                                setFcm_threshold((Float)newValue);
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
                        case DiagramPackage.SEG_FCM__FCM_CLUSTERS:
                                setFcm_clusters(FCM_CLUSTERS_EDEFAULT);
                                return;
                        case DiagramPackage.SEG_FCM__FCM_OPTIONS:
                                setFcm_options(FCM_OPTIONS_EDEFAULT);
                                return;
                        case DiagramPackage.SEG_FCM__FCM_THRESHOLD:
                                setFcm_threshold(FCM_THRESHOLD_EDEFAULT);
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
                        case DiagramPackage.SEG_FCM__FCM_CLUSTERS:
                                return fcm_clusters != FCM_CLUSTERS_EDEFAULT;
                        case DiagramPackage.SEG_FCM__FCM_OPTIONS:
                                return FCM_OPTIONS_EDEFAULT == null ? fcm_options != null : !FCM_OPTIONS_EDEFAULT.equals(fcm_options);
                        case DiagramPackage.SEG_FCM__FCM_THRESHOLD:
                                return fcm_threshold != FCM_THRESHOLD_EDEFAULT;
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
                result.append(" (fcm_clusters: ");
                result.append(fcm_clusters);
                result.append(", fcm_options: ");
                result.append(fcm_options);
                result.append(", fcm_threshold: ");
                result.append(fcm_threshold);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.FILE_LIST_ARG);
	createOutputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
    }
} // SegFCMImpl
