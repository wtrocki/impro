package pl.zgora.uz.imgpro.diagram.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;

public class PhaseConstraint extends AbstractModelConstraint {

    public PhaseConstraint() {
    }

    
    public IStatus validate(IValidationContext ctx) {
	final EObject target = ctx.getTarget();
	if (target instanceof DirInput) {
	    DirInput input = (DirInput) target;
	    if (processingContainsInvalidPhase(input)) {
		return ctx.createFailureStatus();
	    }
	}
	return ctx.createSuccessStatus();
    }

    private boolean processingContainsInvalidPhase(DiagramElement element) {
	if (element != null) {
	    final EList<ElementConnection> connections = element
		    .getConnections();
	    for (ElementConnection connection : connections) {
		DiagramElement target = connection.getTarget();
		if (target != null) {
		    if (isPreccedingPhase(element, target)) {
			return true;
		    }
		}
		processingContainsInvalidPhase(target);
	    }
	}
	return false;
    }

    /**
     * @param element
     * @param target
     * @return
     */
    private boolean isPreccedingPhase(DiagramElement element,
	    DiagramElement target) {
	final boolean invalidOrder = element.getPhase().ordinal() > target
		.getPhase().ordinal();
	return invalidOrder;
    }

}
