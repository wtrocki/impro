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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impro Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.ImproDiagram#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getImproDiagram()
 * @model
 * @generated
 */
public interface ImproDiagram extends EObject {
        /**
         * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
         * The list contents are of type {@link pl.zgora.uz.imgpro.model.diagram.DiagramElement}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Elements</em>' containment reference list.
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getImproDiagram_Elements()
         * @model containment="true"
         * @generated
         */
        EList<DiagramElement> getElements();

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model
         * @generated
         */
        EList<DiagramElement> getElementsOfClass(Class<?> class_);

} // ImproDiagram
