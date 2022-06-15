package Chapter04;

public class FourPractice4 {
	public static void main(String[] args) {
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				int sum = (4*x) + (5*y);
				if (sum == 60) {
					System.out.println(("x는: "+ x +", y는: "+ y));
				}
				
				
			}
			
		}
		/*
		 * wndcjq 래, 4x+5y=60 모든 해 구해서ㅏ (x,y)형태로 출력, x와 y는 10이하의 자연수.
		 */
	}

}
