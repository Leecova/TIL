package Chapter04;

public class FourPractice5 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
				if ( j == i) {
				System.out.println();
				}
				
			}
			
		}
		
	}

}


/*
 * 
 * 
 * 7행 why? print?? 
 * 6행 다음으로
 * if 없이 해도 실행됨 System.out.print("*");
*/
