package collection_practice.demo1.entity;

import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		List<String> list = List.of("Java", "Python", "C");

		System.out.println("This list is an unmodifiable list");
		System.out.println("Contents of list are: " + list);

		System.out.println("Modification of list is not allowed");
		//list.set(2, "SQL"); //UnsupportedOperationException

		System.out.println("Addition of new element to list is not allowed");
		// list.add("C#"); //UnsupportedOperationException

		System.out.println("Removal of element from list is not allowed");
		// list.remove("C#"); //UnsupportedOperationException

		System.out.println("Clear list is not allowed");
		// list.clear();
	}
}
