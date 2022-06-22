package Chapter06;

public class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton() {
		
	}
	public Singleton getInstance() {
		/*if (instance == null) {
			instance = new Singleton();
		}*/
		return instance; // josh Bloch가 이게 낫다하더라~
	}

}
