package interFan;

public class ceilingFan extends FanAdapter{

	@Override
	public void on() {
		System.out.println("천장 선풍기를 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("천장 선풍기를 끕니다.");
	}
	
}
