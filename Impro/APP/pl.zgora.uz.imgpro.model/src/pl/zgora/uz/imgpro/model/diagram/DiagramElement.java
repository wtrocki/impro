/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getConnections <em>Connections</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getInputs <em>Inputs</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getConnectedWith <em>Connected With</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getElementName <em>Element Name</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getSourceLinker <em>Source Linker</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getPhase <em>Phase</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getElementComment <em>Element Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {

    /**
         * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
         * The list contents are of type {@link pl.zgora.uz.imgpro.model.diagram.ElementConnection}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Connections</em>' containment reference list.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement_Connections()
         * @model containment="true"
         * @generated
         */
        EList<ElementConnection> getConnections();

/**
         * Returns the value of the '<em><b>Element Name</b></em>' attribute.
         * The default value is <code>"user-defined"</code>.
         * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @return the value of the '<em>Element Name</em>' attribute.
         * @see #setElementName(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement_ElementName()
         * @model default="user-defined" id="true"
         * @generated
         */
    String getElementName();

    /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getElementName <em>Element Name</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @param value the new value of the '<em>Element Name</em>' attribute.
         * @see #getElementName()
         * @generated
         */
    void setElementName(String value);

    /**
         * Returns the value of the '<em><b>Source Linker</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Source Linker</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Source Linker</em>' containment reference.
         * @see #setSourceLinker(SourceLinker)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement_SourceLinker()
         * @model containment="true" required="true"
         * @generated
         */
        SourceLinker getSourceLinker();

/**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getSourceLinker <em>Source Linker</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Source Linker</em>' containment reference.
         * @see #getSourceLinker()
         * @generated
         */
        void setSourceLinker(SourceLinker value);

/**
         * Returns the value of the '<em><b>Phase</b></em>' attribute.
         * The literals are from the enumeration {@link pl.zgora.uz.imgpro.model.diagram.Phase}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Phase</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Phase</em>' attribute.
         * @see pl.zgora.uz.imgpro.model.diagram.Phase
         * @see #setPhase(Phase)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement_Phase()
         * @model
         * @generated
         */
        Phase getPhase();

/**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getPhase <em>Phase</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Phase</em>' attribute.
         * @see pl.zgora.uz.imgpro.model.diagram.Phase
         * @see #getPhase()
         * @generated
         */
        void setPhase(Phase value);

/**
         * Returns the value of the '<em><b>Element Comment</b></em>' attribute.
         * The default value is <code>"Comment for this block"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Element Comment</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Element Comment</em>' attribute.
         * @see #setElementComment(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement_ElementComment()
         * @model default="Comment for this block"
         * @generated
         */
        String getElementComment();

/**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.DiagramElement#getElementComment <em>Element Comment</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Element Comment</em>' attribute.
         * @see #getElementComment()
         * @generated
         */
        void setElementComment(String value);

/**
         * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
         * The list contents are of type {@link pl.zgora.uz.imgpro.model.diagram.InputConnector}.
         * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @return the value of the '<em>Inputs</em>' containment reference list.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement_Inputs()
         * @model containment="true"
         * @generated
         */
    EList<InputConnector> getInputs();

    /**
         * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
         * The list contents are of type {@link pl.zgora.uz.imgpro.model.diagram.OutputConnector}.
         * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
         * @return the value of the '<em>Outputs</em>' containment reference list.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement_Outputs()
         * @model containment="true"
         * @generated
         */
    EList<OutputConnector> getOutputs();

    /**
         * Returns the value of the '<em><b>Connected With</b></em>' reference list.
         * The list contents are of type {@link pl.zgora.uz.imgpro.model.diagram.DiagramElement}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Connected With</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Connected With</em>' reference list.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getDiagramElement_ConnectedWith()
         * @model
         * @generated
         */
        EList<DiagramElement> getConnectedWith();

public void initIOContainers();

} // DiagramElement
