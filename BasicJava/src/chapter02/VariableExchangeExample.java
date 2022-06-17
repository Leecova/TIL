package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int z;
		
		
		System.out.println("x: " + x + ", y: " + y);
		
		//int 쓰고 시도해서 오류떴었음 한번 선언 했으면 또 할 필요 x 
		z = x;
		x = y;
		y = z;
		System.out.println("x: " + x + ", y: " + y);
		
	}

}
