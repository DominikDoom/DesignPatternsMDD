package de.thm;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class CommandHandler extends AbstractHandler {

	private static String outputDirectory = "";

	private static String pathToJar = "";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("[INFO] Code Generation triggered");
		
		Shell shell = PlatformUI.getWorkbench().getModalDialogShellProvider().getShell();
		
		// open dialog and await user selection
		int returnCode = new AdditionalInformationDialog(shell).open();
		
		if (returnCode != Window.OK) {
			System.out.println("[INFO] Aborted!");
			return null;
		}
			
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		IEditorInput input = editor.getEditorInput();

		Job job = new Job("Generate Code Job") {
			protected IStatus run(IProgressMonitor monitor) {
				String path = ((IFileEditorInput) input).getFile().getLocationURI().getPath();
				
				if (outputDirectory.isEmpty()) {
					System.out.println("[INFO] Empty Output Directory!");
					return Status.CANCEL_STATUS;
				} else if (pathToJar.isEmpty()) {
					System.out.println("[INFO] Empty Path to Jar!");
					return Status.CANCEL_STATUS;
				}
				
				return callJar(path);
			}
		};
		job.setPriority(Job.SHORT);
		job.schedule(); // start as soon as possible

		return null;
	}

	private IStatus callJar(String path) {
		try {
			Process ps = Runtime.getRuntime().exec(new String[] { "java", "-jar", pathToJar, path, outputDirectory });
			ps.waitFor();

			InputStream is = ps.getInputStream();
			byte b[] = new byte[is.available()];
			is.read(b, 0, b.length);
			System.out.println(new String(b));

			System.out.println("[INFO] Generation finished");
			
			return Status.OK_STATUS;
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			
			return Status.CANCEL_STATUS;
		}
	}
	
	public static void setOutputDirectory(String outputDirectory) {
		CommandHandler.outputDirectory = outputDirectory;
	}
	
	public static void setPathToJar(String pathToJar) {
		CommandHandler.pathToJar = pathToJar;
	}

}
