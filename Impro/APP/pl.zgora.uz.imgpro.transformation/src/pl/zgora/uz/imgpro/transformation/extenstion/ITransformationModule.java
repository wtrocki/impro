/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.extenstion;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Interface for transformation definition
 */
public interface ITransformationModule {

	/**
	 * Runs the transformation described by this module
	 * 
	 * @param context
	 *            the transformation context
	 * @param monitor
	 *            the progress monitor given for this transformation process
	 * @return
	 */
	public Object createTarget(ITransformationContext context, IProgressMonitor monitor,
			Map<Object, String> Properties, String mode) throws Exception;
}
