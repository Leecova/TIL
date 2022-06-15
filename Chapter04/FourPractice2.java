package Chapter04;

public class FourPractice2 {
	public static void main(String[] args) {
		int sum = 0;
	
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0) {
				//if문 써서 i가 3의 배수일때 i를 구한다.
				sum += i;
				// System.out.println(i);   > 배수가 확인됨
				/*int sum
				 *int a;
				 *for (a = 1; a <= 100; a++
				 *if ( a%3==0) {
				 *sum +=;
				 *System.out.println
				 *
				 * 
				 * */
			}
		}
		System.out.println("3의 배수 합 : " + sum );
	}

}
