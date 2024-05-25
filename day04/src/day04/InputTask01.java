package day04;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
		//사용자로부터 이름과 나이를 입력받고
		//올해의 나이와 다음해의 나이를 계산하여 출력하기
		//8시5분 ~ 8시10분
		//로직구성 먼저하기(한글로 어떤 과정을 코드로 작성할지 쓰기)
		
		//내이름은 000이고 2023년 나이는 0살입니다
		//2024년의 나이는 1살입니다
		
		//1. 입력 클래스 import
		//2. 변수 3개 선언(초기값 활용)
		//3. 출력메시지(이름 입력 : )
		//4. 입력메소드(next())
		//5. 출력메시지(나이 입력 : )
		//6. 입력메소드(nextInt())
		//7. 출력
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0, futureAge = 0;
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		futureAge = age + 1; 
		//프로그램의 실행방향은 위에서 아래 이므로
		//위에서 age + 1 하게되면 그 값으로만 저장된다
		System.out.println("내 이름은 " + name + "이고, "
				+ "2023년 나이는 " + age + "살입니다");
		System.out.println("2024년 나이는 " + futureAge + "살입니다");
	}
}











