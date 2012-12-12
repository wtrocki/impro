/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.matlab.eclipse.meditor.editors.MatlabConfiguration;
import com.matlab.eclipse.meditor.editors.partitioner.MatlabPartitionScanner;
import com.matlab.eclipse.meditor.util.ColorManager;

public class TemplatesPreferencePage extends PreferencePage implements
	IWorkbenchPreferencePage {

    ListViewer templates;
    ProjectionViewer viewer;
    private Composite main;
    private ColorManager colorManager;
    private MatlabConfiguration editConfiguration;

    public TemplatesPreferencePage() {
	setDescription("This page are currently unused");
    }

    public void init(IWorkbench workbench) {
	colorManager = new ColorManager();
	editConfiguration = new MatlabConfiguration(colorManager);
    }

    
    protected Control createContents(Composite parent) {
	main = new Composite(parent, SWT.NONE);
	main.setLayout(new GridLayout(4, false));
	createLabel("Model Element: ", parent);
	createLabel("Element body", parent);
	createList(main);
	createViewer(main);
	new Label(main, SWT.NONE);
	return main;
    }

    private void createLabel(String text, Composite parent) {
	final Label label = new Label(parent, SWT.NONE);
	label.setText(text);
    }

    private void createViewer(Composite parent) {
	Label label = new Label(main, SWT.SEPARATOR | SWT.VERTICAL);
	label.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, false, true));
	viewer = new ProjectionViewer(parent, null, null, false, SWT.NONE);
	GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
	viewer.getTextWidget().setLayoutData(gridData);

	viewer.configure(editConfiguration);
	final Document document = new Document(
		"function [test]=name(panam)\n test=3+3 \n\nend");
	viewer.setDocument(document);
	IDocumentPartitioner partitioner = new FastPartitioner(
		new MatlabPartitionScanner(),
		MatlabPartitionScanner.getConfiguredContentTypes());
	partitioner.connect(document);
	document.setDocumentPartitioner(partitioner);
    }

    private void createList(Composite parent) {
	templates = new ListViewer(parent);
	final GridData layoutData = new GridData(SWT.LEFT, SWT.FILL, false,
		true);
	layoutData.widthHint = 60;
	templates.getList().setLayoutData(layoutData);
    }

}
