package pl.zgora.uz.imgpro.core.templates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import pl.zgora.uz.imgpro.core.transformation.InvocationChain;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.DirectoryType;
import pl.zgora.uz.imgpro.model.diagram.ExtractFeatures;
import pl.zgora.uz.imgpro.model.diagram.Phase;

public class TemplateHelper {

    /**
     * This method is to obvious for documentation ;)
     */
    public static List<EStructuralFeature> getEffectiveAtributes(
	    DiagramElement element) {
	EList<EAttribute> eAllAttributes = element.eClass().getEAllAttributes();
	ArrayList<EStructuralFeature> atributes = new ArrayList<EStructuralFeature>(
		4);

	final EList<EReference> eAllContainments = element.eClass()
		.getEAllContainments();
	for (EReference a : eAllContainments) {
	    if (DirectoryType.class.equals(a.getEType().getInstanceClass())) {
		atributes.add(a);
	    }
	}

	for (EAttribute eAttribute : eAllAttributes) {
	    final int featureID = eAttribute.getFeatureID();
	    if (DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_NAME == featureID
		    || DiagramPackage.DIAGRAM_ELEMENT__PHASE == featureID
		    || DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_COMMENT == featureID) {
	    } else {
		atributes.add(eAttribute);
	    }
	}

	return atributes;
    }

    /**
     * Declares filelds like: a=4;
     * 
     * @param element
     * @return
     */
    public static String getDelarationDeclarations(DiagramElement element) {
	StringBuffer sb = new StringBuffer();
	final List<EStructuralFeature> effectiveAtributes = getEffectiveAtributes(element);

	for (int i = 0; i < effectiveAtributes.size(); i++) {
	    final EStructuralFeature eAttribute = effectiveAtributes.get(i);
	    if (String.class.equals(eAttribute.getEType().getInstanceClass())) {
		final EList<EAnnotation> eAnnotations = eAttribute
			.getEAnnotations();
		if (eAnnotations == null || eAnnotations.isEmpty()) {
		    sb.append(eAttribute.getName()).append("=").append("\'")
			    .append(element.eGet(eAttribute)).append("\'")
			    .append(";");
		} else {
		    sb.append(eAttribute.getName()).append("=")
			    .append(element.eGet(eAttribute)).append(";");
		}
	    } else if (boolean.class.equals(eAttribute.getEType()
		    .getInstanceClass())) {
		sb.append(eAttribute.getName())
			.append("=")
			.append((Boolean) (element.eGet(eAttribute)) ? "1"
				: "0").append(";");
	    } else if (int.class.equals(eAttribute.getEType()
		    .getInstanceClass())) {
		sb.append(eAttribute.getName()).append("=")
			.append(element.eGet(eAttribute)).append(";");
	    } else if (float.class.equals(eAttribute.getEType()
		    .getInstanceClass())) {
		sb.append(eAttribute.getName()).append("=")
			.append(element.eGet(eAttribute)).append(";");
	    } else if (DirectoryType.class.equals(eAttribute.getEType()
		    .getInstanceClass())) {
		final DirectoryType directory = ((DirInput) element)
			.getDirectory();
		if (directory != null) {
		    sb.append(eAttribute.getName()).append("=")
			    .append("'" + directory.getName() + "'")
			    .append(";");
		} else {
		    throw new IllegalArgumentException();
		}
	    }

	    if (i < effectiveAtributes.size() - 1) {
		sb.append("\n");
	    }
	}
	return sb.toString();
    }

    /**
     * 
     * Return something like var1,var2,var3. Used in method invocations.
     * 
     * @param element
     * @return
     */
    public static String getInputParameters(DiagramElement element) {
	StringBuffer sb = new StringBuffer();
	final List<EStructuralFeature> effectiveAtributes = getEffectiveAtributes(element);
	for (int i = 0; i < effectiveAtributes.size(); i++) {
	    sb.append(effectiveAtributes.get(i).getName());
	    if (i < effectiveAtributes.size() - 1) {
		sb.append(",");
	    }
	}
	return sb.toString();
    }

    /**
     * lists constructor invocations e.g. Car(),Plane() etc.
     * 
     * @param elements
     * @return
     */
    public static String listInvocations(List<DiagramElement> elements) {
	StringBuffer sb = new StringBuffer();
	if (containsMultiplicationElement(elements)) {
	    sb.append("Multiplication(");
	    for (DiagramElement element : elements) {
		if (!isMultiplication(element)) {
		    final String simpleName = element.getClass()
			    .getSimpleName();
		    sb.append(simpleName.substring(0, simpleName.length() - 4))
			    .append("(").append(getInputParameters(element))
			    .append(")").append(",");
		}
	    }
	    return sb.substring(0, sb.length() - 1).toString() + ")";
	} else {
	    for (DiagramElement element : elements) {
		final String simpleName = element.getClass().getSimpleName();
		sb.append(simpleName.substring(0, simpleName.length() - 4))
			.append("(").append(getInputParameters(element))
			.append(")").append(",");
	    }
	    return sb.substring(0, sb.length() - 1).toString();
	}

    }

    /**
     * Returns ExtractFeatures objects from chains
     * 
     * @param invocationsChains
     * @return ExtractFeatures objects list
     */
    public static List<ExtractFeatures> getUniqueFeatures(
	    List<InvocationChain> invocationsChains) {
	List<ExtractFeatures> features = new LinkedList<ExtractFeatures>();
	for (InvocationChain invocationChain : invocationsChains) {
	    if (invocationChain != null) {
		List<DiagramElement> extractions = invocationChain
			.getElements(Phase.FEATURE_EXTRACTION);
		if (extractions != null) {
		    for (DiagramElement extraction : extractions) {
			if (extraction != null) {
			    features.add((ExtractFeatures) extraction);
			}
		    }
		}
	    }

	}
	return reduceDuplicates(features);
    }

    private static List<ExtractFeatures> reduceDuplicates(
	    List<ExtractFeatures> features) {
	HashSet<ExtractFeatures> set = new HashSet<ExtractFeatures>(features);
	return new ArrayList<ExtractFeatures>(set);
    }

    private static boolean containsMultiplicationElement(
	    List<DiagramElement> elements) {
	for (DiagramElement diagramElement : elements) {
	    if (isMultiplication(diagramElement)) {
		return true;
	    }
	}
	return false;
    }

    private static boolean isMultiplication(DiagramElement diagramElement) {
	return DiagramPackage.MULTIPLICATION == diagramElement.eClass()
		.getClassifierID();
    }

    public static String gatherFeatures(int size) {
	StringBuffer sb = new StringBuffer("[");
	for (int i = 0; i < size; i++) {
	    sb.append("features").append(i + 1).append("; ");
	}
	sb.append("];");
	return sb.toString();
    }
}
