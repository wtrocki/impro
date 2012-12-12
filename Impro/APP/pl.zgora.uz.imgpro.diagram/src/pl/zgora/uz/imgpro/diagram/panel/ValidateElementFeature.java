/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.panel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import pl.zgora.uz.imgpro.core.helpers.CommonValidator;
import pl.zgora.uz.imgpro.diagram.providers.ImproImageProvider;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;

public class ValidateElementFeature extends AbstractCustomFeature {

    public static final String NAME = "Validation";
    public static final String DESCRIPTION = "Validate model";

    public ValidateElementFeature(IFeatureProvider fp) {
	super(fp);

    }

    
    public boolean canUndo(IContext context) {
	return false;
    }

    
    public boolean canExecute(ICustomContext context) {
	PictogramElement[] pes = context.getPictogramElements();
	if (pes != null && pes.length != 0) {
	    return true;
	}
	return false;
    }

    
    public String getName() {
	return NAME; //$NON-NLS-1$
    }

    
    public String getDescription() {
	return DESCRIPTION; //$NON-NLS-1$

    }

    
    public String getImageId() {
	return ImproImageProvider.IMG_VALIDATION;

    }

    
    public boolean isAvailable(IContext context) {
	return true;
    }

    
    public void execute(ICustomContext context) {
	// final PictogramElement[] pictogramElements = context
	// .getPictogramElements();
	// List<DiagramElement> validationList = new
	// ArrayList<DiagramElement>();
	//
	// for (PictogramElement pe : pictogramElements) {
	// final DiagramElement bo = (DiagramElement)
	// getBusinessObjectForPictogramElement(pe);
	// if (bo != null) {
	// validationList.add(bo);
	// }
	// }
	//
	// if (validationList.size() == 0) {
	// // Empty selection validate all elements
	// for (PictogramElement pe : getDiagram().getChildren()) {
	// validationList
	// .add((DiagramElement) getBusinessObjectForPictogramElement(pe));
	// }
	// }
	// Always use whole resource set for validation.
	final ResourceSet resourceSet = getDiagramEditor().getResourceSet();
	final EList<Resource> resources = resourceSet.getResources();
	if (resources.size() == 2) {
	    final Resource resource = resources.get(1);
	    final EList<EObject> contents = resource.getContents();
	    final ImproDiagram diagram = (ImproDiagram) contents.get(0);
	    CommonValidator.performValidation(diagram);
	}
    }

}
