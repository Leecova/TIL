package Chapter05;

import java.util.Random;

public class Exercise04 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] count = new int[6];
		for (int i = 0; i < 10000; i++) {
			count[random.nextInt(6)]++;
		}
		//int ranNum = random.nextInt(6);
		// count[ranNum]++;
		
		/*
		for (int i = 0; i < 10000; i++) {
			int num = random.nextInt(6) + 1;
			if( number == 1) {
				count[0]++;
			} else if (number ==2) {
				count[1]++;
			} else if (number ==3) {
				count[2]++;
			} else if (number ==4) {
				count[3]++;
			} else if (number ==5) {
				count[4]++;
			} else  {
				count[5]++;
			}
			
		}
		
		*/
		for (int i = 0; i < count.length; i++) {
			System.out.println("");
		}
	}

}
