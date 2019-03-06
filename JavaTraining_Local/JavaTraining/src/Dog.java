/* Clase = Plantilla */

public class Dog {
	
	String name = "Jacky";
	String breed = "BullDog";
	int height = 4;
	

	// Metodos - Comportamientos
	public void barking(){
		System.out.println(name + " is barking");
	}
	
	public void eating(){
	}
	
	// Main es el que java sabe que tiene que ejecutar.
	public static void main(String[] args) {
		
		Dog dogClass = new Dog();
		Dog obj2 = new Dog();
		//dogClass + obj2 objetos de la clase.
		
		System.out.println(dogClass.height);
		dogClass.barking();
		
		obj2.eating();

	}

}
