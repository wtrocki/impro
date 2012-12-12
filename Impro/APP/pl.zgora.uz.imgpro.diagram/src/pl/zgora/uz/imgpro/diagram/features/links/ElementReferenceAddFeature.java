/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features.links;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import pl.zgora.uz.imgpro.diagram.utils.StyleUtil;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;

public class ElementReferenceAddFeature extends AbstractAddFeature {

    public ElementReferenceAddFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public PictogramElement add(IAddContext context) {
	IAddConnectionContext addConContext = (IAddConnectionContext) context;
	ElementConnection linkObject = (ElementConnection) context
		.getNewObject();

	IPeCreateService peCreateService = Graphiti.getPeCreateService();
	// CONNECTION WITH POLYLINE
	Connection connection = peCreateService
		.createFreeFormConnection(getDiagram());
	connection.setStart(addConContext.getSourceAnchor());
	connection.setEnd(addConContext.getTargetAnchor());
	connection.setActive(true);
	IGaService gaService = Graphiti.getGaService();
	Polyline polyline = gaService.createPolyline(connection);
	polyline.setStyle(StyleUtil.getStyleForElement(getDiagram()));
	// create link and wire it
	link(connection, linkObject);

	// add dynamic text decorator for the reference name
	ConnectionDecorator textDecorator = peCreateService
		.createConnectionDecorator(connection, true, 0.2, true);
	Text text = gaService.createDefaultText(getDiagram(), textDecorator);
	text.setStyle(StyleUtil.getStyleForElementText((getDiagram())));
	gaService.setLocation(text, 0, 0);
	text.setValue(linkObject.getConnectionType());

	// add static graphical decorators (composition and navigable)
	ConnectionDecorator cd;
	cd = peCreateService.createConnectionDecorator(connection, false, 1.0,
		true);
	createArrow(cd);

	return connection;
    }

    
    public boolean canAdd(IAddContext context) {
	// return true if given business object is an EReference
	// note, that the context must be an instance of IAddConnectionContext
	if (context instanceof IAddConnectionContext
		&& context.getNewObject() instanceof ElementConnection) {
	    return true;
	}
	return false;
    }

    private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
	Polyline polyline = Graphiti.getGaCreateService().createPolyline(
		gaContainer, new int[] { -10, 5, 0, 0, -10, -5 });
	polyline.setStyle(StyleUtil.getStyleForElement(getDiagram()));
	return polyline;
    }
}
