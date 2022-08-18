package de.thm;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.osgi.framework.FrameworkUtil;

/**
 * The AdditionalInformationDialog Type.
 *
 */
public class AdditionalInformationDialog extends TitleAreaDialog {
	
	/**
	 * The Dialog Settings (internally represented as XML file with key/value structure)
	 */
	private final IDialogSettings settings = PlatformUI.getDialogSettingsProvider(FrameworkUtil.getBundle(IDE.class))
			.getDialogSettings();

	/**
	 * The Settings Keys
	 */
	private final String outputDirectoryKey = "dirOut";
	private final String jarPathKey = "pathJar";

	/**
	 * The Output Directory related variables
	 */
	private String outputDirectory;
	private Label lblOutputDirectory;
	private Button bOutputDirectory;

	/**
	 * The Path to executable command-line Jar related variables
	 */
	private String pathToJar;
	private Label lblPathToJar;
	private Button bPathToJar;
	
	/**
	 * The Handler, which called the class
	 */
	private CustomCommandHandler handler;

	/**
	 * Calls the super constructor and initializes the handler variable
	 * @param parentShell the parent Shell, which displays the visuals
	 * @param handler the handler, which called the Dialog
	 */
	public AdditionalInformationDialog(Shell parentShell, CustomCommandHandler handler) {
		super(parentShell);
		this.handler = handler;
	}

	/**
	 * Overrides on create to load some custom configurations
	 */
	@Override
	public void create() {
		super.create();
		setTitle("Code Generation");
		setMessage("Please provide additional information!", IMessageProvider.INFORMATION);
	}

	/**
	 * Create the custom Dialog
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		GridLayout layout = new GridLayout(3, false);
		container.setLayout(layout);

		createPathToJarLayout(container);
		createOutputDirectoryLayout(container);

		loadData();
		
		return area;
	}

	/**
	 * Enable custom resizing
	 */
	@Override
	protected boolean isResizable() {
		return true;
	}

	/**
	 * Handle the submit logic
	 */
	@Override
	protected void okPressed() {
		MessageBox dialog = new MessageBox(getParentShell(), SWT.ICON_QUESTION | SWT.OK | SWT.CANCEL);
		dialog.setText("Confirm");
		dialog.setMessage("Do you want to do this?\n\n" + "Path to Jar: " + pathToJar + "\n\n" + "Output Directory: "
				+ outputDirectory);

		int returnCode = dialog.open();

		if (returnCode == SWT.OK) {
			handler.setOutputDirectory(outputDirectory);
			handler.setPathToJar(pathToJar);
			saveSettings();
			super.okPressed();
		}
	}

	/**
	 * Creates the Layout for the path to Jar
	 * @param container the container, which holds the layout
	 */
	private void createPathToJarLayout(Composite container) {
		Label lbl = new Label(container, SWT.NONE);
		lbl.setText("Generation Jar");

		bPathToJar = new Button(container, SWT.PUSH);
		bPathToJar.setText("Select");

		bPathToJar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String result = createFileDialog(getParentShell());
				updatePathToJar(result);
			}
		});

		lblPathToJar = new Label(container, SWT.NONE);
		lblPathToJar.setText("none");

	}

	/**
	 * Creates the Layout for the output directory
	 * @param container the container, which holds the layout
	 */
	private void createOutputDirectoryLayout(Composite container) {
		Label lbl = new Label(container, SWT.NONE);
		lbl.setText("Output Directory");

		bOutputDirectory = new Button(container, SWT.PUSH);
		bOutputDirectory.setText("Select");

		bOutputDirectory.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String result = createDirectoryPickerDialog(getParentShell());
				updateOutputDirectory(result);
			}
		});

		lblOutputDirectory = new Label(container, SWT.NONE);
		updateOutputDirectory(System.getProperty("user.dir"));
	}

	/**
	 * Updates visuals and values whenever path to jar changes
	 * @param text the new Value
	 */
	private void updatePathToJar(String text) {
		pathToJar = text;
		bPathToJar.setToolTipText(pathToJar);
		lblPathToJar.setText(pathToJar);
		lblPathToJar.requestLayout();
	}

	/**
	 * Updates visuals and values whenever the output directory changes
	 * @param text the new Value
	 */
	private void updateOutputDirectory(String text) {
		outputDirectory = text;
		bOutputDirectory.setToolTipText(outputDirectory);
		lblOutputDirectory.setText(outputDirectory);
		lblOutputDirectory.requestLayout();
	}

	/**
	 * Load the Settings from local file system
	 * 
	 * Gets called on start up
	 */
	private void loadData() {
		String pathToJarSetting = settings.get(jarPathKey);
		if (pathToJarSetting != null && !pathToJarSetting.isBlank()) {
			updatePathToJar(pathToJarSetting);
		}

		String outputDirectorySetting = settings.get(outputDirectoryKey);
		if (outputDirectorySetting != null && !outputDirectorySetting.isBlank()) {
			updateOutputDirectory(outputDirectorySetting);
		}
	}
	
	/**
	 * Saves the settings on local file system
	 * 
	 * Gets called on closure
	 */
	private void saveSettings() {
		settings.put(jarPathKey, pathToJar);
		settings.put(outputDirectoryKey, outputDirectory);
	}

	/**
	 * Creates a file dialog
	 * @param shell the shell to display the dialog
	 * @return the File Path
	 */
	private String createFileDialog(Shell shell) {
		FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*.jar" });
		return dialog.open();
	}

	/**
	 * Creates a folder dialog
	 * @param shell the shell to display the dialog
	 * @return the Folder Path
	 */
	private String createDirectoryPickerDialog(Shell shell) {
		DirectoryDialog dialog = new DirectoryDialog(shell, SWT.OPEN);
		return dialog.open();
	}
}
