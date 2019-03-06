package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// Array list es toda la misma linea
		// Linked list son listas relacionadas cn punteros
		LinkedList list = new LinkedList();
		
		list.add(12);
		list.add(100);
		list.add("Java");
		list.add("Tutorial");
		list.add(88);
		list.add("Collection");
		list.add(123);
		list.add(98);
		list.add(56);
		
		// Es un poquito más rapido, no recorre todo el array para modificar. 
		//solo busca el puntero
		System.out.println(list);
		list.addFirst("Vicky");
		list.addLast("Lalala");
		System.out.println(list);
		
		
	}

}
