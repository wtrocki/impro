/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.zgora.uz.imgpro.model.CommonInputOutputConstants;
import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;
import pl.zgora.uz.imgpro.model.diagram.InputConnector;
import pl.zgora.uz.imgpro.model.diagram.OutputConnector;
import pl.zgora.uz.imgpro.model.diagram.Phase;
import pl.zgora.uz.imgpro.model.diagram.SourceLinker;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Diagram Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl#getConnectedWith <em>Connected With</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl#getSourceLinker <em>Source Linker</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.DiagramElementImpl#getElementComment <em>Element Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends EObjectImpl implements
	DiagramElement {
    /**
         * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getConnections()
         * @generated
         * @ordered
         */
    protected EList<ElementConnection> connections;

    /**
         * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getInputs()
         * @generated
         * @ordered
         */
    protected EList<InputConnector> inputs;

    /**
         * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getOutputs()
         * @generated
         * @ordered
         */
    protected EList<OutputConnector> outputs;

    /**
         * The cached value of the '{@link #getConnectedWith() <em>Connected With</em>}' reference list.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getConnectedWith()
         * @generated
         * @ordered
         */
    protected EList<DiagramElement> connectedWith;

    /**
         * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getElementName()
         * @generated
         * @ordered
         */
    protected static final String ELEMENT_NAME_EDEFAULT = "user-defined";

    /**
         * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getElementName()
         * @generated
         * @ordered
         */
    protected String elementName = ELEMENT_NAME_EDEFAULT;

    /**
         * The cached value of the '{@link #getSourceLinker() <em>Source Linker</em>}' containment reference.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see #getSourceLinker()
         * @generated
         * @ordered
         */
    protected SourceLinker sourceLinker;

    /**
         * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getPhase()
         * @generated
         * @ordered
         */
    protected static final Phase PHASE_EDEFAULT = Phase.INPUT;

    /**
         * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see #getPhase()
         * @generated
         * @ordered
         */
    protected Phase phase = PHASE_EDEFAULT;

    /**
         * The default value of the '{@link #getElementComment() <em>Element Comment</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getElementComment()
         * @generated
         * @ordered
         */
    protected static final String ELEMENT_COMMENT_EDEFAULT = "Comment for this block";

    /**
         * The cached value of the '{@link #getElementComment() <em>Element Comment</em>}' attribute.
         * <!-- begin-user-doc --> <!--
     * end-user-doc -->
         * @see #getElementComment()
         * @generated
         * @ordered
         */
    protected String elementComment = ELEMENT_COMMENT_EDEFAULT;

    protected DiagramElementImpl() {
	super();
	// Really bad code :)
	final String simpleName = this.getClass().getSimpleName();
	setElementName(simpleName.substring(0, simpleName.length() - 4));
    }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */

    @Override
    protected EClass eStaticClass() {
                return DiagramPackage.Literals.DIAGRAM_ELEMENT;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public EList<ElementConnection> getConnections() {
                if (connections == null) {
                        connections = new EObjectContainmentEList<ElementConnection>(ElementConnection.class, this, DiagramPackage.DIAGRAM_ELEMENT__CONNECTIONS);
                }
                return connections;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */

    public String getElementName() {
                return elementName;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */

    public void setElementName(String newElementName) {
                String oldElementName = elementName;
                elementName = newElementName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_NAME, oldElementName, elementName));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public SourceLinker getSourceLinker() {
                return sourceLinker;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public NotificationChain basicSetSourceLinker(SourceLinker newSourceLinker,
	    NotificationChain msgs) {
                SourceLinker oldSourceLinker = sourceLinker;
                sourceLinker = newSourceLinker;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER, oldSourceLinker, newSourceLinker);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setSourceLinker(SourceLinker newSourceLinker) {
                if (newSourceLinker != sourceLinker) {
                        NotificationChain msgs = null;
                        if (sourceLinker != null)
                                msgs = ((InternalEObject)sourceLinker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER, null, msgs);
                        if (newSourceLinker != null)
                                msgs = ((InternalEObject)newSourceLinker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER, null, msgs);
                        msgs = basicSetSourceLinker(newSourceLinker, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER, newSourceLinker, newSourceLinker));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public Phase getPhase() {
                return phase;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setPhase(Phase newPhase) {
                Phase oldPhase = phase;
                phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__PHASE, oldPhase, phase));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public String getElementComment() {
                return elementComment;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public void setElementComment(String newElementComment) {
                String oldElementComment = elementComment;
                elementComment = newElementComment;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_COMMENT, oldElementComment, elementComment));
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */

    public EList<InputConnector> getInputs() {
                if (inputs == null) {
                        inputs = new EObjectContainmentEList<InputConnector>(InputConnector.class, this, DiagramPackage.DIAGRAM_ELEMENT__INPUTS);
                }
                return inputs;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */

    public EList<OutputConnector> getOutputs() {
                if (outputs == null) {
                        outputs = new EObjectContainmentEList<OutputConnector>(OutputConnector.class, this, DiagramPackage.DIAGRAM_ELEMENT__OUTPUTS);
                }
                return outputs;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public EList<DiagramElement> getConnectedWith() {
                if (connectedWith == null) {
                        connectedWith = new EObjectResolvingEList<DiagramElement>(DiagramElement.class, this, DiagramPackage.DIAGRAM_ELEMENT__CONNECTED_WITH);
                }
                return connectedWith;
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */

    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
	    int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTIONS:
                                return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
                        case DiagramPackage.DIAGRAM_ELEMENT__INPUTS:
                                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
                        case DiagramPackage.DIAGRAM_ELEMENT__OUTPUTS:
                                return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
                        case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER:
                                return basicSetSourceLinker(null, msgs);
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
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTIONS:
                                return getConnections();
                        case DiagramPackage.DIAGRAM_ELEMENT__INPUTS:
                                return getInputs();
                        case DiagramPackage.DIAGRAM_ELEMENT__OUTPUTS:
                                return getOutputs();
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTED_WITH:
                                return getConnectedWith();
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_NAME:
                                return getElementName();
                        case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER:
                                return getSourceLinker();
                        case DiagramPackage.DIAGRAM_ELEMENT__PHASE:
                                return getPhase();
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_COMMENT:
                                return getElementComment();
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
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTIONS:
                                getConnections().clear();
                                getConnections().addAll((Collection<? extends ElementConnection>)newValue);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__INPUTS:
                                getInputs().clear();
                                getInputs().addAll((Collection<? extends InputConnector>)newValue);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__OUTPUTS:
                                getOutputs().clear();
                                getOutputs().addAll((Collection<? extends OutputConnector>)newValue);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTED_WITH:
                                getConnectedWith().clear();
                                getConnectedWith().addAll((Collection<? extends DiagramElement>)newValue);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_NAME:
                                setElementName((String)newValue);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER:
                                setSourceLinker((SourceLinker)newValue);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__PHASE:
                                setPhase((Phase)newValue);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_COMMENT:
                                setElementComment((String)newValue);
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
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTIONS:
                                getConnections().clear();
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__INPUTS:
                                getInputs().clear();
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__OUTPUTS:
                                getOutputs().clear();
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTED_WITH:
                                getConnectedWith().clear();
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_NAME:
                                setElementName(ELEMENT_NAME_EDEFAULT);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER:
                                setSourceLinker((SourceLinker)null);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__PHASE:
                                setPhase(PHASE_EDEFAULT);
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_COMMENT:
                                setElementComment(ELEMENT_COMMENT_EDEFAULT);
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
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTIONS:
                                return connections != null && !connections.isEmpty();
                        case DiagramPackage.DIAGRAM_ELEMENT__INPUTS:
                                return inputs != null && !inputs.isEmpty();
                        case DiagramPackage.DIAGRAM_ELEMENT__OUTPUTS:
                                return outputs != null && !outputs.isEmpty();
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTED_WITH:
                                return connectedWith != null && !connectedWith.isEmpty();
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_NAME:
                                return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
                        case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER:
                                return sourceLinker != null;
                        case DiagramPackage.DIAGRAM_ELEMENT__PHASE:
                                return phase != PHASE_EDEFAULT;
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_COMMENT:
                                return ELEMENT_COMMENT_EDEFAULT == null ? elementComment != null : !ELEMENT_COMMENT_EDEFAULT.equals(elementComment);
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
                result.append(" (elementName: ");
                result.append(elementName);
                result.append(", phase: ");
                result.append(phase);
                result.append(", elementComment: ");
                result.append(elementComment);
                result.append(')');
                return result.toString();
        }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected void createInputWithName(String name) {
	final InputConnector input = DiagramFactory.eINSTANCE
		.createInputConnector();
	input.setTypeName(name);
	getInputs().add(input);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected void createOutputWithName(String name) {
	final OutputConnector output = DiagramFactory.eINSTANCE
		.createOutputConnector();
	output.setTypeName(name);
	getOutputs().add(output);
    }

    public void initIOContainers() {
	createInputWithName(CommonInputOutputConstants.FILE_LIST_ARG);
	createOutputWithName(CommonInputOutputConstants.FILE_LIST_ARG);
    }
} // DiagramElementImpl
