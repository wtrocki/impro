/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.providers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextEntryHelper;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IContextMenuEntry;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;

import pl.zgora.uz.imgpro.diagram.creators.PaletteCreator;
import pl.zgora.uz.imgpro.diagram.panel.CollapseDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.panel.ExpandDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.panel.OpenEditorForElementFeature;
import pl.zgora.uz.imgpro.diagram.panel.RenameDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.panel.ShowElementPropertiesFeature;
import pl.zgora.uz.imgpro.diagram.panel.ShowHelpFeature;
import pl.zgora.uz.imgpro.diagram.panel.ValidateElementFeature;
import pl.zgora.uz.imgpro.diagram.services.ShapePropertyService;
import pl.zgora.uz.imgpro.model.diagram.Connector;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;

public class ImproToolBehaviorProvider extends DefaultToolBehaviorProvider {

    public ImproToolBehaviorProvider(IDiagramTypeProvider dtp) {
	super(dtp);
    }

    @Override
    public IContextButtonPadData getContextButtonPad(
	    IPictogramElementContext context) {
	IContextButtonPadData data = super.getContextButtonPad(context);
	PictogramElement pe = context.getPictogramElement();
	final Object bo = getFeatureProvider()
		.getBusinessObjectForPictogramElement(pe);
	if (bo instanceof DiagramElement) {

	    // 1. set the generic context buttons
	    // note, that we do not add 'remove' (just as an example)
	    setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE);

	    // 2. set the collapse button
	    // simply use a dummy custom feature (senseless example)
	    CustomContext cc = new CustomContext(new PictogramElement[] { pe });
	    ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(cc);
	    for (int i = 0; i < cf.length; i++) {
		ICustomFeature iCustomFeature = cf[i];
		if (iCustomFeature instanceof CollapseDiagramElementFeature
			&& !ShapePropertyService.isCollapsed(pe)) {
		    IContextButtonEntry collapseButton = ContextEntryHelper
			    .createCollapseContextButton(true, iCustomFeature,
				    cc);
		    data.getGenericContextButtons().add(collapseButton);
		} else if (iCustomFeature instanceof ExpandDiagramElementFeature
			&& ShapePropertyService.isCollapsed(pe)) {
		    IContextButtonEntry expandButton = ContextEntryHelper
			    .createCollapseContextButton(false, iCustomFeature,
				    cc);
		    data.getGenericContextButtons().add(expandButton);
		} else if (iCustomFeature instanceof ShowElementPropertiesFeature) {
		    IContextButtonEntry ret = new ContextButtonEntry(
			    iCustomFeature, cc);
		    ret.setText(ShowElementPropertiesFeature.NAME);
		    ret.setDescription(ShowElementPropertiesFeature.DESCRIPTION);
		    ret.setIconId(iCustomFeature.getImageId());
		    data.getGenericContextButtons().add(ret);

		} else if (iCustomFeature instanceof OpenEditorForElementFeature) {
		    IContextButtonEntry ret = new ContextButtonEntry(
			    iCustomFeature, cc);
		    ret.setText(OpenEditorForElementFeature.NAME);
		    ret.setDescription(OpenEditorForElementFeature.DESCRIPTION);
		    ret.setIconId(iCustomFeature.getImageId());
		    data.getGenericContextButtons().add(ret);
		} else if (iCustomFeature instanceof RenameDiagramElementFeature) {
		    IContextButtonEntry ret = new ContextButtonEntry(
			    iCustomFeature, cc);
		    ret.setText(RenameDiagramElementFeature.NAME);
		    ret.setDescription(RenameDiagramElementFeature.DESCRIPTION);
		    ret.setIconId(iCustomFeature.getImageId());
		    data.getGenericContextButtons().add(ret);
		} else if (iCustomFeature instanceof ShowHelpFeature) {
		    IContextButtonEntry ret = new ContextButtonEntry(
			    iCustomFeature, cc);
		    ret.setText(ShowHelpFeature.NAME);
		    ret.setDescription(ShowHelpFeature.DESCRIPTION);
		    ret.setIconId(iCustomFeature.getImageId());
		    data.getGenericContextButtons().add(ret);

		}

	    }

	    // 3. add one domain specific context-button, which offers all
	    // available connection-features as drag&drop features...

	    // 3.a. create new CreateConnectionContext
	    CreateConnectionContext ccc = new CreateConnectionContext();
	    ccc.setSourcePictogramElement(pe);
	    Anchor anchor = null;
	    if (pe instanceof Anchor) {
		anchor = (Anchor) pe;
	    } else if (pe instanceof AnchorContainer) {
		// assume, that our shapes always have chopbox anchors
		anchor = Graphiti.getPeService().getChopboxAnchor(
			(AnchorContainer) pe);
	    }
	    ccc.setSourceAnchor(anchor);

	    // 3.b. create context button and add all applicable features
	    ContextButtonEntry button = new ContextButtonEntry(null, context);
	    button.setText("Create connection"); //$NON-NLS-1$
	    button.setIconId(ImproImageProvider.IMG_CONNECTION);
	    ICreateConnectionFeature[] features = getFeatureProvider()
		    .getCreateConnectionFeatures();
	    for (ICreateConnectionFeature feature : features) {
		if (feature.isAvailable(ccc) && feature.canStartConnection(ccc))
		    button.addDragAndDropFeature(feature);
	    }

	    // 3.c. add context button, if it contains at least one feature
	    if (button.getDragAndDropFeatures().size() > 0) {
		data.getDomainSpecificContextButtons().add(button);
	    }

	}
	return data;
    }

    @Override
    public IContextMenuEntry[] getContextMenu(ICustomContext context) {
	// create a sub-menu for all custom features
	ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
	subMenu.setText("Cu&stom"); //$NON-NLS-1$
	subMenu.setDescription("Custom features submenu"); //$NON-NLS-1$
	// display sub-menu hierarchical or flat
	subMenu.setSubmenu(true);

	// create a menu-entry in the sub-menu for each custom feature
	if (context instanceof ICustomContext) {
	    ICustomContext customContext = context;
	    ICustomFeature[] customFeatures = getFeatureProvider()
		    .getCustomFeatures(customContext);
	    for (int i = 0; i < customFeatures.length; i++) {
		ICustomFeature customFeature = customFeatures[i];
		if (customFeature.isAvailable(customContext)) {
		    ContextMenuEntry menuEntry = new ContextMenuEntry(
			    customFeature, context);
		    subMenu.add(menuEntry);
		}
	    }
	}

	ContextMenuEntry openEditor = new ContextMenuEntry(
		new ShowElementPropertiesFeature(getFeatureProvider()), context);
	ContextMenuEntry showHelp = new ContextMenuEntry(new ShowHelpFeature(
		getFeatureProvider()), context);
	ContextMenuEntry properties = new ContextMenuEntry(
		new OpenEditorForElementFeature(getFeatureProvider()), context);
	ContextMenuEntry validation = new ContextMenuEntry(
		new ValidateElementFeature(getFeatureProvider()), context);
	IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu,
		properties, openEditor, validation, showHelp };
	return ret;
    }

    @Override
    public IPaletteCompartmentEntry[] getPalette() {
	PaletteCreator palleteCreator = new PaletteCreator(getFeatureProvider());
	return palleteCreator.createPallete();
    }

    @Override
    public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
	ICustomFeature customFeature = new OpenEditorForElementFeature(
		getFeatureProvider());
	// canExecute() tests especially if the context contains a
	// DiagramElement
	if (customFeature.canExecute(context)) {
	    return customFeature;
	}
	return super.getDoubleClickFeature(context);
    }

    @Override
    public IDecorator[] getDecorators(PictogramElement pe) {
	IFeatureProvider featureProvider = getFeatureProvider();
	Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
	if (bo instanceof DiagramElement) {
	    DiagramElement DiagramElement = (DiagramElement) bo;
	    String name = DiagramElement.getElementName();
	    if (!(name != null && name.length() > 0)
		    || !name.matches("[a-zA-Z0-9]*")) {
		ImageDecorator imageRenderingDecorator = new ImageDecorator(
			IPlatformImageConstants.IMG_ECLIPSE_ERROR);
		imageRenderingDecorator.setMessage("Invalid name"); //$NON-NLS-1$
		imageRenderingDecorator.setX(15);
		// imageRenderingDecorator.setY(10);
		return new IDecorator[] { imageRenderingDecorator };
	    }
	}

	return super.getDecorators(pe);
    }

    @Override
    public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
	IFeatureProvider featureProvider = getFeatureProvider();
	Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
	if (bo instanceof ElementConnection) {
	    return super.getClickArea(pe);
	}

	if (bo instanceof DiagramElement) {
	    GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
	    GraphicsAlgorithm rectangle = invisible
		    .getGraphicsAlgorithmChildren().get(0);
	    return new GraphicsAlgorithm[] { rectangle };
	}
	return super.getClickArea(pe);
    }

    @Override
    public PictogramElement getSelection(PictogramElement originalPe,
	    PictogramElement[] oldSelection) {
	if (originalPe instanceof ConnectionDecorator) {
	    return ((ConnectionDecorator) originalPe).getConnection();
	}

	return super.getSelection(originalPe, oldSelection);
    }

    @Override
    public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
	IFeatureProvider featureProvider = getFeatureProvider();
	Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
	if (bo instanceof DiagramElement) {
	    GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
	    EList<GraphicsAlgorithm> graphicsAlgorithmChildren = invisible
		    .getGraphicsAlgorithmChildren();
	    if (!graphicsAlgorithmChildren.isEmpty()) {
		return graphicsAlgorithmChildren.get(0);
	    }
	} else if (pe instanceof ConnectionDecorator) {
	    return pe.getGraphicsAlgorithm();
	}
	return super.getSelectionBorder(pe);
    }

    @Override
    public String getToolTip(GraphicsAlgorithm ga) {
	PictogramElement pe = ga.getPictogramElement();
	Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(
		pe);
	if (bo instanceof DiagramElement) {
	    String name = ((DiagramElement) bo).getElementName();
	    if (name != null && !name.isEmpty()) {
		return name;
	    }
	} else if (bo instanceof Connector) {
	    String name = ((Connector) bo).getTypeName();
	    if (name != null && !name.isEmpty()) {
		return "Type: " + name;
	    }
	}
	return super.getToolTip(ga);
    }

    @Override
    public String getTitleToolTip() {
	return "Impro model ";
    }

}
