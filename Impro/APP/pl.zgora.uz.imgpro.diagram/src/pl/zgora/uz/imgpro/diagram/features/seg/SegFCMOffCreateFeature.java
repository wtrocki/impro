/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features.seg;

import org.eclipse.graphiti.features.IFeatureProvider;

import pl.zgora.uz.imgpro.diagram.features.AbstractImProCreateFeature;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.SegFCMOff;

public class SegFCMOffCreateFeature extends AbstractImProCreateFeature {

    public SegFCMOffCreateFeature(IFeatureProvider fp) {
	// set name and description of the creation feature
	super(fp, SegFCMOff.class.getSimpleName(), "Fuzzy c-means off line based segmentation"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    
    public DiagramElement createElement() {
	return DiagramFactory.eINSTANCE.createSegFCMOff();
    }
}
