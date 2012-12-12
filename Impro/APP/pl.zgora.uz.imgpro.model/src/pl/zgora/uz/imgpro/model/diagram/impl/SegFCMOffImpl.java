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
import pl.zgora.uz.imgpro.model.diagram.SegFCMOff;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Seg FCM Off</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMOffImpl#getFcm_off_clusters <em>Fcm off clusters</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMOffImpl#getFcm_off_options <em>Fcm off options</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMOffImpl#getFcm_off_threshold <em>Fcm off threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegFCMOffImpl extends DiagramElementImpl implements SegFCMOff {
    /**
         * The default value of the '{@link #getFcm_off_clusters() <em>Fcm off clusters</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_off_clusters()
         * @generated
         * @ordered
         */
    protected static final int FCM_OFF_CLUSTERS_EDEFAULT = 3;
    /**
         * The cached value of the '{@link #getFcm_off_clusters() <em>Fcm off clusters</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_off_clusters()
         * @generated
         * @ordered
         */
    protected int fcm_off_clusters = FCM_OFF_CLUSTERS_EDEFAULT;
    /**
         * The default value of the '{@link #getFcm_off_options() <em>Fcm off options</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_off_options()
         * @generated
         * @ordered
         */
    protected static final String FCM_OFF_OPTIONS_EDEFAULT = "[2 100 0.00001 0]";
    /**
         * The cached value of the '{@link #getFcm_off_options() <em>Fcm off options</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_off_options()
         * @generated
         * @ordered
         */
    protected String fcm_off_options = FCM_OFF_OPTIONS_EDEFAULT;
    /**
         * The default value of the '{@link #getFcm_off_threshold() <em>Fcm off threshold</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_off_threshold()
         * @generated
         * @ordered
         */
    protected static final float FCM_OFF_THRESHOLD_EDEFAULT = 0.6F;
    /**
         * The cached value of the '{@link #getFcm_off_threshold() <em>Fcm off threshold</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getFcm_off_threshold()
         * @generated
         * @ordered
         */
    protected float fcm_off_threshold = FCM_OFF_THRESHOLD_EDEFAULT;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected SegFCMOffImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.SEG_FCM_OFF;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public int getFcm_off_clusters() {
                return fcm_off_clusters;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setFcm_off_clusters(int newFcm_off_clusters) {
                int oldFcm_off_clusters = fcm_off_clusters;
                fcm_off_clusters = newFcm_off_clusters;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_FCM_OFF__FCM_OFF_CLUSTERS, oldFcm_off_clusters, fcm_off_clusters));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public String getFcm_off_options() {
                return fcm_off_options;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setFcm_off_options(String newFcm_off_options) {
                String oldFcm_off_options = fcm_off_options;
                fcm_off_options = newFcm_off_options;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_FCM_OFF__FCM_OFF_OPTIONS, oldFcm_off_options, fcm_off_options));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public float getFcm_off_threshold() {
                return fcm_off_threshold;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setFcm_off_threshold(float newFcm_off_threshold) {
                float oldFcm_off_threshold = fcm_off_threshold;
                fcm_off_threshold = newFcm_off_threshold;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_FCM_OFF__FCM_OFF_THRESHOLD, oldFcm_off_threshold, fcm_off_threshold));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_CLUSTERS:
                                return getFcm_off_clusters();
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_OPTIONS:
                                return getFcm_off_options();
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_THRESHOLD:
                                return getFcm_off_threshold();
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
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_CLUSTERS:
                                setFcm_off_clusters((Integer)newValue);
                                return;
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_OPTIONS:
                                setFcm_off_options((String)newValue);
                                return;
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_THRESHOLD:
                                setFcm_off_threshold((Float)newValue);
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
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_CLUSTERS:
                                setFcm_off_clusters(FCM_OFF_CLUSTERS_EDEFAULT);
                                return;
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_OPTIONS:
                                setFcm_off_options(FCM_OFF_OPTIONS_EDEFAULT);
                                return;
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_THRESHOLD:
                                setFcm_off_threshold(FCM_OFF_THRESHOLD_EDEFAULT);
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
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_CLUSTERS:
                                return fcm_off_clusters != FCM_OFF_CLUSTERS_EDEFAULT;
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_OPTIONS:
                                return FCM_OFF_OPTIONS_EDEFAULT == null ? fcm_off_options != null : !FCM_OFF_OPTIONS_EDEFAULT.equals(fcm_off_options);
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_THRESHOLD:
                                return fcm_off_threshold != FCM_OFF_THRESHOLD_EDEFAULT;
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
                result.append(" (fcm_off_clusters: ");
                result.append(fcm_off_clusters);
                result.append(", fcm_off_options: ");
                result.append(fcm_off_options);
                result.append(", fcm_off_threshold: ");
                result.append(fcm_off_threshold);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.FILE_LIST_ARG);
	createOutputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
    }

} // SegFCMOffImpl
