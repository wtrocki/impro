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
import org.eclipse.debug.core.ILaunchConfiguration;

/**
 * Context for a transformation. This context holds information like source
 * object, target container, etc.
 */
public interface ITransformationContext {

    /**
     * Get the transformation defined in extension and selected for use in "Run"
     * dialog
     * 
     * @return the transformation
     */
    public Transformation getTransformation();

    /**
     * Get the target container for the transformation
     * 
     * @return container for transformation result
     */
    public IContainer getContainer();

    /**
     * Get the source of the transformation (a Impro model file in general)
     * 
     * @return source of the transformation
     */
    public Object getSource();

    /**
     * Get the project that owns the container
     * 
     * @return the project owning generation container
     */
    public IProject getProject();

    /**
     * Get the map that stores the local properties of the transformation
     * 
     * @return the properties
     */
    public Map<Object, String> getProperties();

    /**
     * Get the launch configuration
     * 
     * @return the current configuration
     */
    public ILaunchConfiguration getConfiguration();
}
