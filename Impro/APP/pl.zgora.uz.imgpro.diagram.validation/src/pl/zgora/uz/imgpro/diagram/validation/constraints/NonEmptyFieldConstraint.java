/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.validation.constraints;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

/**
 * Constaint for checking
 * 
 * @author Troken
 * 
 */
public class NonEmptyFieldConstraint extends AbstractModelConstraint {

    
    public IStatus validate(IValidationContext ctx) {
	EObject eObj = ctx.getTarget();
	EMFEventType eType = ctx.getEventType();

	// In the case of batch mode.
	if (eType == EMFEventType.NULL) {
	    if (eObj instanceof DiagramElement) {
		final DiagramElement diagramElement = (DiagramElement) eObj;
		final EList<EAttribute> eAllAttributes = diagramElement
			.eClass().getEAllAttributes();

		for (EAttribute atribute : eAllAttributes) {
		    final Object value = diagramElement.eGet(atribute);
		    if (value == null || value.toString().isEmpty()) {
			return ctx.createFailureStatus(diagramElement);
		    }
		    if (String.class.equals(atribute.getEType()
			    .getInstanceClass())) {
			if (((String) value).isEmpty()) {
			    return ctx.createFailureStatus(value);
			}
		    } else if (value instanceof Collection) {
			Collection<?> collection = (Collection<?>) value;
			if (collection.isEmpty()) {
			    return ctx.createFailureStatus(eObj);
			}
		    }
		}

	    }

	}
	return ctx.createSuccessStatus();
    }
}