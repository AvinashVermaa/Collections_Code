package collection_practice.demo3;

import java.util.Comparator;

public class CustomEmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
