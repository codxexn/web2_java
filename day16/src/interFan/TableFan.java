package interFan;

public class TableFan implements Fan{

	@Override
	public void on() {
		System.out.println("테이블 선풍기를 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("테이블 선풍기를 끕니다.");
	}

	@Override
	public void turbo() {
		System.out.println("테이블 선풍기 터보 작동.");
	}

	
	
}
