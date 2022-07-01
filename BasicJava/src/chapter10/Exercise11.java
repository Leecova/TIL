package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		
		while (true) {
			
		 try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("어떤 수로 나누시겠습니까?");
			int value1 = scanner.nextInt();
			System.out.println("어떤 수를 나누시겠습니까?");
			int value2 = scanner.nextInt();
			
			int result = value1 / value2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");

		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		
		}
		 
		 
	}
		
		
		
	}

}
