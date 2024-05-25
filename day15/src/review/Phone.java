package review;

public class Phone {

	String model;
	String color;
	
	public void bell() {
		System.out.println(model + "의 벨이 울립니다.");
	}

	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	
	
	
}
