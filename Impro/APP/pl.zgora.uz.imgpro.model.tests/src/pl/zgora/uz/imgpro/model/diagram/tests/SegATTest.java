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
import pl.zgora.uz.imgpro.model.diagram.SegAT;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Seg AT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SegATTest extends DiagramElementTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(SegATTest.class);
        }

        /**
         * Constructs a new Seg AT test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SegATTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Seg AT test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        protected SegAT getFixture() {
                return (SegAT)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        
        @Override
        protected void setUp() throws Exception {
                setFixture(DiagramFactory.eINSTANCE.createSegAT());
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

} //SegATTest
