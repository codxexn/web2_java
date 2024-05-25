package staticTest;

public class StaticTest02 {
	//필드
	int iVar;
	static int sVar;
	
	//메소드
	//인스턴스메소드
	void iMethod1() {
		System.out.println(iVar);
		iVar = 10;
		sVar = 20;
		
		iMethod2();
		sMethod2();
	}
	
	void iMethod2() {
		System.out.println(iVar);
		System.out.println(sVar);
	}
	
	//정적메소드
	static void sMethod1() {
//		iVar = 100; //오류 : 인스턴스 변수에 접근 불가능
		sVar = 200;
//		iMethod2(); //오류 : 인스턴스 메소드에 접근 불가능
		sMethod2();
	}
	
	static void sMethod2() {
//		System.out.println(iVar); //오류 : 인스턴스 변수에 접근 불가능
		System.out.println(sVar);
		
	}
	
	
	
}






