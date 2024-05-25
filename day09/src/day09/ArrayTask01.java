package day09;

public class ArrayTask01 {
	public static void main(String[] args) {
		
		
		char[] alphabet = new char[5];
		
		for(int i = 0; i < alphabet.length; i++) {
			
			alphabet[i] = (char)(i + 65);
			
			if (i >= 2) {
				alphabet[i] = (char)(i + 66);
			}
			
			System.out.print(alphabet[i]);
		}
	}
	
	
	
	
	
	
	
	
	
}
