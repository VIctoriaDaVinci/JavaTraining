package Oops;

public class ChildAddition extends Addition {

	public static void main(String[] args) {
		Addition add = new Addition();
		add.addValues(11, 11);
		add.addValues(11, 11, 11);
		
		add.addValues(22, 22);
		
		// este add values doble, devuelve un valor doble, 
		// por eso tengo que guardarlo en algun lado.
		double d = add.addValues(11.11, 22.22);
		System.out.println(d);
	}

}
