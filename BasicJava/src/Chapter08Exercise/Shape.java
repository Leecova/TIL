package Chapter08Exercise;

public abstract class Shape implements Comparable<Shape> {
	String name;
	public abstract double area();
	public abstract double perimeter();
	//추상 메소드 변경
	
	//Comparable 인터페이스 --- Arrays.sort ---
	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		if(area() > o.area()) {
			return  1;
		} else if (area() < o.area()) {
			return  -1;
		} else {
			return  0;
		}

	}
	@Override
	public String toString() {
		return String.format("도형:%s, 둘레:%.2fcm,넓이:%.2fcm, ", name, perimeter(), area());
	
	}
}
