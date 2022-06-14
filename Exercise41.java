package Chapter04;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int a = scanner.nextInt();
		System.out.println("삼각형의 두번째 변의 길이를 입력하세요: ");
		int b = scanner.nextInt();
		System.out.println("삼각형의 세번째 변의 길이를 입력하세요: ");
		int c = scanner.nextInt();

		
		
		if ((a > (b+c)) || b > (a+c) || c  >(a+b)) {
			System.out.println("삼각형이 아닙니다.");			
		} else {
			System.out.println("삼각형입니다.");
		}
		/*
		 * 처음 while 사용 하다가 어렵게 간 것 같아서
		 * if로 돌림, if 연속 반복해서 하나당 하나씩 조건을 넣음
		 * 안되서 else 써봄 그래도 안됨
		 * 간단하게 if 조건에 한번에 넣고 하면 될거라 생각
		 * && || 조금 헷갈림
		 * 그다음 부호 헷갈림 < > , 고치니 성공
		 */
		
	}
		
	
	

}
