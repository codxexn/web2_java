package review;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arData = new ArrayList<>();
		
		arData.add(154);
		arData.add(965743);
		arData.add(5463278);
		arData.add(9743);
		arData.add(43);
		arData.add(88523);
		
		System.out.println(arData);
		
		System.out.println("===============");
		System.out.println(arData.contains(1));
		System.out.println(arData.get(3));
		System.out.println("===============");
		arData.set(4, 789);
		System.out.println(arData);
		System.out.println("===============");
		
		arData.stream().map(num -> num * 1000).forEach(System.out::println);
		
		Collections.sort(arData);
		System.out.println(arData);
		
		Collections.sort(arData, Collections.reverseOrder());
		System.out.println(arData);
		
		Collections.shuffle(arData);
		System.out.println(arData);
				
		Collections.reverse(arData);
		System.out.println(arData);
		
		
		
	}
}
