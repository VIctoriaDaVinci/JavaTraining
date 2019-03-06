package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<String, Integer>();
		
		lmap.put("Anshul", 27);
		lmap.put("John", 47);
		lmap.put("Amit", 26);
		lmap.put("Nitika", 23);
		lmap.put("Julia", 32);
		lmap.putIfAbsent("Anshull", 27);
		lmap.putIfAbsent("Anshul", 27);
		
		System.out.println(lmap);
		System.out.println("Size of lmap: " + lmap.size());
		System.out.println("Is lmap emtpy?: " + lmap.isEmpty());
		System.out.println("It contains Nitika?: " + lmap.containsValue("Nitika"));
		System.out.println("It contains 23?: " + lmap.containsValue(23));

	}

}
