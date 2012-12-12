/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.dialogs;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import pl.zgora.uz.imgpro.transformation.extenstion.Transformation;

/**
 * Label provider for transformations
 */
public class TransformationLabelProvider extends LabelProvider {

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
     */
    
    public String getText(Object element) {
	if (element instanceof Transformation) {
	    return ((Transformation) element).getName();
	}
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
     */
    
    public Image getImage(Object element) {
	if (element instanceof Transformation) {
	    return ((Transformation) element).getImage();
	}
	return null;
    }
}
