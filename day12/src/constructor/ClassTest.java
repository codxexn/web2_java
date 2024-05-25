package constructor;

class A{
	//메소드
	void method() {
		System.out.println(this);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a); //객체 주소값이 출력
		a.method();	//this는 객체 자기 자신이기 때문에 객체의 주소값이 출력
	}
}
