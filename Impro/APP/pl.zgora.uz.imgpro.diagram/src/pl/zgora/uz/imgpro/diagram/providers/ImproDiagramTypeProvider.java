/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.providers;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class ImproDiagramTypeProvider extends AbstractDiagramTypeProvider {

    private IToolBehaviorProvider[] toolBehaviorProviders;

    public ImproDiagramTypeProvider() {
	super();
	setFeatureProvider(new ImproFeatureProvider(this));
    }

    
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
	if (toolBehaviorProviders == null) {
	    toolBehaviorProviders = new IToolBehaviorProvider[] { new ImproToolBehaviorProvider(this) };
	}
	return toolBehaviorProviders;
    }

}
