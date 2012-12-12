/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.validation;

import org.eclipse.emf.validation.model.IClientSelector;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;

public class ClientSelector implements IClientSelector {
    
    public boolean selects(Object object) {
	if (object instanceof ImproDiagram || object instanceof DiagramElement) {
	    return true;
	}
	return false;
    }
}
