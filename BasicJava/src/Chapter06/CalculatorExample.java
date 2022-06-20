package Chapter06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		
		int result = calculator.plus(10,20);
		System.out.println(result);
		// 위 아래 둘 다 가능
		System.out.println(calculator.divide(30, 15));
		//calculator.plus(10,20);
	}

}
