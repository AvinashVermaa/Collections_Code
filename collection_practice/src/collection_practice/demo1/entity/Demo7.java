package collection_practice.demo1.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(20, "Harry"));
		list.add(new Employee(10, "Tom"));
		list.add(new Employee(50, "Dick"));
		
		System.out.println("---DEFAULT---");
		System.out.println("Contents of list are: " + list);
		
		System.out.println("---SORT BY ID---");
		Collections.sort(list);
		System.out.println("Contents of list are: " + list);
		
		System.out.println("---SORT BY NAME---");
		Collections.sort(list, new CustomEmployeeComparator());
		System.out.println("Contents of list are: " + list);
	}
}
