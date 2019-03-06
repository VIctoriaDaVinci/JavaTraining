package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		
		l1.add(0,12);
		l1.add(1,14);
		
		System.out.println(l1);
		
		List l2 = new ArrayList();
		l2.add(10);
		l2.add(11);
		l2.add(132);
		l2.add(165);
		l2.add(187);

		l1.addAll(1, l2);
		
		l1.remove(3);
		
		System.out.println(l1);
		System.out.println("Index present at fifth intex: " + l1.get(5));
		
		l1.set(5, 122);
		
		System.out.println(l1);
		
		//Search en una lista
		
		List l3 = new ArrayList();
		l3.add(10);
		l3.add(12);
		l3.add(12);
		l3.add(10);
		l3.add(187);
		
		l1.addAll(1,l3);
		
		//Index of, devuelve el primer index donde encuentra un match, sino hay, devuelve -1
		System.out.println(l1);
		System.out.println(l1.indexOf(187));
		
		//lastIntexof(): devuelve el último index donde hay match, sino hay, devuelve -1
		System.out.println(l1.lastIndexOf(187));
	
		List l4 = new ArrayList();
		l4 = l1.subList(3, 5);
		
		System.out.println("Partial list: " + l4);
	}

}
