/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.extenstion;

import java.util.Map;

/**
 * Interface that dialogs for transformation extension point must implement
 */
public interface IPropertiesDialog {

	/** sets initial properties, for a given configuration */
	public void initAdvancedProperties(Map<Object, String> properties);

	/** Returns the map of advanced properties. */
	public Map<Object, String> getAdvancedProperties();
}
