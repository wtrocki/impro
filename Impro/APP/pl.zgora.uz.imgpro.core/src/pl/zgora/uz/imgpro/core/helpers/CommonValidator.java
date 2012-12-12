package pl.zgora.uz.imgpro.core.helpers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ITraversalStrategy;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;

import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;

/**
 * Common validator used to call validation process and retrieve validation
 * results
 * 
 * @author troken
 */
public class CommonValidator {

    /**
     * 
     * @param diagram
     *            list with object to validate
     * @return
     */
    public static IStatus performValidation(ImproDiagram diagram) {
	List<EObject> validation = new ArrayList<EObject>(diagram.getElements());
	validation.add(diagram);
	IBatchValidator validator = ModelValidationService.getInstance()
		.newValidator(EvaluationMode.BATCH);

	// track the validated resources for accurate problem-marker updates
	// validator.setOption(IBatchValidator.OPTION_TRACK_RESOURCES, true);
	validator.setOption(IBatchValidator.OPTION_TRAVERSAL_STRATEGY,
		new ITraversalStrategy.Flat());
	final IStatus status = validator.validate(validation);
	final Shell shell = getShell();
	if (status.isOK()) {
	    // MessageDialog.openInformation(shell, "Success",
	    // "No errors in model");
	} else {
	    ListDialog dialog = new ListDialog(shell);
	    dialog.setInput(status);
	    dialog.setTitle("Validation Errors");
	    dialog.setContentProvider(new IStructuredContentProvider() {
		
		public void dispose() {
		    // nothing to dispose
		}

		
		public Object[] getElements(Object inputElement) {
		    if (status != null && status.isMultiStatus()
			    && status == inputElement) {
			return status.getChildren();
		    } else if (status != null && status == inputElement) {
			return new Object[] { status };
		    }
		    return new Object[0];
		}

		
		public void inputChanged(Viewer viewer, Object oldInput,
			Object newInput) {
		    // Do nothing.
		}
	    });
	    dialog.setLabelProvider(new LabelProvider() {
		
		public String getText(Object element) {
		    if (element instanceof IStatus) {
			return ((IStatus) element).getMessage();
		    }
		    return null;
		}
	    });
	    dialog.setBlockOnOpen(true);
	    dialog.setMessage("Error in validation");

	    if (Window.OK == dialog.open()) {
		Set<EObject> errorSelections = new HashSet<EObject>();
		if (!status.isMultiStatus()) {
		    IConstraintStatus cstatus = (IConstraintStatus) status;
		    errorSelections.add(cstatus.getTarget());
		} else {
		    IStatus[] children = status.getChildren();
		    for (IStatus element : children) {
			IConstraintStatus cstatus = (IConstraintStatus) element;
			errorSelections.add(cstatus.getTarget());
		    }
		}
	    }
	}
	return status;
    }

    private static Shell getShell() {
	final IWorkbenchWindow[] workbenchWindows = PlatformUI.getWorkbench()
		.getWorkbenchWindows();
	if (workbenchWindows.length > 0)
	    return workbenchWindows[0].getShell();
	else
	    return Display.getDefault().getActiveShell();
    }
}
