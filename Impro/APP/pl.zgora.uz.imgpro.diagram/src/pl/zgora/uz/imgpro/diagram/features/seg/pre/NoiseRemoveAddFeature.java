/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features.seg.pre;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import pl.zgora.uz.imgpro.diagram.features.AbstractAddFeature;
import pl.zgora.uz.imgpro.diagram.providers.ImproImageProvider;
import pl.zgora.uz.imgpro.model.diagram.NoiseRemove;

public class NoiseRemoveAddFeature extends AbstractAddFeature {

    public NoiseRemoveAddFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public boolean canAdd(IAddContext context) {
	// check if user wants to add a FileInput
	final Object newObject = context.getNewObject();
	if (newObject instanceof NoiseRemove) {
	    // check if user wants to add to a diagram
	    if (context.getTargetContainer() instanceof Diagram) {
		return true;
	    }
	}
	return false;
    }

    
    protected String getFeatureImage() {
	return ImproImageProvider.IMG_NOISE;
    }

}
