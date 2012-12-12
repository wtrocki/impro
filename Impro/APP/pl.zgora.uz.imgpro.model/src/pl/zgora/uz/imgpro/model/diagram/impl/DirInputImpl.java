/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pl.zgora.uz.imgpro.model.CommonInputOutputConstants;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.DirInput;
import pl.zgora.uz.imgpro.model.diagram.DirectoryType;
import pl.zgora.uz.imgpro.model.diagram.Phase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dir Input</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DirInputImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DirInputImpl#getDirectory <em>Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirInputImpl extends DiagramElementImpl implements DirInput {

    public static final String DIR_INPUT_IDENTIFIER = "DirInput";

    /**
         * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getFilter()
         * @generated
         * @ordered
         */
    protected static final String FILTER_EDEFAULT = "*.tif";

    /**
         * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getFilter()
         * @generated
         * @ordered
         */
    protected String filter = FILTER_EDEFAULT;

    /**
         * The cached value of the '{@link #getDirectory() <em>Directory</em>}' containment reference.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getDirectory()
         * @generated
         * @ordered
         */
    protected DirectoryType directory;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected DirInputImpl() {
	super();
	setElementName(DIR_INPUT_IDENTIFIER);
	setPhase(Phase.INPUT);
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
protected EClass eStaticClass() {
                return DiagramPackage.Literals.DIR_INPUT;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public DirectoryType getDirectory() {
                return directory;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public NotificationChain basicSetDirectory(DirectoryType newDirectory,
	    NotificationChain msgs) {
                DirectoryType oldDirectory = directory;
                directory = newDirectory;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.DIR_INPUT__DIRECTORY, oldDirectory, newDirectory);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setDirectory(DirectoryType newDirectory) {
                if (newDirectory != directory) {
                        NotificationChain msgs = null;
                        if (directory != null)
                                msgs = ((InternalEObject)directory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.DIR_INPUT__DIRECTORY, null, msgs);
                        if (newDirectory != null)
                                msgs = ((InternalEObject)newDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.DIR_INPUT__DIRECTORY, null, msgs);
                        msgs = basicSetDirectory(newDirectory, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIR_INPUT__DIRECTORY, newDirectory, newDirectory));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public NotificationChain eInverseRemove(InternalEObject otherEnd,
	    int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DiagramPackage.DIR_INPUT__DIRECTORY:
                                return basicSetDirectory(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public String getFilter() {
                return filter;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    public void setFilter(String newFilter) {
                String oldFilter = filter;
                filter = newFilter;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIR_INPUT__FILTER, oldFilter, filter));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.DIR_INPUT__FILTER:
                                return getFilter();
                        case DiagramPackage.DIR_INPUT__DIRECTORY:
                                return getDirectory();
                }
                return super.eGet(featureID, resolve, coreType);
        }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case DiagramPackage.DIR_INPUT__DIRECTORY:
	    if (newValue instanceof DirectoryType) {
		setDirectory((DirectoryType) newValue);
		return;
	    } else if (newValue instanceof String) {
		final DirectoryType directoryType = DiagramFactory.eINSTANCE
			.createDirectoryType();
		directoryType.setName(newValue.toString());
		setDirectory(directoryType);
		return;
	    }
	case DiagramPackage.DIR_INPUT__FILTER: {
	    if (newValue instanceof String) {
		setFilter(newValue.toString());
		return;
	    }
	}
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
                        case DiagramPackage.DIR_INPUT__FILTER:
                                setFilter(FILTER_EDEFAULT);
                                return;
                        case DiagramPackage.DIR_INPUT__DIRECTORY:
                                setDirectory((DirectoryType)null);
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
                        case DiagramPackage.DIR_INPUT__FILTER:
                                return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
                        case DiagramPackage.DIR_INPUT__DIRECTORY:
                                return directory != null;
                }
                return super.eIsSet(featureID);
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    
    @Override
public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (filter: ");
                result.append(filter);
                result.append(')');
                return result.toString();
        }

    
    public void initIOContainers() {
	createOutputWithName(CommonInputOutputConstants.FILE_LIST_ARG);
    }

} // DirInputImpl
