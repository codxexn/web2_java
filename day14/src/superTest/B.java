package superTest;

public class B extends A {

	String data;
	
	public B() {
		super();
		System.out.println("B 클래스 생성자 호출");
	}

	@Override
	void method(int num) {
		super.method(num);
		System.out.println("B클래스의 method 호출 : " +  num);
	}
	
	void test(String data) {
		//전달한 매개변수 출력
		System.out.println(data);
		// 객체에 담긴 data 필드 값 출력
		System.out.println(this.data);
		// method에 1000 담아서 실행
		method(1000);
		// B 클래스 객체에 1500 담아서 실행
		this.method(1500);
		System.out.println("super 확인");
		// 부모클래스 method 메소드에 2000 담아서 실행
		super.method(2000);
	}
	
	

	
}
