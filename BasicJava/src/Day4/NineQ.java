package Day4;

public class NineQ {
	public static void main(String[] args) {
		
		long var1 = 2;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1 + var2 + var3 + Double.parseDouble(var4));
		// int 강제캐스팅 위해 앞에 int, var2,3,4 3개중 하나에 int 붙이면됨 3개중 하나인 이유는 2,3,4소수점 없애야 계산이 맞음
		System.out.println(result);
		
	}


}
