package collection_practice.demo4;

import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = Map.of(30, "Thirty", 80, "Eighty", 17, "Seventeen");
		System.out.println("This set is an unmodifiable map");
		System.out.println("Contents of map are: " + map);
		
		System.out.println("Modification of map is not allowed");
		//map.put(80, "Ten");  //UnsupportedOperationException
		
		System.out.println("Addition of new element to map is not allowed");
		// map.put(90, "Ninety");  //UnsupportedOperationException
		
		System.out.println("Removal of element from map is not allowed");
		// map.remove("80);  //UnsupportedOperationException

		System.out.println("Clear map is not allowed");
		// map.clear();  //UnsupportedOperationException
	}
}
