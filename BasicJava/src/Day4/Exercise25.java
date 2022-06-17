package Day4;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력
		
		System.out.println("500원짜리 동전의 갯수: ");
		String strNum1 = scanner.nextLine();
		
		//String 변수선언, strNum1은 어느 이름을 쓰든 괜찮 정해진거x
		System.out.println("100원짜리 동전의 갯수: ");
		String strNum2 = scanner.nextLine();
		System.out.println("50원짜리 동전의 갯수: ");
		String strNum3 = scanner.nextLine();
		System.out.println("10원짜리 동전의 갯수: ");
		String strNum4 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int num3 = Integer.parseInt(strNum3);
		int num4 = Integer.parseInt(strNum4);
		// 문자를 숫자로 강제캐스팅?parse~ 하는 이유는 + *같은 연산 기호를 수학식으로 이용하기 위해서
		
		int result = (num1 * 500) + (num2 * 100) + (num3 * 50) + (num4 *10);
		
		System.out.println("저금통 안의 동전의 총 액수: " + result);
		
		/* 문제
		 * 사용자로부터 500원, 100원, 50원, 10원짜리 동전의 갯수를 입력 받아
		 * 저금통 안에 총 얼마가 들어 있는지 출력하는 프로그램을 만들어 보자.
		 */
		
		
		/* 선생님 답안
		 * Scanner scanner = new scanner(System.in);
		 * System.out.println("500원짜리 동전의 개수: ");
		 * int coin500 = scanner.nextInt();
		 * System.out.println("100원짜리 동전의 개수: ");
		 * int coin100 = scanner.nextInt();
		 * System.out.println("50원짜리 동전의 개수: ");
		 * int coin50 = scanner.nextInt();
		 * System.out.println("10원짜리 동전의 개수: ");
		 * int coin10 = scanner.nextInt();
		 * 
		 * int totalCoin = 500 * coin500 + 100 * coin100 + 50 * coin50 + 10 * coin10
		 * System.out.println("동전의 총 금액: " totalCoin);
		 *  
		 * scanner.close();
		 * 
		 */
		
		
		
	}

}
