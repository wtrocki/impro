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
 * A representation of the model object '<em><b>Directory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DirectoryType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDirectoryType()
 * @model
 * @generated
 */
public interface DirectoryType extends EObject {
        /**
         * Returns the value of the '<em><b>Name</b></em>' attribute.
         * The default value is <code>""</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Name</em>' attribute.
         * @see #setName(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDirectoryType_Name()
         * @model default=""
         * @generated
         */
        String getName();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.DirectoryType#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);

} // DirectoryType
