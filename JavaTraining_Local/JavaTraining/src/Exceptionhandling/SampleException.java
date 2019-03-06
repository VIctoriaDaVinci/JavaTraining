package Exceptionhandling;

public class SampleException {

	public static void main(String[] args) {
		
		
		/* Va a dar una excepci�n diciendo: Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		int value = 100;
		int result = value/0;
		
		System.out.println(result);
		
		*/
		
		try {
			
			int value = 100;
			int result = value/0;
			
			System.out.println(result);		

		}catch(Exception e){ //Exception es una clase de JAVA que tom� un argumento, que es el objeto de la clase.
			
			System.out.println(e );
			System.out.println("Please choose another value to Devide the integer");
			// al correr el programa, ya no va a devolver la excepci�n, sino lo que yo le indique.
			
			// StackTrace() es un metodo dentro de la clase de Exception que va a traer el error completo.
			e.printStackTrace();		
			
		}
		
		// Null pointer. Cuando haces alguna operaci�n sobre un objeto null. No tiene valor.
		
		String text = null;
		
		System.out.println(text.length());
		
	}

}
