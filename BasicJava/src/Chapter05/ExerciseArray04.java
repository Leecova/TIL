package Chapter05;

import java.util.Iterator;
import java.util.Random;

public class ExerciseArray04 {
	public static void main(String[] args) {
		Random random = new Random();
		int dice = random.nextInt(6);
		int array[]= new int[6];
		
		
		for (int i = 0; i < 10000; i++) {
		
			array[dice]++;
			
	
			
		}
		
		System.out.println("=============");
		System.out.println("면 빈도");
		System.out.println("=============");
		for(int i = 0; i <dice; i++) {
			
			System.out.println( (i+1)+" "+ array[i]);
			
		}
	}

}
