package day14;

public class Car {

	private String brand;
	private String color;
	private int price;
	private boolean engine;
	
	public Car() {;}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", engine=" + engine + "]";
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isEngine() {
		return engine;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	
	public void engineStart() {
		this.engine = true;
		System.out.println("자동차의 시동이 켜졌습니다.");
	}
	
	public void engineStop() {
		this.engine = false;
		System.out.println("자동차의 시동이 꺼졌습니다.");
	}
	
	
	
}
