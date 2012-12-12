/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.panel;

import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import pl.zgora.uz.imgpro.diagram.providers.ImproImageProvider;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class RenameDiagramElementFeature extends AbstractCustomFeature {

    public static final String NAME = "Re&name element";
    public static final String DESCRIPTION = "Change the name";
    private boolean hasDoneChanges = false;

    public RenameDiagramElementFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public String getName() {
	return NAME; //$NON-NLS-1$
    }

    
    public String getDescription() {
	return DESCRIPTION; //$NON-NLS-1$
    }

    
    public String getImageId() {
	return ImproImageProvider.IMG_RENAME;
    }

    
    public boolean canExecute(ICustomContext context) {
	// allow rename if exactly one pictogram element
	// representing an EClass is selected
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

    
    public void execute(ICustomContext context) {
	PictogramElement[] pes = context.getPictogramElements();
	if (pes != null && pes.length == 1) {
	    Object bo = getBusinessObjectForPictogramElement(pes[0]);
	    if (bo instanceof DiagramElement) {
		DiagramElement element = (DiagramElement) bo;
		String currentName = element.getElementName();
		// ask user for a new class name
		String newName = ExampleUtil.askString(
			"Rename element", getDescription(), currentName); //$NON-NLS-1$
		if (newName != null && !newName.equals(currentName)) {
		    final String generatedName = new RenameHelper(getDiagram(),
			    getFeatureProvider()).generateName(newName);
		    this.hasDoneChanges = true;
		    element.setElementName(generatedName);
		}
	    }
	}
    }

    
    public boolean hasDoneChanges() {
	return this.hasDoneChanges;
    }
}
