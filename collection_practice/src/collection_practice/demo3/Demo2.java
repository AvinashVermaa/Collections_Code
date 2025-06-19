package collection_practice.demo3;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println("Contents of set are: " + set);
		
		set.remove(1);
		
		System.out.println("Contents of set are: " + set);
		
		set.remove(Integer.valueOf(1));
		
		System.out.println("Contents of set are: " + set);
	}
}
