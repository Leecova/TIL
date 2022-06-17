package Chapter05;

public class StringEqualsExample {
	public static void main(String[] args) {
		// JDK 1.5부터 String pool(문자열 관리 공간)
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가다름");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		// 이렇게 쓰면 안됨, why 효율적으로 관리하기 위해 메모리를, 성능적으로 관리. 문제는 없지만 가능하면 위에가 좋다.
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVAr4는 참조가 다름");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} // 스트링을 쓸때에는 반드시 이콜드와 비교해서 써봐야하는게 맞고 = 문자열 비교는
	}

}
