package tvTest2;

public class Tv2 {
	//필드
	int ch;
	int vol;
	boolean power;
	String color;
	
	//생성자 단축키 alt + shift + s + o
	//기본생성자
	public Tv2() {
	}
	
	//매개변수 2개인 생성자
	public Tv2(boolean power, String color) {
		this.power = power;
		this.color = color;
	}


	//매개변수 4개인 생성자
	public Tv2(int ch, int vol, boolean power, String color) {
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.color = color;
	}

	
	//메소드
	void power() {
		power = !power;
	}
	


	void chUp() {
		System.out.println("채널을 올립니다");
	}
	void chDown() {
		System.out.println("채널을 내립니다");
	}
}
