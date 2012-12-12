/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
import pl.zgora.uz.imgpro.model.diagram.FullSelection;

/**
 * This is the item provider adapter for a {@link pl.zgora.uz.imgpro.model.diagram.FullSelection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FullSelectionItemProvider
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
        public FullSelectionItemProvider(AdapterFactory adapterFactory) {
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

                        addCrossValidationTypePropertyDescriptor(object);
                        addMinimumFeaturesPropertyDescriptor(object);
                        addMaximumFeaturesPropertyDescriptor(object);
                        addFeaturesPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Cross Validation Type feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addCrossValidationTypePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FullSelection_crossValidationType_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FullSelection_crossValidationType_feature", "_UI_FullSelection_type"),
                                 DiagramPackage.Literals.FULL_SELECTION__CROSS_VALIDATION_TYPE,
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
                                 getString("_UI_FullSelection_features_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FullSelection_features_feature", "_UI_FullSelection_type"),
                                 DiagramPackage.Literals.FULL_SELECTION__FEATURES,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Minimum Features feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addMinimumFeaturesPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FullSelection_minimumFeatures_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FullSelection_minimumFeatures_feature", "_UI_FullSelection_type"),
                                 DiagramPackage.Literals.FULL_SELECTION__MINIMUM_FEATURES,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Maximum Features feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addMaximumFeaturesPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_FullSelection_maximumFeatures_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_FullSelection_maximumFeatures_feature", "_UI_FullSelection_type"),
                                 DiagramPackage.Literals.FULL_SELECTION__MAXIMUM_FEATURES,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This returns FullSelection.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/FullSelection"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public String getText(Object object) {
                String label = ((FullSelection)object).getElementName();
                return label == null || label.length() == 0 ?
                        getString("_UI_FullSelection_type") :
                        getString("_UI_FullSelection_type") + " " + label;
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

                switch (notification.getFeatureID(FullSelection.class)) {
                        case DiagramPackage.FULL_SELECTION__CROSS_VALIDATION_TYPE:
                        case DiagramPackage.FULL_SELECTION__MINIMUM_FEATURES:
                        case DiagramPackage.FULL_SELECTION__MAXIMUM_FEATURES:
                        case DiagramPackage.FULL_SELECTION__FEATURES:
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
