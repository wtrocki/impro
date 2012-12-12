/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import org.eclipse.emf.ecore.EClass;

import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.NoiseRemove;
import pl.zgora.uz.imgpro.model.diagram.Phase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Noise Remove</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NoiseRemoveImpl extends DiagramElementImpl implements NoiseRemove {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected NoiseRemoveImpl() {
	super();
	setPhase(Phase.PREPROCESSING);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.NOISE_REMOVE;
        }

} // NoiseRemoveImpl
