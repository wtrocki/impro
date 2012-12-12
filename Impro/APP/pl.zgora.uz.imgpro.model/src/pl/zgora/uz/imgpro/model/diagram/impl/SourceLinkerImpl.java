/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.zgora.uz.imgpro.model.diagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.SourceLinker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Linker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.zgora.uz.imgpro.model.diagram.impl.SourceLinkerImpl#getSourceFilePath <em>Source File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceLinkerImpl extends EObjectImpl implements SourceLinker {
        /**
         * The default value of the '{@link #getSourceFilePath() <em>Source File Path</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSourceFilePath()
         * @generated
         * @ordered
         */
        protected static final String SOURCE_FILE_PATH_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getSourceFilePath() <em>Source File Path</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSourceFilePath()
         * @generated
         * @ordered
         */
        protected String sourceFilePath = SOURCE_FILE_PATH_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SourceLinkerImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        protected EClass eStaticClass() {
                return DiagramPackage.Literals.SOURCE_LINKER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getSourceFilePath() {
                return sourceFilePath;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setSourceFilePath(String newSourceFilePath) {
                String oldSourceFilePath = sourceFilePath;
                sourceFilePath = newSourceFilePath;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SOURCE_LINKER__SOURCE_FILE_PATH, oldSourceFilePath, sourceFilePath));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<String> getDependencies() {
                // TODO: implement this method
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DiagramPackage.SOURCE_LINKER__SOURCE_FILE_PATH:
                                return getSourceFilePath();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DiagramPackage.SOURCE_LINKER__SOURCE_FILE_PATH:
                                setSourceFilePath((String)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case DiagramPackage.SOURCE_LINKER__SOURCE_FILE_PATH:
                                setSourceFilePath(SOURCE_FILE_PATH_EDEFAULT);
                                return;
                }
                super.eUnset(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case DiagramPackage.SOURCE_LINKER__SOURCE_FILE_PATH:
                                return SOURCE_FILE_PATH_EDEFAULT == null ? sourceFilePath != null : !SOURCE_FILE_PATH_EDEFAULT.equals(sourceFilePath);
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (sourceFilePath: ");
                result.append(sourceFilePath);
                result.append(')');
                return result.toString();
        }

} //SourceLinkerImpl
