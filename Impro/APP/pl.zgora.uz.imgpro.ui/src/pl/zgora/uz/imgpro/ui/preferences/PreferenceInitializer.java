/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import pl.zgora.uz.imgpro.ui.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {
    
    public void initializeDefaultPreferences() {
	IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	store.setDefault(PreferenceConstants.MATLAB_SOURCE_FOLDER, "m_src");
	store.setDefault(PreferenceConstants.OUTPUT_FOLDER, "output");
    }
}
