package Map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("Anshul", 27);
		hmap.put("John", 47);
		hmap.put("Amit", 26);
		hmap.put("Nitika", 23);
		hmap.put("Julia", 32);
		
		System.out.println("Todos los valores del hmap: " + hmap);
		
		if (hmap.containsKey("Amit")){
			System.out.println("Age of Amit is:  "+ hmap.get("Amit"));
			
		}
		
		System.out.println("Size of hashmap is: " + hmap.size());
		System.out.println("Is hashmap empty?: " + hmap.isEmpty());
		
		hmap.clear();
		System.out.println("Is hashmap empty?: " + hmap.isEmpty());
		
	}

}
