/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.extenstion;

import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunchConfiguration;

import pl.zgora.uz.imgpro.transformation.Activator;
import pl.zgora.uz.imgpro.transformation.launch.LaunchConfigurationIds;

/**
 * Basic implementation for the transformation context
 */
public class TransformationContext implements ITransformationContext {

    /** private attribute that stores the source object */
    private Object source;

    /** private attribute that stores the container */
    private IContainer container;

    /** private attribute that stores the transformation informations */
    private Transformation transformation;

    /** private attribute that stores the properties */
    private Map<Object, String> properties;

    /** private attribute that stores the launch configuration */
    private final ILaunchConfiguration configuration;

    /**
     * Constructor retrieve any info of the context using current launch
     * configuration
     * 
     * @param configuration
     */
    @SuppressWarnings("unchecked")
    public TransformationContext(ILaunchConfiguration configuration) {

	this.configuration = configuration;

	try {
	    // Get transformation attributes
	    this.properties = configuration.getAttribute(
		    LaunchConfigurationIds.PROPERTY_MAP_ID,
		    (Map<Object, String>) null);

	    // Retrieve the transformation
	    this.transformation = getTransformation(configuration);

	    // Initialize path and containers for transformation
	    String containerPath = configuration.getAttribute(
		    LaunchConfigurationIds.CONTAINER_ATTRIBUTE_ID,
		    (String) null);
	    if (containerPath != null) {
		IPath containerIPath = new Path(containerPath);
		container = (IContainer) ResourcesPlugin.getWorkspace()
			.getRoot().findMember(containerIPath);
	    }

	    // Initialize path and source model for transformation
	    String sourcePath = configuration.getAttribute(
		    LaunchConfigurationIds.MODEL_ATTRIBUTE_ID, (String) null);
	    if (sourcePath != null) {
		IPath sourceModelIPath = new Path(sourcePath);
		source = ResourcesPlugin.getWorkspace().getRoot()
			.findMember(sourceModelIPath);
	    }

	} catch (CoreException e) {
	    Activator.log(e);
	}
    }

    
    public Object getSource() {
	return source;
    }

    
    public IContainer getContainer() {
	return container;
    }

    
    public Transformation getTransformation() {
	return transformation;
    }

    
    public ILaunchConfiguration getConfiguration() {
	return configuration;
    }

    /*
     * (non-Javadoc)
     * 
     * @see pl.zgora.uz.imgpro.transformation.extenstion.
     * ITransformationContext#getProperties ()
     */
    
    public Map<Object, String> getProperties() {
	return properties;
    }

    /*
     * (non-Javadoc)
     * 
     * @see pl.zgora.uz.imgpro.transformation.extenstion.
     * ITransformationContext#getProject()
     */
    
    public IProject getProject() {
	if (container != null)
	    return container.getProject();
	return null;
    }

    /**
     * Retrieves a module by its id.
     * 
     * @param configuration
     * @return the module
     * @throws CoreException
     */
    private static Transformation getTransformation(
	    ILaunchConfiguration configuration) throws CoreException {
	String moduleId = configuration.getAttribute(
		LaunchConfigurationIds.MODULE_ATTRIBUTE_ID, (String) null);
	IExtensionRegistry registry = Platform.getExtensionRegistry();
	IExtensionPoint extensionPoint = registry
		.getExtensionPoint(TransformationExtIds.TRANSFORMATION_EXTENSION_ID);
	if (extensionPoint == null) {
	    Activator.log("unable to resolve extension-point: "
		    + TransformationExtIds.TRANSFORMATION_EXTENSION_ID
			    .toString());
	} else {
	    IExtension[] extensions = extensionPoint.getExtensions();
	    for (int i = 0; i < extensions.length; i++) {
		IExtension extension = extensions[i];
		IConfigurationElement[] members = extension
			.getConfigurationElements();
		for (int j = 0; j < members.length; j++) {

		    // Parse configuration elements for this extension
		    // (Transformations or Groups)
		    IConfigurationElement current = members[j];
		    if (current.getName().equals(
			    TransformationExtIds.TAG_TRANSFORMATION)) {
			// current is a transformation
			Transformation transformation = new Transformation(
				current);
			if (transformation.getId().equals(moduleId)) {
			    return transformation;
			}
		    }
		}
	    }
	}
	return null;
    }

}
