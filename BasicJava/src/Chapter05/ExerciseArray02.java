package Chapter05;

import java.util.Random;

public class ExerciseArray02 {
	public static void main(String[] args) {
		//번호 생성, 1~45 중복되지 않는 6개 추출 후 결과
		
		int[] lotto = new int[6];
		Random random = new Random();
			
		
		
		for (int i = 0; i < lotto.length; i++) {
			int num = random.nextInt(45)+1;
			lotto[i] = num;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.println(lotto[i]);
		} 
		
		
		}
		
}