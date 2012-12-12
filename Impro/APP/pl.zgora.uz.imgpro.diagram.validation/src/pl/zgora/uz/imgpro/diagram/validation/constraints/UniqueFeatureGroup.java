package pl.zgora.uz.imgpro.diagram.validation.constraints;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.ExtractFeatures;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;

/**
 * Check for unique classification groups in extract features elements
 * 
 * @author troken
 * 
 */
public class UniqueFeatureGroup extends AbstractModelConstraint {

    public UniqueFeatureGroup() {
    }

    
    public IStatus validate(IValidationContext ctx) {
	EObject target = ctx.getTarget();
	if (target instanceof ImproDiagram) {
	    ImproDiagram improDiagram = (ImproDiagram) target;
	    List<String> groups = new ArrayList<String>();
	    EList<DiagramElement> elementsOfClass = improDiagram
		    .getElementsOfClass(ExtractFeatures.class);
	    for (DiagramElement diagramElement : elementsOfClass) {
		final String classificationGroup = ((ExtractFeatures) diagramElement)
			.getClassificationGroup();
		if (groups.contains(classificationGroup)) {
		    return ctx.createFailureStatus();
		}
		groups.add(classificationGroup);
	    }
	}
	return ctx.createSuccessStatus();
    }

}
