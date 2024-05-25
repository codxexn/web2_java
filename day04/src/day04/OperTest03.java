package day04;

public class OperTest03 {
	public static void main(String[] args) {
		//증감연산자 (++, --)
		int num1 = 10, num2 = 10, result1 = 0, result2 = 0;
		System.out.println(num1); //10
		//후위형
//		System.out.println(num1++); //10
//		System.out.println(num1); //11
//		
		//전위형
//		System.out.println(++num1); //11
//		System.out.println(num1); //11
		
		result1 = --num1 + 5;
		System.out.println(num1); //9 전위형은 그 라인에서 적용되기 때문에
		System.out.println(result1); //14
		
		result2 = num2-- + 5;
		System.out.println(num2);	//9 후위형은 다음 라인에서 적용되기 때문에
		System.out.println(result2); //15
		
		System.out.println("전위 감소연산자 결과 : " + result1 +", 변수의 값 : " + num1);
		System.out.println("후위 감소연산자 결과 : " + result2 +", 변수의 값 : " + num2);
		
		
	}
}









