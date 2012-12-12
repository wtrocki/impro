/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import pl.zgora.uz.imgpro.diagram.features.AbstractAddFeature;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class LayoutDiagramElementFeature extends AbstractLayoutFeature {

    public static final int MIN_HEIGHT = 40;

    public static final int MIN_WIDTH = 120;

    public LayoutDiagramElementFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public boolean canLayout(ILayoutContext context) {
	// return true, if pictogram element is linked to an EClass
	PictogramElement pe = context.getPictogramElement();
	if (!(pe instanceof ContainerShape))
	    return false;
	EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
	return businessObjects.size() == 1 && businessObjects.get(0) instanceof DiagramElement;
    }

    
    public boolean layout(ILayoutContext context) {
	boolean anythingChanged = false;
	ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
	GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
	// the containerGa is the invisible rectangle
	// containing the visible rectangle as its (first and only) child
	GraphicsAlgorithm rectangle = containerGa.getGraphicsAlgorithmChildren().get(0);

	// height of invisible rectangle
	if (containerGa.getHeight() < MIN_HEIGHT) {
	    containerGa.setHeight(MIN_HEIGHT);
	    anythingChanged = true;
	}

	// height of visible rectangle (same as invisible rectangle)
	if (rectangle.getHeight() != containerGa.getHeight()) {
	    rectangle.setHeight(containerGa.getHeight());
	    anythingChanged = true;
	}

	// width of invisible rectangle
	if (containerGa.getWidth() < MIN_WIDTH) {
	    containerGa.setWidth(MIN_WIDTH);
	    anythingChanged = true;
	}

	// width of visible rectangle (smaller than invisible rectangle)
	int rectangleWidth = containerGa.getWidth() - AbstractAddFeature.INVISIBLE_RECT_RIGHT * 2;
	if (rectangle.getWidth() != rectangleWidth) {
	    rectangle.setWidth(rectangleWidth);
	    anythingChanged = true;
	}

	// width of text and line (same as visible rectangle)
	for (Shape shape : containerShape.getChildren()) {
	    GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
	    IGaService gaService = Graphiti.getGaService();
	    IDimension size = gaService.calculateSize(graphicsAlgorithm);
	    if (rectangleWidth != size.getWidth()) {
		if (graphicsAlgorithm instanceof Polyline) {
		    Polyline polyline = (Polyline) graphicsAlgorithm;
		    Point secondPoint = polyline.getPoints().get(1);
		    Point newSecondPoint = gaService.createPoint(rectangleWidth, secondPoint.getY());
		    polyline.getPoints().set(1, newSecondPoint);
		    anythingChanged = true;
		} else if (graphicsAlgorithm instanceof Image) {
		    if (containerGa.getHeight() <= MIN_HEIGHT + AbstractAddFeature.IMAGE_SIZE - 15) {
			gaService.setLocationAndSize(graphicsAlgorithm, 0, 0, 0, 0);
		    } else {
			final int radius = AbstractAddFeature.IMAGE_SIZE / 2;
			gaService.setLocationAndSize(graphicsAlgorithm, (rectangleWidth / 2) - radius + 5,
				(containerGa.getHeight() / 2) - radius + 4, AbstractAddFeature.IMAGE_SIZE,
				AbstractAddFeature.IMAGE_SIZE);
		    }
		} else {
		    gaService.setWidth(graphicsAlgorithm, rectangleWidth);
		    anythingChanged = true;
		}
	    }
	}

	return anythingChanged;
    }
}
