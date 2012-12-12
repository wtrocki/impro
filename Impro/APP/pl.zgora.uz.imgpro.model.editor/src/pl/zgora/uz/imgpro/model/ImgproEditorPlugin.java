/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Imgpro editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ImgproEditorPlugin extends EMFPlugin {
        /**
         * Keep track of the singleton.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final ImgproEditorPlugin INSTANCE = new ImgproEditorPlugin();
        
        /**
         * Keep track of the singleton.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static Implementation plugin;

        /**
         * Create the instance.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ImgproEditorPlugin() {
                super
                        (new ResourceLocator [] {
                        });
        }

        /**
         * Returns the singleton instance of the Eclipse plugin.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the singleton instance.
         * @generated
         */
        
        public ResourceLocator getPluginResourceLocator() {
                return plugin;
        }
        
        /**
         * Returns the singleton instance of the Eclipse plugin.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the singleton instance.
         * @generated
         */
        public static Implementation getPlugin() {
                return plugin;
        }
        
        /**
         * The actual implementation of the Eclipse <b>Plugin</b>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static class Implementation extends EclipseUIPlugin {
                /**
                 * Creates an instance.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                public Implementation() {
                        super();
        
                        // Remember the static instance.
                        //
                        plugin = this;
                }
        }

}
