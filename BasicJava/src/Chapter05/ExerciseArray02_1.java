package Chapter05;

import java.util.Random;

public class ExerciseArray02_1 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[45];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			
			int ranNum = random.nextInt(45);
			
			int temp = numbers[i];
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp;
			
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(numbers[i] + " ");
		}
	}
	
	
	
	
	
	/*
	 * 총 45개의 배열을 만들고 1부터 45까지 숫자를넣는다.
	 * x - y - temp 처럼 섞는다
	 * 결과가 나오면 앞에 6개를 자른다
	 */
	/*
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[45];
		
		for (int i = 1; i < lotto.length; i++) {
			lotto[i] = i + 1;
			System.out.println(lotto[i]);
		}
		for (int i = 0; i < lotto.length; i++) {
			
			int num = random.nextInt(lotto.length);
			int temp = 0;
			temp = lotto[i];
			lotto[i] = num;
			
		}
		
		
		
	}*/
}
