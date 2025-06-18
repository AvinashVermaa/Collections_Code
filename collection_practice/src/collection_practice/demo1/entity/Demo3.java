package collection_practice.demo1.entity;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("Contents of list are: " + list);
		
		list.remove(1);
		System.out.println("Contents of list are: " + list);
		
		list.remove(Integer.valueOf(1));
		System.out.println("Contents of list are: " + list);

	}
}
