package day02;

public class EscapeCharacter {

	public static void main(String[] args) {
		//제어문자
		// \n : 줄바꿈
		System.out.println("안녕하세요");
		//복사 단축키 : ctrl + alt + 화살표 방향키

		System.out.println("안녕\n하세요");
		// \t : 탭키적용
		System.out.println("반갑\t습니다");
		// \", \' : ", '를 표현
		System.out.println("무궁화 삼천리 화려강산");
		System.out.println("\"무궁화\" 삼천리 화려강산");
		System.out.println("무궁화 \'삼천리\' 화려강산");
		
		// \\ : 역슬래시를 표현
		System.out.println("제어문자는 \"\\\"로 시작한다");
	}

}












