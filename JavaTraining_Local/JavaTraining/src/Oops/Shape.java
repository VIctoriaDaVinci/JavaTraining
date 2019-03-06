package Oops;

abstract public class Shape {
	// No tiene implementaci�n. Si le borro la palabra "abstract" va a dar error. No tiene body.
	// la clase hija va a definir c�mo se implementa
	
	abstract public void displayShape();
	
	public void displayName(){
		//Este no es abstracto porque si tiene un body. Ac� dentro ponemos cualquier implementaci�n.
		System.out.println("From Shape Class");
	}
}
