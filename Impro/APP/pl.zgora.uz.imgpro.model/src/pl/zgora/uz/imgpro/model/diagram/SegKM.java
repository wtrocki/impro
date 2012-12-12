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
 * A representation of the model object '<em><b>Seg KM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegKM#getKM_clusters <em>KM clusters</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegKM()
 * @model
 * @generated
 */
public interface SegKM extends DiagramElement {

        /**
         * Returns the value of the '<em><b>KM clusters</b></em>' attribute.
         * The default value is <code>"3"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>KM clusters</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>KM clusters</em>' attribute.
         * @see #setKM_clusters(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegKM_KM_clusters()
         * @model default="3"
         * @generated
         */
        int getKM_clusters();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegKM#getKM_clusters <em>KM clusters</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>KM clusters</em>' attribute.
         * @see #getKM_clusters()
         * @generated
         */
        void setKM_clusters(int value);
} // SegKM
