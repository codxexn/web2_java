package tvTest;

public class Tv {
	//필드
	int ch;
	int vol;
	boolean power;
	
	//메소드
	void powerOnOff() {
		//power가 true라면 전원을 킵니다 출력
		//power가 false라면 전원을 끕니다 출력
		if(power) {
			System.out.println("전원을 킵니다");
		}else {
			System.out.println("전원을 끕니다");
		}
	}
	
	void chUp() {
		System.out.println("채널을 올립니다 " + ++ch);
	}
	void chDown() {
		System.out.println("채널을 올립니다 " + --ch);
	}
	
}
