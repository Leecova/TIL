package Chapter08Exercise;

public class Rectangle extends Shape{
	
	public double width;
	public double height;
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
		name = "사각형";
	}
	
	@Override
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return (2*width)+(2*height);
	}
	
	

	

}
