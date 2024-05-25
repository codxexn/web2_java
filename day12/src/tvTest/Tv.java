package tvTest;

public class Tv {
	//필드 : 변수
	int ch;
	int vol;
	boolean power;
	String color;
	int inch;
	int price;
	
	//메소드 : 행동, 행위, 기능
	
	//전원을 켜고끄는 메소드(켜져있으면 끄기, 꺼져있으면 켜기)
	void powerOnOff() {
		power = !power;
	}
	
	//채널을 올립니다 출력하는 메소드
	void chUp() {
		System.out.println("채널을 올립니다");
	}
	
	//채널을 내립니다 출력하는 메소드
	void chDown() {
		System.out.println("채널을 내립니다");
	}
	//볼륨을 올립니다 출력하는 메소드
	void volUp() {
		System.out.println("볼륨을 올립니다");
	}
	
	//볼륨을 내립니다 출력하는 메소드
	void volDown() {
		System.out.println("볼륨을 내립니다");
	}
}
