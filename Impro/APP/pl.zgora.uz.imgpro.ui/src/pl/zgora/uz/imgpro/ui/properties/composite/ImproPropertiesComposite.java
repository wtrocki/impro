/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.properties.composite;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import pl.zgora.uz.imgpro.model.diagram.ClassificationStyle;
import pl.zgora.uz.imgpro.model.diagram.Classifier;
import pl.zgora.uz.imgpro.model.diagram.CrossValidationType;
import pl.zgora.uz.imgpro.model.diagram.DirectoryType;
import pl.zgora.uz.imgpro.model.diagram.Features;
import pl.zgora.uz.imgpro.model.diagram.Phase;
import pl.zgora.uz.imgpro.model.diagram.provider.DiagramItemProviderAdapterFactory;

public class ImproPropertiesComposite extends AbstractImproPropertiesComposite {

    public ImproPropertiesComposite(Composite parent, int style) {
	super(parent, style);
    }

    
    public void createBindings() {
	ItemProviderAdapter itemProviderAdapter = (ItemProviderAdapter) new DiagramItemProviderAdapterFactory()
		.adapt(be, ItemProviderAdapter.class);

	EList<EAttribute> eAllAttributes = be.eClass().getEAllAttributes();
	for (EAttribute a : eAllAttributes) {
	    IItemPropertyDescriptor propertyDescriptor = itemProviderAdapter
		    .getPropertyDescriptor(be, a);
	    if (String.class.equals(a.getEType().getInstanceClass())) {
		bind(a,
			createTextInput(propertyDescriptor.getDisplayName(be),
				propertyDescriptor.isMultiLine(be), true));
	    } else if (boolean.class.equals(a.getEType().getInstanceClass())) {
		bindBoolean(a,
			createBooleanInput(propertyDescriptor
				.getDisplayName(be)));
	    } else if (int.class.equals(a.getEType().getInstanceClass())) {
		bindInt(a,
			createIntInput(propertyDescriptor.getDisplayName(be)));
	    } else if (CrossValidationType.class.equals(a.getEType()
		    .getInstanceClass())) {
		final ComboViewer comboBoxInput = createComboBoxInput(propertyDescriptor
			.getDisplayName(be));
		final String propertyName = "crossValidationType";
		bindEnumToCombo(comboBoxInput, propertyName,
			CrossValidationType.values());
	    } else if (ClassificationStyle.class.equals(a.getEType()
		    .getInstanceClass())) {
		final ComboViewer comboBoxInput = createComboBoxInput(propertyDescriptor
			.getDisplayName(be));
		final String propertyName = "classificationStyle";
		bindEnumToCombo(comboBoxInput, propertyName,
			ClassificationStyle.values());
	    } else if (Phase.class.equals(a.getEType().getInstanceClass())) {
		Text textInput = createTextInput("Processing Phase", false,
			false);
		textInput.setText(be.eGet(a).toString());
	    } else if (Features.class.equals(a.getEType().getInstanceClass())) {
		createLabel("Features");
		if (editor != null) {
		    FeaturesListWithBinding list = new FeaturesListWithBinding(
			    this, a, editor.getEditingDomain(), be,
			    bindingContext);
		    widgets.add(list);
		    list.setLayout(new GridLayout());
		    list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
			    true, 1, 1));
		}
	    } else if (Classifier.class.equals(a.getEType().getInstanceClass())) {
		createLabel("Classifiers");
		if (editor != null) {
		    ClassifiersListWithBinding list = new ClassifiersListWithBinding(
			    this, a, editor.getEditingDomain(), be,
			    bindingContext);
		    widgets.add(list);
		    list.setLayout(new GridLayout());
		    list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
			    true, 1, 1));
		}
	    }
	}

	final EList<EReference> eAllContainments = be.eClass()
		.getEAllContainments();
	for (EReference a : eAllContainments) {
	    if (DirectoryType.class.equals(a.getEType().getInstanceClass())) {
		IItemPropertyDescriptor propertyDescriptor = itemProviderAdapter
			.getPropertyDescriptor(be, a);
		bind(a, createPathInput(propertyDescriptor.getDisplayName(be)));
	    }
	}
    }
}
