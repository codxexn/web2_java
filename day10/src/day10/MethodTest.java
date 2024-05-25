package day10;

public class MethodTest {

	// 메소드의 정의 순서에 맞춰서 10을 더해주는 메소드 만들기
	
	public int addTen(int a) {
		return a + 10;
	}
	
	
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		
		int result = mt.addTen(654);
		System.out.println(result);
		
	}
}
