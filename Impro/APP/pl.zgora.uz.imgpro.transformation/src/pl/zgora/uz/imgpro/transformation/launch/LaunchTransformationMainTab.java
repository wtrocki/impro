/*******************************************************************************
 * Copyright (c) 2011, 2012 Wojciech Trocki
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the EPL license
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package pl.zgora.uz.imgpro.transformation.launch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import pl.zgora.uz.imgpro.transformation.dialogs.EditPropertiesDialog;
import pl.zgora.uz.imgpro.transformation.dialogs.SelectTransformationDialog;
import pl.zgora.uz.imgpro.transformation.extenstion.ITransformationContext;
import pl.zgora.uz.imgpro.transformation.extenstion.Transformation;
import pl.zgora.uz.imgpro.transformation.extenstion.TransformationContext;
import pl.zgora.uz.imgpro.transformation.extenstion.TransformationExtIds;
import pl.zgora.uz.imgpro.transformation.filter.FileSelectionFilter;
import pl.zgora.uz.imgpro.transformation.validators.FileSelectionValidator;
import pl.zgora.uz.imgpro.transformation.validators.FolderSelectionValidator;

/**
 * Main Tab used to configure a generation with a module.
 * 
 */
public class LaunchTransformationMainTab extends AbstractLaunchConfigurationTab {

    // Key used to store the selected transformation in label data
    private static final String MODULE_ID_KEY = "module_key";

    // module selection
    private Label selectedModuleLabel;

    private Button moduleButton;

    // module selection
    private Text selectedModuleDescription;

    // internal module configuration
    private Button propertiesButton;

    private Map<Object, String> propertyMap = null;

    // model selection
    private Text modelText;

    private Button modelButton;

    // container selection
    private Text containerText;

    private Button containerButton;

    
    public void createControl(Composite parent) {
	Composite mainComposite = new Composite(parent, SWT.NONE);
	setControl(mainComposite);
	GridLayout layout = new GridLayout();
	GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
	gridData.horizontalSpan = 2;
	layout.numColumns = 2;
	layout.makeColumnsEqualWidth = false;
	mainComposite.setLayout(layout);
	mainComposite.setLayoutData(gridData);
	mainComposite.setFont(parent.getFont());

	// module selection part
	createModuleComponent(mainComposite);

	// module configuration part
	createConfComponent(mainComposite);

	initializeComponents();
    }

    /**
     * Module selection part
     * 
     * @param parent
     *            the parent Composite
     */
    private void createModuleComponent(Composite parent) {
	Group group = new Group(parent, SWT.NONE);
	group.setText("Module");
	GridData gd = new GridData(SWT.FILL, SWT.NONE, true, false);
	gd.horizontalSpan = 2;
	group.setLayoutData(gd);
	GridLayout layout = new GridLayout(3, false);
	group.setLayout(layout);
	group.setFont(parent.getFont());

	selectedModuleLabel = new Label(group, SWT.HORIZONTAL);
	gd = new GridData(SWT.BEGINNING, SWT.NORMAL, true, false);
	selectedModuleLabel.setLayoutData(gd);

	moduleButton = createPushButton(group, "&Browse...", null);
	moduleButton.addSelectionListener(new SelectionAdapter() {

	    
	    public void widgetSelected(SelectionEvent e) {
		browseModules();
	    }
	});

	propertiesButton = createPushButton(group, "&Properties...", null);
	propertiesButton.addSelectionListener(new SelectionAdapter() {

	    
	    public void widgetSelected(SelectionEvent e) {
		editProperties();
	    }
	});
	propertiesButton.setEnabled(false);

	// Create textual zone containing module description
	Group descGroup = new Group(group, SWT.NONE);
	descGroup.setText("Description");
	gd = new GridData(SWT.FILL, SWT.NONE, true, true);
	gd.horizontalSpan = 3;
	descGroup.setLayoutData(gd);
	layout = new GridLayout(2, false);
	descGroup.setLayout(layout);
	descGroup.setFont(parent.getFont());

	selectedModuleDescription = new Text(descGroup, SWT.MULTI | SWT.WRAP);
	gd = new GridData(SWT.FILL, SWT.FILL, true, true);
	gd.horizontalSpan = 2;
	gd.minimumHeight = 50;
	selectedModuleDescription.setLayoutData(gd);
	selectedModuleDescription.setEditable(false); // read only description
	selectedModuleDescription.setBackground(group.getBackground());
    }

    /**
     * Module configuration part
     * 
     * @param parent
     *            the parent Composite
     */
    private void createConfComponent(Composite parent) {
	Group group = new Group(parent, SWT.NONE);
	group.setText("Configuration");
	GridData gd = new GridData(SWT.FILL, SWT.NONE, true, false);
	gd.horizontalSpan = 2;
	group.setLayoutData(gd);
	GridLayout layout = new GridLayout(3, false);
	group.setLayout(layout);
	group.setFont(parent.getFont());

	// model selection sub-part
	createModelSelector(group);
	// container selection sub-part
	createContainerSelector(group);
    }

    /**
     * Model selection sub-part
     * 
     * @param parent
     *            the parent Composite
     */
    private void createModelSelector(Composite parent) {
	Label modelLabel = new Label(parent, SWT.NONE);
	modelLabel.setText("&Source model :");
	GridData gd = new GridData(GridData.BEGINNING);
	modelLabel.setLayoutData(gd);

	modelText = new Text(parent, SWT.SINGLE | SWT.BORDER);
	gd = new GridData(GridData.FILL_HORIZONTAL);
	modelText.setEditable(false);
	modelText.setLayoutData(gd);
	modelText.addModifyListener(new ModifyListener() {

	    
	    public void modifyText(ModifyEvent e) {
		updateLaunchConfigurationDialog();
	    }
	});

	modelButton = createPushButton(parent, "&Browse...", null);
	modelButton.addSelectionListener(new SelectionAdapter() {

	    
	    public void widgetSelected(SelectionEvent e) {
		List<String> validFileExtensions = new ArrayList<String>();
		validFileExtensions.add("impro");
		browseFiles("Select the source model for generation",
			validFileExtensions, modelText);
	    }
	});
    }

    /**
     * Container selection sub-part
     * 
     * @param parent
     *            the parent Composite
     */
    private void createContainerSelector(Composite parent) {
	Label containerLabel = new Label(parent, SWT.NONE);
	containerLabel.setText("&Target folder :");
	GridData gd = new GridData(GridData.BEGINNING);
	containerLabel.setLayoutData(gd);

	containerText = new Text(parent, SWT.SINGLE | SWT.BORDER);
	gd = new GridData(GridData.FILL_HORIZONTAL);
	containerText.setLayoutData(gd);
	containerText.setEditable(false);
	containerText.addModifyListener(new ModifyListener() {

	    
	    public void modifyText(ModifyEvent e) {
		updateLaunchConfigurationDialog();
	    }
	});

	containerButton = createPushButton(parent, "&Browse...", null);
	containerButton.addSelectionListener(new SelectionAdapter() {

	    
	    public void widgetSelected(SelectionEvent e) {
		browseContainers("Select the target folder for generated files");
	    }
	});
    }

    /**
     * Open a resource chooser to select the container.
     * 
     * @param comment
     *            message shown in dialog
     */
    private void browseContainers(String comment) {

	ContainerSelectionDialog dialog = new ContainerSelectionDialog(
		getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
		comment);
	dialog.setValidator(new FolderSelectionValidator());
	dialog.setTitle("Folder selection");
	dialog.setHelpAvailable(false);
	dialog.showClosedProjects(false);

	if (dialog.open() == Window.OK) {
	    Object[] elements = dialog.getResult();
	    if (elements.length == 1) {
		String file = ((IPath) elements[0]).toOSString();
		containerText.setText(file);
	    }
	}
    }

    /**
     * Open a resource chooser to select a module (a transformation).
     */
    private void browseModules() {

	SelectTransformationDialog dialog = new SelectTransformationDialog(
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
		"Select the module",
		TransformationExtIds.TRANSFORMATION_EXTENSION_NAME);

	int result = dialog.open();
	if ((result == Window.OK) && (dialog.getFirstResult() != null)) {

	    Object selection = dialog.getFirstResult();
	    if (selection instanceof Transformation) {
		Transformation transformation = (Transformation) selection;
		propertiesButton.setEnabled(true);

		if (transformation.getName() != null) {
		    selectedModuleLabel.setText(transformation.getName());
		} else {
		    selectedModuleLabel.setText(transformation.getId());
		}
		selectedModuleLabel.setData(MODULE_ID_KEY, transformation);
		selectedModuleLabel.pack(true);

		if (transformation.getDescription() != null) {
		    selectedModuleDescription.setText(transformation
			    .getDescription());
		}

		updateLaunchConfigurationDialog();
	    }
	}
    }

    /**
     * Open a resource chooser to select a file.
     * 
     * @param comment
     *            the title of the resource chooser
     * @param filetypes
     * @param text
     */
    private void browseFiles(String comment, List<String> filetypes, Text text) {

	ILabelProvider lp = new WorkbenchLabelProvider();
	ITreeContentProvider cp = new WorkbenchContentProvider();
	ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
		getShell(), lp, cp);

	dialog.setTitle("File selection");
	dialog.setMessage(comment);
	dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
	dialog.addFilter(new FileSelectionFilter(filetypes));
	dialog.setValidator(new FileSelectionValidator());
	dialog.setDoubleClickSelects(true);
	dialog.setHelpAvailable(false);
	dialog.setAllowMultiple(false);

	if (dialog.open() == Window.OK) {
	    Object[] elements = dialog.getResult();
	    if (elements.length == 1) {
		final IFile iFile = (IFile) elements[0];
		final IPath fullPath = iFile.getFullPath();
		String file = fullPath.toOSString();
		text.setText(file);
		containerText.setText(fullPath.removeLastSegments(2)
			.append("sources").toOSString());
	    }
	}

    }

    /**
     * Open a resource chooser to edit module properties.
     */
    private void editProperties() {
	Transformation tranformation = (Transformation) selectedModuleLabel
		.getData(MODULE_ID_KEY);
	EditPropertiesDialog dialog = new EditPropertiesDialog(PlatformUI
		.getWorkbench().getActiveWorkbenchWindow().getShell(),
		tranformation.configElement, propertyMap);
	if (dialog.open() == Window.OK)
	    if (dialog.getPropertyMap() != null) {
		propertyMap = dialog.getPropertyMap();
		updateLaunchConfigurationDialog();
	    }
    }

    /**
     * GUI component initialization
     */
    private void initializeComponents() {
	propertiesButton.setEnabled(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.
     * debug.core. ILaunchConfigurationWorkingCopy)
     */
    
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
     * .debug.core. ILaunchConfiguration)
     */
    
    public void initializeFrom(ILaunchConfiguration configuration) {
	ITransformationContext context = new TransformationContext(
		configuration);

	// Set Container
	IContainer container = context.getContainer();
	if (container != null) {
	    containerText.setText(container.getFullPath().toOSString());
	}

	// Set module
	Transformation transformation = context.getTransformation();
	if (transformation != null) {
	    String moduleId = transformation.getId();
	    if (moduleId != null) {
		selectedModuleLabel.setText(transformation.getName());
		selectedModuleLabel.setData(MODULE_ID_KEY, transformation);
		selectedModuleLabel.pack(true);

		propertiesButton.setEnabled(true);
		if (transformation.getDescription() != null) {
		    selectedModuleDescription.setText(transformation
			    .getDescription());
		}
	    }
	}

	// Set model
	IFile modelFile = (IFile) context.getSource();
	if (modelFile != null) {
	    modelText.setText(modelFile.getFullPath().toOSString());
	}

	propertyMap = context.getProperties();
	updateLaunchConfigurationDialog();
    }

    
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {

	String container = containerText.getText().trim();
	if (container.length() == 0) {
	    container = null;
	}

	String model = modelText.getText().trim();
	if (model.length() == 0) {
	    model = null;
	}

	// get register module selected for transformation
	String moduleId = null;
	Transformation transformation = (Transformation) selectedModuleLabel
		.getData(MODULE_ID_KEY);
	if (transformation != null) {
	    moduleId = transformation.getId();
	}
	configuration.setAttribute(
		LaunchConfigurationIds.CONTAINER_ATTRIBUTE_ID, container);
	configuration.setAttribute(LaunchConfigurationIds.MODEL_ATTRIBUTE_ID,
		model);
	configuration.setAttribute(LaunchConfigurationIds.MODULE_ATTRIBUTE_ID,
		moduleId);
	configuration.setAttribute(LaunchConfigurationIds.PROPERTY_MAP_ID,
		propertyMap);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
     */
    
    public String getName() {
	return "Matlab Code generation";
    }

    /*
     * (non-Javadoc)
     * 
     * @seeorg.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse
     * .debug.core. ILaunchConfiguration)
     */
    
    public boolean isValid(ILaunchConfiguration launchConfig) {
	boolean valid = super.isValid(launchConfig) && isModuleValid()
		&& isModelValid() && isContainerValid();
	if (valid) {
	    setMessage(null);
	    setErrorMessage(null);
	}
	return valid;
    }

    /**
     * Check if the selected model exists
     * 
     * @return the resource validation boolean
     */
    private boolean isModelValid() {
	if (modelText.getText().length() > 0) {
	    StringTokenizer st = new StringTokenizer(modelText.getText(), ":");
	    while (st.hasMoreTokens()) {
		IPath path = new Path(st.nextToken().trim());
		if (ResourcesPlugin.getWorkspace().getRoot().findMember(path) == null) {
		    setErrorMessage("Specified model does not exist : "
			    + path.toString());
		    return false;
		} else {
		    IResource containerResource = ResourcesPlugin
			    .getWorkspace().getRoot().findMember(path);
		    if (containerResource.getType() != IResource.FILE) {
			setErrorMessage("The model must be defined in a file.");
			return false;
		    }
		}
	    }
	} else {
	    setMessage("Specify a model");
	    return false;
	}
	return true;
    }

    /**
     * Check if the selected resource exists
     * 
     * @return the resource validation boolean
     */
    private boolean isContainerValid() {
	if (containerText.getText().length() > 0) {
	    StringTokenizer st = new StringTokenizer(containerText.getText(),
		    ":");
	    while (st.hasMoreTokens()) {
		IPath path = new Path(st.nextToken().trim());
		if (ResourcesPlugin.getWorkspace().getRoot().findMember(path) == null) {
		    setErrorMessage("Specified container does not exist : "
			    + path.toString());
		    return false;
		}
	    }
	} else {
	    setMessage("Specify a container");
	    return false;
	}
	return true;
    }

    /**
     * Check if the selected module still exists
     * 
     * @return the module validation boolean
     */
    private boolean isModuleValid() {

	// get register module selected for transformation
	Transformation transformation = (Transformation) selectedModuleLabel
		.getData(MODULE_ID_KEY);
	if (transformation == null) {
	    setMessage("Specify a module");
	    return false;
	}
	return true;
    }
}
