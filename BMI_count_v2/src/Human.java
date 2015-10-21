
public class Human {

	public int bmi;
	private String name;
	private int height;
	private int weight;
	private int age;

	public Human(String name, int weight, int height, int age) {
		setName(name);
		setWeight(weight);
		setAge(age);
		setHeight(height);
	}

	public Human() {
		setName(Input.getStringValue("Enter your name: "));
		setWeight(Input.getIntValue("Enter your weight: "));
		setAge(Input.getIntValue("Enter your age: "));
		setHeight(Input.getIntValue("Enter your height: "));
		setBMI(BMI.countBMI(this));
	}

	public int getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	private void setHeight(int height) {
		if (height <= 0) {
			System.out.println("Height is not valid (less or equal to 0)");
		} else {
			this.height = height;
		}
	}

	private void setAge(int age) {
		if (age <= 0) {
			System.out.println("Age is not valid (less or equal to 0)");
		} else if (age < 12 && age > 0) {
			System.out.println("Don't speak to strangers, child!");
		} else {
			this.age = age;
		}
	}

	private void setWeight(int weight) {
		if (weight <= 0) {
			System.out.println("Weight is not valid (less or equal to 0)");
		} else {
			this.weight = weight;
		}
	}

	private void setName(String name) {
		if (name.equals("")) {
			System.out.println("Don't be shy. Tell me your name!");
		} else {
			this.name = name;
		}
	}

	public int getBMI() {
		return this.bmi;
	}

	public void setBMI(int bmi) {
		this.bmi = bmi;
	}

}
