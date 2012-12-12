/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.utils;

import java.util.Collection;

import org.eclipse.graphiti.mm.StyleContainer;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.graphiti.util.PredefinedColoredAreas;

public class StyleUtil {

    private static final IColorConstant ELEMENT_TEXT_FOREGROUND = new ColorConstant(
	    51, 51, 153);

    private static final IColorConstant ELEMENT_FOREGROUND = new ColorConstant(
	    255, 102, 0);

    private static String DEFAULT_FONT = "Arial"; //$NON-NLS-1$

    public static Style getStyleForElement(Diagram diagram) {
	final String styleId = "CLASS"; //$NON-NLS-1$

	Style style = findStyle(diagram, styleId);

	IGaService gaService = Graphiti.getGaService();
	if (style == null) { // style not found - create new style
	    style = gaService.createStyle(diagram, styleId);
	    style.setForeground(gaService.manageColor(diagram,
		    ELEMENT_FOREGROUND));
	    // gaService.setRenderingStyle(style,
	    // rm_ColoredAreas.getLimeWhiteAdaptions());
	    gaService.setRenderingStyle(style,
		    PredefinedColoredAreas.getBlueWhiteGlossAdaptions());
	    style.setLineWidth(2);
	}
	return style;
    }

    public static Style getStyleForElementText(Diagram diagram) {
	final String styleId = "CLASS-TEXT"; //$NON-NLS-1$

	// this is a child style of the e-class-style
	Style parentStyle = getStyleForElement(diagram);
	Style style = findStyle(parentStyle, styleId);

	if (style == null) { // style not found - create new style
	    IGaService gaService = Graphiti.getGaService();
	    style = gaService.createStyle(getStyleForElement(diagram), styleId);
	    // "overwrites" values from parent style
	    style.setForeground(gaService.manageColor(diagram,
		    ELEMENT_TEXT_FOREGROUND));
	    style.setFont(gaService.manageFont(diagram, DEFAULT_FONT, 8, false,
		    true));
	}
	return style;
    }

    // find the style with a given id in the style-container, can return null
    private static Style findStyle(StyleContainer styleContainer, String id) {
	// find and return style
	Collection<Style> styles = styleContainer.getStyles();
	if (styles != null) {
	    for (Style style : styles) {
		if (id.equals(style.getId())) {
		    return style;
		}
	    }
	}
	return null;
    }
}
