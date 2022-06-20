package Chapter06;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	
	Car(String model){
	this.model = model;
	//this(model, "은색", 250);
	//new Car(model, "은색", 250);
	// String model = "현대자동차";
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {
		//model = "현대자동차";
		//color = "은색";
		//maxSpeed = 250;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

}
