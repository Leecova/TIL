package chapter08;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//인터페이스 기본 모양
	// 상수를 쓸 수 있거나 선언하는 , 이름이 뭐고 매개변수가 뭐가 있고
	// 선언 부분만 선언해주는게 인터페이스의 기본 형태다
	
	void turnOn();
	void turnOff();
	void setVolume(int voulme);
	/* public abstract void turnOn();
	 * public abstract void turnOff();
	 * public abstract void setVolume(int voulme);
	 * 인터페이스는 public과 abstract가 생략되어있다.
	 * 안써도 되고 안쓰는게 좋다.
	 */
}
