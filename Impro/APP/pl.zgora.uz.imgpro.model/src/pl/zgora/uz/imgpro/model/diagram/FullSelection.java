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
 * A representation of the model object '<em><b>Full Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getCrossValidationType <em>Cross Validation Type</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getMinimumFeatures <em>Minimum Features</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getMaximumFeatures <em>Maximum Features</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getFullSelection()
 * @model
 * @generated
 */
public interface FullSelection extends DiagramElement {
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
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getFullSelection_CrossValidationType()
         * @model default="" required="true"
         * @generated
         */
        CrossValidationType getCrossValidationType();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getCrossValidationType <em>Cross Validation Type</em>}' attribute.
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
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getFullSelection_Features()
         * @model
         * @generated
         */
        EList<Features> getFeatures();

        /**
         * Returns the value of the '<em><b>Minimum Features</b></em>' attribute.
         * The default value is <code>"2"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Minimum Features</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Minimum Features</em>' attribute.
         * @see #setMinimumFeatures(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getFullSelection_MinimumFeatures()
         * @model default="2"
         * @generated
         */
        int getMinimumFeatures();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getMinimumFeatures <em>Minimum Features</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Minimum Features</em>' attribute.
         * @see #getMinimumFeatures()
         * @generated
         */
        void setMinimumFeatures(int value);

        /**
         * Returns the value of the '<em><b>Maximum Features</b></em>' attribute.
         * The default value is <code>"3"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Maximum Features</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Maximum Features</em>' attribute.
         * @see #setMaximumFeatures(int)
         * @see pl.zgora.uz.imgpro.model.diagram.DiagramPackage#getFullSelection_MaximumFeatures()
         * @model default="3"
         * @generated
         */
        int getMaximumFeatures();

        /**
         * Sets the value of the '{@link pl.zgora.uz.imgpro.model.diagram.FullSelection#getMaximumFeatures <em>Maximum Features</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Maximum Features</em>' attribute.
         * @see #getMaximumFeatures()
         * @generated
         */
        void setMaximumFeatures(int value);

} // FullSelection
