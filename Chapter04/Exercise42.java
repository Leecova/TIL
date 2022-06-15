package Chapter04;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요(1~12): ");
		int a = scanner.nextInt();
		
		if (3 <= a && 5>=a ) {
			System.out.println(a + "월은 봄입니다.");
		} else {
			if (a>= 6 && a<= 8) {
				System.out.println(a + "월은 여름입니다.");
		} else {
			if (a >= 9 && a<= 11) {
				System.out.println(a + "월은 가을입니다.");
		} else {
			if (a >=1 && a <=12) {
				System.out.println(a + "월은 겨울입니다.");
			} else {
				System.out.println(a + "월은 잘못된 입력입니다.");
			}
			
		} scanner.close();
				/*
				 * if만 반복시키다가 결과가 여러개 떠서 else {} if 를 터득
				 */
	} 

}
}
}