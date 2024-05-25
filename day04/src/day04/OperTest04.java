package day04;

public class OperTest04 {
	public static void main(String[] args) {
		//관계연산자(비교연산자) => 결과는 boolean
		int num1 = 5, num2 = 10;
		
		//초과, 미만 비교
		System.out.println(num1 > num2); //num1이 num2보다 크니? false 
		System.out.println(num1 < num2);//num1이 num2보다 작니? true
		
		//이상, 이하 비교
		System.out.println(num1 >= 5); //num1이 5보다 크거나 같니? true(참)
		System.out.println(num1 <= 4); //num1이 4보다 작거나 같니? false(거짓)
		
		//같다, 같지않다 비교
		System.out.println(num1 != num2); //num1과 num2가 같지 않니? true
		System.out.println(num1 == num2); //num1은 num2와 같니? false
		
		//논리연산자(&& AND, || OR, ! NOT)
		boolean isTrue = true;
		boolean isFalse = false;
		
		System.out.println(isTrue && isTrue); //둘 다 참일 때 참
		System.out.println(isTrue && isFalse); //true && false => false
		System.out.println(isFalse && isFalse); //false && false => false
		
		System.out.println(isTrue || isTrue); // 둘 중 하나라도 참이면 참
		System.out.println(isTrue || isFalse); // true || false => true
		System.out.println(isFalse || isFalse);// false || false => false
		
		System.out.println(!isTrue); //!true => false
		System.out.println(!isFalse); //!false => true
		
	
	
	
	}
}










