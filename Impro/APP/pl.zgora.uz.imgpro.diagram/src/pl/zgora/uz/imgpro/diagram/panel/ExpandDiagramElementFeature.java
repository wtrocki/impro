/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.panel;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;

import pl.zgora.uz.imgpro.diagram.features.AbstractAddFeature;
import pl.zgora.uz.imgpro.diagram.services.ShapePropertyService;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class ExpandDiagramElementFeature extends AbstractCustomFeature {

    public ExpandDiagramElementFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public boolean canExecute(ICustomContext context) {
	boolean ret = false;
	PictogramElement[] pes = context.getPictogramElements();
	if (pes != null && pes.length == 1) {
	    Object bo = getBusinessObjectForPictogramElement(pes[0]);
	    if (bo instanceof DiagramElement) {
		ret = true;
	    }
	}
	return ret;
    }

    
    public String getName() {
	return "E&xpand"; //$NON-NLS-1$
    }

    
    public String getDescription() {
	return "E&xpand Figure"; //$NON-NLS-1$

    }

    
    public String getImageId() {
	return IPlatformImageConstants.IMG_EDIT_EXPAND;

    }

    
    public boolean isAvailable(IContext context) {
	return true;
    }

    
    public void execute(ICustomContext context) {
	PictogramElement[] containerShape = context.getPictogramElements();
	if (containerShape != null && containerShape.length == 1) {
	    GraphicsAlgorithm containerGa = containerShape[0]
		    .getGraphicsAlgorithm();
	    containerGa.setHeight(AbstractAddFeature.STANDARD_HEIGHT);
	    layoutPictogramElement(containerShape[0]);
	    ShapePropertyService.setCollapsed(containerShape[0], false);
	}

    }
}
