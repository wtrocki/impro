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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Element Connection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ElementConnectionImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ElementConnectionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementConnectionImpl extends EObjectImpl implements
	ElementConnection {

    /**
         * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getConnectionType()
         * @generated
         * @ordered
         */
    protected static final String CONNECTION_TYPE_EDEFAULT = null;

    /**
         * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getConnectionType()
         * @generated
         * @ordered
         */
    protected String connectionType = CONNECTION_TYPE_EDEFAULT;

    /**
         * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getTarget()
         * @generated
         * @ordered
         */
    protected DiagramElement target;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected ElementConnectionImpl() {
	super();
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.ELEMENT_CONNECTION;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public String getConnectionType() {
                return connectionType;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setConnectionType(String newConnectionType) {
                String oldConnectionType = connectionType;
                connectionType = newConnectionType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ELEMENT_CONNECTION__CONNECTION_TYPE, oldConnectionType, connectionType));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public DiagramElement getTarget() {
                if (target != null && target.eIsProxy()) {
                        InternalEObject oldTarget = (InternalEObject)target;
                        target = (DiagramElement)eResolveProxy(oldTarget);
                        if (target != oldTarget) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.ELEMENT_CONNECTION__TARGET, oldTarget, target));
                        }
                }
                return target;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public DiagramElement basicGetTarget() {
                return target;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setTarget(DiagramElement newTarget) {
                DiagramElement oldTarget = target;
                target = newTarget;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ELEMENT_CONNECTION__TARGET, oldTarget, target));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.ELEMENT_CONNECTION__CONNECTION_TYPE:
                                return getConnectionType();
                        case DiagramPackage.ELEMENT_CONNECTION__TARGET:
                                if (resolve) return getTarget();
                                return basicGetTarget();
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
                        case DiagramPackage.ELEMENT_CONNECTION__CONNECTION_TYPE:
                                setConnectionType((String)newValue);
                                return;
                        case DiagramPackage.ELEMENT_CONNECTION__TARGET:
                                setTarget((DiagramElement)newValue);
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
                        case DiagramPackage.ELEMENT_CONNECTION__CONNECTION_TYPE:
                                setConnectionType(CONNECTION_TYPE_EDEFAULT);
                                return;
                        case DiagramPackage.ELEMENT_CONNECTION__TARGET:
                                setTarget((DiagramElement)null);
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
                        case DiagramPackage.ELEMENT_CONNECTION__CONNECTION_TYPE:
                                return CONNECTION_TYPE_EDEFAULT == null ? connectionType != null : !CONNECTION_TYPE_EDEFAULT.equals(connectionType);
                        case DiagramPackage.ELEMENT_CONNECTION__TARGET:
                                return target != null;
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
                result.append(" (connectionType: ");
                result.append(connectionType);
                result.append(')');
                return result.toString();
        }

} // ElementConnectionImpl
