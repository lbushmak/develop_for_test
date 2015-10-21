
public class Computer {

	private String name;
	private int age;

	public Computer(String name, int age) {
		setName(name);
		setAge(age);
	}

	private void setAge(int age) {
		this.age = age;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}