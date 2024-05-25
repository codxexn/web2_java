package classTest;

public class Exam03 {
	public static void main(String[] args) {

		// 3. 객체를 생성하기 위한 틀
		int num1 = 3;
		int num2 = 5;
		Student 철수 = new Student();
		Student 유리 = new Student();
		
		철수.eng = 92;
		유리.eng = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(철수.eng);
		System.out.println(유리.eng);
//		eng = 100; 변수가 정의되지 않아 오류 발생
		
		
		
	}

}