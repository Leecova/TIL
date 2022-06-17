package Chapter04;

import java.util.Random;

public class FourPractice3 {
	public static void main(String[] args) {
		
		
		int sum = 0;
		while (true) {
			Random random = new Random();
			int a = random.nextInt(6) + 1;
			int b = random.nextInt(6) + 1;
			
			System.out.println("첫번째 주사위: " + a);
			System.out.println("두번째 주사위: " + b);
			if ((a + b) == 5) {
				System.out.println("합이 5입니다. 종료합니다.");
				break;
				
			}
			/*while(true) {
				Random random = new Random(); 
				int num = random.nextInt(6) + 1;
				System.out.println(num);
				if(num==6) {
				
					break;
				}
			}
			System.out.println("프로그램 종료");
	*/	
			
		}
	}

}
