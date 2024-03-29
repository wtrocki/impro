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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.DirectoryType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Directory Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DirectoryTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectoryTypeImpl extends EObjectImpl implements DirectoryType {
    /**
         * The default value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
    protected static final String NAME_EDEFAULT = "";

    /**
         * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getName()
         * @generated
         * @ordered
         */
    protected String name = NAME_EDEFAULT;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected DirectoryTypeImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.DIRECTORY_TYPE;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public String getName() {
                return name;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setName(String newName) {
                String oldName = name;
                name = newName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIRECTORY_TYPE__NAME, oldName, name));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.DIRECTORY_TYPE__NAME:
                                return getName();
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
                        case DiagramPackage.DIRECTORY_TYPE__NAME:
                                setName((String)newValue);
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
                        case DiagramPackage.DIRECTORY_TYPE__NAME:
                                setName(NAME_EDEFAULT);
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
                        case DiagramPackage.DIRECTORY_TYPE__NAME:
                                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
                }
                return super.eIsSet(featureID);
        }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    
    public String toString() {
	return name;
    }

} // DirectoryTypeImpl
