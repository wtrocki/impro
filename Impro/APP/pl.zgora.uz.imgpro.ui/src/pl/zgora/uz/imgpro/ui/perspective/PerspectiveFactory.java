/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import pl.zgora.uz.imgpro.images.view.ImageView;
import pl.zgora.uz.imgpro.ui.wizard.CreateImproDiagramWizard;

import com.matlab.eclipse.mconsole.internal.ui.wizards.NewMatlabFileWizard;
import com.matlab.eclipse.mconsole.internal.ui.wizards.NewMatlabProjectWizard;
import com.matlab.eclipse.mconsole.views.CommandHistoryView;
import com.matlab.eclipse.mconsole.views.MatlabConsoleDebugView;
import com.matlab.eclipse.mconsole.views.MatlabConsoleView;
import com.matlab.eclipse.mconsole.views.MatlabWorkspaceView;

public class PerspectiveFactory implements IPerspectiveFactory {

    public void createInitialLayout(IPageLayout layout) {
	defineLayout(layout);
    }

    public void defineLayout(IPageLayout layout) {
	// Editors are placed for free.
	String editorArea = layout.getEditorArea();
	layout.setFixed(false);
	layout.addNewWizardShortcut(CreateImproDiagramWizard.ID);
	layout.addNewWizardShortcut(NewMatlabProjectWizard.WIZARD_ID);
	layout.addNewWizardShortcut(NewMatlabFileWizard.WIZARD_ID);
	layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
	layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");

	layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
	layout.addShowViewShortcut("com.matlab.eclipse.mconsole.views.MatlabProjectNavigator");
	layout.addShowViewShortcut(MatlabConsoleView.VIEW_ID);
	layout.addShowViewShortcut(MatlabWorkspaceView.VIEW_ID);
	layout.addShowViewShortcut(CommandHistoryView.VIEW_ID);

	IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT,
		(float) 0.20, editorArea);
	IFolderLayout bottomLeft = layout.createFolder(
		"bottomLeft", IPageLayout.BOTTOM, (float) 0.6,//$NON-NLS-1$
		"left");//$NON-NLS-1$
	bottomLeft.addView(CommandHistoryView.VIEW_ID);
	left.addView("com.matlab.eclipse.mconsole.views.MatlabProjectNavigator");

	layout.addPlaceholder(MatlabConsoleDebugView.VIEW_ID,
		IPageLayout.RIGHT, (float) 0.74, editorArea);
	IFolderLayout bottomRight = layout.createFolder(
		"bottomRight", IPageLayout.BOTTOM, (float) 0.6,//$NON-NLS-1$
		editorArea);//$NON-NLS-1$

	bottomRight.addView(MatlabConsoleView.VIEW_ID);
	bottomRight.addView(MatlabWorkspaceView.VIEW_ID);
	bottomRight.addView(IPageLayout.ID_PROP_SHEET);
	bottomRight.addView(IPageLayout.ID_PROBLEM_VIEW);
	bottomRight.addView(ImageView.VIEW_ID);

    }
}
