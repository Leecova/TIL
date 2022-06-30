package Chapter04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		String C;
		String Y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.println("철수: ");
		C = scanner.nextLine();
		System.out.println("영희: ");
		Y = scanner.nextLine();
		
		if (C.equals("가위")) {
			if (Y.equals("가위")) {
				System.out.println("비겼습니다.");
				} else if(Y.equals("바위")){
					System.out.println("영희가 이겼습니다.");
				} else if(Y.equals("보") ) {
					System.out.println("철수가 이겼습니다.");
				}
			}
		if (C.equals("바위")) {
			if (Y.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
				} else if(Y.equals("바위")){
					System.out.println("비겼습니다.");
				} else if(Y.equals("보") ) {
					System.out.println("영희가 이겼습니다.");
				}
			}
		if (C.equals("보")) {
			if (Y.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
				} else if(Y.equals("바위")){
					System.out.println("철수가 이겼습니다.");
				} else if(Y.equals("보") ) {
					System.out.println("비겼습니다.");
				}
			}	scanner.close();
		}
		
		
		
}

/*
 * package SoloPractice;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임!");
		System.out.print("철수: ");
		String cheol = scanner.nextLine();
		System.out.print("영희: ");
		String young = scanner.nextLine();
		
		//처리
		String result = null;
		if(cheol.equals(young) ) {
			result = "무승부";
		} else if(cheol.equals("보") && young.equals("바위") ||
				cheol.equals("바위") && young.equals("가위") ||
				cheol.equals("가위") && young.equals("보")) {
			result = "철수 승리!";
		} else {
			result = "영희 승리";
		}
		
		//출력
		System.out.println("결과: " + result);
		
		scanner.close();
	}
}
 */

