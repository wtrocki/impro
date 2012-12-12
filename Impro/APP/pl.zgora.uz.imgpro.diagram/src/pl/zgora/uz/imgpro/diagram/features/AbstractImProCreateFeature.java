/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import pl.zgora.uz.imgpro.diagram.panel.RenameHelper;
import pl.zgora.uz.imgpro.diagram.utils.DiagramResourcesUtil;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public abstract class AbstractImProCreateFeature extends AbstractCreateFeature {

    public AbstractImProCreateFeature(IFeatureProvider fp, String name,
	    String description) {
	super(fp, name, description);
    }

    
    public boolean canCreate(ICreateContext context) {
	return context.getTargetContainer() instanceof Diagram;
    }

    public abstract DiagramElement createElement();

    
    public Object[] create(ICreateContext context) {
	DiagramElement element = createElement();
	element.initIOContainers();

	new RenameHelper(getDiagram(), getFeatureProvider()).fillName(element);
	DiagramResourcesUtil.storeElement(element, getDiagram());

	// do the add
	addGraphicalRepresentation(context, element);

	// activate direct editing after object creation
	getFeatureProvider().getDirectEditingInfo().setActive(true);
	// return newly created business object(s)
	return new Object[] { element };
    }

}
