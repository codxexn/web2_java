package reviewLambda;

public class LambdaMain {
	public static void main(String[] args) {
		
		Person yhw = () -> System.out.println("바봉");
		yhw.action();
		System.out.println(yhw);
		
//		reviewLambda.LambdaMain$$Lambda$19/0x00000008000cb010@34cd072c
		// $ -> 익명 클래스 의미, $Lambda$ -> 클래스내부 람다 의미
		// 0x00000008000cb010 -> jvm내에서 객체 식별할 때 사용되는 객체의 해시코드 또는 주소값
		// @34cd072c -> 객체의 해시코드를 16진수로 표현한 값
		
		
		
		
		
		
	}
}
