package day03;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
		
		//입력 클래스
		Scanner sc = new Scanner(System.in);
		//import 단축키 : ctrl + shift + o
		
		//이름을 입력해주세요: 000
		//000님 환영합니다 출력
		
//		System.out.print("이름을 입력해주세요 : ");
//		String name = sc.next();
//		System.out.println(name + "님 환영합니다");
////		System.out.println(name + "님 안녕히가세요");
//		String lastName = sc.next();
//		System.out.println(lastName);
		
		System.out.print("입력 >>> ");
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		
		//next()는 엔터를 소모하지 않고
		//nextLine()는 엔터를 소모한다
		//그렇기 때문에 next()는 엔터만 입력했을 때
		//계속 입력을 요구하고 nextLint() 엔터만 입력했을 때
		//입력받는 것을 끝낸다.
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		
	}
}








