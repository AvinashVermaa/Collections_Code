package collection_practice.demo3;

import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		
		Set<String> set = Set.of("Java", "Python", "C");
		
		System.out.println("This set is an unmodifiable set");
		System.out.println("Contents of set are: " + set);

		System.out.println("Addition of new element to set is not allowed");
		//set.add("C#"); //UnsupportedOperationException

		System.out.println("Removal of element from set is not allowed");
		// set.remove("C#"); //UnsupportedOperationException

		System.out.println("Clear set is not allowed");
		// set.clear(); //UnsupportedOperationException
	}
}
