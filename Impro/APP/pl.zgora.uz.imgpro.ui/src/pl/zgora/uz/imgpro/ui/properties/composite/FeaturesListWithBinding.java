package pl.zgora.uz.imgpro.ui.properties.composite;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.core.databinding.observable.set.WritableSet;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;

import pl.zgora.uz.imgpro.model.diagram.Features;

public class FeaturesListWithBinding extends Composite {

    protected final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    public FeaturesListWithBinding(Composite parent, EAttribute featureField,
	    TransactionalEditingDomain editingDomain, EObject be,
	    DataBindingContext bindingContext) {
	super(parent, SWT.NONE);
	toolkit.adapt(this);
	createAndBindFeaturesViewer(featureField, editingDomain, be,
		bindingContext);
    }

    /**
     * @param featureField
     * @param be
     * @param editingDomain
     * @param bindingContext
     * 
     */
    private void createAndBindFeaturesViewer(EAttribute featureField,
	    final TransactionalEditingDomain editingDomain, EObject be,
	    DataBindingContext bindingContext) {
	// create
	final CheckboxTableViewer featuresViewer = CheckboxTableViewer
		.newCheckList(this, SWT.BORDER | SWT.MULTI);
	Table featuresTable = featuresViewer.getTable();
	GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
	layoutData.widthHint = 340;
	featuresTable.setLayoutData(layoutData);

	final List<Features> model = Arrays.asList(Features.values());

	final IObservableList observableList = EMFObservables.observeList(be,
		featureField);
	final IObservableSet set = new WritableSet(observableList,
		Features.class);

	observableList.addListChangeListener(new IListChangeListener() {

	    public void handleListChange(ListChangeEvent evt) {
		final ListDiffEntry[] differences = evt.diff.getDifferences();
		for (final ListDiffEntry diff : differences) {
		    if (diff.isAddition()) {
			editingDomain.getCommandStack().execute(
				new RecordingCommand(editingDomain) {

				    
				    protected void doExecute() {
					set.add(diff.getElement());
				    }
				});

		    } else {
			editingDomain.getCommandStack().execute(
				new RecordingCommand(editingDomain) {

				    
				    protected void doExecute() {
					set.remove(diff.getElement());
				    }
				});
		    }
		}
	    }
	});

	set.addSetChangeListener(new ISetChangeListener() {

	    @SuppressWarnings("rawtypes")
	    public void handleSetChange(SetChangeEvent evt) {
		Set additions = evt.diff.getAdditions();
		for (final Object object : additions) {
		    editingDomain.getCommandStack().execute(
			    new RecordingCommand(editingDomain) {

				
				protected void doExecute() {
				    observableList.add(object);
				}
			    });
		}
		Set removals = evt.diff.getRemovals();
		for (final Object object : removals) {
		    editingDomain.getCommandStack().execute(
			    new RecordingCommand(editingDomain) {

				
				protected void doExecute() {
				    observableList.remove(object);
				}
			    });
		}
	    }
	});

	// BIND
	ViewerSupport.bind(featuresViewer, new WritableSet(model,
		Features.class), BeanProperties
		.value(Features.class, "literal"));

	bindingContext.bindSet(ViewersObservables.observeCheckedElements(
		featuresViewer, Features.class), set);
    }

}
