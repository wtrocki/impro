package pl.zgora.uz.imgpro.core.transformation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import pl.zgora.uz.imgpro.core.helpers.CommonValidator;
import pl.zgora.uz.imgpro.core.resources.ResourcesCreator;
import pl.zgora.uz.imgpro.core.templates.GroupConventer;
import pl.zgora.uz.imgpro.core.templates.MainScriptTemplate;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;
import pl.zgora.uz.imgpro.transformation.Activator;

public class TransformationJob extends WorkspaceJob {

    private final Object source;
    private final IContainer container;

    private final List<InvocationChain> invocationsChains = new ArrayList<InvocationChain>();

    public TransformationJob(final Object source, final IContainer container) {
	super("Generating matlab source code");
	this.source = source;
	this.container = container;
    }

    
    public IStatus runInWorkspace(IProgressMonitor monitor)
	    throws CoreException {
	if (source instanceof IFile) {
	    IFile modelFile = (IFile) source;
	    XMIResource resource = new XMIResourceImpl(
		    URI.createFileURI(modelFile.getLocation().toOSString()));
	    try {
		resource.load(null);
	    } catch (IOException e) {
		Activator.log(e);
	    }
	    final EList<EObject> contents = resource.getContents();
	    if (contents.size() == 1) {
		ImproDiagram diagram = (ImproDiagram) contents.get(0);
		List<DiagramElement> inputs = collectStartingPoints(diagram);
		final IStatus validationStatus = validate(diagram);
		if (validationStatus.isOK()) {
		    buildSources(container, modelFile, inputs);
		}
	    }
	}
	return Status.OK_STATUS;
    };

    /**
     * @param diagram
     * @return
     */
    private IStatus validate(final ImproDiagram diagram) {
	final ValidationRunnable runnable = new ValidationRunnable(diagram);
	Display.getDefault().syncExec(runnable);
	return runnable.getResult();
    }

    /**
     * @param container
     * @param modelFile
     * @param inputs
     * @throws CoreException
     */
    private void buildSources(final IContainer container, IFile modelFile,
	    List<DiagramElement> inputs) throws CoreException {
	for (DiagramElement diagramElement : inputs) {
	    invocationsChains.add(buildInvocationChain(diagramElement));
	}

	String mainScriptTemplateContent = MainScriptTemplate.create(null)
		.generate(invocationsChains);
	createSourceFile(container, mainScriptTemplateContent,
		modelFile.getName(), true);

	String groupConventerContent = GroupConventer.create(null).generate(
		invocationsChains);
	createSourceFile(container, groupConventerContent,
		GroupConventer.class.getSimpleName(), false);
    }

    /**
     * @param container
     * @param iFile
     * @param fileContent
     * @throws RuntimeException
     * @throws CoreException
     */
    private void createSourceFile(final IContainer container,
	    String fileContent, String name, boolean canOpenEditor)
	    throws RuntimeException, CoreException {
	if (fileContent.isEmpty()) {
	    throw new RuntimeException(
		    "Empty file content. Check if elements have properly defined phases and properties.");
	}
	final IFile createdFile = ResourcesCreator.createFile(fileContent,
		container, name);
	container.refreshLocal(IResource.DEPTH_INFINITE,
		new NullProgressMonitor());
	if (canOpenEditor)
	    openEditor(createdFile);
    }

    /**
     * @param createdFile
     */
    private void openEditor(final IFile createdFile) {
	if (createdFile != null & createdFile.exists()) {
	    final IWorkbenchWindow[] workbenchWindows = PlatformUI
		    .getWorkbench().getWorkbenchWindows();
	    if (workbenchWindows.length > 0) {
		final IWorkbenchPage activePage = workbenchWindows[0]
			.getActivePage();

		Display.getDefault().syncExec(new Runnable() {
		    
		    public void run() {
			try {
			    IDE.openEditor(activePage, createdFile);
			} catch (PartInitException e) {
			    Activator.log(e);
			}
		    }
		});
	    }
	}
    }

    private InvocationChain buildInvocationChain(DiagramElement firstElement) {
	InvocationChain chain = new InvocationChain();
	chain.add(firstElement);
	addNext(firstElement, chain);
	return chain;
    }

    private void addNext(DiagramElement element, InvocationChain chain) {
	final EList<ElementConnection> connections = element.getConnections();
	for (ElementConnection connection : connections) {
	    if (connection != null) {
		final DiagramElement target = connection.getTarget();
		if (target != null) {
		    chain.add(target);
		    addNext(target, chain);
		}
	    }
	}

    }

    private List<DiagramElement> collectStartingPoints(ImproDiagram diagram) {
	List<DiagramElement> startingPoints = new ArrayList<DiagramElement>();
	for (DiagramElement element : diagram.getElements()) {
	    if (element instanceof DirInput)
		startingPoints.add(element);
	}
	return startingPoints;
    }

    private class ValidationRunnable implements Runnable {

	private IStatus performGeneration;
	private final ImproDiagram diagram;

	public ValidationRunnable(ImproDiagram diagram) {
	    this.diagram = diagram;
	}

	
	public void run() {
	    performGeneration = CommonValidator.performValidation(diagram);
	}

	public IStatus getResult() {
	    return performGeneration;
	}
    }

}
