package day06;

public class ForTest01 {
	
	
	
	public static void main(String[] args) {
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println( i + 1 + "번째 이도은");
//		}
		
		for (int i = 1; i < 49; i++) {
			System.out.print(i * 2 + " ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		for (int i = 0; i < 9; i++) {
			System.out.print( (i + 1) * 3 + " ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		for (int i = 0; i < 6; i++) {
			System.out.print((char)(i + 65)  + " ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		for (char c = 'A'; c <= 'F'; c++) {
			System.out.print(c + " ");
		}
		
		
	}
}
