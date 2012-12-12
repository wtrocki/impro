/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.filter;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * A simple filter class for source selection dialog
 */
public class FileSelectionFilter extends ViewerFilter {

	/** Authorized file extensions */
	List<String> filetypes;

	/**
	 * If newFileTypes is null, any extension is accepted
	 * 
	 * @param newFiletypes
	 *            authorized extensions for the file viewer filter
	 */
	public FileSelectionFilter(List<String> newFiletypes) {
		super();
		filetypes = newFiletypes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
	 * java.lang.Object, java.lang.Object)
	 */
	public boolean select(Viewer arg0, Object arg1, Object arg2) {

		if ((arg2 instanceof IContainer) || (arg2 instanceof IFile)) {

			// Filter files
			if (arg2 instanceof IFile) {
				IFile file = (IFile) arg2;
				String file_ext = file.getFileExtension();

				if ((filetypes != null) && (!filetypes.contains(file_ext))) {
					return false;
				}
			}

			// Filter folders
			if (arg2 instanceof IContainer) {
				IContainer container = (IContainer) arg2;
				String name = container.getName();

				// Mask hidden folder
				if (name.startsWith(".")) {
					return false;
				}
			}

			return true;
		}
		return false;
	}

}
