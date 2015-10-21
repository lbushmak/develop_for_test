
public class BMI {

	public static int countBMI(Human human) {
		return human.getHeight() - human.getWeight();
	}

	public static void checkBMI(Human human, Computer comp) {
		if (human.getBMI() > 120) {
			System.out.println(
					"\nHey, " + human.getName() + "! My name is " + comp.getName() + ". I'm " + comp.getAge() + ".");
		} else if (human.getBMI() > 100 && human.getBMI() < 120) {
			System.out.println("\nHey, " + human.getName() + "! My name is " + comp.getName()
					+ ". I'm busy now. But you can call me later:)");
		} else {
			System.out.println("\nHey, " + human.getName() + "! You have to go to gym. Your BMI is " + human.getBMI());
		}

	}
}
