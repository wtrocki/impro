/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

import pl.zgora.uz.imgpro.transformation.launch.LaunchConfigurationIds;
import pl.zgora.uz.imgpro.transformation.launch.LaunchTransformationDelegate;

/**
 * Launch shortcut for ImPro. Used to create launch for run as context menu
 * 
 * @author troken
 */
public class LaunchShortcut implements ILaunchShortcut2 {

    
    public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
	final IResource launchableResource = getLaunchableResource(selection);
	return getConfigurations(launchableResource);
    }

    
    public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {
	final IResource launchableResource = getLaunchableResource(editorpart);
	return getConfigurations(launchableResource);
    }

    /**
     * Returns all of the launch configurations of type
     * <code>org.eclipse.jdt.debug.tests.testConfigType</code>
     * 
     * @param launchableResource
     * 
     * @return all of the launch configurations of type
     *         <code>org.eclipse.jdt.debug.tests.testConfigType</code>
     */
    protected ILaunchConfiguration[] getConfigurations(IResource resource) {
	if (resource != null) {
	    ILaunchConfiguration lc;
	    if (resource instanceof IFile) {
		IFile file = (IFile) resource.getAdapter(IFile.class);
		if (file != null) {
		    try {
			lc = findOrCreateLaunchConfigurationForFile(file);
			if (lc != null) {
			    return new ILaunchConfiguration[] { lc };
			}
		    } catch (CoreException e) {
			Activator.log(e);
		    }
		}
	    }
	}
	return new ILaunchConfiguration[0];
    }

    /**
     * Finds or creates launch configuration for {@code selection}
     * 
     * @param selectedResource
     *            - launched resource
     * @param kind
     *            - launch kind
     * @return launch configuration for {@code selection}
     * @throws CoreException
     * @see ILaunchConfiguration
     */
    protected ILaunchConfiguration findOrCreateLaunchConfigurationForFile(
	    IResource selectedResource) throws CoreException {
	ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
	ILaunchConfigurationType type = manager
		.getLaunchConfigurationType(LaunchTransformationDelegate.LCS_TYPE);
	IProject generalProject = selectedResource.getProject();
	String projectName = generalProject.getName();
	final IPath projectRelativePath = selectedResource
		.getProjectRelativePath();
	if (selectedResource instanceof IFile
		&& selectedResource.getName().endsWith(".impro")) {

	    if (projectName != null) {
		ILaunchConfiguration[] foundConfigurations = manager
			.getLaunchConfigurations(type);
		for (ILaunchConfiguration foundConfiguration : foundConfigurations) {
		    String model = foundConfiguration.getAttribute(
			    LaunchConfigurationIds.MODEL_ATTRIBUTE_ID,
			    (String) null);
		    if (model != null
			    && new Path(model).removeFirstSegments(1)
				    .toOSString()
				    .equals(projectRelativePath.toOSString())) {
			return foundConfiguration;
		    }
		}
	    }
	}

	ILaunchConfigurationWorkingCopy launchConfig = type.newInstance(
		generalProject, projectName);

	// TODO non string attributes. Require fix in dependency cycles
	// Wszystko wymaga czasu, ale jak siê go nie ma to siê pisze naprawde
	// z³y kod, tak jak poni¿ej.
	// Mam nadzieje ¿e kiedyœ tu wrócê i napiszê to tak jak trzeba.
	launchConfig.setAttribute(LaunchConfigurationIds.MODEL_ATTRIBUTE_ID,
		projectName + "\\" + projectRelativePath.toOSString());
	launchConfig.setAttribute(
		LaunchConfigurationIds.CONTAINER_ATTRIBUTE_ID, projectName
			+ "\\sources");
	launchConfig.setAttribute(LaunchConfigurationIds.MODULE_ATTRIBUTE_ID,
		"pl.zgora.uz.imgpro.core.r2011");
	renameConfig(launchConfig, selectedResource.getName());
	return launchConfig.doSave();
    }

    private void renameConfig(ILaunchConfigurationWorkingCopy config,
	    String name) {
	String uniqueName = DebugPlugin.getDefault().getLaunchManager()
		.generateLaunchConfigurationName(name);
	config.rename(uniqueName);
    }

    
    public IResource getLaunchableResource(ISelection selection) {
	if (selection instanceof IStructuredSelection) {
	    IStructuredSelection structSelection = (IStructuredSelection) selection;

	    Object element = structSelection.getFirstElement();
	    IResource res = null;
	    if (element instanceof IResource) {
		res = (IResource) structSelection.getFirstElement();
	    }
	    return res;
	}
	return null;
    }

    
    public IResource getLaunchableResource(IEditorPart editorpart) {
	return (IFile) editorpart.getEditorInput().getAdapter(IFile.class);
    }

    
    public void launch(ISelection selection, String mode) {
	ILaunchConfiguration[] configs = getLaunchConfigurations(selection);
	try {
	    if (configs[0] != null) {
		configs[0].launch(mode, null, true);
	    }
	} catch (CoreException e) {
	    Activator.log(e);
	}
    }

    
    public void launch(IEditorPart editor, String mode) {
	ILaunchConfiguration[] configs = getLaunchConfigurations(editor);
	try {
	    if (configs[0] != null) {
		configs[0].launch(mode, null, true);
	    }
	} catch (CoreException e) {
	    Activator.log(e);
	}
    }

}
