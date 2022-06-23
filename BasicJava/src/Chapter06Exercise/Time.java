package Chapter06Exercise;

public class Time {
	
	//필드
	private int hour;
	private int minute;
	private int second;
	
	//생성자
	public Time() {
		
	}
	//0초기화
	
	public Time(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		}
		if (minute >= 0 && minute <60) {
			this.minute = minute;
		}
		if (second >= 0 && second <60) {
			this.second = second;
		}
	}
	// 필드조건건
	//인스턴스의 필드가 어떤 값을 갖고 있는지 확인 할 수 있는 메소드
	
	
	//메소드
	public String toString() {
		return String.format("%02d:%02d:%02d",  hour, minute, second);
	}
	
}
