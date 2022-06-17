package Day6;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("윤년인지를 확인할 연도를 입력하세요: ");
		String num1 = scanner.nextLine();
		
		Integer LeapYear = Integer.parseInt(num1);
		
		
		
		
		if (((LeapYear % 4) == 0) && (LeapYear % 100) != 0) {
			System.out.println("윤년입니다.");
		} else {
			if ((LeapYear % 400) == 0) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println(LeapYear + "년은 윤년이 아닙니다.");
			}
		}
		
		
		/*
		if ((LeapYear % 400) == 0) {
			System.out.println("윤년입니다.");
		} else {
			if (((LeapYear % 4) == 0) && (LeapYear % 100) != 0) {
				System.out.println("윤년입니다.");
			} System.out.println(LeapYear + "년은 윤년이 아닙니다.");
		} 
		*/
		
		
		scanner.close();
	}

}
