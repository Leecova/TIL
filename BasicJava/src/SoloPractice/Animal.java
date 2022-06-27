package SoloPractice;

public abstract class Animal { //추상클래스
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //추상 메소드

}
