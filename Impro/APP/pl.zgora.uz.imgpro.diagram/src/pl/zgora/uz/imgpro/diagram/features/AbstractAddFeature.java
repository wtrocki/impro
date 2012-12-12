/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import pl.zgora.uz.imgpro.core.resources.ResourcesCreator;
import pl.zgora.uz.imgpro.diagram.utils.StyleUtil;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.InputConnector;
import pl.zgora.uz.imgpro.model.diagram.OutputConnector;

/**
 * Abstract add feature used to add some common draw behavior for diagrams.
 */
public abstract class AbstractAddFeature extends AbstractAddShapeFeature {

    // the additional size of the invisible rectangle at the right border
    // (this also equals the half width of the anchor to paint there)
    public static final int INVISIBLE_RECT_RIGHT = 5;

    private static final IPeCreateService PE_SERVICE = Graphiti
	    .getPeCreateService();

    private static final IGaService GA_SERVICE = Graphiti.getGaService();

    private DiagramElement addedClass;

    public static final int STANDARD_WIDTH = 120;

    public static final int STANDARD_HEIGHT = 70;

    public static final int IMAGE_SIZE = 36;

    public static final IColorConstant[] colors = new IColorConstant[] {
	    ColorConstant.BLACK, ColorConstant.BLUE, ColorConstant.RED };

    public AbstractAddFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public PictogramElement add(IAddContext context) {
	addedClass = (DiagramElement) context.getNewObject();
	final Diagram targetDiagram = (Diagram) context.getTargetContainer();
	final ContainerShape containerShape = PE_SERVICE.createContainerShape(
		targetDiagram, true);

	final int width = context.getWidth() <= 0 ? STANDARD_WIDTH : context
		.getWidth();
	final int height = context.getHeight() <= 0 ? STANDARD_HEIGHT : context
		.getHeight();

	RoundedRectangle roundedRectangle; // need to access it later
	{
	    // create invisible outer rectangle expanded by
	    // the width needed for the anchor
	    final Rectangle invisibleRectangle = GA_SERVICE
		    .createInvisibleRectangle(containerShape);
	    GA_SERVICE.setLocationAndSize(invisibleRectangle, context.getX(),
		    context.getY(), width + INVISIBLE_RECT_RIGHT * 2, height);

	    // create and set visible rectangle inside invisible rectangle
	    roundedRectangle = GA_SERVICE.createRoundedRectangle(
		    invisibleRectangle, 5, 5);
	    roundedRectangle.setParentGraphicsAlgorithm(invisibleRectangle);
	    roundedRectangle.setStyle(StyleUtil
		    .getStyleForElement(getDiagram()));
	    GA_SERVICE.setLocationAndSize(roundedRectangle,
		    0 + INVISIBLE_RECT_RIGHT, 0, width, height);

	    // create link and wire it
	    link(containerShape, addedClass);
	}

	// SHAPE WITH TEXT
	{
	    // create shape for text
	    final Shape shape = PE_SERVICE.createShape(containerShape, false);

	    // create and set text graphics algorithm
	    final Text text = GA_SERVICE.createText(shape,
		    addedClass.getElementName());
	    text.setStyle(StyleUtil.getStyleForElementText(getDiagram()));
	    text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
	    text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
	    GA_SERVICE.setLocationAndSize(text, 0, 0, width, 20);

	    link(shape, addedClass);

	    // provide information to support direct-editing directly
	    // after object creation (must be activated additionally)
	    final IDirectEditingInfo directEditingInfo = getFeatureProvider()
		    .getDirectEditingInfo();
	    // set container shape for direct editing after object creation
	    directEditingInfo.setMainPictogramElement(containerShape);
	    // set shape and graphics algorithm where the editor for
	    // direct editing shall be opened after object creation
	    directEditingInfo.setPictogramElement(shape);
	    directEditingInfo.setGraphicsAlgorithm(text);
	}

	// SHAPE WITH IMAGE
	{
	    // create shape for text
	    final Shape shape = PE_SERVICE.createShape(containerShape, false);

	    // create and set text graphics algorithm
	    final Image image = GA_SERVICE
		    .createImage(shape, getFeatureImage());
	    image.setStyle(StyleUtil.getStyleForElementText(getDiagram()));
	    GA_SERVICE.setLocationAndSize(image, 0, 0, IMAGE_SIZE, IMAGE_SIZE);

	    // provide information to support direct-editing directly
	    // after object creation (must be activated additionally)
	    final IDirectEditingInfo directEditingInfo = getFeatureProvider()
		    .getDirectEditingInfo();
	    // set container shape for direct editing after object creation
	    directEditingInfo.setMainPictogramElement(containerShape);
	    // set shape and graphics algorithm where the editor for
	    // direct editing shall be opened after object creation
	    directEditingInfo.setPictogramElement(shape);
	    directEditingInfo.setGraphicsAlgorithm(image);
	}

	addConnectors(containerShape, roundedRectangle, addedClass);

	// call the layout feature
	layoutPictogramElement(containerShape);

	addMatlabSourceFile(addedClass);
	return containerShape;
    }

    protected void addConnectors(ContainerShape containerShape,
	    RoundedRectangle roundedRectangle, DiagramElement addedClass) {
	final EList<InputConnector> inputs = addedClass.getInputs();

	final double spread = 0.28;

	for (int elementIndex = 1; elementIndex <= inputs.size(); elementIndex++) {
	    createAnhor(containerShape, roundedRectangle,
		    (float) (spread * elementIndex), 0f, colors[elementIndex
			    % colors.length], inputs.get(elementIndex - 1));
	}

	final EList<OutputConnector> outputs = addedClass.getOutputs();
	for (int elementIndex = 1; elementIndex <= outputs.size(); elementIndex++) {
	    createAnhor(containerShape, roundedRectangle,
		    (float) (spread * elementIndex), 1f, colors[elementIndex
			    % colors.length], outputs.get(elementIndex - 1));
	}

    }

    /**
     * @param containerShape
     * @param roundedRectangle
     * @param color
     * @param buisnessObject
     */
    private void createAnhor(ContainerShape containerShape,
	    RoundedRectangle roundedRectangle, float heightPosition,
	    float widthPosition, IColorConstant color, EObject buisnessObject) {
	PE_SERVICE.createChopboxAnchor(containerShape);
	// create an additional box relative anchor at middle-right
	final BoxRelativeAnchor boxAnchor = PE_SERVICE
		.createBoxRelativeAnchor(containerShape);
	boxAnchor.setRelativeWidth(widthPosition);
	boxAnchor.setRelativeHeight(heightPosition); // Use golden section
	// anchor references visible rectangle instead of invisible
	// rectangle
	boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
	// assign a graphics algorithm for the box relative anchor
	// final Rectangle boxRect = gaService.createEllipse(boxAnchor);
	final Rectangle connectionRect = GA_SERVICE.createRectangle(boxAnchor);
	connectionRect.setFilled(true);
	// anchor is located on the right border of the visible rectangle
	// and touches the border of the invisible rectangle
	final int w = INVISIBLE_RECT_RIGHT;
	GA_SERVICE.setLocationAndSize(connectionRect, -w, -w, 2 * w, 2 * w);
	final Color c = GA_SERVICE.manageColor(getDiagram(), color);
	connectionRect.setBackground(c);
	connectionRect.setForeground(c);
	connectionRect.setStyle(StyleUtil.getStyleForElement(getDiagram()));
	link(boxAnchor, buisnessObject);
    }

    abstract protected String getFeatureImage();

    private void addMatlabSourceFile(DiagramElement element) {
	ResourcesCreator.createResource(element, getDiagramEditor());
    }
}
