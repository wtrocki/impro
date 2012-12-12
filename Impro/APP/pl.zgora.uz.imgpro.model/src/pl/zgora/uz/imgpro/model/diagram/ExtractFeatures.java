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
 * A representation of the model object '<em><b>Extract Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.ExtractFeatures#getClassificationGroup <em>Classification Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getExtractFeatures()
 * @model
 * @generated
 */
public interface ExtractFeatures extends DiagramElement {

        /**
         * Returns the value of the '<em><b>Classification Group</b></em>' attribute.
         * The default value is <code>""</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Classification Group</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Classification Group</em>' attribute.
         * @see #setClassificationGroup(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getExtractFeatures_ClassificationGroup()
         * @model default=""
         * @generated
         */
        String getClassificationGroup();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.ExtractFeatures#getClassificationGroup <em>Classification Group</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Classification Group</em>' attribute.
         * @see #getClassificationGroup()
         * @generated
         */
        void setClassificationGroup(String value);
} // ExtractFeatures
