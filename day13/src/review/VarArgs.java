package review;

//가변길이 메소드 확인
public class VarArgs {
	
	static void printNumbers(int ... numbers) {
		System.out.println(numbers); //주소값 출력
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printNumbers();
		printNumbers(1, 2, 3, 4, 5); //5개의 인수 전달
		printNumbers(1, 2); //2개의 인수 전달
		printNumbers(10);
	}
}
