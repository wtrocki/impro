/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.validators;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

import pl.zgora.uz.imgpro.transformation.Activator;
import pl.zgora.uz.imgpro.transformation.extenstion.Transformation;

/**
 * A validator class for transformation selection dialog
 * 
 */
public class TransformationSelectionStatusValidator implements
	ISelectionStatusValidator {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.dialogs.ISelectionStatusValidator#validate(java.lang.Object
     * [])
     */
    
    public IStatus validate(Object[] arg0) {

	if ((arg0 != null) && (arg0.length > 0)) {
	    // Single selection
	    Object selection = arg0[0];

	    if (selection instanceof Transformation) {
		return Status.OK_STATUS;
	    }
	} else {
	    // No selection
	    return new Status(IStatus.WARNING, Activator.PLUGIN_ID,
		    "Empty selection.");
	}

	return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Unknown error.");
    }

}
