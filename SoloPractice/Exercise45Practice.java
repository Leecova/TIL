package SoloPractice;

import java.util.Random;
import java.util.Scanner;

public class Exercise45Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		boolean run = true;
		int num = random.nextInt(50) + 1;
		int n = 0;
		
		while(run) {
			System.out.println("1부터 50까지의 정수를 선택");
			n++;
			int Input = scanner.nextInt(); // Input이랑 random이랑 자꾸 헷갈림 숙지.
			
			if ( Input > 50) {
				System.out.println("50초과");
			} else if ( Input == num) { // = 과 == 다른 이유 확실히 알기
				System.out.println("정답");
				System.out.println(n+"번만에 맞춤");
				scanner.close();
				run = false;
			} else if (Input < num) {
				System.out.println("더 큰 수");
			} else {
				System.out.println("더 작은 수");
			}
			
		}
		
		
		
		
		
	}

}
