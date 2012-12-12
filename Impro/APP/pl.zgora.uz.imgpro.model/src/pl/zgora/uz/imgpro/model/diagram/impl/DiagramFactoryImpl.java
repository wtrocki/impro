/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pl.zgora.uz.imgpro.model.diagram.*;
import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.ClassificationStyle;
import pl.zgora.uz.imgpro.model.diagram.Classifier;
import pl.zgora.uz.imgpro.model.diagram.Connector;
import pl.zgora.uz.imgpro.model.diagram.Crop;
import pl.zgora.uz.imgpro.model.diagram.CrossValidationType;
import pl.zgora.uz.imgpro.model.diagram.CustomElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.DirectoryType;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;
import pl.zgora.uz.imgpro.model.diagram.ExtractFeatures;
import pl.zgora.uz.imgpro.model.diagram.Features;
import pl.zgora.uz.imgpro.model.diagram.ForwardSelection;
import pl.zgora.uz.imgpro.model.diagram.FullSelection;
import pl.zgora.uz.imgpro.model.diagram.HistStretch;
import pl.zgora.uz.imgpro.model.diagram.ImagePreview;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;
import pl.zgora.uz.imgpro.model.diagram.InputConnector;
import pl.zgora.uz.imgpro.model.diagram.Multiplication;
import pl.zgora.uz.imgpro.model.diagram.NoiseRemove;
import pl.zgora.uz.imgpro.model.diagram.OutputConnector;
import pl.zgora.uz.imgpro.model.diagram.Phase;
import pl.zgora.uz.imgpro.model.diagram.SegAT;
import pl.zgora.uz.imgpro.model.diagram.SegCLN;
import pl.zgora.uz.imgpro.model.diagram.SegFCM;
import pl.zgora.uz.imgpro.model.diagram.SegFCMOff;
import pl.zgora.uz.imgpro.model.diagram.SegKM;
import pl.zgora.uz.imgpro.model.diagram.SegKMOff;
import pl.zgora.uz.imgpro.model.diagram.SourceLinker;
import pl.zgora.uz.imgpro.model.diagram.Vignetting;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DiagramFactoryImpl extends EFactoryImpl implements DiagramFactory {
    /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @generated
         */
    public static DiagramFactory init() {
                try {
                        DiagramFactory theDiagramFactory = (DiagramFactory)EPackage.Registry.INSTANCE.getEFactory("http:/uz.zgora/imgpro/model/diagram"); 
                        if (theDiagramFactory != null) {
                                return theDiagramFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new DiagramFactoryImpl();
        }

    /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @generated
         */
    public DiagramFactoryImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case DiagramPackage.IMPRO_DIAGRAM: return createImproDiagram();
                        case DiagramPackage.SOURCE_LINKER: return createSourceLinker();
                        case DiagramPackage.DIR_INPUT: return createDirInput();
                        case DiagramPackage.DIRECTORY_TYPE: return createDirectoryType();
                        case DiagramPackage.ELEMENT_CONNECTION: return createElementConnection();
                        case DiagramPackage.CONNECTOR: return createConnector();
                        case DiagramPackage.CUSTOM_ELEMENT: return createCustomElement();
                        case DiagramPackage.INPUT_CONNECTOR: return createInputConnector();
                        case DiagramPackage.OUTPUT_CONNECTOR: return createOutputConnector();
                        case DiagramPackage.IMAGE_PREVIEW: return createImagePreview();
                        case DiagramPackage.VIGNETTING: return createVignetting();
                        case DiagramPackage.CROP: return createCrop();
                        case DiagramPackage.HIST_STRETCH: return createHistStretch();
                        case DiagramPackage.NOISE_REMOVE: return createNoiseRemove();
                        case DiagramPackage.MULTIPLICATION: return createMultiplication();
                        case DiagramPackage.SEG_AT: return createSegAT();
                        case DiagramPackage.SEG_FCM: return createSegFCM();
                        case DiagramPackage.SEG_FCM_OFF: return createSegFCMOff();
                        case DiagramPackage.SEG_CLN: return createSegCLN();
                        case DiagramPackage.SEG_KM: return createSegKM();
                        case DiagramPackage.SEG_KM_OFF: return createSegKMOff();
                        case DiagramPackage.EXTRACT_FEATURES: return createExtractFeatures();
                        case DiagramPackage.FORWARD_SELECTION: return createForwardSelection();
                        case DiagramPackage.FULL_SELECTION: return createFullSelection();
                        case DiagramPackage.CLASSIFICATION: return createClassification();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object createFromString(EDataType eDataType, String initialValue) {
                switch (eDataType.getClassifierID()) {
                        case DiagramPackage.PHASE:
                                return createPhaseFromString(eDataType, initialValue);
                        case DiagramPackage.CLASSIFIER:
                                return createClassifierFromString(eDataType, initialValue);
                        case DiagramPackage.CROSS_VALIDATION_TYPE:
                                return createCrossValidationTypeFromString(eDataType, initialValue);
                        case DiagramPackage.FEATURES:
                                return createFeaturesFromString(eDataType, initialValue);
                        case DiagramPackage.CLASSIFICATION_STYLE:
                                return createClassificationStyleFromString(eDataType, initialValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public String convertToString(EDataType eDataType, Object instanceValue) {
                switch (eDataType.getClassifierID()) {
                        case DiagramPackage.PHASE:
                                return convertPhaseToString(eDataType, instanceValue);
                        case DiagramPackage.CLASSIFIER:
                                return convertClassifierToString(eDataType, instanceValue);
                        case DiagramPackage.CROSS_VALIDATION_TYPE:
                                return convertCrossValidationTypeToString(eDataType, instanceValue);
                        case DiagramPackage.FEATURES:
                                return convertFeaturesToString(eDataType, instanceValue);
                        case DiagramPackage.CLASSIFICATION_STYLE:
                                return convertClassificationStyleToString(eDataType, instanceValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public DirInput createDirInput() {
                DirInputImpl dirInput = new DirInputImpl();
                return dirInput;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public ElementConnection createElementConnection() {
                ElementConnectionImpl elementConnection = new ElementConnectionImpl();
                return elementConnection;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public Connector createConnector() {
                ConnectorImpl connector = new ConnectorImpl();
                return connector;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public ImagePreview createImagePreview() {
                ImagePreviewImpl imagePreview = new ImagePreviewImpl();
                return imagePreview;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Vignetting createVignetting() {
                VignettingImpl vignetting = new VignettingImpl();
                return vignetting;
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public DirectoryType createDirectoryType() {
                DirectoryTypeImpl directoryType = new DirectoryTypeImpl();
                return directoryType;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public Crop createCrop() {
                CropImpl crop = new CropImpl();
                return crop;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public HistStretch createHistStretch() {
                HistStretchImpl histStretch = new HistStretchImpl();
                return histStretch;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public NoiseRemove createNoiseRemove() {
                NoiseRemoveImpl noiseRemove = new NoiseRemoveImpl();
                return noiseRemove;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public SegAT createSegAT() {
                SegATImpl segAT = new SegATImpl();
                return segAT;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public SegFCM createSegFCM() {
                SegFCMImpl segFCM = new SegFCMImpl();
                return segFCM;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public SegFCMOff createSegFCMOff() {
                SegFCMOffImpl segFCMOff = new SegFCMOffImpl();
                return segFCMOff;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public SegCLN createSegCLN() {
                SegCLNImpl segCLN = new SegCLNImpl();
                return segCLN;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public SegKM createSegKM() {
                SegKMImpl segKM = new SegKMImpl();
                return segKM;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public SegKMOff createSegKMOff() {
                SegKMOffImpl segKMOff = new SegKMOffImpl();
                return segKMOff;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public ExtractFeatures createExtractFeatures() {
                ExtractFeaturesImpl extractFeatures = new ExtractFeaturesImpl();
                return extractFeatures;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ForwardSelection createForwardSelection() {
                ForwardSelectionImpl forwardSelection = new ForwardSelectionImpl();
                return forwardSelection;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public FullSelection createFullSelection() {
                FullSelectionImpl fullSelection = new FullSelectionImpl();
                return fullSelection;
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public Classification createClassification() {
                ClassificationImpl classification = new ClassificationImpl();
                return classification;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public Multiplication createMultiplication() {
                MultiplicationImpl multiplication = new MultiplicationImpl();
                return multiplication;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public Phase createPhaseFromString(EDataType eDataType, String initialValue) {
                Phase result = Phase.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public String convertPhaseToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Classifier createClassifierFromString(EDataType eDataType, String initialValue) {
                Classifier result = Classifier.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertClassifierToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CrossValidationType createCrossValidationTypeFromString(EDataType eDataType, String initialValue) {
                CrossValidationType result = CrossValidationType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertCrossValidationTypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Features createFeaturesFromString(EDataType eDataType, String initialValue) {
                Features result = Features.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertFeaturesToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ClassificationStyle createClassificationStyleFromString(EDataType eDataType, String initialValue) {
                ClassificationStyle result = ClassificationStyle.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertClassificationStyleToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public ImproDiagram createImproDiagram() {
                ImproDiagramImpl improDiagram = new ImproDiagramImpl();
                return improDiagram;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public SourceLinker createSourceLinker() {
                SourceLinkerImpl sourceLinker = new SourceLinkerImpl();
                return sourceLinker;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public CustomElement createCustomElement() {
                CustomElementImpl customElement = new CustomElementImpl();
                return customElement;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public InputConnector createInputConnector() {
                InputConnectorImpl inputConnector = new InputConnectorImpl();
                return inputConnector;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public OutputConnector createOutputConnector() {
                OutputConnectorImpl outputConnector = new OutputConnectorImpl();
                return outputConnector;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public DiagramPackage getDiagramPackage() {
                return (DiagramPackage)getEPackage();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
    @Deprecated
    public static DiagramPackage getPackage() {
                return DiagramPackage.eINSTANCE;
        }

} // DiagramFactoryImpl
