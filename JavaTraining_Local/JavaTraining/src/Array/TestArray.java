package Array;

public class TestArray {

	public static void main(String[] args) {
		// Inizializamos el array
		int arrayOne[] = new int[10];
		// Definen los valores del array.
		arrayOne[0]=12;
		arrayOne[1]=13;
		arrayOne[2]=14;
		arrayOne[3]=15;
		arrayOne[4]=25;
		arrayOne[5]=26;
		arrayOne[6]=27;
		arrayOne[7]=28;
		
		//Cómo se accede a un espacio particular del array.
		System.out.println(arrayOne[4]);
		
		// Como iteramos sobre el array.
		for(int i=0; i < arrayOne.length; i++){
			System.out.println(arrayOne[i]);
			// Los ultimos dos números del array, no fueron definidos, asíque van a mostrarse como 0
		}
		
	//Otra forma de inicializar un array
	int arrayTwo[] = {10,20,30,40,50,60};

	System.out.println("Size of Second Array " + arrayTwo.length);
	
	}

}
