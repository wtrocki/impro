/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import pl.zgora.uz.imgpro.ui.Activator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class GeneralPreferencePage extends FieldEditorPreferencePage implements
	IWorkbenchPreferencePage {

    public GeneralPreferencePage() {
	super(GRID);
	setPreferenceStore(Activator.getDefault().getPreferenceStore());
	setDescription("Impro general preference page");
    }

    /**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     */
    
    public void createFieldEditors() {
	final Composite fieldEditorParent = getFieldEditorParent();

	final StringFieldEditor sourceEditor = new StringFieldEditor(
		PreferenceConstants.MATLAB_SOURCE_FOLDER,
		"  &Source folder for matlab files:  ", fieldEditorParent);
	addField(sourceEditor);
	sourceEditor.setEmptyStringAllowed(false);
	sourceEditor.setPropertyChangeListener(this);

	final StringFieldEditor outputEditor = new StringFieldEditor(
		PreferenceConstants.OUTPUT_FOLDER,
		"  &Output folder for images:  ", fieldEditorParent);
	addField(outputEditor);
	outputEditor.setEmptyStringAllowed(false);
	outputEditor.setPropertyChangeListener(this);

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
    }

    
    public void propertyChange(PropertyChangeEvent event) {
	// For all current properties.
	String newVal = ((String) event.getNewValue());
	if (newVal.contains("/") || newVal.contains("\\")) {
	    setErrorMessage("Path must be a folder");
	} else {
	    setErrorMessage(null);
	}

	super.propertyChange(event);
    }

}