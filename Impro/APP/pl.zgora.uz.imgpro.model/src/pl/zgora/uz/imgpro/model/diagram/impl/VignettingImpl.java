/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.zgora.uz.imgpro.model.diagram.impl;

import org.eclipse.emf.ecore.EClass;

import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.Phase;
import pl.zgora.uz.imgpro.model.diagram.Vignetting;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Vignetting</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class VignettingImpl extends DiagramElementImpl implements Vignetting {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected VignettingImpl() {
	super();
	setPhase(Phase.PREPROCESSING);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return DiagramPackage.Literals.VIGNETTING;
    }

} // VignettingImpl
