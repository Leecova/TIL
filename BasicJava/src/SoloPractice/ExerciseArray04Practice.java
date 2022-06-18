package SoloPractice;

import java.util.Random;

public class ExerciseArray04Practice {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		
		for (int i = 0; i < 10000; i++) {
			lotto[random.nextInt(6)]++;;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%-6d%6d\n",i+1,lotto[i]);
		}
	}

}
