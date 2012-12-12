/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.validators;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

import pl.zgora.uz.imgpro.transformation.Activator;

/**
 * Validator class for source model selection dialog
 */
public class FileSelectionValidator implements ISelectionStatusValidator {

    
    public IStatus validate(Object[] arg0) {

	if ((arg0 == null) || (arg0.length < 1)) {
	    return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No selection.");
	}

	Object selection = arg0[0];
	if (!(selection instanceof IFile)) {

	    return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The selection should be a file.");
	}

	return new Status(IStatus.OK, Activator.PLUGIN_ID, "Selection is valid");
    }
}
