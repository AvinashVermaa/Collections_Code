package collection_practice.demo4;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Java");
		map.put(2, "Python");
		map.put(45, "C");
		
		System.out.println("using key set");
		
		Set<Integer> keySet = map.keySet();
		
		for(Integer key : keySet) {
			System.out.println("Value of element fetched on the basis of key: "+map.get(key));
		}
		
		System.out.println("using values : ");
		
		Collection<String> values = map.values();
		
		for(String value : values) {
			System.out.println("Fetching the value by using values() : "+value);
		}
		
		System.out.println("Fetching the value from map using entrySet approach");
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer,String> entry : entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}
}
