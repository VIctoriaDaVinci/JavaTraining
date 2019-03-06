package Array;

public class PassArrayToMethod {
	// M�todo que acepta un array c�mo par�metro.
	public static void findMin(int arrayOne[]){
		// Funci�n para buscar el m�nimo.
		int min = arrayOne[0];
		
		for (int i = 1; i < arrayOne.length; i++){
			if(min>arrayOne[i]){
				min = arrayOne[i];
			}
		}
		
		System.out.println("Minimun Element is " + min);
	}
	
	// Devuelve un array entero.
	public static int [] getArray(){
		
		return new int[] {12,13,56,78,90,12,34};
	}

	public static void main(String[] args) {
		
		PassArrayToMethod pass = new PassArrayToMethod();
		// Defino un array
		int arrayTest[] = {12,16,18,22,7,9};
		// Uso el m�todo con la variable que acabo de crear y sus valores.
		pass.findMin(arrayTest);
		
		// Inicializamos el array y con el "get" le asignamos el array ya creado.
		int arrayThree[] = pass.getArray();
		
		System.out.println(arrayThree[2]);
	}

}
