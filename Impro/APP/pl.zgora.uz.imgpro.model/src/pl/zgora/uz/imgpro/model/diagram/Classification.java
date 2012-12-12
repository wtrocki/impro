/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.Classification#getClassificationStyle <em>Classification Style</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.Classification#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getClassification()
 * @model
 * @generated
 */
public interface Classification extends DiagramElement {

        /**
         * Returns the value of the '<em><b>Classification Style</b></em>' attribute.
         * The literals are from the enumeration {@link pl.zgora.uz.imgpro.model.diagram.ClassificationStyle}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Classification Style</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Classification Style</em>' attribute.
         * @see pl.zgora.uz.imgpro.model.diagram.ClassificationStyle
         * @see #setClassificationStyle(ClassificationStyle)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getClassification_ClassificationStyle()
         * @model
         * @generated
         */
        ClassificationStyle getClassificationStyle();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.Classification#getClassificationStyle <em>Classification Style</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Classification Style</em>' attribute.
         * @see pl.zgora.uz.imgpro.model.diagram.ClassificationStyle
         * @see #getClassificationStyle()
         * @generated
         */
        void setClassificationStyle(ClassificationStyle value);

        /**
         * Returns the value of the '<em><b>Features</b></em>' attribute list.
         * The list contents are of type {@link pl.zgora.uz.imgpro.model.diagram.Features}.
         * The literals are from the enumeration {@link pl.zgora.uz.imgpro.model.diagram.Features}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Features</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Features</em>' attribute list.
         * @see pl.zgora.uz.imgpro.model.diagram.Features
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getClassification_Features()
         * @model
         * @generated
         */
        EList<Features> getFeatures();
} // Classification
