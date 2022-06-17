package Chapter06;

public class Student {
	//필드
	String deptid;
	String year;
	String studentId;
	String name;
	String idNumber;
	//생성자
	public Student() {
		
	}
	//메소드
	void displayStudent() {
		System.out.println(studentId + ":전공 -" + deptid + ", 이름-");
	}
}
