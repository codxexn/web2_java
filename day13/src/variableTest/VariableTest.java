package variableTest;

public class VariableTest {

	//필드
	int iVar;
	static int sVar;

	//메소드
	//지역변수 사용하는 메소드
	void LocalVar() {
		int localVar = 10; //지역변수 선언 및 초기화
		System.out.println("지역변수 : " + localVar);
	}
	
	//매개변수 사용하는 메소드
	void paraVar(int num) {
		System.out.println("매개변수 : " + num);
//		System.out.println(localVar); // 지역변수는 해당 중괄호안에서만 사용 가능
	}
	
	//인스턴스 변수 사용하는 메소드
	void inVar() {
		System.out.println("인스턴스 변수 : " + iVar);
		iVar = 150;
		System.out.println("인스턴스 변수 : " + iVar);
	}
	
	//정적메소드
	static void staticVar() {
		sVar = 100; //정적변수 값 설정
		System.out.println("정적변수 : " + sVar);
		
		//객체 생성하여 정적변수에 접근
		VariableTest vt1 = new VariableTest();
		VariableTest vt2 = new VariableTest();
		vt1.sVar = 200;
		
		System.out.println("정적변수(vt1) : " + vt1.sVar);
		System.out.println("정적변수(vt2) : " + vt2.sVar);
		//sVar 저장공간이 1개로 모든 객체가 값을 공유하며 사용한다
		//그렇기 때문에 객체를 만들어서 호출하지 않고 클래스명으로 접근하는 것을 권장한다
	}
	
	
	public static void main(String[] args) {
		VariableTest vt = new VariableTest(); //객체 생성
		VariableTest vt2 = new VariableTest(); //객체 생성
		
		vt.LocalVar(); // 지역변수 메소드 호출
		
		vt.paraVar(11); // 매개변수 메소드 호출
		
		vt.inVar(); //인스턴스변수 메소드 호출
		vt2.iVar = 1000; 
		vt2.inVar(); //인스턴스 변수는 객체마다 고유 값을 가질 수 있다
		
		VariableTest.staticVar();
		
		
	}
}










