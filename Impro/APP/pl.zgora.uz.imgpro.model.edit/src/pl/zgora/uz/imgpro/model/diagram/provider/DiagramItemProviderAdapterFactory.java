/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.model.diagram.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import pl.zgora.uz.imgpro.model.diagram.util.DiagramAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramItemProviderAdapterFactory extends DiagramAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
        /**
         * This keeps track of the root adapter factory that delegates to this adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ComposedAdapterFactory parentAdapterFactory;

        /**
         * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected IChangeNotifier changeNotifier = new ChangeNotifier();

        /**
         * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected Collection<Object> supportedTypes = new ArrayList<Object>();

        /**
         * This constructs an instance.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DiagramItemProviderAdapterFactory() {
                supportedTypes.add(IEditingDomainItemProvider.class);
                supportedTypes.add(IStructuredItemContentProvider.class);
                supportedTypes.add(ITreeItemContentProvider.class);
                supportedTypes.add(IItemLabelProvider.class);
                supportedTypes.add(IItemPropertySource.class);
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.ImproDiagram} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ImproDiagramItemProvider improDiagramItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.ImproDiagram}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createImproDiagramAdapter() {
                if (improDiagramItemProvider == null) {
                        improDiagramItemProvider = new ImproDiagramItemProvider(this);
                }

                return improDiagramItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.SourceLinker} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SourceLinkerItemProvider sourceLinkerItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.SourceLinker}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createSourceLinkerAdapter() {
                if (sourceLinkerItemProvider == null) {
                        sourceLinkerItemProvider = new SourceLinkerItemProvider(this);
                }

                return sourceLinkerItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.DirInput} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DirInputItemProvider dirInputItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.DirInput}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createDirInputAdapter() {
                if (dirInputItemProvider == null) {
                        dirInputItemProvider = new DirInputItemProvider(this);
                }

                return dirInputItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.ElementConnection} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ElementConnectionItemProvider elementConnectionItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.ElementConnection}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createElementConnectionAdapter() {
                if (elementConnectionItemProvider == null) {
                        elementConnectionItemProvider = new ElementConnectionItemProvider(this);
                }

                return elementConnectionItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.Connector} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ConnectorItemProvider connectorItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.Connector}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createConnectorAdapter() {
                if (connectorItemProvider == null) {
                        connectorItemProvider = new ConnectorItemProvider(this);
                }

                return connectorItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.CustomElement} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CustomElementItemProvider customElementItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.CustomElement}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createCustomElementAdapter() {
                if (customElementItemProvider == null) {
                        customElementItemProvider = new CustomElementItemProvider(this);
                }

                return customElementItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.InputConnector} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected InputConnectorItemProvider inputConnectorItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.InputConnector}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createInputConnectorAdapter() {
                if (inputConnectorItemProvider == null) {
                        inputConnectorItemProvider = new InputConnectorItemProvider(this);
                }

                return inputConnectorItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.OutputConnector} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OutputConnectorItemProvider outputConnectorItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.OutputConnector}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createOutputConnectorAdapter() {
                if (outputConnectorItemProvider == null) {
                        outputConnectorItemProvider = new OutputConnectorItemProvider(this);
                }

                return outputConnectorItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.DirectoryType} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DirectoryTypeItemProvider directoryTypeItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.DirectoryType}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createDirectoryTypeAdapter() {
                if (directoryTypeItemProvider == null) {
                        directoryTypeItemProvider = new DirectoryTypeItemProvider(this);
                }

                return directoryTypeItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.ImagePreview} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ImagePreviewItemProvider imagePreviewItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.ImagePreview}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createImagePreviewAdapter() {
                if (imagePreviewItemProvider == null) {
                        imagePreviewItemProvider = new ImagePreviewItemProvider(this);
                }

                return imagePreviewItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.Vignetting} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected VignettingItemProvider vignettingItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.Vignetting}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Adapter createVignettingAdapter() {
                if (vignettingItemProvider == null) {
                        vignettingItemProvider = new VignettingItemProvider(this);
                }

                return vignettingItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.Crop} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CropItemProvider cropItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.Crop}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createCropAdapter() {
                if (cropItemProvider == null) {
                        cropItemProvider = new CropItemProvider(this);
                }

                return cropItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.HistStretch} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected HistStretchItemProvider histStretchItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.HistStretch}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createHistStretchAdapter() {
                if (histStretchItemProvider == null) {
                        histStretchItemProvider = new HistStretchItemProvider(this);
                }

                return histStretchItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.NoiseRemove} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected NoiseRemoveItemProvider noiseRemoveItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.NoiseRemove}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createNoiseRemoveAdapter() {
                if (noiseRemoveItemProvider == null) {
                        noiseRemoveItemProvider = new NoiseRemoveItemProvider(this);
                }

                return noiseRemoveItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.ExtractFeatures} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ExtractFeaturesItemProvider extractFeaturesItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.ExtractFeatures}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createExtractFeaturesAdapter() {
                if (extractFeaturesItemProvider == null) {
                        extractFeaturesItemProvider = new ExtractFeaturesItemProvider(this);
                }

                return extractFeaturesItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ForwardSelectionItemProvider forwardSelectionItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.ForwardSelection}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createForwardSelectionAdapter() {
                if (forwardSelectionItemProvider == null) {
                        forwardSelectionItemProvider = new ForwardSelectionItemProvider(this);
                }

                return forwardSelectionItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.FullSelection} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected FullSelectionItemProvider fullSelectionItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.FullSelection}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createFullSelectionAdapter() {
                if (fullSelectionItemProvider == null) {
                        fullSelectionItemProvider = new FullSelectionItemProvider(this);
                }

                return fullSelectionItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.Classification} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ClassificationItemProvider classificationItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.Classification}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createClassificationAdapter() {
                if (classificationItemProvider == null) {
                        classificationItemProvider = new ClassificationItemProvider(this);
                }

                return classificationItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.Multiplication} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MultiplicationItemProvider multiplicationItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.Multiplication}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createMultiplicationAdapter() {
                if (multiplicationItemProvider == null) {
                        multiplicationItemProvider = new MultiplicationItemProvider(this);
                }

                return multiplicationItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.SegAT} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SegATItemProvider segATItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.SegAT}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createSegATAdapter() {
                if (segATItemProvider == null) {
                        segATItemProvider = new SegATItemProvider(this);
                }

                return segATItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.SegFCM} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SegFCMItemProvider segFCMItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.SegFCM}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createSegFCMAdapter() {
                if (segFCMItemProvider == null) {
                        segFCMItemProvider = new SegFCMItemProvider(this);
                }

                return segFCMItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SegFCMOffItemProvider segFCMOffItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.SegFCMOff}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createSegFCMOffAdapter() {
                if (segFCMOffItemProvider == null) {
                        segFCMOffItemProvider = new SegFCMOffItemProvider(this);
                }

                return segFCMOffItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.SegCLN} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SegCLNItemProvider segCLNItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.SegCLN}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createSegCLNAdapter() {
                if (segCLNItemProvider == null) {
                        segCLNItemProvider = new SegCLNItemProvider(this);
                }

                return segCLNItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.SegKM} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SegKMItemProvider segKMItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.SegKM}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createSegKMAdapter() {
                if (segKMItemProvider == null) {
                        segKMItemProvider = new SegKMItemProvider(this);
                }

                return segKMItemProvider;
        }

        /**
         * This keeps track of the one adapter used for all {@link pl.zgora.uz.imgpro.model.diagram.SegKMOff} instances.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SegKMOffItemProvider segKMOffItemProvider;

        /**
         * This creates an adapter for a {@link pl.zgora.uz.imgpro.model.diagram.SegKMOff}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter createSegKMOffAdapter() {
                if (segKMOffItemProvider == null) {
                        segKMOffItemProvider = new SegKMOffItemProvider(this);
                }

                return segKMOffItemProvider;
        }

        /**
         * This returns the root adapter factory that contains this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ComposeableAdapterFactory getRootAdapterFactory() {
                return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
        }

        /**
         * This sets the composed adapter factory that contains this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
                this.parentAdapterFactory = parentAdapterFactory;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public boolean isFactoryForType(Object type) {
                return supportedTypes.contains(type) || super.isFactoryForType(type);
        }

        /**
         * This implementation substitutes the factory itself as the key for the adapter.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Adapter adapt(Notifier notifier, Object type) {
                return super.adapt(notifier, this);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        
        @Override
        public Object adapt(Object object, Object type) {
                if (isFactoryForType(type)) {
                        Object adapter = super.adapt(object, type);
                        if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                                return adapter;
                        }
                }

                return null;
        }

        /**
         * This adds a listener.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void addListener(INotifyChangedListener notifyChangedListener) {
                changeNotifier.addListener(notifyChangedListener);
        }

        /**
         * This removes a listener.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void removeListener(INotifyChangedListener notifyChangedListener) {
                changeNotifier.removeListener(notifyChangedListener);
        }

        /**
         * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void fireNotifyChanged(Notification notification) {
                changeNotifier.fireNotifyChanged(notification);

                if (parentAdapterFactory != null) {
                        parentAdapterFactory.fireNotifyChanged(notification);
                }
        }

        /**
         * This disposes all of the item providers created by this factory. 
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void dispose() {
                if (improDiagramItemProvider != null) improDiagramItemProvider.dispose();
                if (sourceLinkerItemProvider != null) sourceLinkerItemProvider.dispose();
                if (dirInputItemProvider != null) dirInputItemProvider.dispose();
                if (directoryTypeItemProvider != null) directoryTypeItemProvider.dispose();
                if (elementConnectionItemProvider != null) elementConnectionItemProvider.dispose();
                if (connectorItemProvider != null) connectorItemProvider.dispose();
                if (customElementItemProvider != null) customElementItemProvider.dispose();
                if (inputConnectorItemProvider != null) inputConnectorItemProvider.dispose();
                if (outputConnectorItemProvider != null) outputConnectorItemProvider.dispose();
                if (imagePreviewItemProvider != null) imagePreviewItemProvider.dispose();
                if (vignettingItemProvider != null) vignettingItemProvider.dispose();
                if (cropItemProvider != null) cropItemProvider.dispose();
                if (histStretchItemProvider != null) histStretchItemProvider.dispose();
                if (noiseRemoveItemProvider != null) noiseRemoveItemProvider.dispose();
                if (multiplicationItemProvider != null) multiplicationItemProvider.dispose();
                if (segATItemProvider != null) segATItemProvider.dispose();
                if (segFCMItemProvider != null) segFCMItemProvider.dispose();
                if (segFCMOffItemProvider != null) segFCMOffItemProvider.dispose();
                if (segCLNItemProvider != null) segCLNItemProvider.dispose();
                if (segKMItemProvider != null) segKMItemProvider.dispose();
                if (segKMOffItemProvider != null) segKMOffItemProvider.dispose();
                if (extractFeaturesItemProvider != null) extractFeaturesItemProvider.dispose();
                if (forwardSelectionItemProvider != null) forwardSelectionItemProvider.dispose();
                if (fullSelectionItemProvider != null) fullSelectionItemProvider.dispose();
                if (classificationItemProvider != null) classificationItemProvider.dispose();
        }

}
