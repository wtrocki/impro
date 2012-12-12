/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import pl.zgora.uz.imgpro.core.resources.ImproProjectResourcesMapper;

import com.matlab.eclipse.mconsole.internal.ui.wizards.NewMatlabProjectWizard;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "mpe". If a
 * sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */
public class NewImproProjectWizard extends NewMatlabProjectWizard {

    /**
     * Constructor for NewImproProjectWizard.
     */
    public NewImproProjectWizard() {
	super();
	setNeedsProgressMonitor(true);
    }

    /**
     * This method is called when 'Finish' button is pressed in the wizard. We
     * will create an operation and run it using wizard as execution context.
     */
    
    public boolean performFinish() {
	super.performFinish();
	final WorkspaceJob workspaceJob = new WorkspaceJob("Creating project") {

	    
	    public IStatus runInWorkspace(IProgressMonitor monitor)
		    throws CoreException {
		final IProject newProject = getNewProject();
		ImproProjectResourcesMapper.createProjectStructure(newProject);
		return Status.OK_STATUS;
	    }
	};
	workspaceJob.schedule();
	return true;

    }
}