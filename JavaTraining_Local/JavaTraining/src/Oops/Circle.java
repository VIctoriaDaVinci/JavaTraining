package Oops;


public class Circle extends Shape {
// Pone solito lo de abajo cuando haces click en el error y elegis "Add unimplemented methods"
	@Override
	/* El método hijo de la clase abstracta va a implementar lo que era abstracto en el padre*/
	public void displayShape() {
		System.out.println("Shape is Circle");
		
	}

public static void main(String[] args){
		
		Shape s = new Circle();
		Shape s1 = new Triangle();
		
		s.displayShape();
		s1.displayShape();
		
	}


}
