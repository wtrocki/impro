/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * Tab group to launch a module.
 */
public class LaunchTransformationTabGroup extends
	AbstractLaunchConfigurationTabGroup {

    
    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
	setTabs(new ILaunchConfigurationTab[] { new LaunchTransformationMainTab() });
    }

}
