
public class Main {

	public static void main(String[] args) {
		Human serena = new Human();
		Computer comp = new Computer("Computer 1", 25);

		Output.PrintHuman(serena);
		BMI.checkBMI(serena, comp);
	}

}