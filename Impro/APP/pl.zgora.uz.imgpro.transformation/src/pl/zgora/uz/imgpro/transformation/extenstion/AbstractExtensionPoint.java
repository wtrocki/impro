/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.extenstion;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.swt.graphics.Image;

import pl.zgora.uz.imgpro.transformation.Activator;


public abstract class AbstractExtensionPoint {

	/**
	 * Returns the value of the attribute that has the given name, for the given configuration
	 * element.
	 * <p>
	 * if the attribute has no value, and if default value is not <code>null</code>, it returns
	 * defaultValue.
	 * <p>
	 * if it has no value, no default value, and if the attribute is required, it throws an
	 * exception.
	 * 
	 * @param defaultValue
	 *            the default value (if exists) of the attribute
	 * @param isRequired
	 *            boolean that indicates if this attribute is required
	 * @param configElt
	 *            configuration element that reflects the content of the extension
	 * @param name
	 *            the name of the attribute to read
	 * @return the attribute value
	 */
	protected static String getAttribute(IConfigurationElement configElt, String name, String defaultValue,
			boolean isRequired) {
		String value = configElt.getAttribute(name);

		if (value != null) {
			return value;
		} else if (defaultValue != null) {
			return defaultValue;
		}

		if (isRequired) {
			throw new IllegalArgumentException("Missing " + name + " attribute");
		}

		return null;
	}

	/**
	 * Icon getter
	 * 
	 * @return the icon which path is in extension
	 */
	protected Image getImage(String iconPath, IConfigurationElement configElement) {

		// no image associated to this plug-in
		if (iconPath == null) {
			return null;
		}
		IExtension extension = configElement.getDeclaringExtension();
		String extensionPluginId = extension.getContributor().getName();

		return Activator.getImage(extensionPluginId, iconPath);
	}
}
