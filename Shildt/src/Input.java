import java.util.Scanner;

public class Input {

	private static Scanner in;

	public static int input() {

		in = new Scanner(System.in);
		System.out.print("������� ���������� ������: ");
		int number = in.nextInt();
		System.out.println("����� ���������� ������: " + number + ".");
		return number;
	}

	public static int input2() {

		in = new Scanner(System.in);
		System.out.print("������� ���������� ���������: ");
		int number = in.nextInt();
		System.out.println("����� ���������� ���������: " + number + ".");
		return number;
	}
}
