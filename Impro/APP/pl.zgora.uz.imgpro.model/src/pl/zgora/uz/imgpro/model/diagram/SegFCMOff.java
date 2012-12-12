/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Seg FCM Off</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_clusters <em>Fcm off clusters</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_options <em>Fcm off options</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_threshold <em>Fcm off threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegFCMOff()
 * @model
 * @generated
 */
public interface SegFCMOff extends DiagramElement {

    /**
         * Returns the value of the '<em><b>Fcm off clusters</b></em>' attribute.
         * The default value is <code>"3"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Fcm off clusters</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Fcm off clusters</em>' attribute.
         * @see #setFcm_off_clusters(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegFCMOff_Fcm_off_clusters()
         * @model default="3"
         * @generated
         */
        int getFcm_off_clusters();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_clusters <em>Fcm off clusters</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Fcm off clusters</em>' attribute.
         * @see #getFcm_off_clusters()
         * @generated
         */
        void setFcm_off_clusters(int value);

/**
         * Returns the value of the '<em><b>Fcm off options</b></em>' attribute.
         * The default value is <code>"[2 100 0.00001 0]"</code>.
         * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Fcm off options</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @return the value of the '<em>Fcm off options</em>' attribute.
         * @see #setFcm_off_options(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegFCMOff_Fcm_off_options()
         * @model default="[2 100 0.00001 0]"
         * @generated
         */
    String getFcm_off_options();

    /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_options <em>Fcm off options</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @param value the new value of the '<em>Fcm off options</em>' attribute.
         * @see #getFcm_off_options()
         * @generated
         */
    void setFcm_off_options(String value);

    /**
         * Returns the value of the '<em><b>Fcm off threshold</b></em>' attribute.
         * The default value is <code>"0.6"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Fcm off threshold</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Fcm off threshold</em>' attribute.
         * @see #setFcm_off_threshold(float)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegFCMOff_Fcm_off_threshold()
         * @model default="0.6"
         * @generated
         */
        float getFcm_off_threshold();

/**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_threshold <em>Fcm off threshold</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Fcm off threshold</em>' attribute.
         * @see #getFcm_off_threshold()
         * @generated
         */
        void setFcm_off_threshold(float value);
} // SegFCMOff
