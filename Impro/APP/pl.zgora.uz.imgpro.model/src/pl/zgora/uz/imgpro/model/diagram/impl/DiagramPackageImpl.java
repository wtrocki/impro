/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.ClassificationStyle;
import pl.zgora.uz.imgpro.model.diagram.Classifier;
import pl.zgora.uz.imgpro.model.diagram.Connector;
import pl.zgora.uz.imgpro.model.diagram.Crop;
import pl.zgora.uz.imgpro.model.diagram.CrossValidationType;
import pl.zgora.uz.imgpro.model.diagram.CustomElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DiagramPackageImpl extends EPackageImpl implements DiagramPackage {
    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private EClass dirInputEClass = null;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private EClass diagramElementEClass = null;

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass sourceLinkerEClass = null;

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private EClass elementConnectionEClass = null;

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass connectorEClass = null;

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private EClass imagePreviewEClass = null;

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass vignettingEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass directoryTypeEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass cropEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass histStretchEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass noiseRemoveEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass segATEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass segFCMEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass segFCMOffEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass segCLNEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass segKMEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass segKMOffEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass extractFeaturesEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass forwardSelectionEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass fullSelectionEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass classificationEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass multiplicationEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum phaseEEnum = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum classifierEEnum = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum crossValidationTypeEEnum = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum featuresEEnum = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum classificationStyleEEnum = null;

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private EClass improDiagramEClass = null;

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass customElementEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass inputConnectorEClass = null;

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass outputConnectorEClass = null;

/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
     * package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory
     * method {@link #init init()}, which also performs initialization of the
     * package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DiagramPackageImpl() {
                super(eNS_URI, DiagramFactory.eINSTANCE);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model,
     * and for any others upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link DiagramPackage#eINSTANCE} when
     * that field is accessed. Clients should not invoke it directly. Instead,
     * they should simply access that field to obtain the package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DiagramPackage init() {
                if (isInited) return (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);

                // Obtain or create and register package
                DiagramPackageImpl theDiagramPackage = (DiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiagramPackageImpl());

                isInited = true;

                // Create package meta-data objects
                theDiagramPackage.createPackageContents();

                // Initialize created meta-data
                theDiagramPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theDiagramPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(DiagramPackage.eNS_URI, theDiagramPackage);
                return theDiagramPackage;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EClass getDirInput() {
                return dirInputEClass;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EReference getDirInput_Directory() {
                return (EReference)dirInputEClass.getEStructuralFeatures().get(1);
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDirInput_Filter() {
                return (EAttribute)dirInputEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EClass getDiagramElement() {
                return diagramElementEClass;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDiagramElement_Connections() {
                return (EReference)diagramElementEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EAttribute getDiagramElement_ElementName() {
                return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(4);
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDiagramElement_SourceLinker() {
                return (EReference)diagramElementEClass.getEStructuralFeatures().get(5);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDiagramElement_Phase() {
                return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(6);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDiagramElement_ElementComment() {
                return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(7);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSourceLinker() {
                return sourceLinkerEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSourceLinker_SourceFilePath() {
                return (EAttribute)sourceLinkerEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDiagramElement_Inputs() {
                return (EReference)diagramElementEClass.getEStructuralFeatures().get(1);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDiagramElement_Outputs() {
                return (EReference)diagramElementEClass.getEStructuralFeatures().get(2);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDiagramElement_ConnectedWith() {
                return (EReference)diagramElementEClass.getEStructuralFeatures().get(3);
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EClass getElementConnection() {
                return elementConnectionEClass;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getElementConnection_ConnectionType() {
                return (EAttribute)elementConnectionEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EReference getElementConnection_Target() {
                return (EReference)elementConnectionEClass.getEStructuralFeatures().get(1);
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getConnector() {
                return connectorEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getConnector_TypeName() {
                return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EClass getImagePreview() {
                return imagePreviewEClass;
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getVignetting() {
                return vignettingEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDirectoryType() {
                return directoryTypeEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDirectoryType_Name() {
                return (EAttribute)directoryTypeEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getCrop() {
                return cropEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getCrop_NumberOfHorizontalPixels() {
                return (EAttribute)cropEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getCrop_NumberOfVerticalPixels() {
                return (EAttribute)cropEClass.getEStructuralFeatures().get(1);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getHistStretch() {
                return histStretchEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getNoiseRemove() {
                return noiseRemoveEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSegAT() {
                return segATEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegAT_WindowSize() {
                return (EAttribute)segATEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegAT_At_threshold() {
                return (EAttribute)segATEClass.getEStructuralFeatures().get(1);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegAT_UseMedian() {
                return (EAttribute)segATEClass.getEStructuralFeatures().get(2);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSegFCM() {
                return segFCMEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegFCM_Fcm_clusters() {
                return (EAttribute)segFCMEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegFCM_Fcm_options() {
                return (EAttribute)segFCMEClass.getEStructuralFeatures().get(1);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegFCM_Fcm_threshold() {
                return (EAttribute)segFCMEClass.getEStructuralFeatures().get(2);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSegFCMOff() {
                return segFCMOffEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegFCMOff_Fcm_off_clusters() {
                return (EAttribute)segFCMOffEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegFCMOff_Fcm_off_options() {
                return (EAttribute)segFCMOffEClass.getEStructuralFeatures().get(1);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegFCMOff_Fcm_off_threshold() {
                return (EAttribute)segFCMOffEClass.getEStructuralFeatures().get(2);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSegCLN() {
                return segCLNEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegCLN_ClnLearningEpochs() {
                return (EAttribute)segCLNEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSegKM() {
                return segKMEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegKM_KM_clusters() {
                return (EAttribute)segKMEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSegKMOff() {
                return segKMOffEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSegKMOff_KM_Off_clusters() {
                return (EAttribute)segKMOffEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getExtractFeatures() {
                return extractFeaturesEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getExtractFeatures_ClassificationGroup() {
                return (EAttribute)extractFeaturesEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getForwardSelection() {
                return forwardSelectionEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getForwardSelection_CrossValidationType() {
                return (EAttribute)forwardSelectionEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getForwardSelection_Features() {
                return (EAttribute)forwardSelectionEClass.getEStructuralFeatures().get(2);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getForwardSelection_Classifiers() {
                return (EAttribute)forwardSelectionEClass.getEStructuralFeatures().get(1);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getFullSelection() {
                return fullSelectionEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFullSelection_CrossValidationType() {
                return (EAttribute)fullSelectionEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFullSelection_Features() {
                return (EAttribute)fullSelectionEClass.getEStructuralFeatures().get(3);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFullSelection_MinimumFeatures() {
                return (EAttribute)fullSelectionEClass.getEStructuralFeatures().get(1);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getFullSelection_MaximumFeatures() {
                return (EAttribute)fullSelectionEClass.getEStructuralFeatures().get(2);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getClassification() {
                return classificationEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getClassification_ClassificationStyle() {
                return (EAttribute)classificationEClass.getEStructuralFeatures().get(0);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getClassification_Features() {
                return (EAttribute)classificationEClass.getEStructuralFeatures().get(1);
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMultiplication() {
                return multiplicationEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getPhase() {
                return phaseEEnum;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getClassifier() {
                return classifierEEnum;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getCrossValidationType() {
                return crossValidationTypeEEnum;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getFeatures() {
                return featuresEEnum;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getClassificationStyle() {
                return classificationStyleEEnum;
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EClass getImproDiagram() {
                return improDiagramEClass;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EReference getImproDiagram_Elements() {
                return (EReference)improDiagramEClass.getEStructuralFeatures().get(0);
        }

    /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getCustomElement() {
                return customElementEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getInputConnector() {
                return inputConnectorEClass;
        }

/**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getOutputConnector() {
                return outputConnectorEClass;
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public DiagramFactory getDiagramFactory() {
                return (DiagramFactory)getEFactoryInstance();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private boolean isCreated = false;

    /**
         * Creates the meta-model objects for the package.  This method is
         * guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @generated
         */
    public void createPackageContents() {
                if (isCreated) return;
                isCreated = true;

                // Create classes and their features
                improDiagramEClass = createEClass(IMPRO_DIAGRAM);
                createEReference(improDiagramEClass, IMPRO_DIAGRAM__ELEMENTS);

                diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
                createEReference(diagramElementEClass, DIAGRAM_ELEMENT__CONNECTIONS);
                createEReference(diagramElementEClass, DIAGRAM_ELEMENT__INPUTS);
                createEReference(diagramElementEClass, DIAGRAM_ELEMENT__OUTPUTS);
                createEReference(diagramElementEClass, DIAGRAM_ELEMENT__CONNECTED_WITH);
                createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ELEMENT_NAME);
                createEReference(diagramElementEClass, DIAGRAM_ELEMENT__SOURCE_LINKER);
                createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__PHASE);
                createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ELEMENT_COMMENT);

                sourceLinkerEClass = createEClass(SOURCE_LINKER);
                createEAttribute(sourceLinkerEClass, SOURCE_LINKER__SOURCE_FILE_PATH);

                dirInputEClass = createEClass(DIR_INPUT);
                createEAttribute(dirInputEClass, DIR_INPUT__FILTER);
                createEReference(dirInputEClass, DIR_INPUT__DIRECTORY);

                directoryTypeEClass = createEClass(DIRECTORY_TYPE);
                createEAttribute(directoryTypeEClass, DIRECTORY_TYPE__NAME);

                elementConnectionEClass = createEClass(ELEMENT_CONNECTION);
                createEAttribute(elementConnectionEClass, ELEMENT_CONNECTION__CONNECTION_TYPE);
                createEReference(elementConnectionEClass, ELEMENT_CONNECTION__TARGET);

                connectorEClass = createEClass(CONNECTOR);
                createEAttribute(connectorEClass, CONNECTOR__TYPE_NAME);

                customElementEClass = createEClass(CUSTOM_ELEMENT);

                inputConnectorEClass = createEClass(INPUT_CONNECTOR);

                outputConnectorEClass = createEClass(OUTPUT_CONNECTOR);

                imagePreviewEClass = createEClass(IMAGE_PREVIEW);

                vignettingEClass = createEClass(VIGNETTING);

                cropEClass = createEClass(CROP);
                createEAttribute(cropEClass, CROP__NUMBER_OF_HORIZONTAL_PIXELS);
                createEAttribute(cropEClass, CROP__NUMBER_OF_VERTICAL_PIXELS);

                histStretchEClass = createEClass(HIST_STRETCH);

                noiseRemoveEClass = createEClass(NOISE_REMOVE);

                multiplicationEClass = createEClass(MULTIPLICATION);

                segATEClass = createEClass(SEG_AT);
                createEAttribute(segATEClass, SEG_AT__WINDOW_SIZE);
                createEAttribute(segATEClass, SEG_AT__AT_THRESHOLD);
                createEAttribute(segATEClass, SEG_AT__USE_MEDIAN);

                segFCMEClass = createEClass(SEG_FCM);
                createEAttribute(segFCMEClass, SEG_FCM__FCM_CLUSTERS);
                createEAttribute(segFCMEClass, SEG_FCM__FCM_OPTIONS);
                createEAttribute(segFCMEClass, SEG_FCM__FCM_THRESHOLD);

                segFCMOffEClass = createEClass(SEG_FCM_OFF);
                createEAttribute(segFCMOffEClass, SEG_FCM_OFF__FCM_OFF_CLUSTERS);
                createEAttribute(segFCMOffEClass, SEG_FCM_OFF__FCM_OFF_OPTIONS);
                createEAttribute(segFCMOffEClass, SEG_FCM_OFF__FCM_OFF_THRESHOLD);

                segCLNEClass = createEClass(SEG_CLN);
                createEAttribute(segCLNEClass, SEG_CLN__CLN_LEARNING_EPOCHS);

                segKMEClass = createEClass(SEG_KM);
                createEAttribute(segKMEClass, SEG_KM__KM_CLUSTERS);

                segKMOffEClass = createEClass(SEG_KM_OFF);
                createEAttribute(segKMOffEClass, SEG_KM_OFF__KM_OFF_CLUSTERS);

                extractFeaturesEClass = createEClass(EXTRACT_FEATURES);
                createEAttribute(extractFeaturesEClass, EXTRACT_FEATURES__CLASSIFICATION_GROUP);

                forwardSelectionEClass = createEClass(FORWARD_SELECTION);
                createEAttribute(forwardSelectionEClass, FORWARD_SELECTION__CROSS_VALIDATION_TYPE);
                createEAttribute(forwardSelectionEClass, FORWARD_SELECTION__CLASSIFIERS);
                createEAttribute(forwardSelectionEClass, FORWARD_SELECTION__FEATURES);

                fullSelectionEClass = createEClass(FULL_SELECTION);
                createEAttribute(fullSelectionEClass, FULL_SELECTION__CROSS_VALIDATION_TYPE);
                createEAttribute(fullSelectionEClass, FULL_SELECTION__MINIMUM_FEATURES);
                createEAttribute(fullSelectionEClass, FULL_SELECTION__MAXIMUM_FEATURES);
                createEAttribute(fullSelectionEClass, FULL_SELECTION__FEATURES);

                classificationEClass = createEClass(CLASSIFICATION);
                createEAttribute(classificationEClass, CLASSIFICATION__CLASSIFICATION_STYLE);
                createEAttribute(classificationEClass, CLASSIFICATION__FEATURES);

                // Create enums
                phaseEEnum = createEEnum(PHASE);
                classifierEEnum = createEEnum(CLASSIFIER);
                crossValidationTypeEEnum = createEEnum(CROSS_VALIDATION_TYPE);
                featuresEEnum = createEEnum(FEATURES);
                classificationStyleEEnum = createEEnum(CLASSIFICATION_STYLE);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This
     * method is guarded to have no affect on any invocation but its first. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
                if (isInitialized) return;
                isInitialized = true;

                // Initialize package
                setName(eNAME);
                setNsPrefix(eNS_PREFIX);
                setNsURI(eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                dirInputEClass.getESuperTypes().add(this.getDiagramElement());
                customElementEClass.getESuperTypes().add(this.getDiagramElement());
                inputConnectorEClass.getESuperTypes().add(this.getConnector());
                outputConnectorEClass.getESuperTypes().add(this.getConnector());
                imagePreviewEClass.getESuperTypes().add(this.getDiagramElement());
                vignettingEClass.getESuperTypes().add(this.getDiagramElement());
                cropEClass.getESuperTypes().add(this.getDiagramElement());
                histStretchEClass.getESuperTypes().add(this.getDiagramElement());
                noiseRemoveEClass.getESuperTypes().add(this.getDiagramElement());
                multiplicationEClass.getESuperTypes().add(this.getDiagramElement());
                segATEClass.getESuperTypes().add(this.getDiagramElement());
                segFCMEClass.getESuperTypes().add(this.getDiagramElement());
                segFCMOffEClass.getESuperTypes().add(this.getDiagramElement());
                segCLNEClass.getESuperTypes().add(this.getDiagramElement());
                segKMEClass.getESuperTypes().add(this.getDiagramElement());
                segKMOffEClass.getESuperTypes().add(this.getDiagramElement());
                extractFeaturesEClass.getESuperTypes().add(this.getDiagramElement());
                forwardSelectionEClass.getESuperTypes().add(this.getDiagramElement());
                fullSelectionEClass.getESuperTypes().add(this.getDiagramElement());
                classificationEClass.getESuperTypes().add(this.getDiagramElement());

                // Initialize classes and features; add operations and parameters
                initEClass(improDiagramEClass, ImproDiagram.class, "ImproDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getImproDiagram_Elements(), this.getDiagramElement(), null, "elements", null, 0, -1, ImproDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                EOperation op = addEOperation(improDiagramEClass, this.getDiagramElement(), "getElementsOfClass", 0, -1, IS_UNIQUE, IS_ORDERED);
                EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
                EGenericType g2 = createEGenericType();
                g1.getETypeArguments().add(g2);
                addEParameter(op, g1, "class_", 0, 1, IS_UNIQUE, IS_ORDERED);

                initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getDiagramElement_Connections(), this.getElementConnection(), null, "connections", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDiagramElement_Inputs(), this.getInputConnector(), null, "inputs", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDiagramElement_Outputs(), this.getOutputConnector(), null, "outputs", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDiagramElement_ConnectedWith(), this.getDiagramElement(), null, "connectedWith", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDiagramElement_ElementName(), ecorePackage.getEString(), "elementName", "user-defined", 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDiagramElement_SourceLinker(), this.getSourceLinker(), null, "sourceLinker", null, 1, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDiagramElement_Phase(), this.getPhase(), "phase", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDiagramElement_ElementComment(), ecorePackage.getEString(), "elementComment", "Comment for this block", 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(sourceLinkerEClass, SourceLinker.class, "SourceLinker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSourceLinker_SourceFilePath(), ecorePackage.getEString(), "sourceFilePath", null, 0, 1, SourceLinker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                op = addEOperation(sourceLinkerEClass, null, "getDependencies", 0, 1, IS_UNIQUE, IS_ORDERED);
                g1 = createEGenericType(ecorePackage.getEEList());
                g2 = createEGenericType(ecorePackage.getEString());
                g1.getETypeArguments().add(g2);
                initEOperation(op, g1);

                initEClass(dirInputEClass, DirInput.class, "DirInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getDirInput_Filter(), ecorePackage.getEString(), "filter", "*.tif", 0, 1, DirInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDirInput_Directory(), this.getDirectoryType(), null, "directory", null, 1, 1, DirInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(directoryTypeEClass, DirectoryType.class, "DirectoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getDirectoryType_Name(), ecorePackage.getEString(), "name", "", 0, 1, DirectoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(elementConnectionEClass, ElementConnection.class, "ElementConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getElementConnection_ConnectionType(), ecorePackage.getEString(), "connectionType", null, 0, 1, ElementConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getElementConnection_Target(), this.getDiagramElement(), null, "target", null, 0, 1, ElementConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getConnector_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(customElementEClass, CustomElement.class, "CustomElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(inputConnectorEClass, InputConnector.class, "InputConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(outputConnectorEClass, OutputConnector.class, "OutputConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(imagePreviewEClass, ImagePreview.class, "ImagePreview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(vignettingEClass, Vignetting.class, "Vignetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(cropEClass, Crop.class, "Crop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getCrop_NumberOfHorizontalPixels(), ecorePackage.getEInt(), "numberOfHorizontalPixels", "4", 0, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getCrop_NumberOfVerticalPixels(), ecorePackage.getEInt(), "numberOfVerticalPixels", "4", 0, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(histStretchEClass, HistStretch.class, "HistStretch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(noiseRemoveEClass, NoiseRemove.class, "NoiseRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(segATEClass, SegAT.class, "SegAT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSegAT_WindowSize(), ecorePackage.getEInt(), "windowSize", "20", 0, 1, SegAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSegAT_At_threshold(), ecorePackage.getEFloat(), "at_threshold", "0.01", 0, 1, SegAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSegAT_UseMedian(), ecorePackage.getEBoolean(), "useMedian", "false", 0, 1, SegAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(segFCMEClass, SegFCM.class, "SegFCM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSegFCM_Fcm_clusters(), ecorePackage.getEInt(), "fcm_clusters", "3", 0, 1, SegFCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSegFCM_Fcm_options(), ecorePackage.getEString(), "fcm_options", "[2 100 0.00001 0]", 0, 1, SegFCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSegFCM_Fcm_threshold(), ecorePackage.getEFloat(), "fcm_threshold", "0.8", 0, 1, SegFCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(segFCMOffEClass, SegFCMOff.class, "SegFCMOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSegFCMOff_Fcm_off_clusters(), ecorePackage.getEInt(), "fcm_off_clusters", "3", 0, 1, SegFCMOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSegFCMOff_Fcm_off_options(), ecorePackage.getEString(), "fcm_off_options", "[2 100 0.00001 0]", 0, 1, SegFCMOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getSegFCMOff_Fcm_off_threshold(), ecorePackage.getEFloat(), "fcm_off_threshold", "0.6", 0, 1, SegFCMOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(segCLNEClass, SegCLN.class, "SegCLN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSegCLN_ClnLearningEpochs(), ecorePackage.getEInt(), "clnLearningEpochs", "100", 0, 1, SegCLN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(segKMEClass, SegKM.class, "SegKM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSegKM_KM_clusters(), ecorePackage.getEInt(), "KM_clusters", "3", 0, 1, SegKM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(segKMOffEClass, SegKMOff.class, "SegKMOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSegKMOff_KM_Off_clusters(), ecorePackage.getEInt(), "KM_Off_clusters", "3", 0, 1, SegKMOff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(extractFeaturesEClass, ExtractFeatures.class, "ExtractFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getExtractFeatures_ClassificationGroup(), ecorePackage.getEString(), "classificationGroup", "", 0, 1, ExtractFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(forwardSelectionEClass, ForwardSelection.class, "ForwardSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getForwardSelection_CrossValidationType(), this.getCrossValidationType(), "crossValidationType", "", 1, 1, ForwardSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getForwardSelection_Classifiers(), this.getClassifier(), "classifiers", null, 0, -1, ForwardSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getForwardSelection_Features(), this.getFeatures(), "features", null, 0, -1, ForwardSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(fullSelectionEClass, FullSelection.class, "FullSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getFullSelection_CrossValidationType(), this.getCrossValidationType(), "crossValidationType", "", 1, 1, FullSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFullSelection_MinimumFeatures(), ecorePackage.getEInt(), "minimumFeatures", "2", 0, 1, FullSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFullSelection_MaximumFeatures(), ecorePackage.getEInt(), "maximumFeatures", "3", 0, 1, FullSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getFullSelection_Features(), this.getFeatures(), "features", null, 0, -1, FullSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(classificationEClass, Classification.class, "Classification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getClassification_ClassificationStyle(), this.getClassificationStyle(), "classificationStyle", null, 0, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getClassification_Features(), this.getFeatures(), "features", null, 0, -1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Initialize enums and add enum literals
                initEEnum(phaseEEnum, Phase.class, "Phase");
                addEEnumLiteral(phaseEEnum, Phase.INPUT);
                addEEnumLiteral(phaseEEnum, Phase.PREPROCESSING);
                addEEnumLiteral(phaseEEnum, Phase.SEGMENTATION);
                addEEnumLiteral(phaseEEnum, Phase.FEATURE_EXTRACTION);
                addEEnumLiteral(phaseEEnum, Phase.FEATURES_SELECTION);
                addEEnumLiteral(phaseEEnum, Phase.CLASSIFICATION);
                addEEnumLiteral(phaseEEnum, Phase.UNKNOWN);

                initEEnum(classifierEEnum, Classifier.class, "Classifier");
                addEEnumLiteral(classifierEEnum, Classifier.KNN);
                addEEnumLiteral(classifierEEnum, Classifier.NAIVE_BAYES);
                addEEnumLiteral(classifierEEnum, Classifier.DECISION_TREES);
                addEEnumLiteral(classifierEEnum, Classifier.ENSEMBLE_CLASSIFIER);

                initEEnum(crossValidationTypeEEnum, CrossValidationType.class, "CrossValidationType");
                addEEnumLiteral(crossValidationTypeEEnum, CrossValidationType.IMAGE);
                addEEnumLiteral(crossValidationTypeEEnum, CrossValidationType.PATIENT);

                initEEnum(featuresEEnum, Features.class, "Features");
                addEEnumLiteral(featuresEEnum, Features.AREA_MEAN);
                addEEnumLiteral(featuresEEnum, Features.AREA_VAR);
                addEEnumLiteral(featuresEEnum, Features.PERIMETER_MEAN);
                addEEnumLiteral(featuresEEnum, Features.PERIMETER_VAR);
                addEEnumLiteral(featuresEEnum, Features.ECCENTRICITY_MEAN);
                addEEnumLiteral(featuresEEnum, Features.ECCENTRICITY_VAR);
                addEEnumLiteral(featuresEEnum, Features.MAJOR_AXIS_LENGTH_MEAN);
                addEEnumLiteral(featuresEEnum, Features.MAJOR_AXIS_LENGTH_VAR);
                addEEnumLiteral(featuresEEnum, Features.MINOR_AXIS_LENGTH_MEAN);
                addEEnumLiteral(featuresEEnum, Features.MINOR_AXIS_LENGTH_VAR);
                addEEnumLiteral(featuresEEnum, Features.LUMINANCE_MEAN_MEAN);
                addEEnumLiteral(featuresEEnum, Features.LUMINANCE_MEAN_VAR);
                addEEnumLiteral(featuresEEnum, Features.LUMINANCE_VARIANCE_MEAN);
                addEEnumLiteral(featuresEEnum, Features.LUMINANCE_VARIANCE_VAR);
                addEEnumLiteral(featuresEEnum, Features.DIST_TO_CENTROID_MEAN);
                addEEnumLiteral(featuresEEnum, Features.DIST_TO_CENTROID_VAR);

                initEEnum(classificationStyleEEnum, ClassificationStyle.class, "ClassificationStyle");
                addEEnumLiteral(classificationStyleEEnum, ClassificationStyle.BASIC);
                addEEnumLiteral(classificationStyleEEnum, ClassificationStyle.STANDARD);
                addEEnumLiteral(classificationStyleEEnum, ClassificationStyle.EXTENDED);
                addEEnumLiteral(classificationStyleEEnum, ClassificationStyle.FULL);

                // Create resource
                createResource(eNS_URI);

                // Create annotations
                // meta-tag
                createMetatagAnnotations();
        }

/**
         * Initializes the annotations for <b>meta-tag</b>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void createMetatagAnnotations() {
                String source = "meta-tag";		
                addAnnotation
                  (getSegFCM_Fcm_options(), 
                   source, 
                   new String[] {
                   });		
                addAnnotation
                  (getSegFCMOff_Fcm_off_options(), 
                   source, 
                   new String[] {
                   });
        }

} // DiagramPackageImpl
