/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features.links;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import pl.zgora.uz.imgpro.model.diagram.Connector;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;
import pl.zgora.uz.imgpro.model.diagram.InputConnector;
import pl.zgora.uz.imgpro.model.diagram.OutputConnector;

public class ElementRererenceCreateFeature extends
	AbstractCreateConnectionFeature {

    public ElementRererenceCreateFeature(IFeatureProvider fp) {
	// provide name and description for the UI, e.g. the palette
	super(fp, "Connection", "Connect elements"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    
    public boolean canCreate(ICreateConnectionContext context) {
	OutputConnector start = getOutputConnectorElement(context
		.getSourceAnchor());
	InputConnector end = getInputConnectorElement(context.getTargetAnchor());
	if (end != null && start != null) {
	    if (start.getTypeName().equals(end.getTypeName()))
		return true;
	}
	return false;
    }

    
    public boolean canStartConnection(ICreateConnectionContext context) {
	final OutputConnector outputElement = getOutputConnectorElement(context
		.getSourceAnchor());
	if (outputElement != null) {
	    return true;
	}
	return false;
    }

    
    public Connection create(ICreateConnectionContext context) {
	Connection newConnection = null;
	// get EClasses which should be connected
	final Anchor sourceAnchor = context.getSourceAnchor();
	final Anchor targetAnchor = context.getTargetAnchor();
	DiagramElement source = getDiagramElement(sourceAnchor);
	DiagramElement target = getDiagramElement(targetAnchor);

	if (CycleValidator.elementHasLoop(target)) {
	    return newConnection;
	}

	if (source != null && target != null) {
	    // create new business object
	    final Connector connector = (Connector) getBusinessObjectForPictogramElement(sourceAnchor);
	    ElementConnection reference = createReference(source, target,
		    connector);

	    // add connection for business object
	    AddConnectionContext addContext = new AddConnectionContext(
		    sourceAnchor, targetAnchor);
	    addContext.setNewObject(reference);
	    newConnection = (Connection) getFeatureProvider().addIfPossible(
		    addContext);
	}

	return newConnection;
    }

    /**
     * Returns the DiagramElement belonging to the anchor, or null if not
     * available.
     */
    private DiagramElement getDiagramElement(Anchor anchor) {
	if (anchor != null) {
	    Object obj = getBusinessObjectForPictogramElement(anchor
		    .getParent());
	    if (obj instanceof DiagramElement) {
		return (DiagramElement) obj;
	    }
	}
	return null;
    }

    /**
     * Returns the InputConnector belonging to the anchor, or null if not
     * available.
     */
    private InputConnector getInputConnectorElement(Anchor anchor) {
	if (anchor != null) {
	    Object obj = getBusinessObjectForPictogramElement(anchor);
	    if (obj instanceof InputConnector) {
		return (InputConnector) obj;
	    }
	}
	return null;
    }

    /**
     * Returns the OutputConnector belonging to the anchor, or null if not
     * available.
     */
    private OutputConnector getOutputConnectorElement(Anchor anchor) {
	if (anchor != null) {
	    Object obj = getBusinessObjectForPictogramElement(anchor);
	    if (obj instanceof OutputConnector) {
		return (OutputConnector) obj;
	    }
	}
	return null;
    }

    /**
     * Creates a EReference between two EClasses.
     * 
     * @param connector
     */
    private ElementConnection createReference(DiagramElement source,
	    DiagramElement target, Connector connector) {
	ElementConnection elementConnection = DiagramFactory.eINSTANCE
		.createElementConnection();
	elementConnection.setTarget(target);
	target.getConnectedWith().add(source);
	elementConnection.setConnectionType(connector.getTypeName());
	source.getConnections().add(elementConnection);
	return elementConnection;
    }
}
