/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.core.resources;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;

import pl.zgora.uz.imgpro.core.Activator;

public class ImproProjectResourcesMapper {

    // FIXME this will be default values. Actual values should be moved to
    // preferences.
    public static final String IMAGES_DIR = "images";
    public static final String SOURCES_DIR = "sources";
    public static final String DIAGRAM_DIR = "model";
    public static final String DATA_DIR = "data";
    public static final String STATIC_DIR = "sources\\static";
    public static final String ClASSIFY_DIR = "sources\\classifiy";
    private static final String LOGS_DIR = "logs";

    public ImproProjectResourcesMapper() {
    }

    public static String getIMAGES_DIR() {
	return IMAGES_DIR;
    }

    public static String getDIAGRAM_DIR() {
	return DIAGRAM_DIR;
    }

    public static String getSOURCES_DIR() {
	return SOURCES_DIR;
    }

    public static void createProjectStructure(IProject project) {
	try {
	    final String[] projectStructure = getProjectStructure();
	    for (String name : projectStructure) {
		final IFolder folder = project.getFolder(name);
		if (!folder.exists()) {
		    folder.create(true, true, new NullProgressMonitor());
		}
	    }
	    copyData(project);
	} catch (Exception e) {
	    Activator.logError("Cannot create folder", e);
	}
    }

    /**
     * @param project
     * @throws IOException
     * @throws CoreException
     * @throws URISyntaxException
     */
    private static void copyData(IProject project) throws IOException,
	    CoreException, URISyntaxException {
	final Bundle bundle = Activator.getDefault().getBundle();
	final URL location = FileLocator.find(bundle, new Path(DATA_DIR), null);
	IFileSystem fileSystem = EFS.getLocalFileSystem();
	final URL fileURL = FileLocator.toFileURL(location);
	URI uri = new URI(fileURL.getProtocol(), fileURL.getUserInfo(),
		fileURL.getHost(), fileURL.getPort(), fileURL.getPath(),
		fileURL.getQuery(), fileURL.getRef());
	IFileStore fileStore = fileSystem.getStore(uri);
	fileStore.copy(fileSystem.getStore(project.getFolder(DATA_DIR)
		.getLocationURI()), EFS.OVERWRITE, new NullProgressMonitor());
	project.refreshLocal(IResource.DEPTH_INFINITE,
		new NullProgressMonitor());
    }

    public static void copyClassesFromDir(IResource container,
	    String projectRelatedDir) throws CoreException, Exception {
	final Bundle bundle = Activator.getDefault().getBundle();
	if (container != null) {
	    final URL fromDir = FileLocator.find(bundle, new Path(
		    projectRelatedDir), null);
	    IFileSystem fileSystem = EFS.getLocalFileSystem();
	    final URL fileURL = FileLocator.toFileURL(fromDir);
	    URI uri = new URI(fileURL.getProtocol(), fileURL.getUserInfo(),
		    fileURL.getHost(), fileURL.getPort(), fileURL.getPath(),
		    fileURL.getQuery(), fileURL.getRef());
	    IFileStore fileStore = fileSystem.getStore(uri);
	    fileStore.copy(fileSystem.getStore(container.getLocationURI()),
		    EFS.OVERWRITE, new NullProgressMonitor());
	    final IProject project = container.getProject();
	    if (project != null) {
		project.refreshLocal(IResource.DEPTH_INFINITE,
			new NullProgressMonitor());
	    }
	}
    }

    private static String[] getProjectStructure() {
	return new String[] { IMAGES_DIR, DIAGRAM_DIR, SOURCES_DIR, DATA_DIR,
		LOGS_DIR };
    }

}
