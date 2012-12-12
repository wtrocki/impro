/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pl.zgora.uz.imgpro.model.diagram.DiagramElement;
import pl.zgora.uz.imgpro.model.diagram.DiagramFactory;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;

/**
 * This is the item provider adapter for a {@link pl.zgora.uz.imgpro.model.diagram.DiagramElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramElementItemProvider
        extends ItemProviderAdapter
        implements
                IEditingDomainItemProvider,
                IStructuredItemContentProvider,
                ITreeItemContentProvider,
                IItemLabelProvider,
                IItemPropertySource {
        /**
         * This constructs an instance from a factory and a notifier.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DiagramElementItemProvider(AdapterFactory adapterFactory) {
                super(adapterFactory);
        }

        /**
         * This returns the property descriptors for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
                if (itemPropertyDescriptors == null) {
                        super.getPropertyDescriptors(object);

                        addConnectedWithPropertyDescriptor(object);
                        addElementNamePropertyDescriptor(object);
                        addPhasePropertyDescriptor(object);
                        addElementCommentPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Connected With feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addConnectedWithPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DiagramElement_connectedWith_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DiagramElement_connectedWith_feature", "_UI_DiagramElement_type"),
                                 DiagramPackage.Literals.DIAGRAM_ELEMENT__CONNECTED_WITH,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Element Name feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addElementNamePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DiagramElement_elementName_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DiagramElement_elementName_feature", "_UI_DiagramElement_type"),
                                 DiagramPackage.Literals.DIAGRAM_ELEMENT__ELEMENT_NAME,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Phase feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addPhasePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DiagramElement_phase_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DiagramElement_phase_feature", "_UI_DiagramElement_type"),
                                 DiagramPackage.Literals.DIAGRAM_ELEMENT__PHASE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Element Comment feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addElementCommentPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DiagramElement_elementComment_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DiagramElement_elementComment_feature", "_UI_DiagramElement_type"),
                                 DiagramPackage.Literals.DIAGRAM_ELEMENT__ELEMENT_COMMENT,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
         * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
         * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
                if (childrenFeatures == null) {
                        super.getChildrenFeatures(object);
                        childrenFeatures.add(DiagramPackage.Literals.DIAGRAM_ELEMENT__CONNECTIONS);
                        childrenFeatures.add(DiagramPackage.Literals.DIAGRAM_ELEMENT__INPUTS);
                        childrenFeatures.add(DiagramPackage.Literals.DIAGRAM_ELEMENT__OUTPUTS);
                        childrenFeatures.add(DiagramPackage.Literals.DIAGRAM_ELEMENT__SOURCE_LINKER);
                }
                return childrenFeatures;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        protected EStructuralFeature getChildFeature(Object object, Object child) {
                // Check the type of the specified child object and return the proper feature to use for
                // adding (see {@link AddCommand}) it as a child.

                return super.getChildFeature(object, child);
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public String getText(Object object) {
                String label = ((DiagramElement)object).getElementName();
                return label == null || label.length() == 0 ?
                        getString("_UI_DiagramElement_type") :
                        getString("_UI_DiagramElement_type") + " " + label;
        }

        /**
         * This handles model notifications by calling {@link #updateChildren} to update any cached
         * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public void notifyChanged(Notification notification) {
                updateChildren(notification);

                switch (notification.getFeatureID(DiagramElement.class)) {
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_NAME:
                        case DiagramPackage.DIAGRAM_ELEMENT__PHASE:
                        case DiagramPackage.DIAGRAM_ELEMENT__ELEMENT_COMMENT:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case DiagramPackage.DIAGRAM_ELEMENT__CONNECTIONS:
                        case DiagramPackage.DIAGRAM_ELEMENT__INPUTS:
                        case DiagramPackage.DIAGRAM_ELEMENT__OUTPUTS:
                        case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_LINKER:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                                return;
                }
                super.notifyChanged(notification);
        }

        /**
         * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
         * that can be created under this object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
                super.collectNewChildDescriptors(newChildDescriptors, object);

                newChildDescriptors.add
                        (createChildParameter
                                (DiagramPackage.Literals.DIAGRAM_ELEMENT__CONNECTIONS,
                                 DiagramFactory.eINSTANCE.createElementConnection()));

                newChildDescriptors.add
                        (createChildParameter
                                (DiagramPackage.Literals.DIAGRAM_ELEMENT__INPUTS,
                                 DiagramFactory.eINSTANCE.createInputConnector()));

                newChildDescriptors.add
                        (createChildParameter
                                (DiagramPackage.Literals.DIAGRAM_ELEMENT__OUTPUTS,
                                 DiagramFactory.eINSTANCE.createOutputConnector()));

                newChildDescriptors.add
                        (createChildParameter
                                (DiagramPackage.Literals.DIAGRAM_ELEMENT__SOURCE_LINKER,
                                 DiagramFactory.eINSTANCE.createSourceLinker()));
        }

        /**
         * Return the resource locator for this item provider's resources.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public ResourceLocator getResourceLocator() {
                return ImgproEditPlugin.INSTANCE;
        }

}
