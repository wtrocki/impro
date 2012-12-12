/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.core.transformation;

import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;

import pl.zgora.uz.imgpro.core.resources.ImproProjectResourcesMapper;
import pl.zgora.uz.imgpro.transformation.extenstion.ITransformationContext;
import pl.zgora.uz.imgpro.transformation.extenstion.ITransformationModule;

/**
 * Main transformation module used to create matlab sources
 * 
 * @author Troken
 * 
 */
public class MatlabTransformationModule implements ITransformationModule {

    public static final String ID = "pl.zgora.uz.imgpro.core.r2011";

    
    public Object createTarget(ITransformationContext context,
	    IProgressMonitor monitor, Map<Object, String> Properties,
	    String mode) throws Exception {

	final Object source = context.getSource();

	// Copy static classes
	final IContainer container = context.getContainer();
	ImproProjectResourcesMapper.copyClassesFromDir(container,
		ImproProjectResourcesMapper.STATIC_DIR);
	TransformationJob job = new TransformationJob(source, container);
	job.schedule();
	return null;
    }

}
