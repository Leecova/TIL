package Chapter06;

public class CarExample01 {
	public static void main(String[] args) {
		
	//객체 생성
		Car01 myCar = new Car01();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.company);
		System.out.println("색깔 " + myCar.company);
		System.out.println("최고속도: " + myCar.company);
		System.out.println("현재속도: " + myCar.company);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}

}
