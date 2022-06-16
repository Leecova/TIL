package Chapter5;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i] ) {
				max = array[i];				
			}
			
		}
		
		System.out.println("max: " + max);
	}

}
/*
 * for, if 
 * 배열 식 어떻게 쓰는지 몰랐음 공부 할 것
 * for 문 i 정의할때 arry[i]식으로 한 실수 생각 
 * 
 */
