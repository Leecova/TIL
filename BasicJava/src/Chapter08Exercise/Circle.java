package Chapter08Exercise;

public class Circle extends Shape{
	public double radius;
	
	public  Circle(double radius) {
		this.radius = radius;
		name = "원";
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	public double perimeter() {
		return Math.PI * radius * 2;
	}
	
	
}
