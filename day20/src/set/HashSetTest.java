package set;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> animalSet = new HashSet<>();
		
		// 내가 저장한 순서대로 값이 저장돼 있는지?
		// 내가 set에서 특정 값을 가지고 올 수 있는지?
		// 중복된 값들을 저장할 수 있는지?
		
		animalSet.add("고양이");
		animalSet.add("강아지");
		animalSet.add("원숭이");
		animalSet.add("소");
		animalSet.add("호랑이");
		animalSet.add("뱀");
		
		System.out.println(animalSet);
		
		
		
		
	}
}
