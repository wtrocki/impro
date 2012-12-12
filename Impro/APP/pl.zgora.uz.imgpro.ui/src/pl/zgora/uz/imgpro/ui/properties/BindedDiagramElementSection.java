/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import pl.zgora.uz.imgpro.ui.properties.composite.AbstractImproPropertiesComposite;
import pl.zgora.uz.imgpro.ui.properties.composite.ImproPropertiesComposite;

public class BindedDiagramElementSection extends GFPropertySection implements ITabbedPropertyConstants {

    private AbstractImproPropertiesComposite composite;

    
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
	super.createControls(parent, aTabbedPropertySheetPage);
	parent.setLayout(new FillLayout());
	composite = new ImproPropertiesComposite(parent, SWT.None);
    }

    
    public void refresh() {
	PictogramElement pe = getSelectedPictogramElement();
	if (pe != null) {
	    final PictogramLink link = pe.getLink();
	    if (link != null) {
		final EList<EObject> businessObjects = link.getBusinessObjects();
		if (!businessObjects.isEmpty()) {
		    // get and use only first selected elementtr
		    final EObject be = businessObjects.get(0);
		    final IDiagramEditor diagramEditor = getDiagramEditor();
		    updateComposite(be, diagramEditor);
		}
	    }
	}
    }

    private void updateComposite(EObject be, IDiagramEditor diagramEditor) {
	composite.setEObject(be);
	composite.setDiagramEditor(diagramEditor);
    }

}
