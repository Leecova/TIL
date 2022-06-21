package Chapter06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		//Calculator calculator = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
		
		
		
		
		
		
	/*	
		calculator.powerOn();
		
		int result = calculator.plus(10,20);
		System.out.println(result);
		// 위 아래 둘 다 가능
		System.out.println(calculator.divide(30, 15));
		//calculator.plus(10,20);
		 * */
		
	}

}
