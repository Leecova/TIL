package Chapter04;

import java.util.Random;

public class SwitchExample {
	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		//int num = (int) (Math.random() * 6 ) +1; //주사위 번호 하나 뽑기
		
		switch(num) {
		
		  case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		  case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		  case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		  case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		  case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		  default:
			  System.out.println("6번이 나왔습니다.");
			  break;
		}
	}

}
