package Chapter06Exercise;

public class Car {
	
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	
	
	public Car() {
		
	}
	
	public Car(String color){
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
			this.speed = speed;			
	
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public boolean speedUp(double speed) {
		if (speed + this.speed >=0 && speed+this.speed <= MAX_SPEED) {
			//this.speed+speed <0 || this.speed+speed>MAX_SPEED
			this.speed += speed;
			return true;
		} else {
			return false;
		}
		
	}
	
	static double getMaxSpeed(){
		
		return MAX_SPEED;
	}
	
	public String toString() {
		return String.format("%d", speed);
	}

//	program speed: 목표속도 or 속도만큼 증감 
	//@Override
	//public String toString() {
	//return "자동차 속력 =" +speed + ", 색상 =" + color;
	//}
}
