package Chapter5;

import java.util.Random;
import java.util.Scanner;

public class ExerciseArray03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String user;
		int com;
		
		System.out.println("User: ");
		user = scanner.nextLine();
		
		int num = random.nextInt(3);
		if (num == 0) {
			System.out.println("주먹");
		} else if (num == 1) {
			System.out.println("가위");
		} else {
			System.out.println("보");
		}
		
		if (user.equals("주먹")) {
			if ( com == 0) {
				System.out.println("");
			}
		}
		
	}

}

/*
 * public class Exercise44 {
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

 */