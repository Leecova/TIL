package SoloPractice;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("윤년 연도 입력");
		String year = scanner.nextLine();
		
		Integer Year = Integer.parseInt(year);
		
		String yoon = Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0 ? "윤년" : "노윤년";
		System.out.println(yoon);
		
		
		
		
		
	}
	

}
