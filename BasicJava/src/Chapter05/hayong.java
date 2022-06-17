package Chapter05;

import java.util.Random;

public class hayong {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[6];
		
		for(int i=0; i<10000; i++) {
			array[random.nextInt(6)]++;
//			switch(random.nextInt(6)) {
//			case 0:
//				array[0]++;
//				break;
//			case 1:
//				array[1]++;
//				break;
//			case 2:
//				array[2]++;
//				break;
//			case 3:
//				array[3]++;
//				break;
//			case 4:
//				array[4]++;
//				break;
//			case 5:
//				array[5]++;
//				break;
//			}
		}
		
		//출력
		for(int i=0; i<array.length; i++) {
			System.out.printf("%-6d%6d\n",i+1,array[i]);
		}
	}
}
