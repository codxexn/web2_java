package accessModifier1;

public class AccessTestMain {
	public static void main(String[] args) {
		
	AccessTest01 at = new AccessTest01();

	System.out.println("접근제한자 별 필드 출력");
	System.out.println(at.defaultVar);
	System.out.println(at.proVar);
	System.out.println(at.publicVar);
	
	}
}
