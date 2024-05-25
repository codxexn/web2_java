package staticTest;

public class StaticBlock {

	//정적블록
	static {
		System.out.println("클래스가 로드될 때 이 블록이 실행됩니다.");
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메소드 실행");
		
	}
	
	//해당 클래스가 사용되기 전에 클래스 파일이 메모리로 로드되고 클래스의 정적 블록이 실행되는 시점	
	
}
