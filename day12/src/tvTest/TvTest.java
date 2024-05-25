package tvTest;

public class TvTest {
	public static void main(String[] args) {
		//객체화작업(Tv 클래스)
		//클래스명 참조변수명 = new 생성자();
		Tv samsungTv = new Tv();
		//객체를 생성하고 필드를 출력하면 각 자료형의 디폴트 값이 들어있다
		System.out.println(samsungTv); //참조값
		System.out.println(samsungTv.power);
		System.out.println(samsungTv.ch);
		System.out.println(samsungTv.color);
		
		samsungTv.ch = 10;
		samsungTv.vol = 15;
		samsungTv.power = true;
		samsungTv.color = "black";
		samsungTv.inch = 30;
		samsungTv.price = 1500000;
		//객체에 값을 저장하는 방법이 불편하다.
		//이럴 때 생성자를 사용한다.
		System.out.println(samsungTv.ch);
		System.out.println(samsungTv.power);
		System.out.println(samsungTv.vol);
		System.out.println(samsungTv.color);
		
	}
}















