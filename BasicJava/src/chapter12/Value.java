package chapter12;

public class Value {
	private Object value = 100;
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}
	
}
