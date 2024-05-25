package day03;

public class Casting02 {

	public static void main(String[] args) {
		//자동형변환 가능한 타입과 값 확인
		//정수(int) <- char
//		int iNum1 = 10L; //long 값
//		int iNum2 = 3.5; //double 값
//		int iNum3 = 3.5f; //float 값
		int iNum4 = 'A'; //char 값
//		int iNum5 = true; //boolean 값
		System.out.println(iNum4);
		
		//정수(Long) <- int, char
		long lNum1 = 10; //int 값
//		long lNum2 = 3.5;
//		long lNum3 = 4.11f;
		long lNum4 = 'a'; //97
//		long lnum5 = false;
		System.out.println(lNum1);
		System.out.println(lNum4);
		
		//실수(double) <- int, long, float, char
		double dNum1 = 10; 
		double dNum2 = 10L;
		double dNum3 = 10.5f;
		double dNum4 = 'B'; //66.0
//		double dNum5 = true;
		System.out.println(dNum1);
		System.out.println(dNum2);
		System.out.println(dNum3);
		System.out.println(dNum4);
		
		//실수(float) 
		float fNum1 = 10;
		float fNum2 = 20L;
//		float fNum3 = 10.5; //double
		float fNum4 = '가';
//		float fNum5 = false; //boolean
		System.out.println(fNum1);
		System.out.println(fNum2);
		System.out.println(fNum4);
		
		//char : 문자형 '' 작은 따옴표로 표시
//		char cNum1 = 100000; //0~65535사이의 값은 자동형변환
//		char cNum2 = 65L;
//		char cNum3 = 10.5;
//		char cNum4 = 10.5f;
//		char cNum5 = true;
		char cNum6 = 65;
		System.out.println(cNum6 + "입니다");
		
		//boolean
//		boolean bNum1 = 10;
//		boolean bNum2 = 1.5;
//		boolean bNum3 = 100L;
//		boolean bNum4 = 15.34f;
//		boolean bNum5 = 'a';		
		
	}

}






