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



