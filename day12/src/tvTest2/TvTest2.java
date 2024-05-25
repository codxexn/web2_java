package tvTest2;

public class TvTest2 {
	public static void main(String[] args) {
		
		//Tv2 클래스의 객체 생성
//		Tv2 lTv = new Tv2(); //기본 생성자가 존재하지 않아서 오류
		Tv2 sTv = new Tv2(1, 10, false, "white");
		//생성자를 사용하면 객체를 만듦과 동시에 내가 원하는 값으로 초기화 할 수 있다
		
		System.out.println(sTv.power);
		System.out.println(sTv.ch);
		System.out.println(sTv.vol);
		System.out.println(sTv.color);
		
		
		
	}
}
