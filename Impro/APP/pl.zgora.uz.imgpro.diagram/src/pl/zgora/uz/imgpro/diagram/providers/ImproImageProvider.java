/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.diagram.providers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

import pl.zgora.uz.imgpro.model.diagram.SegAT;
import pl.zgora.uz.imgpro.model.diagram.SegCLN;
import pl.zgora.uz.imgpro.model.diagram.SegFCM;
import pl.zgora.uz.imgpro.model.diagram.SegFCMOff;
import pl.zgora.uz.imgpro.model.diagram.SegKM;
import pl.zgora.uz.imgpro.model.diagram.SegKMOff;

@SuppressWarnings({ "rawtypes" })
public class ImproImageProvider extends AbstractImageProvider {

    // The prefix for all identifiers of this image provider
    protected static final String PREFIX = "pl.zgora.uz.imgpro.diagram."; //$NON-NLS-1$

    // The image identifier for an reference.
    public static final String IMG_CONNECTION = PREFIX + "ereference"; //$NON-NLS-1$

    public static final String IMG_COMMON = PREFIX + "common"; //$NON-NLS-1$

    public static final String IMG_OPEN = PREFIX + "open"; //$NON-NLS-1$

    public static final String IMG_GRAYSCALLE = PREFIX + "pre"; //$NON-NLS-1$

    public static final String IMG_CROP = PREFIX + "crop"; //$NON-NLS-1$

    public static final String IMG_VIGNETTING = PREFIX + "vignetting"; //$NON-NLS-1$

    public static final String IMG_HISTOGRAM = PREFIX + "hist"; //$NON-NLS-1$

    public static final String IMG_NOISE = PREFIX + "noise"; //$NON-NLS-1$

    public static final String IMG_EXTRACTION = PREFIX + "opef"; //$NON-NLS-1$

    public static final String IMG_CLASIFFICATION = PREFIX + "opg"; //$NON-NLS-1$

    public static final String IMG_MULTIPLICATION = PREFIX + "multi"; //$NON-NLS-1$

    public static final String IMG_PREPROCESSING = PREFIX + "preprocessing"; //$NON-NLS-1$

    public static final String IMG_SHOW_IMG = PREFIX + "showimg"; //$NON-NLS-1$

    public static final String IMG_OPEN_EDITOR = PREFIX + "editor"; //$NON-NLS-1$

    public static final String IMG_SHOW_PROPERTIES = PREFIX + "properties"; //$NON-NLS-1$

    public static final String IMG_VALIDATION = PREFIX + "validation"; //$NON-NLS-1$

    public static final String IMG_RENAME = PREFIX + "rename"; //$NON-NLS-1$

    public static final String IMG_SEG = PREFIX + "seg"; //$NON-NLS-1$

    public static final String IMG_FORWARD_SELECTION = PREFIX + "FORWARD"; //$NON-NLS-1$

    public static final String IMG_FULL_SELECTION = PREFIX + "FULL_SELECTION"; //$NON-NLS-1$

    public static final String IMG_HELP = PREFIX + "HELP"; //$NON-NLS-1$;

    public static final String[] segClasses = { SegFCM.class.getSimpleName(),
	    SegKM.class.getSimpleName(), SegAT.class.getSimpleName(),
	    SegCLN.class.getSimpleName(), SegFCMOff.class.getSimpleName(),
	    SegKMOff.class.getSimpleName() };

    @Override
    protected void addAvailableImages() {
	// register the path for each image identifier
	addImageFilePath(IMG_CONNECTION, "icons/ereference.gif"); //$NON-NLS-1$
	addImageFilePath(IMG_COMMON, "icons/common.gif"); //$NON-NLS-1$
	addImageFilePath(IMG_OPEN, "icons/open.png"); //$NON-NLS-1$

	addImageFilePath(IMG_GRAYSCALLE, "icons/pre.png"); //$NON-NLS-1$
	addImageFilePath(IMG_VIGNETTING, "icons/vignetting.gif"); //$NON-NLS-1$
	addImageFilePath(IMG_CROP, "icons/crop.jpg"); //$NON-NLS-1$
	addImageFilePath(IMG_HISTOGRAM, "icons/histogram.gif"); //$NON-NLS-1$
	addImageFilePath(IMG_NOISE, "icons/noise.jpg"); //$NON-NLS-1$
	addImageFilePath(IMG_MULTIPLICATION, "icons/multiplication.png"); //$NON-NLS-1$
	addImageFilePath(IMG_PREPROCESSING, "icons/preprocessing.png"); //$NON-NLS-1$
	addImageFilePath(IMG_VALIDATION, "icons/validation.png"); //$NON-NLS-1$

	addImageFilePath(IMG_EXTRACTION, "icons/extraction.png"); //$NON-NLS-1$
	addImageFilePath(IMG_CLASIFFICATION, "icons/classify.jpg"); //$NON-NLS-1$
	addImageFilePath(IMG_FORWARD_SELECTION, "icons/forward-selection.png"); //$NON-NLS-1$
	addImageFilePath(IMG_FULL_SELECTION, "icons/full-selection.png"); //$NON-NLS-1$

	addImageFilePath(IMG_SHOW_IMG, "icons/showimg.png"); //$NON-NLS-1$
	addImageFilePath(IMG_OPEN_EDITOR, "icons/pane/editor.jpg"); //$NON-NLS-1$
	addImageFilePath(IMG_SHOW_PROPERTIES, "icons/pane/properties.jpg"); //$NON-NLS-1$
	addImageFilePath(IMG_RENAME, "icons/pane/rename.jpg"); //$NON-NLS-1$
	addImageFilePath(IMG_HELP, "icons/pane/help_icon.png"); //$NON-NLS-1$
	createHashImages();
    }

    private void createHashImages() {
	for (String clazz : segClasses) {
	    addImageFilePath(IMG_SEG + clazz, "icons/seg/" + clazz + ".png"); //$NON-NLS-1$
	}
    }

    private final static Map<Class, String> keys = new HashMap<Class, String>();

    /**
     * Return image key for current class
     * 
     * @param clazz
     * @return
     */

    public static String getHashImageForClass(Class clazz) {
	final String image = keys.get(clazz);
	if (image != null) {
	    return image;
	} else {
	    keys.put(clazz, IMG_SEG + clazz.getSimpleName());
	    return IMG_SEG + clazz.getSimpleName();
	}
    }
}
