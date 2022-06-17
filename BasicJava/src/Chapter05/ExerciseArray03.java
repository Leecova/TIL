package Chapter05;

import java.util.Random;
import java.util.Scanner;

public class ExerciseArray03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String user;
		
		
		System.out.println("User: ");
		user = scanner.nextLine();
		
		int num = random.nextInt(3);
		if (num == 0)  {
			System.out.println("주먹");
		} else if (num == 1) {
			System.out.println("가위");
		} else if (num == 2){
			System.out.println("보");
		}
		int com=num;
		if (user.equals("주먹")) {
			if ( com == 0) {
				System.out.println("비겼습니다.");
			} else if ( com == 1) {
				System.out.println("User 승");
			} else if ( com == 2) {
				System.out.println("Com 승");
			}
		
		}
		if (user.equals("가위")) {
			if ( com == 0) {
				System.out.println("Com 승");
			} else if ( com == 1) {
				System.out.println("비겼습니다.");
			} else if ( com == 2) {
				System.out.println("User 승");
			}
		
		}
		if (user.equals("보")) {
			if ( com == 0) {
				System.out.println("User 승");
			} else if ( com == 1) {
				System.out.println("Com 승");
			} else if ( com == 2) {
				System.out.println("비겼습니다.");
			}
		
		}
		
	}

}

