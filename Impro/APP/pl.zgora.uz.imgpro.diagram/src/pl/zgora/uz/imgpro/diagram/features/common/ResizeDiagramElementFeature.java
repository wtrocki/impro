/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.features.common;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

public class ResizeDiagramElementFeature extends DefaultResizeShapeFeature {

    public ResizeDiagramElementFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public boolean canResizeShape(IResizeShapeContext context) {
	return true;
    }
}
