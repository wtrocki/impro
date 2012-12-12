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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pl.zgora.uz.imgpro.model.diagram.Classification;
import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;

/**
 * This is the item provider adapter for a {@link pl.zgora.uz.imgpro.model.diagram.Classification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassificationItemProvider
        extends DiagramElementItemProvider
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
        public ClassificationItemProvider(AdapterFactory adapterFactory) {
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

                        addClassificationStylePropertyDescriptor(object);
                        addFeaturesPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Classification Style feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addClassificationStylePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Classification_classificationStyle_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Classification_classificationStyle_feature", "_UI_Classification_type"),
                                 DiagramPackage.Literals.CLASSIFICATION__CLASSIFICATION_STYLE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Features feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addFeaturesPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Classification_features_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Classification_features_feature", "_UI_Classification_type"),
                                 DiagramPackage.Literals.CLASSIFICATION__FEATURES,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This returns Classification.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/Classification"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public String getText(Object object) {
                String label = ((Classification)object).getElementName();
                return label == null || label.length() == 0 ?
                        getString("_UI_Classification_type") :
                        getString("_UI_Classification_type") + " " + label;
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

                switch (notification.getFeatureID(Classification.class)) {
                        case DiagramPackage.CLASSIFICATION__CLASSIFICATION_STYLE:
                        case DiagramPackage.CLASSIFICATION__FEATURES:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
        }

}
