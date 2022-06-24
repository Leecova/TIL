package Chapter07Exercise;

public class Rectangle extends Shape{
	
	public double width;
	public double height;
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return (2*width)+(2*height);
	}
	
	
	public String toString() {
		return String.format("도형: 사각형, 둘레:%.1f, 넓이:%.1f " , perimeter(),area());
	};
	

}
