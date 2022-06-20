package SoloPractice;

import java.util.Random;

public class ExerciseArray04Practice_2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[6];
		
		for (int i = 0; i < 10000; i++) {
			
		
		switch (random.nextInt(6)) {
		case 0:
			array[0]++;
			break;
			
		case 1:
			array[1]++;
			break;
			
		case 2:
			array[2]++;
			break;
			
		case 3:
			array[3]++;
			break;
			
		case 4:
			array[4]++;
			break;
			
		case 5:
			array[5]++;
			break;
			
		}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%-6d%d",i,array[i]);
		}
	}

}
