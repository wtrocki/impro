/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.zgora.uz.imgpro.model.diagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getCrossValidationType <em>Cross Validation Type</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getForwardSelection()
 * @model
 * @generated
 */
public interface ForwardSelection extends DiagramElement {
        /**
         * Returns the value of the '<em><b>Cross Validation Type</b></em>' attribute.
         * The default value is <code>""</code>.
         * The literals are from the enumeration {@link pl.zgora.uz.imgpro.model.diagram.CrossValidationType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Cross Validation Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Cross Validation Type</em>' attribute.
         * @see pl.zgora.uz.imgpro.model.diagram.CrossValidationType
         * @see #setCrossValidationType(CrossValidationType)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getForwardSelection_CrossValidationType()
         * @model default="" required="true"
         * @generated
         */
        CrossValidationType getCrossValidationType();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection#getCrossValidationType <em>Cross Validation Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Cross Validation Type</em>' attribute.
         * @see pl.zgora.uz.imgpro.model.diagram.CrossValidationType
         * @see #getCrossValidationType()
         * @generated
         */
        void setCrossValidationType(CrossValidationType value);

        /**
         * Returns the value of the '<em><b>Features</b></em>' attribute list.
         * The list contents are of type {@link pl.zgora.uz.imgpro.model.diagram.Features}.
         * The literals are from the enumeration {@link pl.zgora.uz.imgpro.model.diagram.Features}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Features</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Features</em>' attribute list.
         * @see pl.zgora.uz.imgpro.model.diagram.Features
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getForwardSelection_Features()
         * @model
         * @generated
         */
        EList<Features> getFeatures();

        /**
         * Returns the value of the '<em><b>Classifiers</b></em>' attribute list.
         * The list contents are of type {@link pl.zgora.uz.imgpro.model.diagram.Classifier}.
         * The literals are from the enumeration {@link pl.zgora.uz.imgpro.model.diagram.Classifier}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Classifiers</em>' attribute list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Classifiers</em>' attribute list.
         * @see pl.zgora.uz.imgpro.model.diagram.Classifier
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getForwardSelection_Classifiers()
         * @model
         * @generated
         */
        EList<Classifier> getClassifiers();

} // ForwardSelection
