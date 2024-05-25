package anonymousTest;

public class AnonymousTest {
	
	 //익명객체를 매개변수로 받아서 speak메소드 호출
	   public void animalSpeak(Animal animal) {
	      animal.speak();
	   }
	
	
	   public static void main(String[] args) {
	      AnonymousTest at = new AnonymousTest();
	      
	      Animal cat = new Animal() {
	         @Override
	         public void speak() {
	            System.out.println("야옹~");
	         }
	      };
	      
	      cat.speak();
	      
	      at.animalSpeak(new Animal() {
	         @Override
	         public void speak() {
	            System.out.println("강아지가 멍멍!");
	         }
	      });
	      
	   }
}