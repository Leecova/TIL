package Day4;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		// Scanner를 이용해서 데이터 입력 받기
		Scanner scanner = new Scanner(System.in);
		// Scan 컨트롤 엔터 하면 import java.util.Scanner;자동적으로 생김
		// Scan 컨트롤 엔터 (System.in) 후 컨트롤1 활용
		
		System.out.println("정수를 입력하세요: ");
		//int value1 = scanner.nextInt();
		System.out.println("실수를 입력하세요: ");
		//double value2 = scanner.nextDouble();
		System.out.println("문자를 입력하세요: ");
		String next = scanner.next();
		//String nextLine = scanner.next();
		
		System.out.println(next);
		//System.out.println(nextLine);
		//System.out.println(value1);
		//System.out.println(value2);
	}

}
