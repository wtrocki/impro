/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.extenstion;

import pl.zgora.uz.imgpro.transformation.Activator;

/**
 * Interface to stores IDs
 */
public interface TransformationExtIds {

    /** name of the transformation extension point */
    public final static String TRANSFORMATION_EXTENSION_NAME = "MatlabTransformation";

    /** id of the transformation extension point */
    public final static String TRANSFORMATION_EXTENSION_ID = Activator.PLUGIN_ID + "." + TRANSFORMATION_EXTENSION_NAME;

    /** id of the transformation element */
    public static final String TAG_TRANSFORMATION = "transformation";

    /** identifier of the id attribute */
    public static final String ATT_ID = "id";

    /** identifier of the name attribute */
    public static final String ATT_NAME = "name";

    /** identifier of the description attribute */
    public static final String ATT_DESCRIPTION = "description";

    /** identifier of the module attribute */
    public static final String ATT_MODULE = "module";

    /** identifier of the icon path attribute */
    public static final String ATT_ICON = "icon";

    /** identifier of the icon path attribute */
    public static final String ATT_PROPERTIES_DIALOG = "conf";

}
