package day02;

public class PrintTask {

	public static void main(String[] args) {
		// 1. 서식문자 %s %d를 사용하여 이름과 나이를 출력하기(값으로넣기)
		System.out.printf("이름 : %s, 나이 : %d", "김영선", 20);

		// 2. 서식문자 %s %d를 사용하여 이름과 나이를 출력하기(변수로넣기)
		String name = "김영선";
		int age = 40;
		System.out.printf("\n이름 : %s, 나이 : %d", name, age);

		// 3. 두개의 문자열 변수 fristdata와 lastdata를 선언하고
		// 값을 웹개발1 수업, 2일차 를 각각 대입한 후
		// 오늘은 웹개발1 수업 2일차입니다 출력하기(서식문자 사용)
		String fristdata = "웹개발1 수업", lastdata = "2일차";
		System.out.printf("\n오늘은 %s %s입니다", fristdata, lastdata);

		// 4. 논리형 변수 isRaining에 true를 대입하고
		// 11월 9일엔 비가 옵니까? true 출력하기(print 사용)
		boolean isRaining = true;
		System.out.print("\n11월 9일엔 비가 옵니까? " + isRaining);

		// 5. 동해물과 백두산이 마르고 닳도록 문자열을 출력하는데
		// 동해물에는 큰따옴표 강조, 백두산은 작은따옴표 강조
		// 백두산이 다음에 줄바꿈되게 출력하기(출력메소드 1개만 사용)
		System.out.println("\n\"동해물\"과 \'백두산\'이 \n마르고 닳도록");
		
	}
}







