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
 * A representation of the model object '<em><b>Seg FCM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_clusters <em>Fcm clusters</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_options <em>Fcm options</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_threshold <em>Fcm threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegFCM()
 * @model
 * @generated
 */
public interface SegFCM extends DiagramElement {

        /**
         * Returns the value of the '<em><b>Fcm clusters</b></em>' attribute.
         * The default value is <code>"3"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Fcm clusters</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Fcm clusters</em>' attribute.
         * @see #setFcm_clusters(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegFCM_Fcm_clusters()
         * @model default="3"
         * @generated
         */
        int getFcm_clusters();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_clusters <em>Fcm clusters</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Fcm clusters</em>' attribute.
         * @see #getFcm_clusters()
         * @generated
         */
        void setFcm_clusters(int value);

        /**
         * Returns the value of the '<em><b>Fcm options</b></em>' attribute.
         * The default value is <code>"[2 100 0.00001 0]"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Fcm options</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Fcm options</em>' attribute.
         * @see #setFcm_options(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegFCM_Fcm_options()
         * @model default="[2 100 0.00001 0]"
         * @generated
         */
        String getFcm_options();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_options <em>Fcm options</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Fcm options</em>' attribute.
         * @see #getFcm_options()
         * @generated
         */
        void setFcm_options(String value);

        /**
         * Returns the value of the '<em><b>Fcm threshold</b></em>' attribute.
         * The default value is <code>"0.8"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Fcm threshold</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Fcm threshold</em>' attribute.
         * @see #setFcm_threshold(float)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegFCM_Fcm_threshold()
         * @model default="0.8"
         * @generated
         */
        float getFcm_threshold();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_threshold <em>Fcm threshold</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Fcm threshold</em>' attribute.
         * @see #getFcm_threshold()
         * @generated
         */
        void setFcm_threshold(float value);
} // SegFCM
