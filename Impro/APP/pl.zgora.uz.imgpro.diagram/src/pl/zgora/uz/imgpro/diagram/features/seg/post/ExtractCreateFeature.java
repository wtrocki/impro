/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features.seg.post;

import org.eclipse.graphiti.features.IFeatureProvider;

import pl.zgora.uz.imgpro.diagram.features.AbstractImProCreateFeature;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.ExtractFeatures;

public class ExtractCreateFeature extends AbstractImProCreateFeature {

    public ExtractCreateFeature(IFeatureProvider fp) {
	// set name and description of the creation feature
	super(fp, ExtractFeatures.class.getSimpleName(), "Features extraction"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    
    public DiagramElement createElement() {
	return DiagramFactory.eINSTANCE.createExtractFeatures();
    }
}
