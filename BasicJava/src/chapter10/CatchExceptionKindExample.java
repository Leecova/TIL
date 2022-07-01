package chapter10;

public class CatchExceptionKindExample {
	public static void main(String[] args) {
		try {
		String dat1 = args[0];
		String dat2 = args[1];
		int value1 = Integer.parseInt(dat1);
		int value2 = Integer.parseInt(dat2);
		int result = value1 + value2;
		System.out.printf("%d + %d = %d\n", value1, value2, result);
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("실행 매개값의 수가 부족합니다.");
	}catch (NumberFormatException e) {
		System.out.println("숫자로 변환할 수 없습니다.");
		// TODO: handle exception
	}catch (Exception e) {
		System.out.println("예외가 발생했습니다.");
	}
		finally{
		System.out.println("다시 실행하세요.");
	}
// 순서가 중요하다
	}
}
