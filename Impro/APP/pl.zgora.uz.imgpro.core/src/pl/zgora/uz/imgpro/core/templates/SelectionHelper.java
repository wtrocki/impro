package pl.zgora.uz.imgpro.core.templates;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import pl.zgora.uz.imgpro.model.diagram.Classifier;
import pl.zgora.uz.imgpro.model.diagram.CrossValidationType;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.Features;
import pl.zgora.uz.imgpro.model.diagram.ForwardSelection;
import pl.zgora.uz.imgpro.model.diagram.FullSelection;

public class SelectionHelper {

    public static String transformSelections(List<DiagramElement> selections) {
	final String delimiter = "\n";
	StringBuffer sb = new StringBuffer();
	boolean hasBestResults = false;
	for (DiagramElement selection : selections) {
	    if (selection instanceof FullSelection) {
		FullSelection fullSelection = (FullSelection) selection;
		hasBestResults = true;
		CrossValidationType crossValidationType = fullSelection
			.getCrossValidationType();
		EList<Features> features = fullSelection.getFeatures();
		int maximumFeatures = fullSelection.getMaximumFeatures();
		int minimumFeatures = fullSelection.getMinimumFeatures();
		// %[bestScore, bestSet] = FullSearchAllClass(crossVal,
		// features, 2, 3, 'all');
		sb.append("classes={\'" + listFeatures(features) + "\'};");
		sb.append(delimiter);

		sb.append("[bestScore,bestSet] = FullSearchAllClass(");
		sb.append("\'" + crossValidationType.getLiteral() + "\'");
		sb.append(",features," + minimumFeatures).append(
			"," + maximumFeatures);
		sb.append(",classes);");
		sb.append(delimiter);
	    } else if (selection instanceof ForwardSelection) {
		ForwardSelection forwardSelection = (ForwardSelection) selection;
		EList<Classifier> classifiers = forwardSelection
			.getClassifiers();
		EList<Features> features = forwardSelection.getFeatures();
		sb.append("classes={\'" + listFeatures(features) + "\'};");
		sb.append(delimiter);
		CrossValidationType crossValidationType = forwardSelection
			.getCrossValidationType();
		if (hasBestResults) {
		    for (int i = 0; i < classifiers.size(); i++) {
			// ForwardSelection('KNN', crossVal, features, cell(0),
			// 0,
			// 'all');
			sb.append("ForwardSelection(\'"
				+ classifiers.get(i).getLiteral());
			sb.append("\', \'" + crossValidationType.getLiteral());
			sb.append("\',features,");
			sb.append("bestSet{" + (i + 1));
			sb.append("},bestScore(" + (i + 1) + ")");
			sb.append(",classes);");
			sb.append(delimiter);
		    }
		} else {
		    for (Classifier classifier : classifiers) {
			// ForwardSelection('KNN', crossVal, features,
			// bestSet{1},
			// bestScore(1), 'all');
			sb.append("ForwardSelection(\'"
				+ classifier.getLiteral());
			sb.append("\',\'" + crossValidationType.getLiteral());
			sb.append("\',features,");
			sb.append("cell(0), 0");
			sb.append(",classes);");
			sb.append(delimiter);
		    }
		}
	    }
	    sb.append(delimiter);
	}
	return sb.toString();
    }

    private static String listFeatures(EList<Features> features) {
	StringBuffer sb = new StringBuffer();
	for (int i = 0; i < features.size(); i++) {
	    sb.append(features.get(i).getLiteral());
	    if ((i < features.size() - 1))
		sb.append("\',\'");
	}
	return sb.toString();
    }
}
