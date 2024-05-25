package constructor;
class B{
	//필드
	int num;
	
	//메소드
	void printNum(int num) {
		System.out.println("num >> " + num); //메소드의 매개변수로 전달된 num
		System.out.println("num >> " + this.num); //this.num은 객체의 필드에 저장된 값 num
		System.out.println("참조값 >> " + this); // 객체 주소값
	}
	
}

public class ClassTest2 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		
		System.out.println(b1);
		b1.printNum(10);
		b1.num = 100; //필드에 저장
		b1.printNum(10);
		
		System.out.println(b2);
		b2.num = 20;
		b2.printNum(50);
		
	}
}
