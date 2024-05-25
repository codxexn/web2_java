package ambiguityTest;

public interface Inter1 {
	
	default void printText() {
		System.out.println("Inter1 printText() 호출");
	}

}
