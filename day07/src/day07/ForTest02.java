package day07;

public class ForTest02 {

	public static void main(String[] args) {

		String star = "¡Ú";
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
	}

}
