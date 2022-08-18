package de.thm.logging;

public final class LogUtils {
	
	private static String prefix = ConsoleColors.BLUE_BOLD + "[" + ConsoleColors.BLUE + "COMMAND" + ConsoleColors.BLUE_BOLD + "] ";

	private LogUtils() {
		// Explicitly hide constructor
	}
	
	public static void printWithPrefix(String message) {
		System.out.println(prefix + message);
	}
	
	public static void logSuccess(String message) {
		printWithPrefix(ConsoleColors.GREEN + message);
	}
	
	public static void logError(String message) {
		printWithPrefix(ConsoleColors.RED + message);
	}
	
	public static void logInfo(String message) {
		printWithPrefix(ConsoleColors.WHITE + message);
	}

	public static void newParagraph() {
		System.out.println(ConsoleColors.CYAN + "  ________                                   __                \n"
				+ " /  _____/  ____   ____   ________________ _/  |_  ___________ \n"
				+ "/   \\  ____/ __ \\ /    \\_/ __ \\_  __ \\__  \\\\   __\\/  _ \\_  __ \\\n"
				+ "\\    \\_\\  \\  ___/|   |  \\  ___/|  | \\// __ \\|  | (  <_> )  | \\/\n"
				+ " \\______  /\\___  >___|  /\\___  >__|  (____  /__|  \\____/|__|   \n"
				+ "        \\/     \\/     \\/     \\/           \\/                  ");
	}

}
