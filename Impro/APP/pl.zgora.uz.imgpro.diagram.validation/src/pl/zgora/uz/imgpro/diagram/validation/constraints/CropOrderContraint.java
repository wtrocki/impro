package pl.zgora.uz.imgpro.diagram.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import pl.zgora.uz.imgpro.model.diagram.Crop;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;
import pl.zgora.uz.imgpro.model.diagram.Vignetting;

public class CropOrderContraint extends AbstractModelConstraint {

    public CropOrderContraint() {
	// TODO Auto-generated constructor stub
    }

    @Override
    public IStatus validate(IValidationContext ctx) {
	final EObject target = ctx.getTarget();
	if (target instanceof Crop) {
	    Crop crop = (Crop) target;
	    final DiagramElement viniettingElement = findVignetting(crop);
	    if (viniettingElement != null) {
		return ctx.createFailureStatus();
	    }
	}
	return ctx.createSuccessStatus();
    }

    private DiagramElement findVignetting(DiagramElement element) {
	if (element != null) {
	    final EList<ElementConnection> connections = element
		    .getConnections();
	    DiagramElement result = null;
	    for (ElementConnection connection : connections) {
		result = connection.getTarget();
		if (result instanceof Vignetting) {
		    return result;
		}
		result = findVignetting(result);
	    }
	    return result;
	}
	return null;
    }

}
