/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dir Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DirInput#getFilter <em>Filter</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DirInput#getDirectory <em>Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDirInput()
 * @model
 * @generated
 */
public interface DirInput extends DiagramElement {
        /**
         * Returns the value of the '<em><b>Filter</b></em>' attribute.
         * The default value is <code>"*.tif"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Filter</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Filter</em>' attribute.
         * @see #setFilter(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDirInput_Filter()
         * @model default="*.tif"
         * @generated
         */
        String getFilter();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.DirInput#getFilter <em>Filter</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Filter</em>' attribute.
         * @see #getFilter()
         * @generated
         */
        void setFilter(String value);

        /**
         * Returns the value of the '<em><b>Directory</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Directory</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Directory</em>' containment reference.
         * @see #setDirectory(DirectoryType)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDirInput_Directory()
         * @model containment="true" required="true"
         * @generated
         */
        DirectoryType getDirectory();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.DirInput#getDirectory <em>Directory</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Directory</em>' containment reference.
         * @see #getDirectory()
         * @generated
         */
        void setDirectory(DirectoryType value);

} // DirInput
