package chapter11;

public class MemberExample {
	public static void main(String[] args) {
		Member meber1 = new Member("a001", "김은대", 1000);
		Member meber2 = new Member("b001", "이쁜이", 2000);
		Member meber3 = new Member("c001", "신용환", 3000);
		
		Member meber4 = new Member("b001", "이쁜이", 1000);
		
		System.out.println(member1.equals(member3));
		System.out.println(member2.equals(member4));
	}

}
