package Chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("점수를 입력하세요.");
		System.out.println("프로그래밍 기초: " );
		int a = scanner.nextInt();
		System.out.println("데이터베이스: " );
		int b = scanner.nextInt();
		System.out.println("화면 구현: " );
		int c = scanner.nextInt();
		System.out.println("애플리케이션 구현: " );
		int d = scanner.nextInt();
		System.out.println("머신러닝: " );
		int e = scanner.nextInt();
		int sum = a + b + c + d + e;
		double avr = (double)sum / 5;
		
		System.out.println("총점: " + sum);
		System.out.printf("평균: %1.2f\n"  ,avr );
		
		if (avr >= 90) {
			System.out.println("학점: A");
		} else {
			if (90> avr && avr >= 80) {
				System.out.println("학점: B");
			} else {
				if (80> avr && avr >= 70) {
					System.out.println("학점: C");
				} else {
					if (80> avr && avr >= 70) {
						System.out.println("학점: D");
					} else {
						System.out.println("학점: F");
					}
				}
			}
		}
		
		scanner.close();
	} 
	

}
/*
 * Syso쓴 후 밑에 값을 받기위해 int a = scanner.nextInt(); 같은걸 써야함
 * 생각 못하고 syso에 넣고 정의 안된다고 헷갈려함. 
 * 
 */
