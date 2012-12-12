/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Imgpro edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ImgproEditPlugin extends EMFPlugin {
        /**
         * Keep track of the singleton.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final ImgproEditPlugin INSTANCE = new ImgproEditPlugin();

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
        public ImgproEditPlugin() {
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
        
        @Override
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
        public static class Implementation extends EclipsePlugin {
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
