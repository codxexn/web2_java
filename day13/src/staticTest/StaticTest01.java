package staticTest;

public class StaticTest01 {
	public static void main(String[] args) {
		// 정적메소드를 직접 호출 가능
		staticMethod();
		
		// 정적메소드를 클래스명 이용해서 호출 가능하지만 권장하지 않음
		StaticTest01.staticMethod();
		
		//인스턴스 메소드는 직접 호출 불가
//		instanceMethod();
		
		StaticTest01 st = new StaticTest01();
		//객체 이용해 인스턴스 메소드 호출 (추천)
		st.instanceMethod();
	}
	
	//인스턴스 메소드
	void instanceMethod() {
		System.out.println("인스턴스 메소드 실행");
		instanceMethod2(); // 인스턴스2 메소드 호출
		staticMethod(); //스태틱메소드 호출
	}
	
	//인스턴스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드2 실행");
	}
	
	//정적메소드
	static void staticMethod() {
		System.out.println("정적메소드 실행");
//		instanceMethod(); // 인스턴스 메소드 호출
		staticMethod2(); // 정적 메소드 호출
	}

	static void staticMethod2() {
		System.out.println("정적메소드2 실행");
//		instanceMethod(); // 인스턴스 메소드 호출
	}
	
	
	//인스턴스 메소드에서 정적메소드 호출가능하지만 권장하지 않음
	void iMethodSMethod() {
		System.out.println("인스턴스 메소드에서 정적메소드 호출");
		staticMethod(); // 정적 메소드 호출
	}
}










