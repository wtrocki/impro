package pl.zgora.uz.imgpro.diagram.validation.constraints;

import java.util.HashSet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;

public class AscCycleConstraint extends AbstractModelConstraint {

    HashSet<DiagramElement> nodesSeen = new HashSet<DiagramElement>();

    /**
     * Szukam cykli w grafie.
     */
    public AscCycleConstraint() {
    }

    
    public IStatus validate(IValidationContext ctx) {
	final EObject target = ctx.getTarget();
	if (target instanceof DirInput) {
	    final IStatus canProcess = canProcess(ctx, target);
	    if (canProcess != null) {
		return canProcess;
	    }
	}
	return ctx.createSuccessStatus();
    }

    /**
     * @param ctx
     * @param target
     * @return
     */
    private IStatus canProcess(IValidationContext ctx, final EObject target) {
	nodesSeen = new HashSet<DiagramElement>();

	DiagramElement startingPoint = (DiagramElement) target;
	if (hasLoop(startingPoint)) {
	    nodesSeen = null;
	    return ctx.createFailureStatus();
	}
	return ctx.createSuccessStatus();
    }

    public boolean hasLoop(DiagramElement startNode) {
	boolean hasLoop = false;
	if (nodesSeen.contains(startNode)) {
	    return true;
	}
	nodesSeen.add(startNode);
	if (startNode != null) {
	    final EList<ElementConnection> connections = startNode
		    .getConnections();
	    for (ElementConnection elementConnection : connections) {
		hasLoop = hasLoop(elementConnection.getTarget());
	    }
	    if (connections.isEmpty()) {
		nodesSeen.clear();
	    }
	}
	return hasLoop;
    }

}
