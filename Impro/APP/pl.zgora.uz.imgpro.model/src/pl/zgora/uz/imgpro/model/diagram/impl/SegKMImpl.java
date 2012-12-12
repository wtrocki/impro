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
import pl.zgora.uz.imgpro.model.diagram.SegKM;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Seg KM</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegKMImpl#getKM_clusters <em>KM clusters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegKMImpl extends DiagramElementImpl implements SegKM {
    /**
         * The default value of the '{@link #getKM_clusters() <em>KM clusters</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getKM_clusters()
         * @generated
         * @ordered
         */
    protected static final int KM_CLUSTERS_EDEFAULT = 3;
    /**
         * The cached value of the '{@link #getKM_clusters() <em>KM clusters</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getKM_clusters()
         * @generated
         * @ordered
         */
    protected int kM_clusters = KM_CLUSTERS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected SegKMImpl() {
	super();
	setPhase(Phase.SEGMENTATION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.SEG_KM;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public int getKM_clusters() {
                return kM_clusters;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setKM_clusters(int newKM_clusters) {
                int oldKM_clusters = kM_clusters;
                kM_clusters = newKM_clusters;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_KM__KM_CLUSTERS, oldKM_clusters, kM_clusters));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.SEG_KM__KM_CLUSTERS:
                                return getKM_clusters();
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
                        case DiagramPackage.SEG_KM__KM_CLUSTERS:
                                setKM_clusters((Integer)newValue);
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
                        case DiagramPackage.SEG_KM__KM_CLUSTERS:
                                setKM_clusters(KM_CLUSTERS_EDEFAULT);
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
                        case DiagramPackage.SEG_KM__KM_CLUSTERS:
                                return kM_clusters != KM_CLUSTERS_EDEFAULT;
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
                result.append(" (KM_clusters: ");
                result.append(kM_clusters);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.FILE_LIST_ARG);
	createOutputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
    }

} // SegKMImpl
