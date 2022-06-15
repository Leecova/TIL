package Day5;
import java.util.Scanner;

public class Chapter3_2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력
		
		System.out.println("첫 번째 수:" );
		double num1 = scanner.nextDouble();
		System.out.println("두 번째 수:" );
		double num2 = scanner.nextDouble();
		//nextLine 오류 이유무엇?
		
		if (num2 != 0.0) {
			System.out.println("결과:" + num1 / num2);		
		} else {
			System.out.println("결과:무한대");
		}
		
		/*
		 * double num3 = num1/num2;
		 * String num5 = String.value0f(num3);
		 * String num4 = (num2 == 0 || num2 == 0.0) ? "무한대" :num3 + "";
		 * 
		 * Syso ("결과:" + num4);
		 */
		
		
		
		
	}

}
