package casting;

public class CastingTest {
	public static void main(String[] args) {
		
	Tv tv = new Tv();
	Tv smartTv = new SmartTv();
	
	
//	SmartTv realSmartTv = (SmartTv)smartTv;
//	realSmartTv.netflix();

	if (smartTv instanceof SmartTv) {
		((SmartTv)smartTv).netflix();
		System.out.println("넷플릭스를 시청합니다.");
	} else {
		System.out.println("스마트 티비가 아니므로 업그레이드가 필요합니다.");
	}
	
	
	}
}
