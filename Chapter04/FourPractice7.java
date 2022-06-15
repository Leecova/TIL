package Chapter04;

import java.util.Scanner;

public class FourPractice7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 통장 잔고 잔액
		Scanner scanner = new Scanner(System.in);
		
		// Loop while ...
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break ;
			
			/*
			if (a == 1) {
				System.out.println("예금액>10000");
			} if (a == 2) {
				System.out.println("출금액>2000");
			} if (a == 3) {
				System.out.println("잔고>8000");
			} if(a==4) {
				System.out.println("프로그램 종료");
				break;
			}
			*/
		/*	switch (menu) {
			case 1:
				System.out.print("예금액>");
				balance += Scanner.nextInt();
				break;
			case 2:
				System.out.print("출금>");
				balance -= Scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break Loop;
				
			}
		*/
		}
	} scanner.close();
	} 
}

