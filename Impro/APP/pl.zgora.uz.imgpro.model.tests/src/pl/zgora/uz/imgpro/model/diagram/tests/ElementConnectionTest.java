/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.ElementConnection;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Element Connection</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class ElementConnectionTest extends TestCase {

    /**
         * The fixture for this Element Connection test case.
         * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
         * @generated
         */
    protected ElementConnection fixture = null;

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
    public static void main(String[] args) {
                TestRunner.run(ElementConnectionTest.class);
        }

    /**
     * Constructs a new Element Connection test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ElementConnectionTest(String name) {
                super(name);
        }

    /**
     * Sets the fixture for this Element Connection test case. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void setFixture(ElementConnection fixture) {
                this.fixture = fixture;
        }

    /**
         * Returns the fixture for this Element Connection test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ElementConnection getFixture() {
                return fixture;
        }

/**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
    
    @Override
protected void setUp() throws Exception {
                setFixture(DiagramFactory.eINSTANCE.createElementConnection());
        }

    /**
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see junit.framework.TestCase#tearDown()
         * @generated
         */
    
    @Override
protected void tearDown() throws Exception {
                setFixture(null);
        }

} // ElementConnectionTest
