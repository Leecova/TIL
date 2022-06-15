package Day4;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력
		
		System.out.println("원기둥 밑변의 반지름을 입력하시오.(단위: cm)");
		String strNum1 = scanner.nextLine();
		System.out.println("원기둥의 높이를 입력하시오.(단위: cm)");
		String strNum2 = scanner.nextLine();
		
			
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		double result = num1 * num1 * Math.PI;
		double result1 = Math.PI * (num1 * num1) * num2;
		
		System.out.println("원기둥 밑변의 넓이는 " + result +"cm이고, 원기둥의 부피는 " + result1 + "cm이다.");
		
		/* 문제
		 * 원기둥 밑면의 반지름과 높이를 입력 받아서 밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자.
		 *  원주율은 Math.PI를 사용한다.
		 * 
		 */
		
		
		/* 선생님 답안
		 * Scanner scanner = new Scanner(System.in);
		 * 입력
		 * System.out.println("원기둥 밑변의 반지름을 입력하시오.(단위: cm)");
		 * double radius = scanner.nextDouble();
		 * System.out.println("원기둥의 높이를 입력하시오.(단위: cm)");
		 * double height = scanner.nextDouble();
		 * 처리
		 * double area = Math.PI * radius * radius;
		 * double volume = area * height;
		 * 출력
		 * System.out.println("원기둥 밑변의 넓이는 " + area +"cm이고, 원기둥의 부피는 " + volume + "cm이다.");
		 * or
		 * System.out.printf( "원기둥 밑면의 넓이: %fcm, qnvl: %fcm이다.", area, volume
		 * scanner.close(); > 반드시 해줘야한다, 여러명이 쓸 경우 자원을 반납해야되는데 쓰지 않으면
		 * 반납을 하지 않아서 문제가 될 수 있음. ( 권장사항 ), 혼자 쓰면 7번라인 같이 느낌표가 뜸.
		 * 
		 */
		
		
		
	}

}
