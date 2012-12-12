/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.images.view;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class ImageView extends ViewPart {

    public static final String VIEW_ID = "pl.zgora.uz.imgpro.ImageView";

    ImageViewer viewer;
    Image image;

    /*
     * The selectionListener listens for changes in the workbench's selection
     * service.
     */
    private final ISelectionListener selectionListener = new ISelectionListener() {
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
	    if (selection instanceof IStructuredSelection) {
		selectionChanged((IStructuredSelection) selection);
	    }
	}

	private void selectionChanged(IStructuredSelection selection) {
	    if (selection.size() == 0)
		return;
	    Object first = selection.getFirstElement();
	    if (first instanceof IFile) {
		selectionChanged((IFile) first);
	    }
	}

	private void selectionChanged(IFile file) {
	    setImage(file);
	}

    };

    @Override
    public void createPartControl(Composite parent) {
	parent.setLayout(new FillLayout());
	viewer = new ImageViewer(parent, SWT.NONE);

	getSelectionService().addSelectionListener(selectionListener);
    }

    protected void setImage(IFile file) {
	InputStream in = null;
	try {
	    in = file.getContents();
	    Image newImage = new Image(Display.getDefault(), in);
	    viewer.setImage(newImage);
	    disposeImage();
	    image = newImage;
	} catch (Exception e) {
	    // If there's an exception, do nothing. Life goes on...
	    e.printStackTrace();
	} finally {
	    try {
		if (in != null) {
		    in.close();
		}
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }

    @Override
    public void dispose() {
	super.dispose();
	getSelectionService().removeSelectionListener(selectionListener);
	disposeImage();
    }

    private void disposeImage() {
	if (image == null)
	    return;
	image.dispose();
	image = null;
    }

    @Override
    public void setFocus() {
	viewer.setFocus();
    }

    private ISelectionService getSelectionService() {
	return getSite().getWorkbenchWindow().getSelectionService();
    }
}