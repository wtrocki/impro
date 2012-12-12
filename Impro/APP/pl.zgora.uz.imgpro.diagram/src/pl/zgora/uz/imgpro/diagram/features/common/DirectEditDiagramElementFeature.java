/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features.common;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import pl.zgora.uz.imgpro.diagram.panel.RenameHelper;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class DirectEditDiagramElementFeature extends
	AbstractDirectEditingFeature {

    public DirectEditDiagramElementFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public int getEditingType() {
	// there are several possible editor-types supported:
	// text-field, checkbox, color-chooser, combobox, ...
	return TYPE_TEXT;
    }

    
    public boolean canDirectEdit(IDirectEditingContext context) {
	PictogramElement pe = context.getPictogramElement();
	Object bo = getBusinessObjectForPictogramElement(pe);
	GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
	// support direct editing, if it is a EClass, and the user clicked
	// directly on the text and not somewhere else in the rectangle
	if (bo instanceof DiagramElement && ga instanceof Text) {
	    return true;
	}
	// direct editing not supported in all other cases
	return false;
    }

    
    public String getInitialValue(IDirectEditingContext context) {
	// return the current name of the EClass
	PictogramElement pe = context.getPictogramElement();
	DiagramElement eClass = (DiagramElement) getBusinessObjectForPictogramElement(pe);
	return eClass.getElementName();
    }

    
    public String checkValueValid(String value, IDirectEditingContext context) {
	if (value.length() < 1)
	    return "Please enter any text as class name."; //$NON-NLS-1$
	if (value.contains(" ")) //$NON-NLS-1$
	    return "Spaces are not allowed in class names."; //$NON-NLS-1$
	if (value.contains("\n")) //$NON-NLS-1$
	    return "Line breakes are not allowed in class names."; //$NON-NLS-1$

	// null means, that the value is valid
	return null;
    }

    
    public void setValue(String value, IDirectEditingContext context) {
	// set the new name for the EClass
	PictogramElement pe = context.getPictogramElement();
	DiagramElement element = (DiagramElement) getBusinessObjectForPictogramElement(pe);
	final String generatedName = new RenameHelper(getDiagram(),
		getFeatureProvider()).generateName(value);
	element.setElementName(generatedName);

	// Explicitly update the shape to display the new value in the diagram
	// Note, that this might not be necessary in future versions of Graphiti
	// (currently in discussion)

	// we know, that pe is the Shape of the Text, so its container is the
	// main shape of the EClass
	updatePictogramElement(((Shape) pe).getContainer());
    }
}
