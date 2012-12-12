/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.ui.properties.composite;

import java.util.ArrayList;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;

import pl.zgora.uz.imgpro.model.diagram.provider.DiagramItemProviderAdapterFactory;

public abstract class AbstractImproPropertiesComposite extends Composite {

    public final static ComposedAdapterFactory ADAPTER_FACTORY;
    protected EObject be;
    protected IDiagramEditor editor;
    protected final DataBindingContext bindingContext;
    protected final ArrayList<Widget> widgets = new ArrayList<Widget>();
    protected final ArrayList<Binding> bindings = new ArrayList<Binding>();
    protected final Composite parent;
    protected final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    static {
	ADAPTER_FACTORY = new ComposedAdapterFactory(
		ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	ADAPTER_FACTORY
		.addAdapterFactory(new ResourceItemProviderAdapterFactory());
	ADAPTER_FACTORY
		.addAdapterFactory(new DiagramItemProviderAdapterFactory());
	;
	ADAPTER_FACTORY
		.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    }

    /**
     * NB! Must call setEObject for updating contents and rebuild the UI.
     * 
     * @param parent
     * @param style
     */
    public AbstractImproPropertiesComposite(Composite parent, int style) {
	super(parent, style);
	this.parent = parent;
	bindingContext = new DataBindingContext();
	addDisposeListener(new DisposeListener() {
	    public void widgetDisposed(DisposeEvent e) {
		toolkit.dispose();
	    }
	});
	toolkit.adapt(this);
	toolkit.paintBordersFor(this);
	setLayout(new GridLayout(4, false));
    }

    /**
     * This method is called when setEObject is called and this should recreate
     * all bindings and widgets for the component.
     */
    public abstract void createBindings();

    protected Text createTextInput(String name, boolean multiLine,
	    boolean editable) {
	createLabel(name);

	int flag = SWT.BORDER;
	if (multiLine) {
	    flag |= SWT.BORDER | SWT.WRAP | SWT.MULTI;
	}
	Text text = new Text(this, flag);
	if (!editable) {
	    text.setEnabled(false);
	    text.setEditable(false);
	}
	GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1);
	if (multiLine) {
	    data.heightHint = 50;
	}
	text.setLayoutData(data);
	toolkit.adapt(text, true, true);
	widgets.add(text);

	return text;
    }

    protected Text createIntInput(String name) {
	createLabel(name);

	Text text = new Text(this, SWT.BORDER);
	text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
	toolkit.adapt(text, true, true);
	widgets.add(text);
	return text;
    }

    protected Button createBooleanInput(String name) {
	createLabel(name);

	Button button = new Button(this, SWT.CHECK);
	button.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3,
		1));
	toolkit.adapt(button, true, true);
	widgets.add(button);
	return button;
    }

    protected ComboViewer createComboBoxInput(String displayName) {
	createLabel(displayName);

	ComboViewer comboElement = new ComboViewer(this, SWT.READ_ONLY);
	final Combo combo = comboElement.getCombo();
	combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3,
		1));
	toolkit.adapt(combo, true, true);
	widgets.add(combo);
	return comboElement;
    }

    protected void createLabel(String name) {
	Label label = new Label(this, SWT.NONE);
	label.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
	toolkit.adapt(label, true, true);
	label.setText(name);
	widgets.add(label);
    }

    protected Text createPathInput(String name) {
	createLabel(name);

	int flag = SWT.BORDER | SWT.READ_ONLY;
	final Text text = new Text(this, flag);
	GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false);
	text.setLayoutData(data);
	toolkit.adapt(text, true, true);
	widgets.add(text);

	Button browseButton = new Button(this, SWT.NONE);
	browseButton.setText("Browse..");
	toolkit.adapt(browseButton, true, true);
	widgets.add(browseButton);

	browseButton.addSelectionListener(new SelectionAdapter() {

	    
	    public void widgetSelected(SelectionEvent e) {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
			getShell(), null, false, "Select a images container:");
		dialog.setTitle("Image selection");
		dialog.setMessage("Select images folder");
		dialog.open();
		if (dialog.getReturnCode() == Dialog.OK) {
		    final Object[] result = dialog.getResult();
		    if (result != null && result.length == 1) {
			final Object firstResult = result[0];
			if (firstResult instanceof IPath) {
			    final IResource resource = ResourcesPlugin
				    .getWorkspace().getRoot()
				    .findMember((IPath) firstResult);
			    text.setText(resource.getLocation()
				    .addTrailingSeparator().toOSString());
			}
		    }
		}
	    }
	});

	return text;
    }

    protected void bind(final EStructuralFeature a, final Text text) {

	Object eGet = be.eGet(a);
	if (eGet != null) {
	    text.setText(eGet.toString());
	}

	IObservableValue textObserver = SWTObservables.observeText(text,
		SWT.Modify);
	textObserver.addValueChangeListener(new IValueChangeListener() {

	    public void handleValueChange(final ValueChangeEvent e) {

		final Object property = be.eGet(a);
		if (!text.getText().equals(property)) {
		    TransactionalEditingDomain editingDomain = editor
			    .getEditingDomain();
		    editingDomain.getCommandStack().execute(
			    new RecordingCommand(editingDomain) {
				
				protected void doExecute() {
				    be.eSet(a, e.diff.getNewValue());
				}
			    });
		}
	    }
	});

	text.addFocusListener(new FocusListener() {

	    public void focusGained(FocusEvent e) {
	    }

	    public void focusLost(FocusEvent e) {
		// editor.showErrorMessage(null);
	    }
	});
    }

    protected void bindBoolean(final EStructuralFeature a, final Button button) {
	bindBoolean(a, button, be);
    }

    protected void bindBoolean(final EStructuralFeature a, final Button button,
	    final EObject object) {
	button.setSelection((Boolean) object.eGet(a));
	IObservableValue buttonObserver = SWTObservables
		.observeSelection(button);
	buttonObserver.addValueChangeListener(new IValueChangeListener() {

	    public void handleValueChange(ValueChangeEvent event) {

		if (!object.eGet(a).equals(button.getSelection())) {
		    TransactionalEditingDomain editingDomain = editor
			    .getEditingDomain();
		    editingDomain.getCommandStack().execute(
			    new RecordingCommand(editingDomain) {
				
				protected void doExecute() {
				    object.eSet(a, button.getSelection());
				}
			    });
		}
	    }
	});

	button.addFocusListener(new FocusListener() {

	    public void focusGained(FocusEvent e) {
	    }

	    public void focusLost(FocusEvent e) {
		// editor.showErrorMessage(null);
	    }
	});
    }

    protected void bindInt(final EStructuralFeature a, final Text text) {

	text.addVerifyListener(new VerifyListener() {

	    public void verifyText(VerifyEvent e) {
		String string = e.text;
		char[] chars = new char[string.length()];
		string.getChars(0, chars.length, chars, 0);
		for (int i = 0; i < chars.length; i++) {
		    if (!('0' <= chars[i] && chars[i] <= '9')) {
			e.doit = false;
			return;
		    }
		}
	    }
	});

	Object eGet = be.eGet(a);
	if (eGet != null) {
	    text.setText(eGet.toString());
	}

	IObservableValue textObserveTextObserveWidget = SWTObservables
		.observeText(text, SWT.Modify);
	textObserveTextObserveWidget
		.addValueChangeListener(new IValueChangeListener() {

		    public void handleValueChange(ValueChangeEvent event) {

			try {
			    final int i = Integer.parseInt(text.getText());
			    if (!be.eGet(a).equals(i)) {
				setFeatureValue(i);
			    }
			} catch (NumberFormatException e) {
			    // Intentionaly empty.
			}
		    }

		    private void setFeatureValue(final int i) {
			RecordingCommand command = new RecordingCommand(editor
				.getEditingDomain()) {

			    
			    protected void doExecute() {
				be.eSet(a, i);
			    }
			};
			editor.getEditingDomain().getCommandStack()
				.execute(command);
			// if (editor.getDiagnostics() != null) {
			// // revert the change and display error status
			// // message.
			// text.setText((String) be.eGet(a));
			// editor.showErrorMessage(editor
			// .getDiagnostics().getMessage());
			// } else
			// editor.showErrorMessage(null);
		    }
		});

	text.addFocusListener(new FocusListener() {

	    public void focusGained(FocusEvent e) {
	    }

	    public void focusLost(FocusEvent e) {
		// editor.showErrorMessage(null);
	    }
	});
    }

    /**
     * @param comboBoxInput
     * @param propertyName
     */
    protected void bindEnumToCombo(final ComboViewer comboBoxInput,
	    final String propertyName, Object input) {
	comboBoxInput.setContentProvider(ArrayContentProvider.getInstance());
	comboBoxInput.setInput(input);
	IObservableValue widgetObservable = ViewersObservables
		.observeSingleSelection(comboBoxInput);
	bindingContext.bindValue(widgetObservable,
		PojoObservables.observeValue(be, propertyName));
    }

    protected void cleanBindings() {
	for (Binding b : bindings) {
	    b.dispose();
	}
	bindings.clear();

	for (Widget w : widgets) {
	    w.dispose();
	}
	widgets.clear();
    }

    public void setEObject(EObject be) {
	this.be = be;
	cleanBindings();
	if (be != null) {
	    createBindings();
	}
	layout(true, true);
    }

    public void setDiagramEditor(IDiagramEditor diagramEditor) {
	this.editor = diagramEditor;
    }

}