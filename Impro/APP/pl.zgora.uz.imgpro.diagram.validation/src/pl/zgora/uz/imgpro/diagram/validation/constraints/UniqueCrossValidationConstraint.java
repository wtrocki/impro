package pl.zgora.uz.imgpro.diagram.validation.constraints;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import pl.zgora.uz.imgpro.model.diagram.CrossValidationType;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.ForwardSelection;
import pl.zgora.uz.imgpro.model.diagram.FullSelection;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;

public class UniqueCrossValidationConstraint extends AbstractModelConstraint {

    public UniqueCrossValidationConstraint() {
    }

    
    public IStatus validate(IValidationContext ctx) {
	EObject target = ctx.getTarget();
	if (target instanceof ImproDiagram) {
	    ImproDiagram improDiagram = (ImproDiagram) target;
	    List<CrossValidationType> groups = new ArrayList<CrossValidationType>();
	    EList<DiagramElement> elementsOfClass = improDiagram
		    .getElementsOfClass(ForwardSelection.class);
	    elementsOfClass.addAll(improDiagram
		    .getElementsOfClass(FullSelection.class));
	    for (DiagramElement diagramElement : elementsOfClass) {
		CrossValidationType crossValidationType = null;
		if (diagramElement instanceof ForwardSelection) {
		    ForwardSelection forwardSelection = (ForwardSelection) diagramElement;
		    crossValidationType = forwardSelection
			    .getCrossValidationType();
		} else if (diagramElement instanceof FullSelection) {
		    FullSelection fullSelection = (FullSelection) diagramElement;
		    crossValidationType = fullSelection
			    .getCrossValidationType();
		}
		if (!groups.isEmpty()) {
		    if (!groups.contains(crossValidationType)) {
			return ctx.createFailureStatus();
		    }
		}
		groups.add(crossValidationType);
	    }
	}
	return ctx.createSuccessStatus();
    }
}
