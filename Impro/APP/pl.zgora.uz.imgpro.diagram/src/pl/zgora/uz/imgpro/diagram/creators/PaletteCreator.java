/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.creators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;

import pl.zgora.uz.imgpro.diagram.features.input.DirInputCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.links.ElementRererenceCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.output.ImagePreviewCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.MultiCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegATCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegCLNCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegFCMCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegFCMOffCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegKMCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.SegKMOffCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ClassificationCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ExtractCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.ForwardSelectionCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.post.FullSelectionCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.CropCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.CustomElementCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.HistStretchCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.NoiseRemoveCreateFeature;
import pl.zgora.uz.imgpro.diagram.features.seg.pre.VignettingCreateFeature;

/**
 * Palette creator used to connect add features to right palette entries
 * 
 * @author Troken
 */
public class PaletteCreator {

    private final IFeatureProvider provider;
    private final List<IPaletteCompartmentEntry> palleteEntries = new ArrayList<IPaletteCompartmentEntry>();

    public PaletteCreator(IFeatureProvider provider) {
	this.provider = provider;
    }

    public IPaletteCompartmentEntry[] createPallete() {
	createInputs();
	createPreprocessing();
	createSegmentation();
	createFeatureExtraction();
	createClassification();
	// createResults();
	createUtils();
	createLinks();

	return palleteEntries
		.toArray(new IPaletteCompartmentEntry[palleteEntries.size()]);
    }

    private void createClassification() {
	PaletteCompartmentEntry compartmentEntry = createCompartmentEntry("Classification");
	ICreateFeature[] createFeatures = new ICreateFeature[] {
		new ForwardSelectionCreateFeature(provider),
		new FullSelectionCreateFeature(provider),
		new ClassificationCreateFeature(provider) };
	addFeatureToPalleteCompartment(compartmentEntry, createFeatures);
    }

    private void createFeatureExtraction() {
	PaletteCompartmentEntry compartmentEntry = createCompartmentEntry("Feature Extraction");
	ICreateFeature[] createFeatures = new ICreateFeature[] { new ExtractCreateFeature(
		provider) };
	addFeatureToPalleteCompartment(compartmentEntry, createFeatures);

    }

    private void createInputs() {
	PaletteCompartmentEntry compartmentEntry = createCompartmentEntry("Inputs"); //$NON-NLS-1$
	ICreateFeature[] createFeatures = new ICreateFeature[] { new DirInputCreateFeature(
		provider) };
	addFeatureToPalleteCompartment(compartmentEntry, createFeatures);
    }

    private void addFeatureToPalleteCompartment(
	    PaletteCompartmentEntry compartmentEntry,
	    ICreateFeature[] createFeatures) {
	for (ICreateFeature cf : createFeatures) {
	    ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(
		    cf.getCreateName(), cf.getCreateDescription(),
		    cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);

	    compartmentEntry.addToolEntry(objectCreationToolEntry);
	}
    }

    private void createLinks() {
	PaletteCompartmentEntry compartmentEntry = createCompartmentEntry("Connections");

	ICreateConnectionFeature[] createConnectionFeatures = new ICreateConnectionFeature[] { new ElementRererenceCreateFeature(
		provider) };

	if (createConnectionFeatures.length > 0) {
	    for (ICreateConnectionFeature createConnectionFeature : createConnectionFeatures) {
		ConnectionCreationToolEntry ccTool = new ConnectionCreationToolEntry(
			createConnectionFeature.getCreateName(),
			createConnectionFeature.getCreateDescription(),
			createConnectionFeature.getCreateImageId(),
			createConnectionFeature.getCreateLargeImageId());
		ccTool.addCreateConnectionFeature(createConnectionFeature);
		compartmentEntry.addToolEntry(ccTool);
	    }
	}

    }

    private void createPreprocessing() {
	PaletteCompartmentEntry compartmentEntry = createCompartmentEntry("Preprocessing");
	ICreateFeature[] createFeatures = new ICreateFeature[] {
		new CropCreateFeature(provider),
		new HistStretchCreateFeature(provider),
		new NoiseRemoveCreateFeature(provider),
		new VignettingCreateFeature(provider) };
	addFeatureToPalleteCompartment(compartmentEntry, createFeatures);
    }

    @SuppressWarnings("unused")
    private void createResults() {
	PaletteCompartmentEntry compartmentEntry = createCompartmentEntry("Outputs");
	ICreateFeature[] createFeatures = new ICreateFeature[] { new ImagePreviewCreateFeature(
		provider) };
	addFeatureToPalleteCompartment(compartmentEntry, createFeatures);
    }

    private void createSegmentation() {
	PaletteCompartmentEntry compartmentEntry = createCompartmentEntry("Segmentation");
	ICreateFeature[] createFeatures = new ICreateFeature[] {
		new SegATCreateFeature(provider),
		new SegCLNCreateFeature(provider),
		new SegFCMCreateFeature(provider),
		new SegFCMOffCreateFeature(provider),
		new SegKMCreateFeature(provider),
		new SegKMOffCreateFeature(provider),
		new MultiCreateFeature(provider) };
	addFeatureToPalleteCompartment(compartmentEntry, createFeatures);
    }

    private void createUtils() {
	PaletteCompartmentEntry compartmentEntry = createCompartmentEntry("Utils");
	ICreateFeature[] createFeatures = new ICreateFeature[] { new CustomElementCreateFeature(
		provider) };
	addFeatureToPalleteCompartment(compartmentEntry, createFeatures);
    }

    private PaletteCompartmentEntry createCompartmentEntry(String name) {
	PaletteCompartmentEntry compartmentEntry = new PaletteCompartmentEntry(
		name, null); //$NON-NLS-1$
	palleteEntries.add(compartmentEntry);
	return compartmentEntry;
    }
}
