/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.zgora.uz.imgpro.model.diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Linker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.SourceLinker#getSourceFilePath <em>Source File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSourceLinker()
 * @model
 * @generated
 */
public interface SourceLinker extends EObject {
        /**
         * Returns the value of the '<em><b>Source File Path</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Source File Path</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Source File Path</em>' attribute.
         * @see #setSourceFilePath(String)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getSourceLinker_SourceFilePath()
         * @model
         * @generated
         */
        String getSourceFilePath();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.SourceLinker#getSourceFilePath <em>Source File Path</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Source File Path</em>' attribute.
         * @see #getSourceFilePath()
         * @generated
         */
        void setSourceFilePath(String value);

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model kind="operation" many="false"
         * @generated
         */
        EList<String> getDependencies();

} // SourceLinker
