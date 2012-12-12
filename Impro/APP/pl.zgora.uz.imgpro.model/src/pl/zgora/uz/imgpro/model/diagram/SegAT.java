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
 * A representation of the model object '<em><b>Seg AT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegAT#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegAT#getAt_threshold <em>At threshold</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegAT#isUseMedian <em>Use Median</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegAT()
 * @model
 * @generated
 */
public interface SegAT extends DiagramElement {

        /**
         * Returns the value of the '<em><b>Window Size</b></em>' attribute.
         * The default value is <code>"20"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Window Size</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Window Size</em>' attribute.
         * @see #setWindowSize(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegAT_WindowSize()
         * @model default="20"
         * @generated
         */
        int getWindowSize();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegAT#getWindowSize <em>Window Size</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Window Size</em>' attribute.
         * @see #getWindowSize()
         * @generated
         */
        void setWindowSize(int value);

        /**
         * Returns the value of the '<em><b>At threshold</b></em>' attribute.
         * The default value is <code>"0.01"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>At threshold</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>At threshold</em>' attribute.
         * @see #setAt_threshold(float)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegAT_At_threshold()
         * @model default="0.01"
         * @generated
         */
        float getAt_threshold();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegAT#getAt_threshold <em>At threshold</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>At threshold</em>' attribute.
         * @see #getAt_threshold()
         * @generated
         */
        void setAt_threshold(float value);

        /**
         * Returns the value of the '<em><b>Use Median</b></em>' attribute.
         * The default value is <code>"false"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Use Median</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Use Median</em>' attribute.
         * @see #setUseMedian(boolean)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegAT_UseMedian()
         * @model default="false"
         * @generated
         */
        boolean isUseMedian();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegAT#isUseMedian <em>Use Median</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Use Median</em>' attribute.
         * @see #isUseMedian()
         * @generated
         */
        void setUseMedian(boolean value);
} // SegAT
