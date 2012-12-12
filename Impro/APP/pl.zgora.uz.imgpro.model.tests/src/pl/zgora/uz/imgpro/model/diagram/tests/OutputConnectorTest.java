/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.tests;

import junit.textui.TestRunner;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.OutputConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputConnectorTest extends ConnectorTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(OutputConnectorTest.class);
        }

        /**
         * Constructs a new Output Connector test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OutputConnectorTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Output Connector test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        protected OutputConnector getFixture() {
                return (OutputConnector)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        
        @Override
        protected void setUp() throws Exception {
                setFixture(DiagramFactory.eINSTANCE.createOutputConnector());
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#tearDown()
         * @generated
         */
        
        @Override
        protected void tearDown() throws Exception {
                setFixture(null);
        }

} //OutputConnectorTest
