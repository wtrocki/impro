/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.wizard;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * The Class AbstractWizardPage.
 */
public abstract class AbstractWizardPage extends WizardPage {

    public AbstractWizardPage(String pageName, String title,
	    ImageDescriptor titleImage) {
	super(pageName, title, titleImage);
    }

    protected AbstractWizardPage(String pageName) {
	super(pageName);
    }

    public void createControl(Composite parent) {
	Composite composite = new Composite(parent, SWT.NULL);
	composite.setFont(parent.getFont());
	composite.setLayout(new GridLayout());
	composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

	createWizardContents(composite);

	setPageComplete(true);

	// Show description on opening
	setErrorMessage(null);
	setMessage(null);
	setControl(composite);
    }

    abstract protected void createWizardContents(Composite parent);

}
