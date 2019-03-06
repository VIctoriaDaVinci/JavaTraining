package Set;

import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet tSet = new TreeSet<>();
		
		tSet.add(12);
		tSet.add(887);
		tSet.add(34);
		tSet.add(654);
		tSet.add(111);
		tSet.add(434);
		System.out.println(tSet);
		
		tSet.remove(111);
		System.out.println(tSet);
		
		System.out.println("tSet contains 12?: " + tSet.contains(12));
		System.out.println("First elemnt of tSet is: " + tSet.first());
		System.out.println("Last elemnt of tSet is: " + tSet.last());
		
		System.out.println("Use of headset " + tSet.headSet(434));
		System.out.println("Use of tail " + tSet.tailSet(434));
		
		tSet.clear();
		System.out.println(tSet);
	}
}
