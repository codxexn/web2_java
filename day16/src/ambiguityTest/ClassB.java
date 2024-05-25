package ambiguityTest;

public class ClassB extends ClassA implements Inter1{
// 인터페이스 보다 상속받은 부모 클래스가 더 우선순위가 높다
	public static void main(String[] args) {
		
	ClassB b = new ClassB();
	
	b.printText();
	
	Inter1 inter1 = new ClassB();
	
	inter1.printText();
	
	
	}
}
