package review;

public class DataType {
	public static void main(String[] args) {
		//정수형(byte, short, int, long)
		//byte 1byte => -128 ~ 127
		byte num1 = 127;
		byte num2 = -128;
		System.out.println(num1); //127
		num1++;
		System.out.println(num1); // -128 오버플로우가 발생하여 잘못된 결과가 저장됨
//		System.out.println(num1 + 1); //128
		
		System.out.println(num2);
		num2--;
		System.out.println(num2); // 127 언더플로우가 발생하여 잘못된 결과가 저장됨
	}
}
