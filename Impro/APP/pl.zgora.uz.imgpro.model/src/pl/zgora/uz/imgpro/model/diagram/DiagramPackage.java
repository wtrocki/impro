/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "diagram";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http:/uz.zgora/imgpro/model/diagram";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "imgpro_model_diagram";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        DiagramPackage eINSTANCE = pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl.init();

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getDiagramElement()
         * @generated
         */
        int DIAGRAM_ELEMENT = 1;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.DirInputImpl <em>Dir Input</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DirInputImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getDirInput()
         * @generated
         */
        int DIR_INPUT = 3;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ElementConnectionImpl <em>Element Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.ElementConnectionImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getElementConnection()
         * @generated
         */
        int ELEMENT_CONNECTION = 5;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ConnectorImpl <em>Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.ConnectorImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getConnector()
         * @generated
         */
        int CONNECTOR = 6;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ImagePreviewImpl <em>Image Preview</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.ImagePreviewImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getImagePreview()
         * @generated
         */
        int IMAGE_PREVIEW = 10;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.Phase <em>Phase</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.Phase
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getPhase()
         * @generated
         */
        int PHASE = 26;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.Classifier <em>Classifier</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.Classifier
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getClassifier()
         * @generated
         */
        int CLASSIFIER = 27;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.CrossValidationType <em>Cross Validation Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.CrossValidationType
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getCrossValidationType()
         * @generated
         */
        int CROSS_VALIDATION_TYPE = 28;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.Features <em>Features</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.Features
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getFeatures()
         * @generated
         */
        int FEATURES = 29;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.ClassificationStyle <em>Classification Style</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.ClassificationStyle
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getClassificationStyle()
         * @generated
         */
        int CLASSIFICATION_STYLE = 30;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ImproDiagramImpl <em>Impro Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.ImproDiagramImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getImproDiagram()
         * @generated
         */
        int IMPRO_DIAGRAM = 0;

        /**
         * The feature id for the '<em><b>Elements</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMPRO_DIAGRAM__ELEMENTS = 0;

        /**
         * The number of structural features of the '<em>Impro Diagram</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMPRO_DIAGRAM_FEATURE_COUNT = 1;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT__CONNECTIONS = 0;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT__INPUTS = 1;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT__OUTPUTS = 2;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT__CONNECTED_WITH = 3;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT__ELEMENT_NAME = 4;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT__SOURCE_LINKER = 5;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT__PHASE = 6;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT__ELEMENT_COMMENT = 7;

        /**
         * The number of structural features of the '<em>Element</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIAGRAM_ELEMENT_FEATURE_COUNT = 8;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SourceLinkerImpl <em>Source Linker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.SourceLinkerImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSourceLinker()
         * @generated
         */
        int SOURCE_LINKER = 2;

        /**
         * The feature id for the '<em><b>Source File Path</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SOURCE_LINKER__SOURCE_FILE_PATH = 0;

        /**
         * The number of structural features of the '<em>Source Linker</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SOURCE_LINKER_FEATURE_COUNT = 1;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Filter</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__FILTER = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Directory</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT__DIRECTORY = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Dir Input</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIR_INPUT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.CustomElementImpl <em>Custom Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.CustomElementImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getCustomElement()
         * @generated
         */
        int CUSTOM_ELEMENT = 7;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.InputConnectorImpl <em>Input Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.InputConnectorImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getInputConnector()
         * @generated
         */
        int INPUT_CONNECTOR = 8;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.OutputConnectorImpl <em>Output Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.OutputConnectorImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getOutputConnector()
         * @generated
         */
        int OUTPUT_CONNECTOR = 9;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.DirectoryTypeImpl <em>Directory Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DirectoryTypeImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getDirectoryType()
         * @generated
         */
        int DIRECTORY_TYPE = 4;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIRECTORY_TYPE__NAME = 0;

        /**
         * The number of structural features of the '<em>Directory Type</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DIRECTORY_TYPE_FEATURE_COUNT = 1;

        /**
         * The feature id for the '<em><b>Connection Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ELEMENT_CONNECTION__CONNECTION_TYPE = 0;

        /**
         * The feature id for the '<em><b>Target</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ELEMENT_CONNECTION__TARGET = 1;

        /**
         * The number of structural features of the '<em>Element Connection</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ELEMENT_CONNECTION_FEATURE_COUNT = 2;

        /**
         * The feature id for the '<em><b>Type Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CONNECTOR__TYPE_NAME = 0;

        /**
         * The number of structural features of the '<em>Connector</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CONNECTOR_FEATURE_COUNT = 1;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The number of structural features of the '<em>Custom Element</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CUSTOM_ELEMENT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Type Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int INPUT_CONNECTOR__TYPE_NAME = CONNECTOR__TYPE_NAME;

        /**
         * The number of structural features of the '<em>Input Connector</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int INPUT_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Type Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OUTPUT_CONNECTOR__TYPE_NAME = CONNECTOR__TYPE_NAME;

        /**
         * The number of structural features of the '<em>Output Connector</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int OUTPUT_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The number of structural features of the '<em>Image Preview</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int IMAGE_PREVIEW_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.VignettingImpl <em>Vignetting</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.VignettingImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getVignetting()
         * @generated
         */
        int VIGNETTING = 11;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The number of structural features of the '<em>Vignetting</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int VIGNETTING_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.CropImpl <em>Crop</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.CropImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getCrop()
         * @generated
         */
        int CROP = 12;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Number Of Horizontal Pixels</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__NUMBER_OF_HORIZONTAL_PIXELS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Number Of Vertical Pixels</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP__NUMBER_OF_VERTICAL_PIXELS = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Crop</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CROP_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.HistStretchImpl <em>Hist Stretch</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.HistStretchImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getHistStretch()
         * @generated
         */
        int HIST_STRETCH = 13;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The number of structural features of the '<em>Hist Stretch</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int HIST_STRETCH_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.NoiseRemoveImpl <em>Noise Remove</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.NoiseRemoveImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getNoiseRemove()
         * @generated
         */
        int NOISE_REMOVE = 14;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The number of structural features of the '<em>Noise Remove</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NOISE_REMOVE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegATImpl <em>Seg AT</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.SegATImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegAT()
         * @generated
         */
        int SEG_AT = 16;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMImpl <em>Seg FCM</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.SegFCMImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegFCM()
         * @generated
         */
        int SEG_FCM = 17;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMOffImpl <em>Seg FCM Off</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.SegFCMOffImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegFCMOff()
         * @generated
         */
        int SEG_FCM_OFF = 18;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegCLNImpl <em>Seg CLN</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.SegCLNImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegCLN()
         * @generated
         */
        int SEG_CLN = 19;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegKMImpl <em>Seg KM</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.SegKMImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegKM()
         * @generated
         */
        int SEG_KM = 20;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegKMOffImpl <em>Seg KM Off</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.SegKMOffImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegKMOff()
         * @generated
         */
        int SEG_KM_OFF = 21;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ExtractFeaturesImpl <em>Extract Features</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.ExtractFeaturesImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getExtractFeatures()
         * @generated
         */
        int EXTRACT_FEATURES = 22;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ForwardSelectionImpl <em>Forward Selection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.ForwardSelectionImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getForwardSelection()
         * @generated
         */
        int FORWARD_SELECTION = 23;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.FullSelectionImpl <em>Full Selection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.FullSelectionImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getFullSelection()
         * @generated
         */
        int FULL_SELECTION = 24;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ClassificationImpl <em>Classification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.ClassificationImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getClassification()
         * @generated
         */
        int CLASSIFICATION = 25;

        /**
         * The meta object id for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.MultiplicationImpl <em>Multiplication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see pl.zgora.uz.imgpro.model.diagram.impl.MultiplicationImpl
         * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getMultiplication()
         * @generated
         */
        int MULTIPLICATION = 15;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The number of structural features of the '<em>Multiplication</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTIPLICATION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Window Size</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__WINDOW_SIZE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>At threshold</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__AT_THRESHOLD = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Use Median</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT__USE_MEDIAN = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The number of structural features of the '<em>Seg AT</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_AT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Fcm clusters</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__FCM_CLUSTERS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Fcm options</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__FCM_OPTIONS = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Fcm threshold</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM__FCM_THRESHOLD = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The number of structural features of the '<em>Seg FCM</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Fcm off clusters</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__FCM_OFF_CLUSTERS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Fcm off options</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__FCM_OFF_OPTIONS = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Fcm off threshold</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF__FCM_OFF_THRESHOLD = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The number of structural features of the '<em>Seg FCM Off</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_FCM_OFF_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Cln Learning Epochs</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN__CLN_LEARNING_EPOCHS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Seg CLN</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_CLN_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>KM clusters</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM__KM_CLUSTERS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Seg KM</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>KM Off clusters</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF__KM_OFF_CLUSTERS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Seg KM Off</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SEG_KM_OFF_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Classification Group</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES__CLASSIFICATION_GROUP = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Extract Features</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EXTRACT_FEATURES_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Cross Validation Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__CROSS_VALIDATION_TYPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Classifiers</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__CLASSIFIERS = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Features</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION__FEATURES = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The number of structural features of the '<em>Forward Selection</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FORWARD_SELECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Cross Validation Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__CROSS_VALIDATION_TYPE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Minimum Features</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__MINIMUM_FEATURES = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Maximum Features</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__MAXIMUM_FEATURES = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The feature id for the '<em><b>Features</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION__FEATURES = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The number of structural features of the '<em>Full Selection</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int FULL_SELECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

        /**
         * The feature id for the '<em><b>Connections</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__CONNECTIONS = DIAGRAM_ELEMENT__CONNECTIONS;

        /**
         * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__INPUTS = DIAGRAM_ELEMENT__INPUTS;

        /**
         * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__OUTPUTS = DIAGRAM_ELEMENT__OUTPUTS;

        /**
         * The feature id for the '<em><b>Connected With</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__CONNECTED_WITH = DIAGRAM_ELEMENT__CONNECTED_WITH;

        /**
         * The feature id for the '<em><b>Element Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__ELEMENT_NAME = DIAGRAM_ELEMENT__ELEMENT_NAME;

        /**
         * The feature id for the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__SOURCE_LINKER = DIAGRAM_ELEMENT__SOURCE_LINKER;

        /**
         * The feature id for the '<em><b>Phase</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__PHASE = DIAGRAM_ELEMENT__PHASE;

        /**
         * The feature id for the '<em><b>Element Comment</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__ELEMENT_COMMENT = DIAGRAM_ELEMENT__ELEMENT_COMMENT;

        /**
         * The feature id for the '<em><b>Classification Style</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__CLASSIFICATION_STYLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Features</b></em>' attribute list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION__FEATURES = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Classification</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CLASSIFICATION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.DirInput <em>Dir Input</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Dir Input</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DirInput
         * @generated
         */
        EClass getDirInput();

        /**
         * Returns the meta object for the containment reference '{@link pl.zgora.uz.imgpro.model.diagram.DirInput#getDirectory <em>Directory</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Directory</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DirInput#getDirectory()
         * @see #getDirInput()
         * @generated
         */
        EReference getDirInput_Directory();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.DirInput#getFilter <em>Filter</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Filter</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DirInput#getFilter()
         * @see #getDirInput()
         * @generated
         */
        EAttribute getDirInput_Filter();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement <em>Element</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Element</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement
         * @generated
         */
        EClass getDiagramElement();

        /**
         * Returns the meta object for the containment reference list '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getConnections <em>Connections</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Connections</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement#getConnections()
         * @see #getDiagramElement()
         * @generated
         */
        EReference getDiagramElement_Connections();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getElementName <em>Element Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Element Name</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement#getElementName()
         * @see #getDiagramElement()
         * @generated
         */
        EAttribute getDiagramElement_ElementName();

        /**
         * Returns the meta object for the containment reference '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getSourceLinker <em>Source Linker</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Source Linker</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement#getSourceLinker()
         * @see #getDiagramElement()
         * @generated
         */
        EReference getDiagramElement_SourceLinker();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getPhase <em>Phase</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Phase</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement#getPhase()
         * @see #getDiagramElement()
         * @generated
         */
        EAttribute getDiagramElement_Phase();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getElementComment <em>Element Comment</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Element Comment</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement#getElementComment()
         * @see #getDiagramElement()
         * @generated
         */
        EAttribute getDiagramElement_ElementComment();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.SourceLinker <em>Source Linker</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Source Linker</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SourceLinker
         * @generated
         */
        EClass getSourceLinker();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SourceLinker#getSourceFilePath <em>Source File Path</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Source File Path</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SourceLinker#getSourceFilePath()
         * @see #getSourceLinker()
         * @generated
         */
        EAttribute getSourceLinker_SourceFilePath();

        /**
         * Returns the meta object for the containment reference list '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getInputs <em>Inputs</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Inputs</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement#getInputs()
         * @see #getDiagramElement()
         * @generated
         */
        EReference getDiagramElement_Inputs();

        /**
         * Returns the meta object for the containment reference list '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getOutputs <em>Outputs</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Outputs</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement#getOutputs()
         * @see #getDiagramElement()
         * @generated
         */
        EReference getDiagramElement_Outputs();

        /**
         * Returns the meta object for the reference list '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getConnectedWith <em>Connected With</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Connected With</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramElement#getConnectedWith()
         * @see #getDiagramElement()
         * @generated
         */
        EReference getDiagramElement_ConnectedWith();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.ElementConnection <em>Element Connection</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Element Connection</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ElementConnection
         * @generated
         */
        EClass getElementConnection();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.ElementConnection#getConnectionType <em>Connection Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Connection Type</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ElementConnection#getConnectionType()
         * @see #getElementConnection()
         * @generated
         */
        EAttribute getElementConnection_ConnectionType();

        /**
         * Returns the meta object for the reference '{@link pl.zgora.uz.imgpro.model.diagram.ElementConnection#getTarget <em>Target</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Target</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ElementConnection#getTarget()
         * @see #getElementConnection()
         * @generated
         */
        EReference getElementConnection_Target();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.Connector <em>Connector</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Connector</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Connector
         * @generated
         */
        EClass getConnector();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.Connector#getTypeName <em>Type Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type Name</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Connector#getTypeName()
         * @see #getConnector()
         * @generated
         */
        EAttribute getConnector_TypeName();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.ImagePreview <em>Image Preview</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Image Preview</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ImagePreview
         * @generated
         */
        EClass getImagePreview();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.Vignetting <em>Vignetting</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Vignetting</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Vignetting
         * @generated
         */
        EClass getVignetting();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.DirectoryType <em>Directory Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Directory Type</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DirectoryType
         * @generated
         */
        EClass getDirectoryType();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.DirectoryType#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.DirectoryType#getName()
         * @see #getDirectoryType()
         * @generated
         */
        EAttribute getDirectoryType_Name();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.Crop <em>Crop</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Crop</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Crop
         * @generated
         */
        EClass getCrop();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.Crop#getNumberOfHorizontalPixels <em>Number Of Horizontal Pixels</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Number Of Horizontal Pixels</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Crop#getNumberOfHorizontalPixels()
         * @see #getCrop()
         * @generated
         */
        EAttribute getCrop_NumberOfHorizontalPixels();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.Crop#getNumberOfVerticalPixels <em>Number Of Vertical Pixels</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Number Of Vertical Pixels</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Crop#getNumberOfVerticalPixels()
         * @see #getCrop()
         * @generated
         */
        EAttribute getCrop_NumberOfVerticalPixels();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.HistStretch <em>Hist Stretch</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Hist Stretch</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.HistStretch
         * @generated
         */
        EClass getHistStretch();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.NoiseRemove <em>Noise Remove</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Noise Remove</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.NoiseRemove
         * @generated
         */
        EClass getNoiseRemove();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.SegAT <em>Seg AT</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Seg AT</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegAT
         * @generated
         */
        EClass getSegAT();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegAT#getWindowSize <em>Window Size</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Window Size</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegAT#getWindowSize()
         * @see #getSegAT()
         * @generated
         */
        EAttribute getSegAT_WindowSize();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegAT#getAt_threshold <em>At threshold</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>At threshold</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegAT#getAt_threshold()
         * @see #getSegAT()
         * @generated
         */
        EAttribute getSegAT_At_threshold();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegAT#isUseMedian <em>Use Median</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Use Median</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegAT#isUseMedian()
         * @see #getSegAT()
         * @generated
         */
        EAttribute getSegAT_UseMedian();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.SegFCM <em>Seg FCM</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Seg FCM</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCM
         * @generated
         */
        EClass getSegFCM();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_clusters <em>Fcm clusters</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Fcm clusters</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_clusters()
         * @see #getSegFCM()
         * @generated
         */
        EAttribute getSegFCM_Fcm_clusters();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_options <em>Fcm options</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Fcm options</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_options()
         * @see #getSegFCM()
         * @generated
         */
        EAttribute getSegFCM_Fcm_options();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_threshold <em>Fcm threshold</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Fcm threshold</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCM#getFcm_threshold()
         * @see #getSegFCM()
         * @generated
         */
        EAttribute getSegFCM_Fcm_threshold();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff <em>Seg FCM Off</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Seg FCM Off</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCMOff
         * @generated
         */
        EClass getSegFCMOff();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_clusters <em>Fcm off clusters</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Fcm off clusters</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_clusters()
         * @see #getSegFCMOff()
         * @generated
         */
        EAttribute getSegFCMOff_Fcm_off_clusters();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_options <em>Fcm off options</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Fcm off options</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_options()
         * @see #getSegFCMOff()
         * @generated
         */
        EAttribute getSegFCMOff_Fcm_off_options();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_threshold <em>Fcm off threshold</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Fcm off threshold</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegFCMOff#getFcm_off_threshold()
         * @see #getSegFCMOff()
         * @generated
         */
        EAttribute getSegFCMOff_Fcm_off_threshold();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.SegCLN <em>Seg CLN</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Seg CLN</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegCLN
         * @generated
         */
        EClass getSegCLN();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegCLN#getClnLearningEpochs <em>Cln Learning Epochs</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Cln Learning Epochs</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegCLN#getClnLearningEpochs()
         * @see #getSegCLN()
         * @generated
         */
        EAttribute getSegCLN_ClnLearningEpochs();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.SegKM <em>Seg KM</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Seg KM</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegKM
         * @generated
         */
        EClass getSegKM();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegKM#getKM_clusters <em>KM clusters</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>KM clusters</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegKM#getKM_clusters()
         * @see #getSegKM()
         * @generated
         */
        EAttribute getSegKM_KM_clusters();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.SegKMOff <em>Seg KM Off</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Seg KM Off</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegKMOff
         * @generated
         */
        EClass getSegKMOff();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.SegKMOff#getKM_Off_clusters <em>KM Off clusters</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>KM Off clusters</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.SegKMOff#getKM_Off_clusters()
         * @see #getSegKMOff()
         * @generated
         */
        EAttribute getSegKMOff_KM_Off_clusters();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.ExtractFeatures <em>Extract Features</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Extract Features</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ExtractFeatures
         * @generated
         */
        EClass getExtractFeatures();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.ExtractFeatures#getClassificationGroup <em>Classification Group</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Classification Group</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ExtractFeatures#getClassificationGroup()
         * @see #getExtractFeatures()
         * @generated
         */
        EAttribute getExtractFeatures_ClassificationGroup();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection <em>Forward Selection</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Forward Selection</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ForwardSelection
         * @generated
         */
        EClass getForwardSelection();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getCrossValidationType <em>Cross Validation Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Cross Validation Type</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getCrossValidationType()
         * @see #getForwardSelection()
         * @generated
         */
        EAttribute getForwardSelection_CrossValidationType();

        /**
         * Returns the meta object for the attribute list '{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getFeatures <em>Features</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Features</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getFeatures()
         * @see #getForwardSelection()
         * @generated
         */
        EAttribute getForwardSelection_Features();

        /**
         * Returns the meta object for the attribute list '{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getClassifiers <em>Classifiers</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Classifiers</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getClassifiers()
         * @see #getForwardSelection()
         * @generated
         */
        EAttribute getForwardSelection_Classifiers();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection <em>Full Selection</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Full Selection</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.FullSelection
         * @generated
         */
        EClass getFullSelection();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getCrossValidationType <em>Cross Validation Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Cross Validation Type</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.FullSelection#getCrossValidationType()
         * @see #getFullSelection()
         * @generated
         */
        EAttribute getFullSelection_CrossValidationType();

        /**
         * Returns the meta object for the attribute list '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getFeatures <em>Features</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Features</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.FullSelection#getFeatures()
         * @see #getFullSelection()
         * @generated
         */
        EAttribute getFullSelection_Features();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getMinimumFeatures <em>Minimum Features</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Minimum Features</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.FullSelection#getMinimumFeatures()
         * @see #getFullSelection()
         * @generated
         */
        EAttribute getFullSelection_MinimumFeatures();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getMaximumFeatures <em>Maximum Features</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Maximum Features</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.FullSelection#getMaximumFeatures()
         * @see #getFullSelection()
         * @generated
         */
        EAttribute getFullSelection_MaximumFeatures();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.Classification <em>Classification</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Classification</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Classification
         * @generated
         */
        EClass getClassification();

        /**
         * Returns the meta object for the attribute '{@link pl.zgora.uz.imgpro.model.diagram.Classification#getClassificationStyle <em>Classification Style</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Classification Style</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Classification#getClassificationStyle()
         * @see #getClassification()
         * @generated
         */
        EAttribute getClassification_ClassificationStyle();

        /**
         * Returns the meta object for the attribute list '{@link pl.zgora.uz.imgpro.model.diagram.Classification#getFeatures <em>Features</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute list '<em>Features</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Classification#getFeatures()
         * @see #getClassification()
         * @generated
         */
        EAttribute getClassification_Features();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.Multiplication <em>Multiplication</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Multiplication</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Multiplication
         * @generated
         */
        EClass getMultiplication();

        /**
         * Returns the meta object for enum '{@link pl.zgora.uz.imgpro.model.diagram.Phase <em>Phase</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Phase</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Phase
         * @generated
         */
        EEnum getPhase();

        /**
         * Returns the meta object for enum '{@link pl.zgora.uz.imgpro.model.diagram.Classifier <em>Classifier</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Classifier</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Classifier
         * @generated
         */
        EEnum getClassifier();

        /**
         * Returns the meta object for enum '{@link pl.zgora.uz.imgpro.model.diagram.CrossValidationType <em>Cross Validation Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Cross Validation Type</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.CrossValidationType
         * @generated
         */
        EEnum getCrossValidationType();

        /**
         * Returns the meta object for enum '{@link pl.zgora.uz.imgpro.model.diagram.Features <em>Features</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Features</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.Features
         * @generated
         */
        EEnum getFeatures();

        /**
         * Returns the meta object for enum '{@link pl.zgora.uz.imgpro.model.diagram.ClassificationStyle <em>Classification Style</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Classification Style</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ClassificationStyle
         * @generated
         */
        EEnum getClassificationStyle();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.ImproDiagram <em>Impro Diagram</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Impro Diagram</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ImproDiagram
         * @generated
         */
        EClass getImproDiagram();

        /**
         * Returns the meta object for the containment reference list '{@link pl.zgora.uz.imgpro.model.diagram.ImproDiagram#getElements <em>Elements</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Elements</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.ImproDiagram#getElements()
         * @see #getImproDiagram()
         * @generated
         */
        EReference getImproDiagram_Elements();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.CustomElement <em>Custom Element</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Custom Element</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.CustomElement
         * @generated
         */
        EClass getCustomElement();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.InputConnector <em>Input Connector</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Input Connector</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.InputConnector
         * @generated
         */
        EClass getInputConnector();

        /**
         * Returns the meta object for class '{@link pl.zgora.uz.imgpro.model.diagram.OutputConnector <em>Output Connector</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Output Connector</em>'.
         * @see pl.zgora.uz.imgpro.model.diagram.OutputConnector
         * @generated
         */
        EClass getOutputConnector();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        DiagramFactory getDiagramFactory();

        /**
         * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
         * @generated
         */
        interface Literals {
                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.DirInputImpl <em>Dir Input</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DirInputImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getDirInput()
                 * @generated
                 */
                EClass DIR_INPUT = eINSTANCE.getDirInput();

                /**
                 * The meta object literal for the '<em><b>Directory</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIR_INPUT__DIRECTORY = eINSTANCE.getDirInput_Directory();

                /**
                 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIR_INPUT__FILTER = eINSTANCE.getDirInput_Filter();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl <em>Element</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getDiagramElement()
                 * @generated
                 */
                EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

                /**
                 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIAGRAM_ELEMENT__CONNECTIONS = eINSTANCE.getDiagramElement_Connections();

                /**
                 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIAGRAM_ELEMENT__ELEMENT_NAME = eINSTANCE.getDiagramElement_ElementName();

                /**
                 * The meta object literal for the '<em><b>Source Linker</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIAGRAM_ELEMENT__SOURCE_LINKER = eINSTANCE.getDiagramElement_SourceLinker();

                /**
                 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIAGRAM_ELEMENT__PHASE = eINSTANCE.getDiagramElement_Phase();

                /**
                 * The meta object literal for the '<em><b>Element Comment</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIAGRAM_ELEMENT__ELEMENT_COMMENT = eINSTANCE.getDiagramElement_ElementComment();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SourceLinkerImpl <em>Source Linker</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.SourceLinkerImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSourceLinker()
                 * @generated
                 */
                EClass SOURCE_LINKER = eINSTANCE.getSourceLinker();

                /**
                 * The meta object literal for the '<em><b>Source File Path</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SOURCE_LINKER__SOURCE_FILE_PATH = eINSTANCE.getSourceLinker_SourceFilePath();

                /**
                 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIAGRAM_ELEMENT__INPUTS = eINSTANCE.getDiagramElement_Inputs();

                /**
                 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIAGRAM_ELEMENT__OUTPUTS = eINSTANCE.getDiagramElement_Outputs();

                /**
                 * The meta object literal for the '<em><b>Connected With</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DIAGRAM_ELEMENT__CONNECTED_WITH = eINSTANCE.getDiagramElement_ConnectedWith();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ElementConnectionImpl <em>Element Connection</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.ElementConnectionImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getElementConnection()
                 * @generated
                 */
                EClass ELEMENT_CONNECTION = eINSTANCE.getElementConnection();

                /**
                 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute ELEMENT_CONNECTION__CONNECTION_TYPE = eINSTANCE.getElementConnection_ConnectionType();

                /**
                 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ELEMENT_CONNECTION__TARGET = eINSTANCE.getElementConnection_Target();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ConnectorImpl <em>Connector</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.ConnectorImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getConnector()
                 * @generated
                 */
                EClass CONNECTOR = eINSTANCE.getConnector();

                /**
                 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute CONNECTOR__TYPE_NAME = eINSTANCE.getConnector_TypeName();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ImagePreviewImpl <em>Image Preview</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.ImagePreviewImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getImagePreview()
                 * @generated
                 */
                EClass IMAGE_PREVIEW = eINSTANCE.getImagePreview();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.VignettingImpl <em>Vignetting</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.VignettingImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getVignetting()
                 * @generated
                 */
                EClass VIGNETTING = eINSTANCE.getVignetting();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.DirectoryTypeImpl <em>Directory Type</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DirectoryTypeImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getDirectoryType()
                 * @generated
                 */
                EClass DIRECTORY_TYPE = eINSTANCE.getDirectoryType();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DIRECTORY_TYPE__NAME = eINSTANCE.getDirectoryType_Name();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.CropImpl <em>Crop</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.CropImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getCrop()
                 * @generated
                 */
                EClass CROP = eINSTANCE.getCrop();

                /**
                 * The meta object literal for the '<em><b>Number Of Horizontal Pixels</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute CROP__NUMBER_OF_HORIZONTAL_PIXELS = eINSTANCE.getCrop_NumberOfHorizontalPixels();

                /**
                 * The meta object literal for the '<em><b>Number Of Vertical Pixels</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute CROP__NUMBER_OF_VERTICAL_PIXELS = eINSTANCE.getCrop_NumberOfVerticalPixels();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.HistStretchImpl <em>Hist Stretch</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.HistStretchImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getHistStretch()
                 * @generated
                 */
                EClass HIST_STRETCH = eINSTANCE.getHistStretch();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.NoiseRemoveImpl <em>Noise Remove</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.NoiseRemoveImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getNoiseRemove()
                 * @generated
                 */
                EClass NOISE_REMOVE = eINSTANCE.getNoiseRemove();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegATImpl <em>Seg AT</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.SegATImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegAT()
                 * @generated
                 */
                EClass SEG_AT = eINSTANCE.getSegAT();

                /**
                 * The meta object literal for the '<em><b>Window Size</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_AT__WINDOW_SIZE = eINSTANCE.getSegAT_WindowSize();

                /**
                 * The meta object literal for the '<em><b>At threshold</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_AT__AT_THRESHOLD = eINSTANCE.getSegAT_At_threshold();

                /**
                 * The meta object literal for the '<em><b>Use Median</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_AT__USE_MEDIAN = eINSTANCE.getSegAT_UseMedian();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMImpl <em>Seg FCM</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.SegFCMImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegFCM()
                 * @generated
                 */
                EClass SEG_FCM = eINSTANCE.getSegFCM();

                /**
                 * The meta object literal for the '<em><b>Fcm clusters</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_FCM__FCM_CLUSTERS = eINSTANCE.getSegFCM_Fcm_clusters();

                /**
                 * The meta object literal for the '<em><b>Fcm options</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_FCM__FCM_OPTIONS = eINSTANCE.getSegFCM_Fcm_options();

                /**
                 * The meta object literal for the '<em><b>Fcm threshold</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_FCM__FCM_THRESHOLD = eINSTANCE.getSegFCM_Fcm_threshold();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegFCMOffImpl <em>Seg FCM Off</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.SegFCMOffImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegFCMOff()
                 * @generated
                 */
                EClass SEG_FCM_OFF = eINSTANCE.getSegFCMOff();

                /**
                 * The meta object literal for the '<em><b>Fcm off clusters</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_FCM_OFF__FCM_OFF_CLUSTERS = eINSTANCE.getSegFCMOff_Fcm_off_clusters();

                /**
                 * The meta object literal for the '<em><b>Fcm off options</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_FCM_OFF__FCM_OFF_OPTIONS = eINSTANCE.getSegFCMOff_Fcm_off_options();

                /**
                 * The meta object literal for the '<em><b>Fcm off threshold</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_FCM_OFF__FCM_OFF_THRESHOLD = eINSTANCE.getSegFCMOff_Fcm_off_threshold();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegCLNImpl <em>Seg CLN</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.SegCLNImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegCLN()
                 * @generated
                 */
                EClass SEG_CLN = eINSTANCE.getSegCLN();

                /**
                 * The meta object literal for the '<em><b>Cln Learning Epochs</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_CLN__CLN_LEARNING_EPOCHS = eINSTANCE.getSegCLN_ClnLearningEpochs();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegKMImpl <em>Seg KM</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.SegKMImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegKM()
                 * @generated
                 */
                EClass SEG_KM = eINSTANCE.getSegKM();

                /**
                 * The meta object literal for the '<em><b>KM clusters</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_KM__KM_CLUSTERS = eINSTANCE.getSegKM_KM_clusters();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.SegKMOffImpl <em>Seg KM Off</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.SegKMOffImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getSegKMOff()
                 * @generated
                 */
                EClass SEG_KM_OFF = eINSTANCE.getSegKMOff();

                /**
                 * The meta object literal for the '<em><b>KM Off clusters</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SEG_KM_OFF__KM_OFF_CLUSTERS = eINSTANCE.getSegKMOff_KM_Off_clusters();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ExtractFeaturesImpl <em>Extract Features</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.ExtractFeaturesImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getExtractFeatures()
                 * @generated
                 */
                EClass EXTRACT_FEATURES = eINSTANCE.getExtractFeatures();

                /**
                 * The meta object literal for the '<em><b>Classification Group</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute EXTRACT_FEATURES__CLASSIFICATION_GROUP = eINSTANCE.getExtractFeatures_ClassificationGroup();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ForwardSelectionImpl <em>Forward Selection</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.ForwardSelectionImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getForwardSelection()
                 * @generated
                 */
                EClass FORWARD_SELECTION = eINSTANCE.getForwardSelection();

                /**
                 * The meta object literal for the '<em><b>Cross Validation Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FORWARD_SELECTION__CROSS_VALIDATION_TYPE = eINSTANCE.getForwardSelection_CrossValidationType();

                /**
                 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FORWARD_SELECTION__FEATURES = eINSTANCE.getForwardSelection_Features();

                /**
                 * The meta object literal for the '<em><b>Classifiers</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FORWARD_SELECTION__CLASSIFIERS = eINSTANCE.getForwardSelection_Classifiers();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.FullSelectionImpl <em>Full Selection</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.FullSelectionImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getFullSelection()
                 * @generated
                 */
                EClass FULL_SELECTION = eINSTANCE.getFullSelection();

                /**
                 * The meta object literal for the '<em><b>Cross Validation Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FULL_SELECTION__CROSS_VALIDATION_TYPE = eINSTANCE.getFullSelection_CrossValidationType();

                /**
                 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FULL_SELECTION__FEATURES = eINSTANCE.getFullSelection_Features();

                /**
                 * The meta object literal for the '<em><b>Minimum Features</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FULL_SELECTION__MINIMUM_FEATURES = eINSTANCE.getFullSelection_MinimumFeatures();

                /**
                 * The meta object literal for the '<em><b>Maximum Features</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute FULL_SELECTION__MAXIMUM_FEATURES = eINSTANCE.getFullSelection_MaximumFeatures();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ClassificationImpl <em>Classification</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.ClassificationImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getClassification()
                 * @generated
                 */
                EClass CLASSIFICATION = eINSTANCE.getClassification();

                /**
                 * The meta object literal for the '<em><b>Classification Style</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute CLASSIFICATION__CLASSIFICATION_STYLE = eINSTANCE.getClassification_ClassificationStyle();

                /**
                 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute CLASSIFICATION__FEATURES = eINSTANCE.getClassification_Features();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.MultiplicationImpl <em>Multiplication</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.MultiplicationImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getMultiplication()
                 * @generated
                 */
                EClass MULTIPLICATION = eINSTANCE.getMultiplication();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.Phase <em>Phase</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.Phase
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getPhase()
                 * @generated
                 */
                EEnum PHASE = eINSTANCE.getPhase();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.Classifier <em>Classifier</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.Classifier
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getClassifier()
                 * @generated
                 */
                EEnum CLASSIFIER = eINSTANCE.getClassifier();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.CrossValidationType <em>Cross Validation Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.CrossValidationType
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getCrossValidationType()
                 * @generated
                 */
                EEnum CROSS_VALIDATION_TYPE = eINSTANCE.getCrossValidationType();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.Features <em>Features</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.Features
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getFeatures()
                 * @generated
                 */
                EEnum FEATURES = eINSTANCE.getFeatures();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.ClassificationStyle <em>Classification Style</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.ClassificationStyle
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getClassificationStyle()
                 * @generated
                 */
                EEnum CLASSIFICATION_STYLE = eINSTANCE.getClassificationStyle();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.ImproDiagramImpl <em>Impro Diagram</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.ImproDiagramImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getImproDiagram()
                 * @generated
                 */
                EClass IMPRO_DIAGRAM = eINSTANCE.getImproDiagram();

                /**
                 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference IMPRO_DIAGRAM__ELEMENTS = eINSTANCE.getImproDiagram_Elements();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.CustomElementImpl <em>Custom Element</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.CustomElementImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getCustomElement()
                 * @generated
                 */
                EClass CUSTOM_ELEMENT = eINSTANCE.getCustomElement();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.InputConnectorImpl <em>Input Connector</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.InputConnectorImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getInputConnector()
                 * @generated
                 */
                EClass INPUT_CONNECTOR = eINSTANCE.getInputConnector();

                /**
                 * The meta object literal for the '{@link pl.zgora.uz.imgpro.model.diagram.impl.OutputConnectorImpl <em>Output Connector</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.OutputConnectorImpl
                 * @see pl.zgora.uz.imgpro.model.diagram.impl.DiagramPackageImpl#getOutputConnector()
                 * @generated
                 */
                EClass OUTPUT_CONNECTOR = eINSTANCE.getOutputConnector();

        }

} //DiagramPackage
