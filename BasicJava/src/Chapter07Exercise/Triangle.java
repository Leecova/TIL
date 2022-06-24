package Chapter07Exercise;

public class Triangle extends Shape {
	public double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * side * side;
	}
	public double perimeter() {
		return 3 * side;
	}
	
	public String toString() {
		return String.format("도형:삼각형, 둘레:%.1f,넓이:%.16f",perimeter(), area());
	}
	

}
