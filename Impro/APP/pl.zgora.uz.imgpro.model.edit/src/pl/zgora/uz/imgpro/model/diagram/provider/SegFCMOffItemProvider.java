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

import pl.zgora.uz.imgpro.model.diagram.DiagramPackage;
import pl.zgora.uz.imgpro.model.diagram.SegFCMOff;

/**
 * This is the item provider adapter for a {@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SegFCMOffItemProvider
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
        public SegFCMOffItemProvider(AdapterFactory adapterFactory) {
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

                        addFcm_off_clustersPropertyDescriptor(object);
                        addFcm_off_optionsPropertyDescriptor(object);
                        addFcm_off_thresholdPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Fcm off clusters feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addFcm_off_clustersPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_SegFCMOff_fcm_off_clusters_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SegFCMOff_fcm_off_clusters_feature", "_UI_SegFCMOff_type"),
                                 DiagramPackage.Literals.SEG_FCM_OFF__FCM_OFF_CLUSTERS,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Fcm off options feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addFcm_off_optionsPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_SegFCMOff_fcm_off_options_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SegFCMOff_fcm_off_options_feature", "_UI_SegFCMOff_type"),
                                 DiagramPackage.Literals.SEG_FCM_OFF__FCM_OFF_OPTIONS,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Fcm off threshold feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addFcm_off_thresholdPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_SegFCMOff_fcm_off_threshold_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_SegFCMOff_fcm_off_threshold_feature", "_UI_SegFCMOff_type"),
                                 DiagramPackage.Literals.SEG_FCM_OFF__FCM_OFF_THRESHOLD,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This returns SegFCMOff.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/SegFCMOff"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public String getText(Object object) {
                String label = ((SegFCMOff)object).getElementName();
                return label == null || label.length() == 0 ?
                        getString("_UI_SegFCMOff_type") :
                        getString("_UI_SegFCMOff_type") + " " + label;
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

                switch (notification.getFeatureID(SegFCMOff.class)) {
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_CLUSTERS:
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_OPTIONS:
                        case DiagramPackage.SEG_FCM_OFF__FCM_OFF_THRESHOLD:
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
