package Day6;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수도입니까?(수도: 1, 수도아님: 0)");
		String num1 = scanner.nextLine();
		
		System.out.println("총 인구는?(단위: 만)");
		String num2 = scanner.nextLine();
		
		System.out.println("연소득이 1억 이상인 인구는?(단위: 만)");
		String num3 = scanner.nextLine();
		
		
		
		Integer Capital = Integer.parseInt(num1);
		Integer Population = Integer.parseInt(num2);
		Integer AnnualIncome = Integer.parseInt(num3);
		
		
		
		if ( (Capital == 1) && (Population >= 100)) {
			System.out.println("이 도시는 메트로폴리스입니다.");
		} else { if ( AnnualIncome >= 50 ) {
			System.out.println("이 도시는 메트로폴리스입니다.");
		}
		System.out.println("이 도시는 메트로폴리스가 아닙니다.");
		}
		
		/*
		 * 한나라의 수도 & 인구 100만 이상 or 연소득 1억 & 인구 50만
		 */
		scanner.close();
	}

}
