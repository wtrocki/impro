/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.validators;

import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.dialogs.ISelectionValidator;

/**
 * Simple validator class for container selection dialog
 * 
 */
public class FolderSelectionValidator implements ISelectionValidator {

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.dialogs.ISelectionValidator#isValid(java.lang.Object)
     */
    
    public String isValid(Object selection) {
	String error = null;

	if (!(selection instanceof IPath)) {
	    return "The selection should be a IPath.";
	}

	return error;
    }
}
