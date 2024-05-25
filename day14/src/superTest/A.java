package superTest;

public class A {

	String data;

	public A() {
		super();
		this.data = "부모클래스 생성자";
	}
	
	void method(int num) {
		System.out.println("부모 클래스의 method 호출 : " + num);
	}
	
	
}
