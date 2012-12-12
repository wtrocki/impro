/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.ImproDiagram;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Impro Diagram</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.ImproDiagramImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImproDiagramImpl extends EObjectImpl implements ImproDiagram {
    /**
         * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getElements()
         * @generated
         * @ordered
         */
    protected EList<DiagramElement> elements;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    protected ImproDiagramImpl() {
                super();
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.IMPRO_DIAGRAM;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public EList<DiagramElement> getElements() {
                if (elements == null) {
                        elements = new EObjectContainmentEList<DiagramElement>(DiagramElement.class, this, DiagramPackage.IMPRO_DIAGRAM__ELEMENTS);
                }
                return elements;
        }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    
    public EList<DiagramElement> getElementsOfClass(Class<?> class_) {
	EList<DiagramElement> returnElements = new BasicEList<DiagramElement>();
	for (DiagramElement element : elements) {
	    if (class_.isInstance(element)) {
		returnElements.add(element);
	    }
	}
	return returnElements;
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public NotificationChain eInverseRemove(InternalEObject otherEnd,
	    int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DiagramPackage.IMPRO_DIAGRAM__ELEMENTS:
                                return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.IMPRO_DIAGRAM__ELEMENTS:
                                return getElements();
                }
                return super.eGet(featureID, resolve, coreType);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    @SuppressWarnings("unchecked")
@Override
    
    public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DiagramPackage.IMPRO_DIAGRAM__ELEMENTS:
                                getElements().clear();
                                getElements().addAll((Collection<? extends DiagramElement>)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public void eUnset(int featureID) {
                switch (featureID) {
                        case DiagramPackage.IMPRO_DIAGRAM__ELEMENTS:
                                getElements().clear();
                                return;
                }
                super.eUnset(featureID);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case DiagramPackage.IMPRO_DIAGRAM__ELEMENTS:
                                return elements != null && !elements.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} // ImproDiagramImpl
