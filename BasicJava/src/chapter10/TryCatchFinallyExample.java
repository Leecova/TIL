package chapter10;

public class TryCatchFinallyExample {
	public static void main(String[] args) throws ClassNotFoundException{
		//1.try catch
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("클래스가 존재하지 않습니다.");
			//e.printStackTrace();
		}
		run();
	}
		static void run() throws ClassNotFoundException{
	// 2. throws exception
	Class.forName("java.lang.String2");

	}
}
