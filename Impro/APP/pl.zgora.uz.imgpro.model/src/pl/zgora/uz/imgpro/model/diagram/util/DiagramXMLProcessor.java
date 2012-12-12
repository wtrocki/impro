/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramXMLProcessor extends XMLProcessor {

        /**
         * Public constructor to instantiate the helper.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DiagramXMLProcessor() {
                super((EPackage.Registry.INSTANCE));
                DiagramPackage.eINSTANCE.eClass();
        }
        
        /**
         * Register for "*" and "xml" file extensions the DiagramResourceFactoryImpl factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        protected Map<String, Resource.Factory> getRegistrations() {
                if (registrations == null) {
                        super.getRegistrations();
                        registrations.put(XML_EXTENSION, new DiagramResourceFactoryImpl());
                        registrations.put(STAR_EXTENSION, new DiagramResourceFactoryImpl());
                }
                return registrations;
        }

} //DiagramXMLProcessor
