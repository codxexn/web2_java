package castingTask;

public class Rock extends Music{

	@Override
	void mode() {
		super.mode();
		System.out.println("락 모드");
	}

	void onlyRock() {
		System.out.println("onlyRock 실행");
	}
	
}
