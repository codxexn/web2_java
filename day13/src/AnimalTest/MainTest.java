package AnimalTest;

public class MainTest {
	public static void main(String[] args) {
		//슈퍼클래스
		Animal al = new Animal();
		al.name = "동물";
		al.age = 50;
		al.sleep();
		System.out.println(al.name + "의 나이는 " + al.age + "입니다");
		
		//서브클래스
		Mammal ml = new Mammal();
		ml.name = "사자";
		ml.age = 20;
		ml.play();
	}
}
