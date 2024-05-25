package AnimalTest;

public class Animal { //동물클래스(슈퍼클래스)
	//필드
	//이름, 나이
	String name;
	int age;
	
	//메소드
	//먹기(eat())메소드
	void eat(String food) {
		System.out.println(name + "이/가 " + food + "를 먹습니다");
	}
	//잠자기(sleep())메소드
	void sleep() {
		System.out.println(name + "이/가 잠을 잡니다");
	}
}
