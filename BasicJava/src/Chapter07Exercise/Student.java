package Chapter07Exercise;

public class Student extends Human {
	public String major;
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major; 
		
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		String.format("이름:" + name + ",나이:" + age );
		return super.toString() + ", 전공:" + major; 
	}
}
