/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.providers;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import pl.zgora.uz.imgpro.diagram.features.common.CopyDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.features.common.DeleteElementFeature;
import pl.zgora.uz.imgpro.diagram.features.common.DirectEditDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.features.common.LayoutDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.features.common.PasteDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.features.common.ResizeDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.features.common.UpdateDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.features.input.DirInputAddFeature;
import pl.zgora.uz.imgpro.diagram.features.input.DirInputCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.links.ElementReferenceAddFeature;
import pl.zgora.uz.imgpro.diagram.features.links.ElementRererenceCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.output.ImagePreviewAddFeature;
import pl.zgora.uz.imgpro.diagram.features.output.ImagePreviewCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.MultiAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.MultiCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegATAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegATCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegCLNAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegCLNCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegFCMAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegFCMCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegFCMOffAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegFCMOffCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegKMAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegKMCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegKMOffAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegKMOffCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ClassificationAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ClassificationCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ExtractAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ExtractCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ForwardSelectionAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ForwardSelectionCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.FullSelectionAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.FullSelectionCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.CropAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.CropCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.CustomElementAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.CustomElementCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.HistStretchAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.HistStretchCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.NoiseRemoveAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.NoiseRemoveCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.VignettingAddFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.VignettingCreateFeature;
import pl.zgora.uz.imgpro.diagram.panel.CollapseDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.panel.ExpandDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.panel.OpenEditorForElementFeature;
import pl.zgora.uz.imgpro.diagram.panel.RenameDiagramElementFeature;
import pl.zgora.uz.imgpro.diagram.panel.ShowElementPropertiesFeature;
import pl.zgora.uz.imgpro.diagram.panel.ShowHelpFeature;
import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.Crop;
import pl.zgora.uz.imgpro.model.diagram.CustomElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;
import pl.zgora.uz.imgpro.model.diagram.ExtractFeatures;
import pl.zgora.uz.imgpro.model.diagram.ForwardSelection;
import pl.zgora.uz.imgpro.model.diagram.FullSelection;
import pl.zgora.uz.imgpro.model.diagram.HistStretch;
import pl.zgora.uz.imgpro.model.diagram.ImagePreview;
import pl.zgora.uz.imgpro.model.diagram.Multiplication;
import pl.zgora.uz.imgpro.model.diagram.NoiseRemove;
import pl.zgora.uz.imgpro.model.diagram.SegAT;
import pl.zgora.uz.imgpro.model.diagram.SegCLN;
import pl.zgora.uz.imgpro.model.diagram.SegFCM;
import pl.zgora.uz.imgpro.model.diagram.SegFCMOff;
import pl.zgora.uz.imgpro.model.diagram.SegKM;
import pl.zgora.uz.imgpro.model.diagram.SegKMOff;
import pl.zgora.uz.imgpro.model.diagram.Vignetting;

public class ImproFeatureProvider extends DefaultFeatureProvider {

    public ImproFeatureProvider(IDiagramTypeProvider dtp) {
	super(dtp);
    }

    @Override
    public IAddFeature getAddFeature(IAddContext context) {
	// is object for add request a EClass or EReference?
	Object newObject = context.getNewObject();
	if (newObject instanceof DirInput) {
	    return new DirInputAddFeature(this);
	} else if (newObject instanceof ImagePreview) {
	    return new ImagePreviewAddFeature(this);
	} else if (newObject instanceof ElementConnection) {
	    return new ElementReferenceAddFeature(this);
	} else if (newObject instanceof CustomElement) {
	    return new CustomElementAddFeature(this);
	} else if (newObject instanceof Vignetting) {
	    return new VignettingAddFeature(this);
	} else if (newObject instanceof NoiseRemove) {
	    return new NoiseRemoveAddFeature(this);
	} else if (newObject instanceof HistStretch) {
	    return new HistStretchAddFeature(this);
	} else if (newObject instanceof Crop) {
	    return new CropAddFeature(this);
	} else if (newObject instanceof ExtractFeatures) {
	    return new ExtractAddFeature(this);
	} else if (newObject instanceof Classification) {
	    return new ClassificationAddFeature(this);
	} else if (newObject instanceof FullSelection) {
	    return new FullSelectionAddFeature(this);
	} else if (newObject instanceof ForwardSelection) {
	    return new ForwardSelectionAddFeature(this);
	}

	return getSegmentationAddFeature(newObject);
    }

    private IAddFeature getSegmentationAddFeature(Object newObject) {
	if (newObject instanceof SegKMOff) {
	    return new SegKMOffAddFeature(this);
	} else if (newObject instanceof SegKM) {
	    return new SegKMAddFeature(this);
	} else if (newObject instanceof SegFCMOff) {
	    return new SegFCMOffAddFeature(this);
	} else if (newObject instanceof SegFCM) {
	    return new SegFCMAddFeature(this);
	} else if (newObject instanceof SegCLN) {
	    return new SegCLNAddFeature(this);
	} else if (newObject instanceof Multiplication) {
	    return new MultiAddFeature(this);
	} else if (newObject instanceof SegAT) {
	    return new SegATAddFeature(this);
	}
	return null;
    }

    @Override
    public ICreateFeature[] getCreateFeatures() {
	// Array of all features (not linked)
	return new ICreateFeature[] {
		new DirInputCreateFeature(this),
		new ImagePreviewCreateFeature(this),
		// SEGMENTATION
		new MultiCreateFeature(this),
		new SegATCreateFeature(this),
		new SegCLNCreateFeature(this),
		new SegFCMCreateFeature(this),
		new SegFCMOffCreateFeature(this),
		new SegKMCreateFeature(this),
		new SegKMOffCreateFeature(this),
		// POST
		new ClassificationCreateFeature(this),
		new ForwardSelectionCreateFeature(this),
		new FullSelectionCreateFeature(this),
		new ExtractCreateFeature(this),
		// PRE
		new CropCreateFeature(this),
		new CustomElementCreateFeature(this),
		new HistStretchCreateFeature(this),
		new NoiseRemoveCreateFeature(this),
		new VignettingCreateFeature(this) };
    }

    @Override
    public IUpdateFeature getUpdateFeature(IUpdateContext context) {
	PictogramElement pictogramElement = context.getPictogramElement();
	if (pictogramElement instanceof ContainerShape) {
	    Object bo = getBusinessObjectForPictogramElement(pictogramElement);
	    if (bo instanceof DiagramElement) {
		return new UpdateDiagramElementFeature(this);
	    }
	}
	return super.getUpdateFeature(context);
    }

    @Override
    public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
	Shape shape = context.getShape();
	Object bo = getBusinessObjectForPictogramElement(shape);
	if (bo instanceof DiagramElement) {
	    return new ResizeDiagramElementFeature(this);
	}

	return super.getResizeShapeFeature(context);
    }

    @Override
    public ILayoutFeature getLayoutFeature(ILayoutContext context) {
	PictogramElement pictogramElement = context.getPictogramElement();
	Object bo = getBusinessObjectForPictogramElement(pictogramElement);
	if (bo instanceof DiagramElement) {
	    return new LayoutDiagramElementFeature(this);
	}
	return super.getLayoutFeature(context);
    }

    @Override
    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
	return new ICustomFeature[] { new RenameDiagramElementFeature(this),
		new CollapseDiagramElementFeature(this),
		new ExpandDiagramElementFeature(this),
		new ShowElementPropertiesFeature(this),
		new OpenEditorForElementFeature(this),
		new ShowHelpFeature(this) };
    }

    @Override
    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
	return new ICreateConnectionFeature[] { new ElementRererenceCreateFeature(
		this) };
    }

    @Override
    public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
	// simply return all create connection features
	return getCreateConnectionFeatures();
    }

    @Override
    public IDeleteFeature getDeleteFeature(IDeleteContext context) {
	return new DeleteElementFeature(this);
    }

    @Override
    public IDirectEditingFeature getDirectEditingFeature(
	    IDirectEditingContext context) {
	PictogramElement pe = context.getPictogramElement();
	Object bo = getBusinessObjectForPictogramElement(pe);
	if (bo instanceof DiagramElement) {
	    return new DirectEditDiagramElementFeature(this);
	}
	return super.getDirectEditingFeature(context);
    }

    @Override
    public ICopyFeature getCopyFeature(ICopyContext context) {
	return new CopyDiagramElementFeature(this);
    }

    @Override
    public IPasteFeature getPasteFeature(IPasteContext context) {
	return new PasteDiagramElementFeature(this);
    }
}
