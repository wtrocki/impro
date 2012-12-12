/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import pl.zgora.uz.imgpro.diagram.Activator;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;

public class DiagramResourcesUtil {

    public static final String MODEL_FILE_EXTENSION = "impro";

    /**
     * store element in separate file
     * 
     * @param element
     * @param diagram
     */
    public static void storeElement(DiagramElement element, Diagram diagram) {
	//
	storeElementInFile(element, diagram);
    }

    private static void storeElementInFile(DiagramElement element, Diagram diagram) {
	try {
	    saveToModelFile(element, diagram);
	} catch (Exception e) {
	    Activator.logError("", e);
	}
    }

    /**
     * Add model element to resource. We add the model element to the resource
     * of the diagram for simplicity's sake.
     * 
     * @param element
     * @param diagram
     */
    public static void storeElementInDiagramResource(DiagramElement element, Diagram diagram) {

	diagram.eResource().getContents().add(element);
    }

    /**
     * Gets internal diagram model. (not impro model)
     * 
     * @param diagram
     * @return model of editors diagram
     */
    public static EList<EObject> getModelFor(Diagram diagram) {
	return diagram.eResource().getContents();
    }

    /**
     * Store resource in file
     * 
     * @param obj
     * @param diagram
     * @throws CoreException
     * @throws IOException
     */
    public static void saveToModelFile(final DiagramElement obj, final Diagram diagram) throws CoreException,
	    IOException {
	URI uri = diagram.eResource().getURI();
	uri = uri.trimFragment();
	uri = uri.trimFileExtension();
	uri = uri.appendFileExtension(MODEL_FILE_EXTENSION); //$NON-NLS-1$
	ResourceSet rSet = diagram.eResource().getResourceSet();
	final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	IResource file = workspaceRoot.findMember(uri.toPlatformString(true));
	if (file == null || !file.exists()) {
	    Resource createResource = rSet.createResource(uri);
	    createResource.save(Collections.emptyMap());
	    createResource.setTrackingModification(true);
	}
	final Resource resource = rSet.getResource(uri, true);
	final EList<EObject> contents = resource.getContents();
	if (contents.isEmpty()) {
	    ImproDiagram improDiagram = createRoot(contents);
	    improDiagram.getElements().add(obj);
	    contents.add(improDiagram);
	} else {
	    final EObject eObject = contents.get(0);
	    if (eObject instanceof ImproDiagram) {
		ImproDiagram improDiagram = (ImproDiagram) eObject;
		improDiagram.getElements().add(obj);
	    } else {
		// should not occur
		Activator.logError("Invalid model root", new Throwable());
	    }
	}
    }

    private static ImproDiagram createRoot(EList<EObject> contents) {
	return DiagramFactory.eINSTANCE.createImproDiagram();
    }

    public static Collection<Diagram> getDiagrams(IProject p) {
	final List<IFile> files = getDiagramFiles(p);
	final List<Diagram> diagramList = new ArrayList<Diagram>();
	final ResourceSet rSet = new ResourceSetImpl();
	for (final IFile file : files) {
	    final Diagram diagram = getDiagramFromFile(file, rSet);
	    if (diagram != null) {
		diagramList.add(diagram);
	    }
	}
	return diagramList;
    }

    private static List<IFile> getDiagramFiles(IContainer folder) {
	final List<IFile> ret = new ArrayList<IFile>();
	try {
	    final IResource[] members = folder.members();
	    for (final IResource resource : members) {
		if (resource instanceof IContainer) {
		    ret.addAll(getDiagramFiles((IContainer) resource));
		} else if (resource instanceof IFile) {
		    final IFile file = (IFile) resource;
		    if (file.getName().endsWith(".diagram")) { //$NON-NLS-1$
			ret.add(file);
		    }
		}
	    }
	} catch (final CoreException e) {
	}
	return ret;
    }

    private static Diagram getDiagramFromFile(IFile file, ResourceSet resourceSet) {
	// Get the URI of the model file.
	final URI resourceURI = getFileURI(file, resourceSet);

	// Demand load the resource for this file.
	Resource resource;
	try {
	    resource = resourceSet.getResource(resourceURI, true);
	    if (resource != null) {
		// does resource contain a diagram as root object?
		final EList<EObject> contents = resource.getContents();
		for (final EObject object : contents) {
		    if (object instanceof Diagram) {
			return (Diagram) object;
		    }
		}
	    }
	} catch (final WrappedException e) {
	}

	return null;
    }

    private static URI getFileURI(IFile file, ResourceSet resourceSet) {
	final String pathName = file.getFullPath().toString();
	URI resourceURI = URI.createFileURI(pathName);
	resourceURI = resourceSet.getURIConverter().normalize(resourceURI);
	return resourceURI;
    }

}
