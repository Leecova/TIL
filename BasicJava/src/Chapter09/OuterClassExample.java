package Chapter09;

import Chapter09.OuterClass.InnerClass;

public class OuterClassExample {
	public static void main(String[] args) {
	//	InnerClass innerClass= new OuterClass().new InnerClass(0);
		//innerClass.innerMethod();
		//innerClass.age = 10;
		//OuterClass.name = "홍길동";
		//new OuterClass.InnerClass(10);
		//new Chapter09.OuterClass.InnerClass(10);
		new InnerClass(10);  
	}

}
