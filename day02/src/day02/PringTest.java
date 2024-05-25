package day02;

public class PringTest {
	//메인메소드
	public static void main(String[] args) {
		System.out.println("김영선");
		
		String weahter = "흐림";
		int month = 11;
		int date = 9;
		double max = 16.1234567;
		double min = 8.135;
		
		//변수를 이용해서 값을 넣어주기
		System.out.printf("오늘은 %d월 %d일입니다.\n", month, date);
		System.out.printf("오늘은 " + month + 
				"월 %d일입니다.", 9);
		
		//오늘의 날씨는 흐림입니다 출력
		System.out.println("\n오늘의 날씨는 " + weahter + "입니다.");
		System.out.printf("오늘의 날씨는 %s입니다.", "맑음");
		
		//실수
		System.out.printf("\n오늘의 최고기온은 %f도입니다.\n", max);
		System.out.printf("오늘의 최저기온은 %f도입니다.\n", min);
		System.out.printf("오늘의 최저기온은 %.2f도입니다.\n", min);
		
		//서식문자 옵션 사용
		//%[-or0][자리수][.m]서식문자
		System.out.println("==========================");
		System.out.printf("%10s\n", "안녕하세요");
		System.out.printf("%-10s\n", "안녕하세요");
		System.out.printf("%-10.2s\n", "안녕하세요");
		System.out.printf("%-5s\t\t%05d", "꼬북칩", 2500);
		
	}
}











