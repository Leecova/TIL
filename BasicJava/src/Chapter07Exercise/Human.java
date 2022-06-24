package Chapter07Exercise;

public class Human {
	public String name;
	public int age;
	
	public Human() {
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return String.format("이름:" + name + ",나이:" + age, name, age);
	}

}
