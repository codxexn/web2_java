package review;

public class PhoneMain {
	public static void main(String[] args) {
		
		Smartphone myPhone = new Smartphone("iPhone12mini", "purple", true);
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		System.out.println("와이파이 여부 : " + myPhone.wifi);
		myPhone.bell();
		
		// 메소드 오버라이딩 못하도록 막을 때 부모클래스에서 메소드에 final을 붙인다.
		
		
		
	}
}
