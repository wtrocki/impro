/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram;

import org.eclipse.osgi.util.NLS;

/**
 *
 */
public class Messages extends NLS {
    private static final String BUNDLE_NAME = "pl.zgora.uz.imgpro.diagram.messages"; //$NON-NLS-1$
    public static String CreateDiagramWithAllClassesHandler_ErrorTitle;
    public static String CreateDiagramWithAllClassesHandler_NewDiagramDescription;
    public static String CreateDiagramWithAllClassesHandler_NewDiagramTitle;
    static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
