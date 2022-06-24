package Chapter07Exercise;

public class Circle extends Shape{
	public double radius;
	
	public  Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	public double perimeter() {
		return Math.PI * radius * 2;
	}
	
	public String toString() {
		return String.format("도형:원, 둘레:%.15f,넓이:%.15f, ",  perimeter(),area());
	}

}
