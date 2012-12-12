package pl.zgora.uz.imgpro.diagram.panel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class RenameHelper {

    private final Diagram diagram;
    private final IFeatureProvider featureProvider;

    public RenameHelper(Diagram diagram, IFeatureProvider featureProvider) {
	this.diagram = diagram;
	this.featureProvider = featureProvider;
    }

    /**
     * @param newName
     * @param children
     * @return
     */
    public String generateName(String newName) {
	final EList<Shape> children = getDiagram().getChildren();
	for (Shape shape : children) {
	    final DiagramElement bo = (DiagramElement) getFeatureProvider()
		    .getBusinessObjectForPictogramElement(shape);
	    if (newName.equals(bo.getElementName())) {
		newName = (appendNumber(newName));
		generateName(newName);
	    }
	}
	return newName;
    }

    /**
     * @param element
     * @param children
     */
    public void fillName(DiagramElement element) {
	final EList<Shape> children = getDiagram().getChildren();
	for (Shape shape : children) {
	    Object eBo = getFeatureProvider()
		    .getBusinessObjectForPictogramElement(shape);
	    if (eBo instanceof DiagramElement) {
		final DiagramElement bo = (DiagramElement) eBo;
		String elementName = element.getElementName();
		if (elementName.equals(bo.getElementName())) {
		    element.setElementName(appendNumber(elementName));
		    fillName(element);
		}
	    }
	}
    }

    private String appendNumber(String elementName) {
	char[] charArray = elementName.toCharArray();
	int index = 0;
	for (int i = charArray.length - 1; i >= 0; i--) {
	    if (Character.isDigit(charArray[i])) {
		index++;
	    } else {
		break;
	    }
	}
	final int separator = elementName.length() - index;
	final String subSequence = elementName.substring(separator,
		elementName.length());
	if (subSequence.length() != 0) {
	    return elementName.substring(0, separator)
		    + (Integer.valueOf(subSequence) + 1);
	} else {
	    return elementName.substring(0, separator) + 1;
	}
    }

    public IFeatureProvider getFeatureProvider() {
	return featureProvider;
    }

    public Diagram getDiagram() {
	return diagram;
    }

}
