package SoloPractice;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		System.out.println("첫 번째 숫자");
		int a = scanner.nextInt();
		System.out.println("두 번째 숫자");
		int b = scanner.nextInt();
		
		int large = ((a+b)+Math.abs(a-b))/2;
		int small = ((a+b)-Math.abs(a-b))/2;
		
		int c = large / small;
		int d = large % small;
		System.out.println("큰 수 나눈 몫 " + c + "이고, 나머지는 "+ d);
		
		
	}

}
