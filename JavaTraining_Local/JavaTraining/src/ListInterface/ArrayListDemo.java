package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Din�mico, no tengo que definir el tama�o
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(42);
		list.add(52);
		list.add(12);
		list.add(78674);
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		System.out.println(list.get(3));
	}

}
