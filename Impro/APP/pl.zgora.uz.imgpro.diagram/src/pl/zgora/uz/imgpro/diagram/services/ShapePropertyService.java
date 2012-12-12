/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.services;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;

public class ShapePropertyService {

    private static final String IS_COLLAPSED = ShapePropertyService.class
	    .getName() + "IS_COLLAPSED";

    public static boolean isCollapsed(PictogramElement pe) {
	final String propertyValue = Graphiti.getPeService().getPropertyValue(
		pe, IS_COLLAPSED);

	return Boolean.parseBoolean(propertyValue);
    }

    public static void setCollapsed(PictogramElement pe, boolean value) {
	Graphiti.getPeService().setPropertyValue(pe, IS_COLLAPSED,
		Boolean.toString(value));
    }

}
