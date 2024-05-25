package day03;

public class Casting04 {
	public static void main(String[] args) {
		//문자열의 형변환
		int num1 = 1, num2 = 2;
		String number1 = "1", number2 = "2";
		
		System.out.println(num1 + num2); //연산
		System.out.println(number1 + number2); //연결
		System.out.println(num1 + number1); //정수 + 문자열 = 문자열 연결
		
		System.out.println("제 나이는 " + num1 + "살입니다");
		
		//기본자료형 -> 문자열로 변환
		String number3 = num1 + ""; // 1 + "" => "1"
		System.out.println(number3 + number2); // 문자열 + 문자열
		System.out.println(number3 + num1);
		
		String str1 = 3 + "";
		String str2 = 3.5 + "";
		String str3 = 'a' + "";
		String str4 = true + "";
		System.out.println(str1 + str2 + str3 + str4);
		
		//문자열 -> 기본 자료형(int, long, double, float, boolean, char) 변환
		int iNum1 = Integer.parseInt(str1);
		double dNum1 = Double.parseDouble(str2);
		boolean isTrue = Boolean.parseBoolean(str4);
		long lNum1 = Long.parseLong(str1);
		System.out.println(iNum1 + dNum1); //연산
		System.out.println(str1 + str2); //연결
		char cNum1 = str3.charAt(0);
		char cNum2 = "Hello".charAt(4); //.charAt() 소괄호 안에는 인덱스 번호가 들어간다
		//인덱스 번호는 항상 0부터 시작한다
		System.out.println(cNum2);
		
	}
}













