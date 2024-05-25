package superTest;

public class Main {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
//		System.out.println("부모클래스의 객체 : " + a);
//		System.out.println("자식클래스의 객체 : " + b);
//		
//		b.method(10);
//		
//		System.out.println(b.data);
//		System.out.println(a.data);
		
		b.test("지역변수의 데이터");
		
	}
}
