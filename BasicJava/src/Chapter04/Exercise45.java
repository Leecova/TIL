package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); 
		
		boolean run = true;
		int num = random.nextInt(100) + 1;
		int n = 0;
		
		while(run) {
			System.out.println("1부터 100 사이의 정수 중하나를 선택하세요: ");
			int input = scanner.nextInt();
			n++;
			if(input > 100) {
				System.out.println("100보다 크다.");
			} else if( input == num) {
				System.out.println("정답입니다.");
				System.out.println( n +"번만에 맞췄습니다.");
				scanner.close();
				run = false;
			} else if(input < num) {
				System.out.println("더 큰 수");
			} else if(input > num) {
				System.out.println("더 작은 수");
			}
		
		}
		
		/*
		
		System.out.println("1부터 100 사이의 정수 중하나를 선택하세요: ");
		int a = scanner.nextInt();
		int num = random.nextInt(100) + 1;
		
		while (num != a) {
			if (num > a) {
				System.out.println("정답은 더 큰 수입니다.");
			} 
			else if ( num < a ) {
				System.out.println("정답은 더 작은 수입니다.");
			}
		}
		if (num==a) {
			System.out.println("정답입니다.");
		}scanner.close();
		*/
	}

}
