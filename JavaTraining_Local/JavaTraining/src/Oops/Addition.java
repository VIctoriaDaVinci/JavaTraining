 package Oops;

 /* Va a dar el siguiente error: "The type Addition cannot sublass the final class FinalClass"
  * si se declara la clase cómo "final", de esta no se puede heredar nada. 
  */
 
 /*
 public class Addition extends FinalClass{
	 
 }
 */
 
 // Polimorfismo, voy a hacer lo mismo, de distintas maneras.
public class Addition {
	// void no devuelve nada. Toma dos valores pero no devuelve nada.
	public void addValues(int a, int b){
		int c = a + b;
		System.out.println("Addition is: " + c);
	}
/* Si lo repito, exactamente igual, me da error de compilación)	
	public void addValues(int a, int b){
		int c = a + b;
		System.out.println("Addition is: " + c);
	}
*/
	// Si cambiamos los parametros de un método, le hacemos
	// overload, puedo volverlo a usar con el mismo nombre
	// y más parametros
	public void addValues(int a, int b, int c){
		int d = a + b + c;
		System.out.println("Addition is: " + d);
	}
	
	//toma valores dobles y devuelve uno doble también.
	public double addValues(double a, double b){
		
		double c = a + b;
		return c;
	}
	
}
