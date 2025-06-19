package collection_practice.demo3;

import java.util.Set;
import java.util.TreeSet;

public class Demo5 {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		
		set.add(new Employee(20, "Harry"));
		set.add(new Employee(10, "Tom"));
		set.add(new Employee(50, "Dick"));

		System.out.println("---DEFAULT---");
		System.out.println("Contents of set are: " + set);
		
		Set<Employee> set2 = new TreeSet<>(new CustomEmployeeComparator());
		set2.addAll(set);
		
		System.out.println("---CUSTOM COMPARATOR----");
		System.out.println("Content of custom set are : "+set2);

	}
}
