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

import pl.zgora.uz.imgpro.model.diagram.Connector;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ConnectorImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EObjectImpl implements Connector {
        /**
         * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTypeName()
         * @generated
         * @ordered
         */
        protected static final String TYPE_NAME_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTypeName()
         * @generated
         * @ordered
         */
        protected String typeName = TYPE_NAME_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ConnectorImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        protected EClass eStaticClass() {
                return DiagramPackage.Literals.CONNECTOR;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getTypeName() {
                return typeName;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTypeName(String newTypeName) {
                String oldTypeName = typeName;
                typeName = newTypeName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.CONNECTOR__TYPE_NAME, oldTypeName, typeName));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.CONNECTOR__TYPE_NAME:
                                return getTypeName();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DiagramPackage.CONNECTOR__TYPE_NAME:
                                setTypeName((String)newValue);
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
                        case DiagramPackage.CONNECTOR__TYPE_NAME:
                                setTypeName(TYPE_NAME_EDEFAULT);
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
                        case DiagramPackage.CONNECTOR__TYPE_NAME:
                                return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
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
                result.append(" (typeName: ");
                result.append(typeName);
                result.append(')');
                return result.toString();
        }

} //ConnectorImpl
