/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;

public class DiagramElementSection extends GFPropertySection implements
	ITabbedPropertyConstants {

    private Text nameText;

    
    public void createControls(Composite parent,
	    TabbedPropertySheetPage tabbedPropertySheetPage) {
	super.createControls(parent, tabbedPropertySheetPage);
	TabbedPropertySheetWidgetFactory factory = getWidgetFactory();

	Composite composite = factory.createComposite(parent);

	GridLayout gd = new GridLayout(2, false);
	composite.setLayout(gd);

	final GridData layoutData = new GridData(SWT.NONE, SWT.NONE, true,
		false, 2, 1);
	factory.createLabel(composite, "Impro General Settings:")
		.setLayoutData(layoutData);
	factory.createSeparator(composite, SWT.HORIZONTAL).setLayoutData(
		new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
	createEmptySeparator(factory, composite);

	CLabel valueLabel = factory.createCLabel(composite, "Element Name:"); //$NON-NLS-1$
	valueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
		false));

	nameText = factory.createText(composite, ""); //$NON-NLS-1$
	nameText.setEditable(true);
	nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	createEmptySeparator(factory, composite);

	createListeners();
    }

    /**
     * @param factory
     * @param composite
     */
    private void createEmptySeparator(TabbedPropertySheetWidgetFactory factory,
	    Composite composite) {
	factory.createLabel(composite, "").setLayoutData(
		new GridData(SWT.NONE, SWT.NONE, true, false, 2, 1));
    }

    protected void createListeners() {
	nameText.addVerifyListener(new VerifyListener() {

	    public void verifyText(VerifyEvent e) {
		final String text = ((Text) e.getSource()).getText();
		final EObject model = getModel();
		if (model instanceof DiagramElement) {
		    DiagramElement diagramElement = (DiagramElement) model;
		    diagramElement.setElementName(text);
		}
	    }
	});

    }

    
    public void refresh() {
	final EObject bo = getModel();
	// the filter assured, that it is a EClass
	if (bo == null)
	    return;
	if (bo instanceof DiagramElement) {
	    String name = ((DiagramElement) bo).getElementName();
	    nameText.setText(name == null ? "" : name); //$NON-NLS-1$
	}
    }

    /**
     * @return model for selected pictogram element
     */
    protected EObject getModel() {
	PictogramElement pe = getSelectedPictogramElement();
	if (pe != null) {
	    return Graphiti.getLinkService()
		    .getBusinessObjectForLinkedPictogramElement(pe);
	}
	return null;
    }

}
