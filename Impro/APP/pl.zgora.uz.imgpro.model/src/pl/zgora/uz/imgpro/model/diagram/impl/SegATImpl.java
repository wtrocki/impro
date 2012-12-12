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
import pl.zgora.uz.imgpro.model.diagram.SegAT;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Seg AT</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegATImpl#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegATImpl#getAt_threshold <em>At threshold</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SegATImpl#isUseMedian <em>Use Median</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegATImpl extends DiagramElementImpl implements SegAT {
    /**
         * The default value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getWindowSize()
         * @generated
         * @ordered
         */
    protected static final int WINDOW_SIZE_EDEFAULT = 20;
    /**
         * The cached value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getWindowSize()
         * @generated
         * @ordered
         */
    protected int windowSize = WINDOW_SIZE_EDEFAULT;
    /**
         * The default value of the '{@link #getAt_threshold() <em>At threshold</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getAt_threshold()
         * @generated
         * @ordered
         */
    protected static final float AT_THRESHOLD_EDEFAULT = 0.01F;
    /**
         * The cached value of the '{@link #getAt_threshold() <em>At threshold</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getAt_threshold()
         * @generated
         * @ordered
         */
    protected float at_threshold = AT_THRESHOLD_EDEFAULT;
    /**
         * The default value of the '{@link #isUseMedian() <em>Use Median</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #isUseMedian()
         * @generated
         * @ordered
         */
    protected static final boolean USE_MEDIAN_EDEFAULT = false;
    /**
         * The cached value of the '{@link #isUseMedian() <em>Use Median</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #isUseMedian()
         * @generated
         * @ordered
         */
    protected boolean useMedian = USE_MEDIAN_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected SegATImpl() {
	super();
	setPhase(Phase.SEGMENTATION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.SEG_AT;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public int getWindowSize() {
                return windowSize;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setWindowSize(int newWindowSize) {
                int oldWindowSize = windowSize;
                windowSize = newWindowSize;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_AT__WINDOW_SIZE, oldWindowSize, windowSize));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public float getAt_threshold() {
                return at_threshold;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setAt_threshold(float newAt_threshold) {
                float oldAt_threshold = at_threshold;
                at_threshold = newAt_threshold;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_AT__AT_THRESHOLD, oldAt_threshold, at_threshold));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public boolean isUseMedian() {
                return useMedian;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setUseMedian(boolean newUseMedian) {
                boolean oldUseMedian = useMedian;
                useMedian = newUseMedian;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SEG_AT__USE_MEDIAN, oldUseMedian, useMedian));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.SEG_AT__WINDOW_SIZE:
                                return getWindowSize();
                        case DiagramPackage.SEG_AT__AT_THRESHOLD:
                                return getAt_threshold();
                        case DiagramPackage.SEG_AT__USE_MEDIAN:
                                return isUseMedian();
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
                        case DiagramPackage.SEG_AT__WINDOW_SIZE:
                                setWindowSize((Integer)newValue);
                                return;
                        case DiagramPackage.SEG_AT__AT_THRESHOLD:
                                setAt_threshold((Float)newValue);
                                return;
                        case DiagramPackage.SEG_AT__USE_MEDIAN:
                                setUseMedian((Boolean)newValue);
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
                        case DiagramPackage.SEG_AT__WINDOW_SIZE:
                                setWindowSize(WINDOW_SIZE_EDEFAULT);
                                return;
                        case DiagramPackage.SEG_AT__AT_THRESHOLD:
                                setAt_threshold(AT_THRESHOLD_EDEFAULT);
                                return;
                        case DiagramPackage.SEG_AT__USE_MEDIAN:
                                setUseMedian(USE_MEDIAN_EDEFAULT);
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
                        case DiagramPackage.SEG_AT__WINDOW_SIZE:
                                return windowSize != WINDOW_SIZE_EDEFAULT;
                        case DiagramPackage.SEG_AT__AT_THRESHOLD:
                                return at_threshold != AT_THRESHOLD_EDEFAULT;
                        case DiagramPackage.SEG_AT__USE_MEDIAN:
                                return useMedian != USE_MEDIAN_EDEFAULT;
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
                result.append(" (windowSize: ");
                result.append(windowSize);
                result.append(", at_threshold: ");
                result.append(at_threshold);
                result.append(", useMedian: ");
                result.append(useMedian);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.FILE_LIST_ARG);
	createOutputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
    }
} // SegATImpl
