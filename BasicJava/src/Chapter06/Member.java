package Chapter06;

public class Member {
	
	String name = "이름";
	String id = "아이디";
	String password = "문자열";
	String lastName = "성";
	int age;
	// Default Constructor(기본 생성자)
	Member() {
	
	}
	// 매개값(매개변수)이 있는 생성자
	Member(String name, int age) {
		// this: 메모리에 위치한 객체 자신을 가리킨다.
		this.name = name; // {} 사이, 블럭, 지역 안에서는 위에 있는 name보다 우선권을 갖는다
		this.age = age;
	}
	//Member(String id, String password){
	//	this.id = id;
	//	this.password = password;
	//}
	Member(String name, String id){
		this.name=name;
		this.id=id;
	}
	
	
	void run() {
		System.out.println(this.name);
	}
}
