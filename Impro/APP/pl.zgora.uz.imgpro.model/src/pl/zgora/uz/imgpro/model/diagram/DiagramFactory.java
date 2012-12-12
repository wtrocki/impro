/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage
 * @generated
 */
public interface DiagramFactory extends EFactory {
    /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @generated
         */
    DiagramFactory eINSTANCE = pl.zgora.uz.imgpro.model.diagram.impl.DiagramFactoryImpl.init();

    /**
         * Returns a new object of class '<em>Dir Input</em>'.
         * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
         * @return a new object of class '<em>Dir Input</em>'.
         * @generated
         */
    DirInput createDirInput();

    /**
     * Returns a new object of class '<em>Element Connection</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Element Connection</em>'.
     * @generated
     */
    ElementConnection createElementConnection();

    /**
         * Returns a new object of class '<em>Connector</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Connector</em>'.
         * @generated
         */
        Connector createConnector();

/**
     * Returns a new object of class '<em>Image Preview</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Image Preview</em>'.
     * @generated
     */
    ImagePreview createImagePreview();

    /**
         * Returns a new object of class '<em>Vignetting</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Vignetting</em>'.
         * @generated
         */
        Vignetting createVignetting();

/**
     * Returns a new object of class '<em>Directory Type</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Directory Type</em>'.
     * @generated
     */
    DirectoryType createDirectoryType();

    /**
         * Returns a new object of class '<em>Crop</em>'.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @return a new object of class '<em>Crop</em>'.
         * @generated
         */
    Crop createCrop();

    /**
     * Returns a new object of class '<em>Hist Stretch</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Hist Stretch</em>'.
     * @generated
     */
    HistStretch createHistStretch();

    /**
     * Returns a new object of class '<em>Noise Remove</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Noise Remove</em>'.
     * @generated
     */
    NoiseRemove createNoiseRemove();

    /**
         * Returns a new object of class '<em>Seg AT</em>'.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @return a new object of class '<em>Seg AT</em>'.
         * @generated
         */
    SegAT createSegAT();

    /**
         * Returns a new object of class '<em>Seg FCM</em>'.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @return a new object of class '<em>Seg FCM</em>'.
         * @generated
         */
    SegFCM createSegFCM();

    /**
         * Returns a new object of class '<em>Seg FCM Off</em>'.
         * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
         * @return a new object of class '<em>Seg FCM Off</em>'.
         * @generated
         */
    SegFCMOff createSegFCMOff();

    /**
         * Returns a new object of class '<em>Seg CLN</em>'.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @return a new object of class '<em>Seg CLN</em>'.
         * @generated
         */
    SegCLN createSegCLN();

    /**
         * Returns a new object of class '<em>Seg KM</em>'.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @return a new object of class '<em>Seg KM</em>'.
         * @generated
         */
    SegKM createSegKM();

    /**
         * Returns a new object of class '<em>Seg KM Off</em>'.
         * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
         * @return a new object of class '<em>Seg KM Off</em>'.
         * @generated
         */
    SegKMOff createSegKMOff();

    /**
     * Returns a new object of class '<em>Extract Features</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Extract Features</em>'.
     * @generated
     */
    ExtractFeatures createExtractFeatures();

    /**
         * Returns a new object of class '<em>Forward Selection</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Forward Selection</em>'.
         * @generated
         */
        ForwardSelection createForwardSelection();

/**
         * Returns a new object of class '<em>Full Selection</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Full Selection</em>'.
         * @generated
         */
        FullSelection createFullSelection();

/**
     * Returns a new object of class '<em>Classification</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Classification</em>'.
     * @generated
     */
    Classification createClassification();

    /**
     * Returns a new object of class '<em>Multiplication</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Multiplication</em>'.
     * @generated
     */
    Multiplication createMultiplication();

    /**
     * Returns a new object of class '<em>Impro Diagram</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Impro Diagram</em>'.
     * @generated
     */
    ImproDiagram createImproDiagram();

    /**
         * Returns a new object of class '<em>Source Linker</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Source Linker</em>'.
         * @generated
         */
        SourceLinker createSourceLinker();

/**
     * Returns a new object of class '<em>Custom Element</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Custom Element</em>'.
     * @generated
     */
    CustomElement createCustomElement();

    /**
         * Returns a new object of class '<em>Input Connector</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Input Connector</em>'.
         * @generated
         */
        InputConnector createInputConnector();

/**
         * Returns a new object of class '<em>Output Connector</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Output Connector</em>'.
         * @generated
         */
        OutputConnector createOutputConnector();

/**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
    DiagramPackage getDiagramPackage();

} // DiagramFactory
