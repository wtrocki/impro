/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage
 * @generated
 */
public class DiagramSwitch<T> extends Switch<T> {
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static DiagramPackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DiagramSwitch() {
                if (modelPackage == null) {
                        modelPackage = DiagramPackage.eINSTANCE;
                }
        }

        /**
         * Checks whether this is a switch for the given package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @parameter ePackage the package in question.
         * @return whether this is a switch for the given package.
         * @generated
         */
        
        @Override
        protected boolean isSwitchFor(EPackage ePackage) {
                return ePackage == modelPackage;
        }

        /**
         * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the first non-null result returned by a <code>caseXXX</code> call.
         * @generated
         */
        
        @Override
        protected T doSwitch(int classifierID, EObject theEObject) {
                switch (classifierID) {
                        case DiagramPackage.IMPRO_DIAGRAM: {
                                ImproDiagram improDiagram = (ImproDiagram)theEObject;
                                T result = caseImproDiagram(improDiagram);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.DIAGRAM_ELEMENT: {
                                DiagramElement diagramElement = (DiagramElement)theEObject;
                                T result = caseDiagramElement(diagramElement);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.SOURCE_LINKER: {
                                SourceLinker sourceLinker = (SourceLinker)theEObject;
                                T result = caseSourceLinker(sourceLinker);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.DIR_INPUT: {
                                DirInput dirInput = (DirInput)theEObject;
                                T result = caseDirInput(dirInput);
                                if (result == null) result = caseDiagramElement(dirInput);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.DIRECTORY_TYPE: {
                                DirectoryType directoryType = (DirectoryType)theEObject;
                                T result = caseDirectoryType(directoryType);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.ELEMENT_CONNECTION: {
                                ElementConnection elementConnection = (ElementConnection)theEObject;
                                T result = caseElementConnection(elementConnection);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.CONNECTOR: {
                                Connector connector = (Connector)theEObject;
                                T result = caseConnector(connector);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.CUSTOM_ELEMENT: {
                                CustomElement customElement = (CustomElement)theEObject;
                                T result = caseCustomElement(customElement);
                                if (result == null) result = caseDiagramElement(customElement);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.INPUT_CONNECTOR: {
                                InputConnector inputConnector = (InputConnector)theEObject;
                                T result = caseInputConnector(inputConnector);
                                if (result == null) result = caseConnector(inputConnector);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.OUTPUT_CONNECTOR: {
                                OutputConnector outputConnector = (OutputConnector)theEObject;
                                T result = caseOutputConnector(outputConnector);
                                if (result == null) result = caseConnector(outputConnector);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.IMAGE_PREVIEW: {
                                ImagePreview imagePreview = (ImagePreview)theEObject;
                                T result = caseImagePreview(imagePreview);
                                if (result == null) result = caseDiagramElement(imagePreview);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.VIGNETTING: {
                                Vignetting vignetting = (Vignetting)theEObject;
                                T result = caseVignetting(vignetting);
                                if (result == null) result = caseDiagramElement(vignetting);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.CROP: {
                                Crop crop = (Crop)theEObject;
                                T result = caseCrop(crop);
                                if (result == null) result = caseDiagramElement(crop);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.HIST_STRETCH: {
                                HistStretch histStretch = (HistStretch)theEObject;
                                T result = caseHistStretch(histStretch);
                                if (result == null) result = caseDiagramElement(histStretch);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.NOISE_REMOVE: {
                                NoiseRemove noiseRemove = (NoiseRemove)theEObject;
                                T result = caseNoiseRemove(noiseRemove);
                                if (result == null) result = caseDiagramElement(noiseRemove);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.MULTIPLICATION: {
                                Multiplication multiplication = (Multiplication)theEObject;
                                T result = caseMultiplication(multiplication);
                                if (result == null) result = caseDiagramElement(multiplication);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.SEG_AT: {
                                SegAT segAT = (SegAT)theEObject;
                                T result = caseSegAT(segAT);
                                if (result == null) result = caseDiagramElement(segAT);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.SEG_FCM: {
                                SegFCM segFCM = (SegFCM)theEObject;
                                T result = caseSegFCM(segFCM);
                                if (result == null) result = caseDiagramElement(segFCM);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.SEG_FCM_OFF: {
                                SegFCMOff segFCMOff = (SegFCMOff)theEObject;
                                T result = caseSegFCMOff(segFCMOff);
                                if (result == null) result = caseDiagramElement(segFCMOff);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.SEG_CLN: {
                                SegCLN segCLN = (SegCLN)theEObject;
                                T result = caseSegCLN(segCLN);
                                if (result == null) result = caseDiagramElement(segCLN);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.SEG_KM: {
                                SegKM segKM = (SegKM)theEObject;
                                T result = caseSegKM(segKM);
                                if (result == null) result = caseDiagramElement(segKM);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.SEG_KM_OFF: {
                                SegKMOff segKMOff = (SegKMOff)theEObject;
                                T result = caseSegKMOff(segKMOff);
                                if (result == null) result = caseDiagramElement(segKMOff);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.EXTRACT_FEATURES: {
                                ExtractFeatures extractFeatures = (ExtractFeatures)theEObject;
                                T result = caseExtractFeatures(extractFeatures);
                                if (result == null) result = caseDiagramElement(extractFeatures);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.FORWARD_SELECTION: {
                                ForwardSelection forwardSelection = (ForwardSelection)theEObject;
                                T result = caseForwardSelection(forwardSelection);
                                if (result == null) result = caseDiagramElement(forwardSelection);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.FULL_SELECTION: {
                                FullSelection fullSelection = (FullSelection)theEObject;
                                T result = caseFullSelection(fullSelection);
                                if (result == null) result = caseDiagramElement(fullSelection);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DiagramPackage.CLASSIFICATION: {
                                Classification classification = (Classification)theEObject;
                                T result = caseClassification(classification);
                                if (result == null) result = caseDiagramElement(classification);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Dir Input</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Dir Input</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDirInput(DirInput object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Element</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDiagramElement(DiagramElement object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Source Linker</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Source Linker</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSourceLinker(SourceLinker object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Element Connection</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Element Connection</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseElementConnection(ElementConnection object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseConnector(Connector object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Image Preview</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Image Preview</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseImagePreview(ImagePreview object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Vignetting</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Vignetting</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseVignetting(Vignetting object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Directory Type</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Directory Type</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDirectoryType(DirectoryType object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Crop</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Crop</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseCrop(Crop object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Hist Stretch</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Hist Stretch</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseHistStretch(HistStretch object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Noise Remove</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Noise Remove</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseNoiseRemove(NoiseRemove object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Seg AT</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Seg AT</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSegAT(SegAT object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Seg FCM</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Seg FCM</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSegFCM(SegFCM object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Seg FCM Off</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Seg FCM Off</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSegFCMOff(SegFCMOff object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Seg CLN</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Seg CLN</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSegCLN(SegCLN object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Seg KM</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Seg KM</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSegKM(SegKM object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Seg KM Off</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Seg KM Off</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSegKMOff(SegKMOff object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Extract Features</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Extract Features</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseExtractFeatures(ExtractFeatures object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Forward Selection</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Forward Selection</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseForwardSelection(ForwardSelection object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Full Selection</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Full Selection</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseFullSelection(FullSelection object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Classification</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Classification</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseClassification(Classification object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMultiplication(Multiplication object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Impro Diagram</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Impro Diagram</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseImproDiagram(ImproDiagram object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Custom Element</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Custom Element</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseCustomElement(CustomElement object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Input Connector</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Input Connector</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseInputConnector(InputConnector object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Output Connector</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Output Connector</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseOutputConnector(OutputConnector object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch, but this is the last case anyway.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject)
         * @generated
         */
        
        @Override
        public T defaultCase(EObject object) {
                return null;
        }

} //DiagramSwitch
