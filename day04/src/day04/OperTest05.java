package day04;

public class OperTest05 {
	public static void main(String[] args) {
		//삼항 연산자 ( 조건식? 참일 때의 값:거짓일 때의 값)
		int num1 = 10, num2 = -10, num3 = 20;
		
		System.out.println(true ? "참입니다" : "거짓입니다");
		System.out.println(false ? num1 : num2);
		
		System.out.println(num1 == num2 ? "같다" : "다르다");
		System.out.println(num1 != num2 ? "다르다" : "같다");
	}
}
