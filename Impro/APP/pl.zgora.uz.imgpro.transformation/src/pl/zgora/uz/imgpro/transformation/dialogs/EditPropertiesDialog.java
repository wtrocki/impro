/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.dialogs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osgi.framework.Bundle;

/**
 * The role of this dialog is to edit module properties.
 * 
 */
public class EditPropertiesDialog extends Dialog {

    /**
     * The selected module.
     */
    private IConfigurationElement module = null;

    private HashMap<Object, String> propertyMap = null;

    private static boolean edited = false;

    /**
     * Instantiates a property modification dialog.
     * 
     * @param parentShell
     * @param module
     *            the generation module
     * @param savedPropertyMap
     *            the old properties
     */
    public EditPropertiesDialog(Shell parentShell, IConfigurationElement module, Map<Object, String> savedPropertyMap) {
	super(parentShell);
	this.module = module;
	propertyMap = new HashMap<Object, String>();
	if (savedPropertyMap != null) {
	    // init from old properties
	    propertyMap = new HashMap<Object, String>(savedPropertyMap);
	} else {
	    initProperties();
	}
    }

    /* (non-Javadoc) */
    
    public Control createDialogArea(Composite parent) {
	Composite container = new Composite(parent, SWT.NULL);
	container.setFont(parent.getFont());
	try {
	    for (Iterator<Map.Entry<Object, String>> iter = propertyMap.entrySet().iterator(); iter.hasNext();) {
		Map.Entry<Object, String> property = iter.next();
		addPropertyEditor(container, property.getKey().toString(), property.getValue().toString());
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return container;
    }

    /**
     * Creates a single property editor.
     * 
     * @param comp
     * @param labelName
     *            the property label
     * @param defaultValue
     *            the property default value
     */
    private void addPropertyEditor(Composite comp, String labelName, String defaultValue) {
	GridLayout layout = new GridLayout();
	layout.numColumns = 2;
	comp.setLayout(layout);
	Font font = comp.getFont();
	Label label = new Label(comp, SWT.NONE);
	label.setText(labelName);
	GridData gd = new GridData(GridData.BEGINNING);
	label.setLayoutData(gd);
	label.setFont(font);
	Text text = new Text(comp, SWT.SINGLE | SWT.BORDER);
	gd = new GridData(GridData.FILL_HORIZONTAL);
	text.setData(labelName);
	text.setLayoutData(gd);
	text.setFont(font);
	text.setText(defaultValue);
	text.addModifyListener(new ModifyListener() {

	    
	    public void modifyText(ModifyEvent e) {
		propertyMap.put(((Text) e.getSource()).getData(), ((Text) e.getSource()).getText());
		edited = true;
	    }
	});

    }

    /**
     * Creates a property editor for each of module's properties.
     */
    @SuppressWarnings("rawtypes")
    private void initProperties() {
	try {
	    Bundle bundle = Platform.getBundle(module.getNamespaceIdentifier());
	    Enumeration allProperties = bundle.findEntries("/properties", "*.properties", true);

	    // Retrieve plug-in absolute location
	    while (allProperties != null && allProperties.hasMoreElements()) {
		URL propertyFileURL = (URL) allProperties.nextElement();
		if (propertyFileURL != null) {

		    // Get absolute URL of property file
		    URL propertyFileAbsURL = FileLocator.resolve(propertyFileURL);
		    // Get the file itself
		    File propertyFile = new File(propertyFileAbsURL.getPath());

		    if (propertyFile.exists()) {
			if (!propertyFile.getName().equals("build.properties")
				&& !propertyFile.getName().equals("plugin.properties")) {
			    initProperties(propertyFile);
			}
		    }
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    /**
     * Parses a property file to get all properties.
     * 
     * @param propertyFile
     * @throws Exception
     */
    private void initProperties(File propertyFile) throws Exception {
	BufferedReader reader = null;
	reader = new BufferedReader(new FileReader(propertyFile));
	String propertyLine;
	ArrayList<String> lines = new ArrayList<String>();
	while ((propertyLine = reader.readLine()) != null) {
	    if (!propertyLine.startsWith("#")) {
		lines.add(propertyLine);
	    }
	}
	Collections.sort(lines);
	for (Iterator<String> iter = lines.iterator(); iter.hasNext();) {
	    propertyLine = iter.next();
	    String name = propertyLine.split("=")[0];
	    String defaultValue = propertyLine.split("=")[1];
	    propertyMap.put(name, defaultValue);
	}
	reader.close();
    }

    /**
     * Returns the property Map if necessary.
     * 
     * @return the property Map
     */
    public Map<Object, String> getPropertyMap() {
	if (edited) {
	    return propertyMap;
	}
	return null;
    }

}
