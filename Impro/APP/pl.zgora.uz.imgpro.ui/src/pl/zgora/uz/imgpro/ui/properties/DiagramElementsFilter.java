/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class DiagramElementsFilter extends AbstractPropertySectionFilter {

    
    protected boolean accept(PictogramElement pe) {
	EObject bo = Graphiti.getLinkService()
		.getBusinessObjectForLinkedPictogramElement(pe);

	return bo instanceof DiagramElement;
    }
}
