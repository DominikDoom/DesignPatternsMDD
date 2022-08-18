package de.thm;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import de.thm.logging.LogUtils;

/**
 * The CustomCommandHandler Type.
 *
 */
public final class CustomCommandHandler extends AbstractHandler {
	
	/**
	 * The Directories for the Jar to be called and the Code Output
	 */
	private String outputDirectory = "";
	private String pathToJar = "";
	
	/**
	 * Calls the Jar with the given Directories
	 * 
	 * @param path The Path for the Folder/Model 
	 */
	private IStatus callJar(String path) {
		try {
			LogUtils.logInfo("Path: " + path);
			LogUtils.logInfo("PathJar: " + pathToJar);
			LogUtils.logInfo("PathOut: " + outputDirectory);

			Process ps = Runtime.getRuntime().exec(new String[] { "java", "-jar", pathToJar, path, outputDirectory });
			ps.waitFor();

			// Comment to hide called Jar Output
			/*
			InputStream is = ps.getInputStream();
			byte b[] = new byte[is.available()];
			is.read(b, 0, b.length);
			System.out.println(new String(b));
			*/

			LogUtils.logSuccess("Generation finished successfully");
			
			return Status.OK_STATUS;
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			
			return Status.CANCEL_STATUS;
		}
	}
	
	/**
	 * Overrides the AbstractHandler logic and performs actions based on several logical steps
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		LogUtils.newParagraph();
		
		// get the current shell to show visuals
		Shell shell = PlatformUI.getWorkbench().getModalDialogShellProvider().getShell();
		
		// open dialog and await user selection
		int returnCode = new AdditionalInformationDialog(shell, this).open();
		
		// check if execution was cancelled (e.g. pop up window closed)
		if (returnCode != Window.OK) {
			LogUtils.logError("Aborted!");
			return null;
		}
			
		// fetch the necessary information from the workbench
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorInput input = page.getActiveEditor().getEditorInput();

		// start the asynchronously running job
		Job job = new Job("Generate Code Job") {
			
			/**
			 * The run method which gets executed once the Job is picked up
			 */
			protected IStatus run(IProgressMonitor monitor) {
				try {
					// catch errors to prevent undetermined executions
					if (outputDirectory.isEmpty()) {
						LogUtils.logError("Empty Output Directory!");
						return Status.CANCEL_STATUS;
					} else if (pathToJar.isEmpty()) {
						LogUtils.logError("Empty Path to Jar!");
						return Status.CANCEL_STATUS;
					}
					
					// get the file and the path, which was triggered
					File file = new File(((IFileEditorInput) input).getFile().getLocationURI());
					String path = file.getCanonicalPath();
								
					// if folder, get parent path to prevent only single generation
					if (isFolder((IStructuredSelection) page.getSelection()))
						path = file.getParentFile().getCanonicalPath();
					
					// call the jar with the given path
					return callJar(path);
				} catch (IOException e) {
					// Log the IOException
					LogUtils.logError("Something went wrong while fetching File. Message:");
					LogUtils.logError(e.getMessage());
					return Status.CANCEL_STATUS;
				}
			}
		};
		// SHORT: high priority, most likely finishes within one second
		job.setPriority(Job.SHORT);
		
		// start as soon as possible
		job.schedule();

		return null;
	}
	
	/**
	 * Checks if a Event was triggered by a Folder or Model
	 * @param selection the Selection
	 * @return true if it was triggered by a Folder
	 */
	@SuppressWarnings("unchecked")
	private boolean isFolder(IStructuredSelection selection) {
		return selection.toList().stream().anyMatch(IFolder.class::isInstance);
	}
	
	/**
	 * Sets the Output Directory Path
	 * @param outputDirectory the Path for the generated Code
	 */
	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}
	
	/**
	 * The Path to the Jar to be called
	 * @param pathToJar the Path for the command-line Java Generator
	 */
	public void setPathToJar(String pathToJar) {
		this.pathToJar = pathToJar;
	}
}
