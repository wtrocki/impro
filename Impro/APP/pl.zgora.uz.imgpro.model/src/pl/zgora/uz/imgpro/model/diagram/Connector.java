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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.Connector#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
        /**
         * Returns the value of the '<em><b>Type Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Type Name</em>' attribute.
         * @see #setTypeName(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getConnector_TypeName()
         * @model
         * @generated
         */
        String getTypeName();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.Connector#getTypeName <em>Type Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Type Name</em>' attribute.
         * @see #getTypeName()
         * @generated
         */
        void setTypeName(String value);

} // Connector
