package Day5;

public class Chatper3_2_10 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		// Double.parseDouble > 문자열을 기본열로 강제변환
		System.out.println("원의 넓이:" + var4);
		
	}

}
