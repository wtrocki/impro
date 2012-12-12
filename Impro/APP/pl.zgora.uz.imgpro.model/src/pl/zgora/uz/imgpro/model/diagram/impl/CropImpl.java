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

import pl.zgora.uz.imgpro.model.diagram.Crop;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.Phase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Crop</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.CropImpl#getNumberOfHorizontalPixels <em>Number Of Horizontal Pixels</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.CropImpl#getNumberOfVerticalPixels <em>Number Of Vertical Pixels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CropImpl extends DiagramElementImpl implements Crop {
    /**
         * The default value of the '{@link #getNumberOfHorizontalPixels() <em>Number Of Horizontal Pixels</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNumberOfHorizontalPixels()
         * @generated
         * @ordered
         */
        protected static final int NUMBER_OF_HORIZONTAL_PIXELS_EDEFAULT = 4;
        /**
         * The cached value of the '{@link #getNumberOfHorizontalPixels() <em>Number Of Horizontal Pixels</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNumberOfHorizontalPixels()
         * @generated
         * @ordered
         */
        protected int numberOfHorizontalPixels = NUMBER_OF_HORIZONTAL_PIXELS_EDEFAULT;
        /**
         * The default value of the '{@link #getNumberOfVerticalPixels() <em>Number Of Vertical Pixels</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNumberOfVerticalPixels()
         * @generated
         * @ordered
         */
        protected static final int NUMBER_OF_VERTICAL_PIXELS_EDEFAULT = 4;
        /**
         * The cached value of the '{@link #getNumberOfVerticalPixels() <em>Number Of Vertical Pixels</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNumberOfVerticalPixels()
         * @generated
         * @ordered
         */
        protected int numberOfVerticalPixels = NUMBER_OF_VERTICAL_PIXELS_EDEFAULT;
/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected CropImpl() {
	super();
	setPhase(Phase.PREPROCESSING);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.CROP;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getNumberOfHorizontalPixels() {
                return numberOfHorizontalPixels;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setNumberOfHorizontalPixels(int newNumberOfHorizontalPixels) {
                int oldNumberOfHorizontalPixels = numberOfHorizontalPixels;
                numberOfHorizontalPixels = newNumberOfHorizontalPixels;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.CROP__NUMBER_OF_HORIZONTAL_PIXELS, oldNumberOfHorizontalPixels, numberOfHorizontalPixels));
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getNumberOfVerticalPixels() {
                return numberOfVerticalPixels;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setNumberOfVerticalPixels(int newNumberOfVerticalPixels) {
                int oldNumberOfVerticalPixels = numberOfVerticalPixels;
                numberOfVerticalPixels = newNumberOfVerticalPixels;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.CROP__NUMBER_OF_VERTICAL_PIXELS, oldNumberOfVerticalPixels, numberOfVerticalPixels));
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.CROP__NUMBER_OF_HORIZONTAL_PIXELS:
                                return getNumberOfHorizontalPixels();
                        case DiagramPackage.CROP__NUMBER_OF_VERTICAL_PIXELS:
                                return getNumberOfVerticalPixels();
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
                        case DiagramPackage.CROP__NUMBER_OF_HORIZONTAL_PIXELS:
                                setNumberOfHorizontalPixels((Integer)newValue);
                                return;
                        case DiagramPackage.CROP__NUMBER_OF_VERTICAL_PIXELS:
                                setNumberOfVerticalPixels((Integer)newValue);
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
                        case DiagramPackage.CROP__NUMBER_OF_HORIZONTAL_PIXELS:
                                setNumberOfHorizontalPixels(NUMBER_OF_HORIZONTAL_PIXELS_EDEFAULT);
                                return;
                        case DiagramPackage.CROP__NUMBER_OF_VERTICAL_PIXELS:
                                setNumberOfVerticalPixels(NUMBER_OF_VERTICAL_PIXELS_EDEFAULT);
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
                        case DiagramPackage.CROP__NUMBER_OF_HORIZONTAL_PIXELS:
                                return numberOfHorizontalPixels != NUMBER_OF_HORIZONTAL_PIXELS_EDEFAULT;
                        case DiagramPackage.CROP__NUMBER_OF_VERTICAL_PIXELS:
                                return numberOfVerticalPixels != NUMBER_OF_VERTICAL_PIXELS_EDEFAULT;
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
                result.append(" (numberOfHorizontalPixels: ");
                result.append(numberOfHorizontalPixels);
                result.append(", numberOfVerticalPixels: ");
                result.append(numberOfVerticalPixels);
                result.append(')');
                return result.toString();
        }

} // CropImpl
