package pl.zgora.uz.imgpro.diagram.features.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;

import pl.zgora.uz.imgpro.core.resources.ResourcesCreator;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;

public class DeleteElementFeature extends DefaultDeleteFeature {

    public DeleteElementFeature(IFeatureProvider fp) {
	super(fp);
    }

    
    public void delete(IDeleteContext context) {
	PictogramElement pictogramElement = (context).getPictogramElement();
	Object bo = getBusinessObjectForPictogramElement(pictogramElement);
	if (bo instanceof DiagramElement) {
	    // Remove connections
	    for (DiagramElement element : ((DiagramElement) bo)
		    .getConnectedWith()) {
		final EList<ElementConnection> connections = element
			.getConnections();
		for (int i = 0; i < connections.size(); i++) {
		    DiagramElement target = connections.get(i).getTarget();
		    if (target != null && target.equals(bo)) {
			connections.remove(connections.get(i));
		    }
		}
	    }

	    super.delete(context);

	    // Remove resource
	    if (hasDoneChanges()) {
		removeResource(bo);
	    }
	} else {
	    super.delete(context);
	}
    }

    /**
     * @param context
     */
    @SuppressWarnings("unchecked")
    private void removeResource(Object bo) {

	if (checkIfCanDelete((Class<DiagramElement>) bo.getClass())) {
	    ResourcesCreator.removeResource((DiagramElement) bo,
		    getDiagramEditor());
	}

    }

    /**
     * Checks if diagram contains other model elements with the same class.
     * 
     * @param element
     * @return true if can delete element
     */
    public boolean checkIfCanDelete(Class<DiagramElement> matchedClass) {
	final EList<Shape> children = getDiagram().getChildren();
	for (Shape shape : children) {
	    final DiagramElement bo = (DiagramElement) getFeatureProvider()
		    .getBusinessObjectForPictogramElement(shape);
	    if (bo != null && bo.getClass().equals(matchedClass)) {
		return false;
	    }
	}
	return true;
    }

}
