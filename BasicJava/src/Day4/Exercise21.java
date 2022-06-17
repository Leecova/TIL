package Day4;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가로의 길이는?(단위: m):");
		String strNum1 = scanner.nextLine();
		System.out.println("세로의 길이는?(단위: m):");
		String strNum2 = scanner.nextLine();
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		double result = num1 * num2;
		double result1 = num1 + num1 + num2 + num2;
		
		System.out.println("직사강형의 넓이: " + result);
		System.out.println("직사강형의 둘레: " + result1);
		
		/* 문제
		 * 실수 자료형을 이용하여 직사각형의 둘레와 면적을 구하는 프로그램을 만들어보자.
		 * 실수형 변수 width(가로), height(세로), area(넓이), perimeter(둘레)를 선언하고,
		 * Scanner 클래스를 이용하여 사용자로부터 직사각형의 가로, 세로 길이를 입력받아 다음과 같이 넓이와 둘레를 출력한다.
		 */
		
		
		
		
		/* 선생님 답안
		 *  Scanner scanner = new Scanner(System.in);
		 * 입력
		 * System.out.print("가로 길이는?(단위: m):");
		 * double width = scanner.nextDouble();
		 * System.out.println("세로의 길이는?(단위: m):");
		 * double width = scanner.nextDouble();
		 * 처리
		 * double area = width * height;
		 * double perimeter = (width + height) * 2;
		 * 출력
		 * System.out.println("직사강형의 넓이: " + area);
		 * System.out.println("직사강형의 둘레: " + perimeter);
		 * 
		 * scanner.close()
		 */
		
		
	}

}
