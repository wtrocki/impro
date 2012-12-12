/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.DirectoryType;

public class NonEmptyDirectoryConstraint extends AbstractModelConstraint {

    public NonEmptyDirectoryConstraint() {
    }

    
    public IStatus validate(IValidationContext ctx) {
	EObject eObj = ctx.getTarget();
	EMFEventType eType = ctx.getEventType();

	// In the case of batch mode.
	if (eType == EMFEventType.NULL) {
	    String name = null;
	    if (eObj instanceof DirInput) {
		final DirectoryType directory = ((DirInput) eObj)
			.getDirectory();
		if (directory != null)
		    name = directory.getName();
	    }

	    if (name == null || name.length() == 0) {
		return ctx.createFailureStatus(new Object[] { eObj.eClass()
			.getName() });
	    }
	}
	return ctx.createSuccessStatus();
    }

}
