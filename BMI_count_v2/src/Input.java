import java.util.Scanner;

public class Input {

	private static Scanner in = new Scanner(System.in);

	public static int getIntValue(String message) {
		printMsg(message);
		int value = Integer.parseInt(in.nextLine());
		return value;
	}

	public static String getStringValue(String message) {
		printMsg(message);
		return in.nextLine();
	}

	private static void printMsg(String msg) {
		System.out.print(msg);
	}
}