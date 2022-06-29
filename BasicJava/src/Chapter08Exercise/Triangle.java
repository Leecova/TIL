package Chapter08Exercise;

public class Triangle extends Shape {
	public double side;
	
	public Triangle(double side) {
		this.side = side;
		name = "삼각형";
	}
	
	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * side * side;
	}
	public double perimeter() {
		return 3 * side;
	}
	

	

}
