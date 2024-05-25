package wrapperTest;

public class Stringmethod {
	public static void main(String[] args) {
		
		// String 클래스 메소드
		String msg = "  안녕하세요. ";
		
		// chatAt()
		System.out.println(msg.charAt(2));
		System.out.println(msg.indexOf("녕"));
		System.out.println(msg.length());
		String[] arData = msg.split("");
		for(String result : arData) {
			System.out.print(result + " ");
		}
		System.out.println();
		System.out.println(msg.substring(1, 4));
		System.out.println(msg.strip());
		
	}
}
