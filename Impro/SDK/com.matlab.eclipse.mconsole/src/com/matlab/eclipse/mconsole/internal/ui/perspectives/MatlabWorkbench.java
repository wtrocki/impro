/*******************************************************************************
 * Copyright (c) 2006, 2011 Graz University of Technology,
 * Institute of Theoretical and Computational Physics (ITPCP) 
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Camhy, Winfried Kernbichler, Georg Huhs (ITPCP) - 
 *        initial API and implementation
 *     Christopher Albert (ITPCP) - refactoring
 *******************************************************************************/
package com.matlab.eclipse.mconsole.internal.ui.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import com.matlab.eclipse.mconsole.internal.ui.wizards.NewMatlabFileWizard;
import com.matlab.eclipse.mconsole.internal.ui.wizards.NewMatlabProjectWizard;
import com.matlab.eclipse.mconsole.views.CommandHistoryView;
import com.matlab.eclipse.mconsole.views.MatlabConsoleDebugView;
import com.matlab.eclipse.mconsole.views.MatlabConsoleView;
import com.matlab.eclipse.mconsole.views.MatlabWorkspaceView;

public class MatlabWorkbench implements IPerspectiveFactory {
	public void createInitialLayout(IPageLayout layout) {
		defineLayout(layout);
	}

	public void defineLayout(IPageLayout layout) {
		// Editors are placed for free.
		String editorArea = layout.getEditorArea();
		layout.setFixed(false);
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
				(float) 0.26, editorArea);
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
		bottomRight.addView(IPageLayout.ID_TASK_LIST);
		bottomRight.addView(IPageLayout.ID_PROBLEM_VIEW);

	}
}
