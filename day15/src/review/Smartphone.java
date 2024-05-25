package review;

public class Smartphone extends Phone {

	boolean wifi;
	
	void sifiStatus(boolean wifi) {
		this.wifi = wifi;
		System.out.println(model + "의 와이파이 상태를 변경합니다.");
	}

	public Smartphone(String model, String color, boolean wifi) {
		super(model, color);
		this.wifi = wifi;
	}
	
	
	
	
}
