package Chapter07Exercise;

public class StudentTest {
	public static void main(String[] args) {
		Human man = new Human("Steve", 30);
		System.out.println(man);
		
		Student student = new Student("Parker", 23, "Physics");
		System.out.println(student);
		
		student.setName("Peter");
		student.setAge(19);
		student.setMajor("Computer Science");
		
		System.out.println("이름: " + student.getName() + ", ");
		System.out.println("나이: " + student.getAge() + ", ");
		System.out.println("전공: " + student.getMajor());
	}

}
