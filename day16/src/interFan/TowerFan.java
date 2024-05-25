package interFan;

public class TowerFan implements Fan {

	@Override
	public void on() {
		System.out.println("타워 선풍기를 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("타워 선풍기를 끕니다.");
	}

	@Override
	public void turbo() {
		System.out.println("타워 선풍기 터보 작동.");
	}
	
}
