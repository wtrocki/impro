/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Element Connection</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.ElementConnection#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.ElementConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getElementConnection()
 * @model
 * @generated
 */
public interface ElementConnection extends EObject {
    /**
         * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
         * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @return the value of the '<em>Connection Type</em>' attribute.
         * @see #setConnectionType(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getElementConnection_ConnectionType()
         * @model
         * @generated
         */
    String getConnectionType();

    /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.ElementConnection#getConnectionType <em>Connection Type</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @param value the new value of the '<em>Connection Type</em>' attribute.
         * @see #getConnectionType()
         * @generated
         */
    void setConnectionType(String value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(DiagramElement)
     * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getElementConnection_Target()
     * @model
     * @generated
     */
    DiagramElement getTarget();

    /**
     * Sets the value of the '
     * {@link pl.zgora.uz.imgpro.model.diagram.ElementConnection#getTarget
     * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(DiagramElement value);

} // ElementConnection
