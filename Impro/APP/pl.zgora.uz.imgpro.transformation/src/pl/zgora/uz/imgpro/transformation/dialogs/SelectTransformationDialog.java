/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

import pl.zgora.uz.imgpro.transformation.extenstion.Transformation;
import pl.zgora.uz.imgpro.transformation.validators.TransformationSelectionStatusValidator;

/**
 * The role of this dialog is to select a transformation.
 */
public class SelectTransformationDialog extends ElementTreeSelectionDialog {

    /**
     * Constructor.
     * 
     * @param pageName
     *            name of the page
     * @param launcherExtension
     *            extension of the file to create
     */
    public SelectTransformationDialog(Shell parentShell, String pageName, String launcherExtension) {
	super(parentShell, new TransformationLabelProvider(), new TransformationContentProvider());
	setTitle(pageName);

	// Set dialog properties
	setAllowMultiple(false);
	setDoubleClickSelects(true);
	setHelpAvailable(false);
	setValidator(new TransformationSelectionStatusValidator());
	setEmptyListMessage("No transformation selected.");
	setMessage("Select a transformation:");

	// Build input for selection dialog
	// Retrieve Groups and Transformations to show them in the selection
	// dialog
	List<Object> elements = new ArrayList<Object>();
	Transformation[] transfos = Transformation.getRegisteredTransformations();

	for (int i = 0; i < transfos.length; i++) {
	    elements.add(transfos[i]);
	}

	Object[] elts = elements.toArray(new Object[elements.size()]);

	// And set the input in selection tree
	setInput(elts);
    }
}
