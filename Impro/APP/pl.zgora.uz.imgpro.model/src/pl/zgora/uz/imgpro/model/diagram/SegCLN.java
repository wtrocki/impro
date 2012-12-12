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
 * A representation of the model object '<em><b>Seg CLN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SegCLN#getClnLearningEpochs <em>Cln Learning Epochs</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegCLN()
 * @model
 * @generated
 */
public interface SegCLN extends DiagramElement {

        /**
         * Returns the value of the '<em><b>Cln Learning Epochs</b></em>' attribute.
         * The default value is <code>"100"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Cln Learning Epochs</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Cln Learning Epochs</em>' attribute.
         * @see #setClnLearningEpochs(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSegCLN_ClnLearningEpochs()
         * @model default="100"
         * @generated
         */
        int getClnLearningEpochs();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SegCLN#getClnLearningEpochs <em>Cln Learning Epochs</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Cln Learning Epochs</em>' attribute.
         * @see #getClnLearningEpochs()
         * @generated
         */
        void setClnLearningEpochs(int value);
} // SegCLN
