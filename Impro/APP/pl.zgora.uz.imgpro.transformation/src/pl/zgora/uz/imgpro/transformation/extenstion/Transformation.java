/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.extenstion;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.graphics.Image;

import pl.zgora.uz.imgpro.transformation.Activator;

/**
 * Extension Point for transformations in Papyrus
 */
public class Transformation extends AbstractExtensionPoint {

    /** Array that stores registered transformations */
    private static Transformation[] transformations;

    /** the extension to "parse" */
    public final IConfigurationElement configElement;

    /** the value of the id attribute */
    private final String id;

    /** value of the name attribute */
    private final String name;

    /** the value of the description attribute */
    private final String description;

    /** the value of the icon path attribute */
    private final String iconPath;

    /** value of the module attribute */
    private final String moduleName;

    /** instance of the associated module */
    private ITransformationModule moduleInstance;

    /** instance of the dialog for advanced properties */
    private Dialog dialogInstance;

    /** name of the dialog for advanced properties */
    private final String propertiesDialogName;

    /** boolean that indicates that the module has already been retrieved */
    private boolean moduleRetrieved = false;

    /**
     * boolean that indicates that the dialog for advanced properties has
     * already been retrieved
     */
    private boolean dialogRetrieved = false;

    /**
     * Get the image associated too the transformation
     * 
     * @return an icon for the transformation
     */
    public Image getImage() {
	return getImage(iconPath, configElement);
    }

    /**
     * Returns the set of transformations registered in the platform
     * 
     * @return the set of transformations registered in the platform
     */
    public static Transformation[] getRegisteredTransformations() {

	// Computed only once
	if (transformations != null) {
	    return transformations;
	}

	// It was not already computed,
	// returns the new Collection of Transformation
	List<Transformation> transfos = new ArrayList<Transformation>();

	// Reading data from plug-ins
	IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(
		TransformationExtIds.TRANSFORMATION_EXTENSION_ID);

	// Read configuration elements for the current extension
	for (int j = 0; j < configElements.length; j++) {
	    Transformation proxy = parseTransformationExtension(configElements[j]);

	    if (proxy != null) {
		transfos.add(proxy);
	    }
	} // end of configElements loop

	transformations = transfos.toArray(new Transformation[transfos.size()]);
	return transformations;
    }

    /**
     * Returns a transformation, given elements from the ConfigurationElement
     * 
     * @param configElt
     *            the element that declares the extension
     * @return a new transformation, given the information of the specified
     *         configElt
     */
    public static Transformation parseTransformationExtension(IConfigurationElement configElt) {

	// check that the ConfigElement is a transformation
	if (!configElt.getName().equals(TransformationExtIds.TAG_TRANSFORMATION)) {
	    return null;
	}
	// this is a transformation, tries to parse extension, and create the
	// java corresponding
	// class
	try {
	    return new Transformation(configElt);
	} catch (Exception e) {

	    String name = configElt.getAttribute(TransformationExtIds.ATT_ID);
	    if (name == null) {
		name = "[missing id attribute]";
	    }
	    String msg = "Failed to load language with id " + name + " in "
		    + configElt.getDeclaringExtension().getExtensionPointUniqueIdentifier();

	    Activator.log(msg, e);
	    return null;
	}
    }

    /**
     * Creates a new Transformation, according to the ConfigurationElement
     * 
     * @param configElt
     *            the configuration element corresponding to the transformation
     */
    public Transformation(IConfigurationElement configElt) {
	this.configElement = configElt;

	id = getAttribute(configElt, TransformationExtIds.ATT_ID, "undefined", true); // should
										      // already
										      // be
										      // a
										      // string
	name = getAttribute(configElt, TransformationExtIds.ATT_NAME, "undefined", true); // should
											  // already
											  // be
											  // a
											  // string
	description = getAttribute(configElt, TransformationExtIds.ATT_DESCRIPTION, null, false); // should
												  // already
												  // be
												  // a
												  // string
	moduleName = getAttribute(configElt, TransformationExtIds.ATT_MODULE, null, true);
	iconPath = getAttribute(configElt, TransformationExtIds.ATT_ICON, null, false);
	propertiesDialogName = getAttribute(configElt, TransformationExtIds.ATT_PROPERTIES_DIALOG, null, false);

    }

    /**
     * Default constructor
     */
    public Transformation() {
	this.configElement = null;
	id = "undefined";
	name = "undefined";
	description = "undefined";
	moduleName = "undefined";
	iconPath = "undefined";
	propertiesDialogName = "undefined";
    }

    /**
     * Returns the description of the transformation
     * 
     * @return the description of the transformation
     */
    public String getDescription() {
	return description;
    }

    /**
     * Returns the id of the transformation
     * 
     * @return the id of the transformation
     */
    public String getId() {
	return id;
    }

    /**
     * Returns the qualified name of the module
     * 
     * @return the qualified name of the module
     */
    public String getModuleName() {
	return moduleName;
    }

    /**
     * Returns the icon name of the module
     * 
     * @return the icon name of the module
     */
    public String getIconPath() {
	return iconPath;
    }

    /**
     * Returns the instance of the module
     * 
     * @return the instance of the module
     */
    private ITransformationModule getModuleInstance() {
	try {
	    ITransformationModule module = null;
	    if (moduleName != null) {
		module = (ITransformationModule) configElement
			.createExecutableExtension(TransformationExtIds.ATT_MODULE);
	    }
	    return module;

	} catch (Exception e) {
	    Activator.log("could not get transformation instance", e);
	    return null;
	}
    }

    /**
     * Returns the unique instance of the module. it is created if necessary.
     * 
     * @return the unique instance of the module
     */
    public ITransformationModule getModule() {
	if (!moduleRetrieved) {
	    moduleInstance = getModuleInstance();
	    moduleRetrieved = true;
	}
	return moduleInstance;
    }

    /**
     * Returns the name of dialog for advanced properties
     * 
     * @return the name of dialog for advanced properties
     */
    public String getPropertiesDialogName() {
	return propertiesDialogName;
    }

    /**
     * Returns the dialog for advanced properties, if any
     * 
     * @return the dialog for advanced properties, or <code>null</code>
     */
    private Dialog getPropertiesDialogInstance() {
	try {
	    Dialog dialog = null;
	    if (propertiesDialogName != null) {
		dialog = (Dialog) configElement.createExecutableExtension(TransformationExtIds.ATT_PROPERTIES_DIALOG);
	    }
	    return dialog;

	} catch (Exception e) {
	    Activator.log("could not get transformation instance", e);
	    return null;
	}
    }

    /**
     * Returns the unique instance of the module. it is created if necessary.
     * 
     * @return the unique instance of the module
     */
    public Dialog getDialog() {
	if (!dialogRetrieved) {
	    dialogInstance = getPropertiesDialogInstance();
	    dialogRetrieved = true;
	}
	return dialogInstance;
    }

    public String getName() {
	return name;
    }

}
