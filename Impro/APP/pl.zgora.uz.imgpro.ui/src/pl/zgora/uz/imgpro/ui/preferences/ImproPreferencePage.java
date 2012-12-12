/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */
public class ImproPreferencePage extends PreferencePage implements
	IWorkbenchPreferencePage {

    public ImproPreferencePage() {
	super("Impro");
    }

    public void init(IWorkbench workbench) {
    }

    
    protected Control createContents(Composite parent) {
	Composite composite = new Composite(parent, SWT.NONE);
	composite.setLayout(new GridLayout(1, false));

	Label lblNewLabel = new Label(composite, SWT.HORIZONTAL | SWT.CENTER);
	GridData gd_lblNewLabel = new GridData(SWT.CENTER, SWT.CENTER, false,
		false, 1, 1);
	gd_lblNewLabel.heightHint = 191;
	gd_lblNewLabel.widthHint = 364;
	lblNewLabel.setLayoutData(gd_lblNewLabel);
	lblNewLabel
		.setText("\n\n Image Processing Studio\n\n (c) Copyright Wojciech Trocki 2012.\n\n All rights reserved.\n\n  Contact: wtrocki@gmail.com ");
	return composite;
    }

}