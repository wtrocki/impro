/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import pl.zgora.uz.imgpro.model.diagram.*;
import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.Connector;
import pl.zgora.uz.imgpro.model.diagram.Crop;
import pl.zgora.uz.imgpro.model.diagram.CustomElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.DirectoryType;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;
import pl.zgora.uz.imgpro.model.diagram.ExtractFeatures;
import pl.zgora.uz.imgpro.model.diagram.ForwardSelection;
import pl.zgora.uz.imgpro.model.diagram.FullSelection;
import pl.zgora.uz.imgpro.model.diagram.HistStretch;
import pl.zgora.uz.imgpro.model.diagram.ImagePreview;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;
import pl.zgora.uz.imgpro.model.diagram.InputConnector;
import pl.zgora.uz.imgpro.model.diagram.Multiplication;
import pl.zgora.uz.imgpro.model.diagram.NoiseRemove;
import pl.zgora.uz.imgpro.model.diagram.OutputConnector;
import pl.zgora.uz.imgpro.model.diagram.SegAT;
import pl.zgora.uz.imgpro.model.diagram.SegCLN;
import pl.zgora.uz.imgpro.model.diagram.SegFCM;
import pl.zgora.uz.imgpro.model.diagram.SegFCMOff;
import pl.zgora.uz.imgpro.model.diagram.SegKM;
import pl.zgora.uz.imgpro.model.diagram.SegKMOff;
import pl.zgora.uz.imgpro.model.diagram.SourceLinker;
import pl.zgora.uz.imgpro.model.diagram.Vignetting;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage
 * @generated
 */
public class DiagramAdapterFactory extends AdapterFactoryImpl {
    /**
         * The cached model package.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected static DiagramPackage modelPackage;

    /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @generated
         */
    public DiagramAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = DiagramPackage.eINSTANCE;
                }
        }

    /**
         * Returns whether this factory is applicable for the type of the object.
         * <!-- begin-user-doc --> This implementation returns <code>true</code> if
     * the object is either the model's package or is an instance object of the
     * model. <!-- end-user-doc -->
         * @return whether this factory is applicable for the type of the object.
         * @generated
         */
    
    @Override
public boolean isFactoryForType(Object object) {
                if (object == modelPackage) {
                        return true;
                }
                if (object instanceof EObject) {
                        return ((EObject)object).eClass().getEPackage() == modelPackage;
                }
                return false;
        }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DiagramSwitch<Adapter> modelSwitch = new DiagramSwitch<Adapter>() {
                        @Override
                        public Adapter caseImproDiagram(ImproDiagram object) {
                                return createImproDiagramAdapter();
                        }
                        @Override
                        public Adapter caseDiagramElement(DiagramElement object) {
                                return createDiagramElementAdapter();
                        }
                        @Override
                        public Adapter caseSourceLinker(SourceLinker object) {
                                return createSourceLinkerAdapter();
                        }
                        @Override
                        public Adapter caseDirInput(DirInput object) {
                                return createDirInputAdapter();
                        }
                        @Override
                        public Adapter caseDirectoryType(DirectoryType object) {
                                return createDirectoryTypeAdapter();
                        }
                        @Override
                        public Adapter caseElementConnection(ElementConnection object) {
                                return createElementConnectionAdapter();
                        }
                        @Override
                        public Adapter caseConnector(Connector object) {
                                return createConnectorAdapter();
                        }
                        @Override
                        public Adapter caseCustomElement(CustomElement object) {
                                return createCustomElementAdapter();
                        }
                        @Override
                        public Adapter caseInputConnector(InputConnector object) {
                                return createInputConnectorAdapter();
                        }
                        @Override
                        public Adapter caseOutputConnector(OutputConnector object) {
                                return createOutputConnectorAdapter();
                        }
                        @Override
                        public Adapter caseImagePreview(ImagePreview object) {
                                return createImagePreviewAdapter();
                        }
                        @Override
                        public Adapter caseVignetting(Vignetting object) {
                                return createVignettingAdapter();
                        }
                        @Override
                        public Adapter caseCrop(Crop object) {
                                return createCropAdapter();
                        }
                        @Override
                        public Adapter caseHistStretch(HistStretch object) {
                                return createHistStretchAdapter();
                        }
                        @Override
                        public Adapter caseNoiseRemove(NoiseRemove object) {
                                return createNoiseRemoveAdapter();
                        }
                        @Override
                        public Adapter caseMultiplication(Multiplication object) {
                                return createMultiplicationAdapter();
                        }
                        @Override
                        public Adapter caseSegAT(SegAT object) {
                                return createSegATAdapter();
                        }
                        @Override
                        public Adapter caseSegFCM(SegFCM object) {
                                return createSegFCMAdapter();
                        }
                        @Override
                        public Adapter caseSegFCMOff(SegFCMOff object) {
                                return createSegFCMOffAdapter();
                        }
                        @Override
                        public Adapter caseSegCLN(SegCLN object) {
                                return createSegCLNAdapter();
                        }
                        @Override
                        public Adapter caseSegKM(SegKM object) {
                                return createSegKMAdapter();
                        }
                        @Override
                        public Adapter caseSegKMOff(SegKMOff object) {
                                return createSegKMOffAdapter();
                        }
                        @Override
                        public Adapter caseExtractFeatures(ExtractFeatures object) {
                                return createExtractFeaturesAdapter();
                        }
                        @Override
                        public Adapter caseForwardSelection(ForwardSelection object) {
                                return createForwardSelectionAdapter();
                        }
                        @Override
                        public Adapter caseFullSelection(FullSelection object) {
                                return createFullSelectionAdapter();
                        }
                        @Override
                        public Adapter caseClassification(Classification object) {
                                return createClassificationAdapter();
                        }
                        @Override
                        public Adapter defaultCase(EObject object) {
                                return createEObjectAdapter();
                        }
                };

    /**
         * Creates an adapter for the <code>target</code>.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @param target the object to adapt.
         * @return the adapter for the <code>target</code>.
         * @generated
         */
    
    @Override
public Adapter createAdapter(Notifier target) {
                return modelSwitch.doSwitch((EObject)target);
        }

    /**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.DirInput <em>Dir Input</em>}'.
         * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.DirInput
         * @generated
         */
    public Adapter createDirInputAdapter() {
                return null;
        }

    /**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement <em>Element</em>}'.
         * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement
         * @generated
         */
    public Adapter createDiagramElementAdapter() {
                return null;
        }

    /**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.SourceLinker <em>Source Linker</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.SourceLinker
         * @generated
         */
        public Adapter createSourceLinkerAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.ElementConnection <em>Element Connection</em>}'.
         * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.ElementConnection
         * @generated
         */
    public Adapter createElementConnectionAdapter() {
                return null;
        }

    /**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.Connector <em>Connector</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.Connector
         * @generated
         */
        public Adapter createConnectorAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.ImagePreview <em>Image Preview</em>}'.
         * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.ImagePreview
         * @generated
         */
    public Adapter createImagePreviewAdapter() {
                return null;
        }

    /**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.Vignetting <em>Vignetting</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.Vignetting
         * @generated
         */
        public Adapter createVignettingAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.DirectoryType <em>Directory Type</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.DirectoryType
         * @generated
         */
        public Adapter createDirectoryTypeAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.Crop <em>Crop</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.Crop
         * @generated
         */
        public Adapter createCropAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.HistStretch <em>Hist Stretch</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.HistStretch
         * @generated
         */
        public Adapter createHistStretchAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.NoiseRemove <em>Noise Remove</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.NoiseRemove
         * @generated
         */
        public Adapter createNoiseRemoveAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.SegAT <em>Seg AT</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.SegAT
         * @generated
         */
        public Adapter createSegATAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.SegFCM <em>Seg FCM</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCM
         * @generated
         */
        public Adapter createSegFCMAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff <em>Seg FCM Off</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCMOff
         * @generated
         */
        public Adapter createSegFCMOffAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.SegCLN <em>Seg CLN</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.SegCLN
         * @generated
         */
        public Adapter createSegCLNAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.SegKM <em>Seg KM</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.SegKM
         * @generated
         */
        public Adapter createSegKMAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.SegKMOff <em>Seg KM Off</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.SegKMOff
         * @generated
         */
        public Adapter createSegKMOffAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.ExtractFeatures <em>Extract Features</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.ExtractFeatures
         * @generated
         */
        public Adapter createExtractFeaturesAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection <em>Forward Selection</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.ForwardSelection
         * @generated
         */
        public Adapter createForwardSelectionAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection <em>Full Selection</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.FullSelection
         * @generated
         */
        public Adapter createFullSelectionAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.Classification <em>Classification</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.Classification
         * @generated
         */
        public Adapter createClassificationAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.Multiplication <em>Multiplication</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.Multiplication
         * @generated
         */
        public Adapter createMultiplicationAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.ImproDiagram <em>Impro Diagram</em>}'.
         * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.ImproDiagram
         * @generated
         */
    public Adapter createImproDiagramAdapter() {
                return null;
        }

    /**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.CustomElement <em>Custom Element</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.CustomElement
         * @generated
         */
        public Adapter createCustomElementAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.InputConnector <em>Input Connector</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.InputConnector
         * @generated
         */
        public Adapter createInputConnectorAdapter() {
                return null;
        }

/**
         * Creates a new adapter for an object of class '{@link pl.zgora.uz.imgpro.model.diagram.OutputConnector <em>Output Connector</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see pl.zgora.uz.imgpro.model.diagram.OutputConnector
         * @generated
         */
        public Adapter createOutputConnectorAdapter() {
                return null;
        }

/**
         * Creates a new adapter for the default case.
         * <!-- begin-user-doc --> This
     * default implementation returns null. <!-- end-user-doc -->
         * @return the new adapter.
         * @generated
         */
    public Adapter createEObjectAdapter() {
                return null;
        }

} // DiagramAdapterFactory
