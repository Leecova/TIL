package Day6;

import java.util.Scanner;

public class Practice3T {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("윤년인지를 확인할 연도를 입력하세요: ");
		String num1 = scanner.nextLine();
		
		Integer LeapYear = Integer.parseInt(num1);
		
		
		String Result = ((LeapYear % 4) == 0) && (LeapYear % 100) != 0 ? "윤년입니다" : ((LeapYear % 400) == 0) ? "윤년입니다": num1 + "년은 윤년이 아닙니다.";
		System.out.println(Result);
		
		//int year = scanner.nextInt();
		// leapYear = year~~~~~ /d년은 %s, year, leapYear
		
		
		
		/*
		 * 
		 * 역시 Result 앞에 int.. 등 쓰다가 String 써야한다고 배움.
		 * 
		입력 연도가 윤년인지 아닌지 확인하는 프로그램을 작성해보자. 윤년의 조건은 다음과 같다고 가정한다.
윤년은 4의 배수이어야 하고, 100의 배수는 아니어야 한다. 또한 400의 배수는 무조건 윤년이 된다.

		} 
		*/
		
		
		scanner.close();
	}

}