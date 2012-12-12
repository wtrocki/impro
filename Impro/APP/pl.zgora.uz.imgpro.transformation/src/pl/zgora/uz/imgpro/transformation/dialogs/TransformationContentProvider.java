/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.dialogs;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Content provider for the transformation selection dialog
 */
public class TransformationContentProvider implements ITreeContentProvider {

    
    public Object[] getChildren(Object parentElement) {
	Object[] children = new Object[0];

	if (parentElement instanceof Object[]) {
	    // Root
	    children = (Object[]) parentElement;
	}

	return children;
    }

    
    public Object getParent(Object element) {
	return null;
    }

    
    public boolean hasChildren(Object element) {
	return false;
    }

    
    public Object[] getElements(Object inputElement) {
	return getChildren(inputElement);
    }

    
    public void dispose() {
	// do nothing
    }

    
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	// donothing
    }

}
