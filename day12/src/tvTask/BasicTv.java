package tvTask;

public class BasicTv {
	
	//필드
	String color;
	int inch;
	int price;
	boolean power; // true : On, false : Off
	int channel = 1;

	
	//생성자
	//color, inch, price
	public BasicTv(String color, int inch, int price) {
		this.color = color;
		this.inch = inch;
		this.price = price;
	}
	
	//color, inch, price, channel
	public BasicTv(String color, int inch, int price, int channel) {
		this.color = color;
		this.inch = inch;
		this.price = price;
		this.channel = channel;
	}

	//기본생성자
	public BasicTv() {
		
	}
	
	//메소드
	//전원을 켜져있으면 끄고 꺼져있으면 키는 메소드 powerOnOff
	void powerOnOff() {
		power = !power;
		if(power) {
			System.out.println("tv전원이 켜졌습니다");
		}else {
			System.out.println("tv전원이 꺼졌습니다");
		}
	}

	//채널 1씩 올리는 값을 반환하는 메소드 channelUp
	int channelUp() {
		return ++channel;
	}
	
	//채널을 1씩 내리는 값을 반환하는 메소드 channelDown
	int channelDown() {
		return --channel;
	}
}
