package classTest;

public class Student {
	//2. 연관성 있는 저장공간과 기능을 한곳에 모아 편하게 관리할 수 있는 것
	
	//필드 : 변수
	int math, eng, kor;
	double avg;
	String grade;
	
	//메소드 : 기능, 행동
	int getTotal() {
		return math + eng + kor;
	}
	
}
