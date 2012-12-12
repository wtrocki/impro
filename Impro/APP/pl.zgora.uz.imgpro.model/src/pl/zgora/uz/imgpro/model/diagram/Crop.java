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
 * A representation of the model object '<em><b>Crop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.Crop#getNumberOfHorizontalPixels <em>Number Of Horizontal Pixels</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.Crop#getNumberOfVerticalPixels <em>Number Of Vertical Pixels</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getCrop()
 * @model
 * @generated
 */
public interface Crop extends DiagramElement {

        /**
         * Returns the value of the '<em><b>Number Of Horizontal Pixels</b></em>' attribute.
         * The default value is <code>"4"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Number Of Horizontal Pixels</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Number Of Horizontal Pixels</em>' attribute.
         * @see #setNumberOfHorizontalPixels(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getCrop_NumberOfHorizontalPixels()
         * @model default="4"
         * @generated
         */
        int getNumberOfHorizontalPixels();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.Crop#getNumberOfHorizontalPixels <em>Number Of Horizontal Pixels</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Number Of Horizontal Pixels</em>' attribute.
         * @see #getNumberOfHorizontalPixels()
         * @generated
         */
        void setNumberOfHorizontalPixels(int value);

        /**
         * Returns the value of the '<em><b>Number Of Vertical Pixels</b></em>' attribute.
         * The default value is <code>"4"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Number Of Vertical Pixels</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Number Of Vertical Pixels</em>' attribute.
         * @see #setNumberOfVerticalPixels(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getCrop_NumberOfVerticalPixels()
         * @model default="4"
         * @generated
         */
        int getNumberOfVerticalPixels();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.Crop#getNumberOfVerticalPixels <em>Number Of Vertical Pixels</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Number Of Vertical Pixels</em>' attribute.
         * @see #getNumberOfVerticalPixels()
         * @generated
         */
        void setNumberOfVerticalPixels(int value);
} // Crop
