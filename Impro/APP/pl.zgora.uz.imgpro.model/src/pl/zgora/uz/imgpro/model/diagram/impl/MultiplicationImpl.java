/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import org.eclipse.emf.ecore.EClass;

import pl.zgora.uz.imgpro.model.CommonInputOutputConstants;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.Multiplication;
import pl.zgora.uz.imgpro.model.diagram.Phase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Multiplication</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MultiplicationImpl extends DiagramElementImpl implements
	Multiplication {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected MultiplicationImpl() {
	super();
	setPhase(Phase.SEGMENTATION);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.MULTIPLICATION;
        }

    
    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
	createInputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
	createOutputWithName(CommonInputOutputConstants.SEG_IMG_LIST_ARG);
    }
} // MultiplicationImpl
