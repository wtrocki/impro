/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.panel;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.ide.IDE;

import pl.zgora.uz.imgpro.core.resources.ResourcesCreator;
import pl.zgora.uz.imgpro.diagram.Activator;
import pl.zgora.uz.imgpro.diagram.providers.ImproImageProvider;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class ShowHelpFeature extends AbstractCustomFeature {

    public static final String NAME = "Show Help";
    public static final String DESCRIPTION = "Show help for diagram element";

    public ShowHelpFeature(IFeatureProvider fp) {
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
	return ImproImageProvider.IMG_HELP;

    }

    @Override
    public boolean isAvailable(IContext context) {
	return true;
    }

    @Override
    public void execute(ICustomContext context) {
	final PictogramElement[] pictogramElements = context
		.getPictogramElements();
	if (pictogramElements.length == 0) {
	    Activator.logError("Invalid pictogram element", new Throwable());
	    return;
	}
	final Object bo = getBusinessObjectForPictogramElement(pictogramElements[0]);
	if (bo instanceof DiagramElement) {
	    DiagramElement diagramElement = (DiagramElement) bo;
	    try {
		final IWorkbenchPage activePage = PlatformUI.getWorkbench()
			.getActiveWorkbenchWindow().getActivePage();
		final IFileStore fileStore = ResourcesCreator
			.getHelpFileForElement(diagramElement);
		if (fileStore != null && fileStore.fetchInfo().exists()) {
		    IDE.openEditor(activePage, new FileStoreEditorInput(
			    fileStore), "org.eclipse.ui.browser.editor");
		} else {
		    showErrorInfo();
		    return;
		}
	    } catch (PartInitException e) {
		showErrorInfo();
	    }
	}
    }

    /**
     * 
     */
    private void showErrorInfo() {
	final Shell shell = PlatformUI.getWorkbench()
		.getActiveWorkbenchWindow().getShell();
	MessageDialog.openInformation(shell, "Cannot open help",
		"No context help for this element");
	return;
    }

}
