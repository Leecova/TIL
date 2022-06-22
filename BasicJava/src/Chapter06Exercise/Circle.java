package Chapter06Exercise;

public class Circle {
	
	//필드
	private double radius;
	private double x;
	private double y;
	
	//생성자
	/*public Circle() {
		
	}
	해도 되고 안해도됨 기본 생성자라
	*/
	
	
	//메소드
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	

}
