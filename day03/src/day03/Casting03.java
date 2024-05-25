package day03;

public class Casting03 {
	public static void main(String[] args) {
		//문자형 <-> 실수형 자동형변환 가능
		char cNum1 = 'a';
		double dNum1 = cNum1;
		System.out.println(cNum1);
		System.out.println(dNum1);
		
		//강제 형변환 (타입)값
		int num1 = (int)5.2;
		System.out.println(num1);
		
		System.out.println((int)5.1); // 5.1 값 -> 5
		System.out.println((double)5); // => 5.0출력
		System.out.println((char)97); //97 -> a
		System.out.println(10/(double)3);
		
		System.out.println(10/3.0);
		System.out.println(10.0/3);
	}
}











