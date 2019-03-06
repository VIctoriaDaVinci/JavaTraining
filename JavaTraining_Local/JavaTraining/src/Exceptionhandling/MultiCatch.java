package Exceptionhandling;

public class MultiCatch {

	public static void main(String[] args) {
		
		try{
		int value =100;
		int result = value/0;
		
		
		//Va del específico al más genérico. Sirve si tenes que hacer una tarea segun la excepcion que agarres.
		
		}catch(ArithmeticException e){
			System.out.println("Declared Specific Exception");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Generic Catch Block");
			
		}

	}

}
