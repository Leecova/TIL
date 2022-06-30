package SoloPractice;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수도입니까?(수도: 1, 수도아님: 0)");
		String country = scanner.nextLine();
		System.out.println("총 인구는? 단위만");
		String popular = scanner.nextLine();
		System.out.println("연소득 1억 이상 인구 단위만");
		String year = scanner.nextLine();
		
		Integer Country = Integer.parseInt(country);
		Integer Popular = Integer.parseInt(popular);
		Integer Year = Integer.parseInt(year);
		
		String metropolice = (Country == 1 && Popular >= 100) || Year >= 50 ? "메트로폴리스" : "노메트로";
		System.out.println(metropolice);
		
		
		
	}


}
