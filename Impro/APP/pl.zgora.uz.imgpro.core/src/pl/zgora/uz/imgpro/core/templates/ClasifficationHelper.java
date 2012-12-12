package pl.zgora.uz.imgpro.core.templates;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.ClassificationStyle;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.Features;

public class ClasifficationHelper {

    public static String transformClassifications(
	    List<DiagramElement> selections) {
	final String delimiter = "\n";
	StringBuffer sb = new StringBuffer();

	for (DiagramElement selection : selections) {
	    if (selection instanceof Classification) {
		// Classify(features, style, 'Area_mean');
		Classification classification = (Classification) selection;
		ClassificationStyle style = classification
			.getClassificationStyle();
		EList<Features> features = classification.getFeatures();
		sb.append("style=\'" + style.getLiteral() + "\';");
		sb.append(delimiter);
		for (Features feature : features) {
		    sb.append("Classification(features,style,\'");
		    sb.append(feature.getLiteral());
		    sb.append("\');");
		    sb.append(delimiter);
		}
	    }
	}
	return sb.toString();
    }
}
