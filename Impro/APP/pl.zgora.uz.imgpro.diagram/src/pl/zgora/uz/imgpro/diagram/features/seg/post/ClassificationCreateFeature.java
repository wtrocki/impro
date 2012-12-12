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
import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;

public class ClassificationCreateFeature extends AbstractImProCreateFeature {

    public ClassificationCreateFeature(IFeatureProvider fp) {
	// set name and description of the creation feature
	super(fp, Classification.class.getSimpleName(), "Features classification"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    
    public DiagramElement createElement() {
	return DiagramFactory.eINSTANCE.createClassification();
    }
}
