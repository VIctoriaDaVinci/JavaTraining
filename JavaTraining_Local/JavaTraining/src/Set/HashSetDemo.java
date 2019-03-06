package Set;

import java.util.HashSet;
import java.util.Iterator;

/* Maneja espacios de 16 lugares, cuando ocupa el 0.75% toma otro de 16. 
 * La performance baja mucho mientras mas lugar usa
 * No mantiene orden y no se pueden repetir valores*/

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hash = new HashSet<>();
		
		hash.add("Anshul");
		hash.add("Thakur");
		hash.add("Kronos");
		hash.add("New Delhi");
		hash.add("India");
		System.out.println(hash);
		
		hash.remove("India");
		System.out.println(hash);
		
		System.out.println("Is set contains " + hash.contains("Anshul"));
		
		
		Iterator i = hash.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
			
		hash.clear();
		System.out.println("Hash is: " + hash);
	
	}
}
