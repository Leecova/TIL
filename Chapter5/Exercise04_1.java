package Chapter5;

public class Exercise04_1 {
	public static void main(String[] args) {
		int max = 0; // best:Integer.MIN_VALUE;
		 
		int[] array = { 1, 5, 3, 8, 2};
		int min = array[0]; //Integer.MAX_VALUE, 어레이 먼제 선언 후 미니 선언
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i] ) {
				max = array[i];
			}
			if(min>array[i]) {
				min = array[i];
			}
			
					
		}
		
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}
/*
 * for, if 
 * 배열 식 어떻게 쓰는지 몰랐음 공부 할 것
 * for 문 i 정의할때 arry[i]식으로 한 실수 생각 
 * 
 */
