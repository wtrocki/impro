/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.panel;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import pl.zgora.uz.imgpro.diagram.providers.ImproImageProvider;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class ShowElementPropertiesFeature extends AbstractCustomFeature {

    public static final String NAME = "Properties";
    public static final String DESCRIPTION = "Show Properties";;

    public ShowElementPropertiesFeature(IFeatureProvider fp) {
	super(fp);
    }

    @Override
    public boolean canUndo(IContext context) {
	return false;
    }

    @Override
    public boolean canExecute(ICustomContext context) {
	PictogramElement[] pes = context.getPictogramElements();
	if (pes != null && pes.length == 1) {
	    Object bo = getBusinessObjectForPictogramElement(pes[0]);
	    if (bo instanceof DiagramElement) {
		return true;
	    }
	}
	return false;
    }

    @Override
    public String getName() {

	return NAME; //$NON-NLS-1$
    }

    @Override
    public String getDescription() {
	return DESCRIPTION; //$NON-NLS-1$

    }

    @Override
    public String getImageId() {
	return ImproImageProvider.IMG_SHOW_PROPERTIES;

    }

    @Override
    public boolean isAvailable(IContext context) {
	return false;
    }

    @Override
    public void execute(ICustomContext context) {
	final IWorkbenchPage activePage = PlatformUI.getWorkbench()
		.getActiveWorkbenchWindow().getActivePage();
	try {
	    activePage.showView(IPageLayout.ID_PROP_SHEET);
	} catch (PartInitException e) {
	    System.err.println(e);
	}

    }

}
