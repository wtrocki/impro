package pl.zgora.uz.imgpro.core.transformation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.Phase;

public class InvocationChain {

    Map<Phase, List<DiagramElement>> elements = new HashMap<Phase, List<DiagramElement>>();

    public void add(DiagramElement element) {
	List<DiagramElement> list = elements.get(element.getPhase());
	if (list == null) {
	    list = new LinkedList<DiagramElement>();
	    elements.put(element.getPhase(), list);
	}
	if (!list.contains(element)) {
	    list.add(element);
	}
    }

    public List<DiagramElement> getElements(Phase phase) {
	return elements.get(phase);
    }

}
