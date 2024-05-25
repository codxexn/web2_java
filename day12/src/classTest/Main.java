package classTest;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.math = 100;
		st1.eng = 50;
		st1.kor = 100;
		
		st2.math = 88;
		st2.eng = 0;
		st2.kor = 100;
		
		//메소드를 점수들의 총점 호출
		System.out.println(st1.getTotal()); //학생1의 총점
		System.out.println(st2.getTotal());	//학생2의 총점
		
	}
}
