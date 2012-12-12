package pl.zgora.uz.imgpro.diagram.features.links;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;

public class CycleValidator {

    static HashSet<DiagramElement> nodesSeen = new HashSet<DiagramElement>();

    /**
     * Szukam cykli w grafie.
     */
    public CycleValidator() {
    }

    public static boolean elementHasLoop(DiagramElement element) {
	nodesSeen = new HashSet<DiagramElement>();
	if (hasLoop(element)) {
	    nodesSeen = null;
	    return true;
	}
	return false;
    }

    private static boolean hasLoop(DiagramElement startNode) {
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
