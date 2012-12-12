/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.launch;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import pl.zgora.uz.imgpro.transformation.Activator;
import pl.zgora.uz.imgpro.transformation.extenstion.ITransformationContext;
import pl.zgora.uz.imgpro.transformation.extenstion.Transformation;
import pl.zgora.uz.imgpro.transformation.extenstion.TransformationContext;

/**
 * Configuration delegate to launch a module.
 * 
 */
public class LaunchTransformationDelegate extends LaunchConfigurationDelegate {

    public static final String LCS_TYPE = "pl.zgora.uz.imgpro.transformation.launchConfigurationType";

    
    public void launch(ILaunchConfiguration configuration, String mode,
	    ILaunch launch, IProgressMonitor monitor) throws CoreException {

	// Initialize the transformation configuration for the transformation
	// module
	ITransformationContext context = new TransformationContext(
		configuration);
	IProject project = context.getProject();
	Map<Object, String> properties = context.getProperties();

	// Initialize property path
	IPath propertyPath = null;

	// Start the transformation
	try {
	    // create properties if necessary
	    if (properties != null) {
		propertyPath = new Path(project.getLocation()
			+ "/.impro.properties");
		createPropertyFile(propertyPath, properties);
	    }

	    Transformation transformation = context.getTransformation();
	    transformation.getModule().createTarget(context, monitor,
		    properties, mode);

	} catch (Exception e) {
	    Activator.log(e);
	}

	// clean files
	if (properties != null) {
	    File file = propertyPath.toFile();
	    file.delete();
	}

	// refresh project
	// project.refreshLocal(IResource.DEPTH_INFINITE, null);
    }

    /**
     * Creates the temporary properties file.
     * 
     * @param path
     * @param propertyMap
     */
    private void createPropertyFile(IPath path, Map<Object, String> propertyMap) {
	try {
	    File file = path.toFile();
	    FileWriter out = new FileWriter(file.getAbsolutePath());
	    for (Iterator<Map.Entry<Object, String>> iter = propertyMap
		    .entrySet().iterator(); iter.hasNext();) {
		Map.Entry<Object, String> property = iter.next();
		out.write(property.getKey() + "=" + property.getValue() + "\n");
	    }
	    out.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
