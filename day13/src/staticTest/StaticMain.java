package staticTest;

public class StaticMain {
	public static void main(String[] args) {
		//다른 클래스에서 인스턴스 멤버를 사용하는 경우 => 객체 생성
		StaticTest02 st = new StaticTest02();
		StaticTest02 st1 = new StaticTest02();
		System.out.println(st); //메모리 주소값
		System.out.println(st1); //메모리 주소값
		st.iMethod2();
		System.out.println("----인스턴스메소드 실행1 끝----");
		
		st.iVar = 15;
		st.iMethod2();
		System.out.println("----인스턴스메소드 실행2 끝----");
		
		
		st1.iMethod1();
		System.out.println("----인스턴스메소드 실행3 끝----");
		
		//다른 클래스에서 스태틱 멤버를 사용하는 경우
		st1.sVar = 100;
		System.out.println(st.sVar);
		StaticTest02.sMethod1(); //클래스명.메소드명() 사용
		//이때 클래스명 메소드가 정의되어있는 클래스명을 이용한다
		StaticTest02.sMethod2();
		
	}
}
