
public class Students {
   //Consturctor, va a crear objetos sin necesidad de usar el new
	public Students(){
		
		System.out.println("Hi, I am inside constructor");
		System.out.println("Hi, I am second method");
	}
	
	//Constructor que acepta parametros
	int rollNumber;
	String name;
	
	public Students(int i, String n){
		rollNumber = 1;
		name = n;
	}
	
	public void display(){
		System.out.println("Roll Number is:" + rollNumber + " and Name is " + name);
	}
	
	public static void main(String[] args) {
		
		// Declaramos los objetos y los parametros los trae de otro constructor.
		Students std1 = new Students(10, "James");
		Students std2 = new Students(20, "Natalia");
		
		//llama al metodo display en el objeto.
		std1.display();
		std2.display();
	
	}
	
	/*Al tener dos constructores con mismo nombre,  y difernetes parametros, estamos usando
	 * un constructor oveloded.
	 * Es el mismo constructor con diferente parametrizacion*/

}
