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

public class AdditionalInformationDialog extends TitleAreaDialog {
	
	private final IDialogSettings settings = PlatformUI.getDialogSettingsProvider(FrameworkUtil.getBundle(IDE.class))
			.getDialogSettings();

	private final String outputDirectoryKey = "dirOut";
	private final String jarPathKey = "pathJar";

	private String outputDirectory;
	private Label lblOutputDirectory;
	private Button bOutputDirectory;

	private String pathToJar;
	private Label lblPathToJar;
	private Button bPathToJar;

	public AdditionalInformationDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Code Generation");
		setMessage("Please provide additional information!", IMessageProvider.INFORMATION);
	}

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

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void okPressed() {
		MessageBox dialog = new MessageBox(getParentShell(), SWT.ICON_QUESTION | SWT.OK | SWT.CANCEL);
		dialog.setText("Confirm");
		dialog.setMessage("Do you want to do this?\n\n" + "Path to Jar: " + pathToJar + "\n\n" + "Output Directory: "
				+ outputDirectory);

		int returnCode = dialog.open();

		if (returnCode == SWT.OK) {
			CommandHandler.setOutputDirectory(outputDirectory);
			CommandHandler.setPathToJar(pathToJar);
			saveSettings();
			super.okPressed();
		}
	}

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

	private void updatePathToJar(String text) {
		pathToJar = text;
		bPathToJar.setToolTipText(pathToJar);
		lblPathToJar.setText(pathToJar);
		lblPathToJar.requestLayout();
	}

	private void updateOutputDirectory(String text) {
		outputDirectory = text;
		bOutputDirectory.setToolTipText(outputDirectory);
		lblOutputDirectory.setText(outputDirectory);
		lblOutputDirectory.requestLayout();
	}

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
	
	private void saveSettings() {
		settings.put(jarPathKey, pathToJar);
		settings.put(outputDirectoryKey, outputDirectory);
	}

	private String createFileDialog(Shell shell) {
		FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*.jar" });
		return dialog.open();
	}

	private String createDirectoryPickerDialog(Shell shell) {
		DirectoryDialog dialog = new DirectoryDialog(shell, SWT.OPEN);
		return dialog.open();
	}
}
