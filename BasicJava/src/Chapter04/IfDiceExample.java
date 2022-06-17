package Chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		// 위에거 쓰려면 import java.util.Random; 추가 해야됨
		//int num = (int) (Math.random() * 6) + 1;
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		
		/*
		 * 랜덤 숫자 만들기
		 * 
		 * 1. 좋지 않은 방식
		 * int randomNum = (int) (Math.random()* 총개수) + 시작숫자;
		 * 
		 * 2. 좋은 방식
		 * Randomrandom = new Random();
		 * int randomNum = random.nextInt(총개수) + 시작숫자;  (0부터 숫자-1까지 만들어준다) ex  Int(6) > 0~5
		 * 
		 * 3. 보안 적용
		 * SecureRandom secureRandom = new SecureRandom();
		 * int randimNum = secureRandom.nextInt(총개수) + 시작숫자;
		 * 
		 */
		
	}

}
