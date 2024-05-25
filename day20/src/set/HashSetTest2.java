package set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		 
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(1);
		li.add(2);
		li.add(3);
		
		System.out.println(li);
		
		HashSet<Integer> set = new HashSet<>(li);
		
		System.out.println(set);
		
		ArrayList<Integer> result = new ArrayList<>(set);
		
		System.out.println(result);
		
	}
}



