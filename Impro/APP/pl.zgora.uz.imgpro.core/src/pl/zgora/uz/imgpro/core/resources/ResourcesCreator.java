/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.core.resources;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.ui.IEditorInput;
import org.osgi.framework.Bundle;

import pl.zgora.uz.imgpro.core.Activator;
import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.ForwardSelection;
import pl.zgora.uz.imgpro.model.diagram.FullSelection;
import pl.zgora.uz.imgpro.model.diagram.SourceLinker;

/**
 * ResourcesCreator
 * 
 * TODO Should be refatored to Job
 * 
 * @author troken
 * 
 */
public class ResourcesCreator {

    public static void createResource(DiagramElement element,
	    IDiagramEditor iDiagramEditor) {
	IProject project = getProject(iDiagramEditor);
	String name = getSourceName(element);
	final IFile file = project.getFile(getSourcesPath(name));
	if (!file.exists()) {
	    try {
		final InputStream resourceInputStream = getResourceInputStream(name);
		if (resourceInputStream != null) {
		    final IContainer parent = file.getParent();
		    if (!parent.exists()) {
			IFolder folder = ((IFolder) parent);
			folder.create(true, true, new NullProgressMonitor());
		    }
		    file.create(resourceInputStream, true,
			    new NullProgressMonitor());
		    // TODO FIXME use dependencies mechanism in model.
		    // Baaaaaaaad code :|
		    if (element instanceof ForwardSelection
			    || element instanceof FullSelection
			    || element instanceof Classification) {
			try {
			    ImproProjectResourcesMapper.copyClassesFromDir(
				    file.getParent(),
				    ImproProjectResourcesMapper.ClASSIFY_DIR);
			} catch (Exception e) {
			    Activator.logError(null, e);
			}
		    }
		}
	    } catch (CoreException e) {
		Activator.logError("Cannot write element contents", e);
	    }
	}

	final SourceLinker sourceLinker = DiagramFactory.eINSTANCE
		.createSourceLinker();
	sourceLinker.setSourceFilePath(project.getName() + "\\"
		+ file.getProjectRelativePath().toOSString());
	element.setSourceLinker(sourceLinker);
    }

    public static void removeResource(DiagramElement element,
	    IDiagramEditor iDiagramEditor) {
	IProject project = getProject(iDiagramEditor);
	String name = getSourceName(element);
	final IFile file = project.getFile(getSourcesPath(name));
	if (file.exists()) {
	    try {
		file.delete(true, new NullProgressMonitor());
	    } catch (CoreException e) {
		Activator.logError("Cannot delete file", e);
	    }
	}
    }

    /**
     * @param element
     * @return
     */
    private static String getSourceName(DiagramElement element) {
	final String simpleName = element.getClass().getSimpleName();
	return simpleName.substring(0, simpleName.length() - 4);
    }

    private static String getSourcesPath(String name) {
	return ImproProjectResourcesMapper.getSOURCES_DIR() + "\\" + name
		+ ".m";
    }

    private static IProject getProject(IDiagramEditor iDiagramEditor) {
	if (iDiagramEditor instanceof DiagramEditor) {
	    DiagramEditor editor = (DiagramEditor) iDiagramEditor;
	    final IEditorInput editorInput = editor.getEditorInput();
	    final IFile adapter = (IFile) editorInput.getAdapter(IFile.class);
	    return adapter.getProject();
	}
	return null;
    }

    private static InputStream getResourceInputStream(String name) {
	Bundle bundle = Activator.getDefault().getBundle();
	URL fileURL = bundle.getEntry("sources\\" + name + ".m");
	try {
	    final URL url = FileLocator.resolve(fileURL);
	    URI uri = new URI(url.getProtocol(), url.getUserInfo(),
		    url.getHost(), url.getPort(), url.getPath(),
		    url.getQuery(), url.getRef());

	    File file = new File(uri);
	    if (file.exists()) {
		return url.openStream();
	    }
	} catch (Exception e) {
	    Activator.logError("", e);
	}
	return null;
    }

    private static File getHelpResource(String name) {
	Bundle bundle = Activator.getDefault().getBundle();
	URL fileURL = bundle.getEntry("help\\" + name + ".htm");
	try {
	    final URL url = FileLocator.resolve(fileURL);
	    URI uri = new URI(url.getProtocol(), url.getUserInfo(),
		    url.getHost(), url.getPort(), url.getPath(),
		    url.getQuery(), url.getRef());

	    File file = new File(uri);
	    if (file.exists()) {
		return file;
	    }
	} catch (Exception e) {
	    Activator.logError("", e);
	}
	return null;
    }

    public static IFile getFileForElement(DiagramElement element) {
	final SourceLinker sourceLinker = element.getSourceLinker();
	if (sourceLinker != null) {
	    return (IFile) ResourcesPlugin.getWorkspace().getRoot()
		    .findMember(sourceLinker.getSourceFilePath());
	}
	return null;
    }

    public static IFileStore getHelpFileForElement(DiagramElement element) {
	String sourceName = getSourceName(element);
	final File helpResource = getHelpResource(sourceName);
	if (helpResource != null) {
	    IFileStore fileStore = EFS.getLocalFileSystem().fromLocalFile(
		    helpResource);
	    return fileStore;
	}
	return null;

    }

    public static IFile createFile(String content, IContainer container,
	    String name) {
	final IFile file = container.getFile(new Path(name)
		.removeFileExtension().addFileExtension("m"));
	try {
	    if (file.exists()) {
		file.delete(true, new NullProgressMonitor());
	    }
	    file.create(new ByteArrayInputStream((content.getBytes())), true,
		    new NullProgressMonitor());
	    return file;
	} catch (CoreException e) {
	    Activator.logError("", e);
	}
	return null;
    }
}
