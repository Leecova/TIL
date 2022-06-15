package Day6;

import java.util.Scanner;

public class Practice2T {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		// 여기도 String으로 안하고 int로 > why?
		System.out.println("수도입니까?(수도: 1, 수도아님: 0)");
		String num1 = scanner.nextLine();
		
		System.out.println("총 인구는?(단위: 만)");
		String num2 = scanner.nextLine();
		
		System.out.println("연소득이 1억 이상인 인구는?(단위: 만)");
		String num3 = scanner.nextLine();
		
		
	
		Integer Capital = Integer.parseInt(num1);
		Integer Population = Integer.parseInt(num2);
		Integer AnnualIncome = Integer.parseInt(num3);
		
	
		String Metropolice = (Capital == 1) && (Population >= 100) ? "이 도시는메트로폴리스입니다." : (AnnualIncome >= 50 ? "이 도시는 메트로폴리스입니다." : "아닙니다.");
		System.out.println(Metropolice);
		/*
		 * 
		 * Metropolice 앞에 int, double, char .. 등등 붙였는데 계속 오류
		 * 이유 모르다가 String으로 해야한다는거 뒤늦게 배움  >> why?
		 * 
		 * 
		 * 
		 * 메트로폴리스(거대도시)는 다음과 같은 2가지 조건 중 하나를 만족하여야 한다고 가정한다. 어떤 도시가 메트로폴리스인지를 알아보는 프로그램을 작성하여 보자.(삼항연산자 사용)
1. 한 나라의 수도이고, 인구가 100만 이상이어야 한다. 2. 연 소득이 1억 이상인 인구가 50만 이상이어야 한다.
		 * 
		 */
		scanner.close();
	}

}