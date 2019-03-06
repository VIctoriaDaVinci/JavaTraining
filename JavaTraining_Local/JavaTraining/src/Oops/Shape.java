package Oops;

abstract public class Shape {
	// No tiene implementación. Si le borro la palabra "abstract" va a dar error. No tiene body.
	// la clase hija va a definir cómo se implementa
	
	abstract public void displayShape();
	
	public void displayName(){
		//Este no es abstracto porque si tiene un body. Acá dentro ponemos cualquier implementación.
		System.out.println("From Shape Class");
	}
}
