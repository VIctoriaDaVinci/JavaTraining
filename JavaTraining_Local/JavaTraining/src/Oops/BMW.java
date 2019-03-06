package Oops;

public class BMW extends Car {
	// Car es el padre, BMW el hijo.
	
	
	BMW(){
		/*Llama al constructor del padre y luego al del hijo.
		 * Si borro el super, el resultado es igual. Por qu� en JAVA, 
		 * Cuando una clase hereda otra, el constructor padre es llamado
		 * autom�ticamente. Si creamos el objeto de la clase hija,
		 * el constructor padre, se llama de forma autom�tica*/
		
		// super();
		System.out.println("Calling BMW Constructor");
	}
	
	String name = "BMW";
	
	/* Va a dar error porque el padre, tiene el mismo m�todo con la palabra FINAL 
	 * que no me permite sobreescribirlo(non-Javadoc)
	 * @see Oops.Car#setWheels()
	 */
	
	/*
	public void setWheels(){
		
	}
	*/
	
	//M�todo que va a usar su variable y la del padre de arriba. Ejemplo de "super"
	public void getName(){
		System.out.println(name);
		// el m�todo de la clase padre inmediata.
		System.out.println(super.name);
	}
	
	public void run(){
		System.out.println("BMW is running");
		// Accede al m�todo del padre.
		super.run();
	}
	
	public static void main(String[] args){
		
		/*Car car = new Car();
		
		// Usa con la herencia el "is a" entonces, BMW is a CAR
		System.out.println(name);
		car.run();
		*/
		
		BMW bmw = new BMW();
		bmw.getName();
		bmw.run();
	}
	
}
