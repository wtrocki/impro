/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.properties;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class DiagramElementExecutionSection extends GFPropertySection implements ITabbedPropertyConstants {

    
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
	super.createControls(parent, tabbedPropertySheetPage);
	TabbedPropertySheetWidgetFactory factory = getWidgetFactory();

	Composite composite = factory.createComposite(parent);

	GridLayout gd = new GridLayout(2, false);
	composite.setLayout(gd);

	final GridData layoutData = new GridData(SWT.NONE, SWT.NONE, true, false, 2, 1);
	factory.createLabel(composite, "Impro Matlab Execution Settings: (TODO)").setLayoutData(layoutData);
	factory.createSeparator(composite, SWT.HORIZONTAL).setLayoutData(
		new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
	createEmptySeparator(factory, composite);
    }

    /**
     * @param factory
     * @param composite
     */
    private void createEmptySeparator(TabbedPropertySheetWidgetFactory factory, Composite composite) {
	factory.createLabel(composite, "").setLayoutData(new GridData(SWT.NONE, SWT.NONE, true, false, 2, 1));
    }

    
    public void refresh() {
	PictogramElement pe = getSelectedPictogramElement();
	if (pe != null) {
	    Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
	    // the filter assured, that it is a EClass
	    if (bo == null)
		return;
	}
    }
}
