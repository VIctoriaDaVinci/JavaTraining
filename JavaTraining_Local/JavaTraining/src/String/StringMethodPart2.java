package String;

public class StringMethodPart2 {
	
	public static void main(String[] args){
		
		String text1 = "TechTraining";
		String text2 = "TechTraining";
		String text3 = "techtraining";
		
		// Equals(): compara texto, es case sensitive.
		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		
		// EqualsIgnoreCase(): compara texto, No es case sensitive.
		System.out.println(text1.equalsIgnoreCase(text3));
		
		//Indexof(): Te tira el index de la letra que estas buscando. Es case-sensitive. Si no está, devuelve -1
		System.out.println(text1.indexOf("h"));
		
		//LastIndexOf(): va a buscar la cantidad de veces que se repite, y devolver el último index. Si no está, devuelve -1
		System.out.println(text1.lastIndexOf("T"));
		
		//Length(): dice cuántos caracteres tiene el string.
		System.out.println(text1.length());
	}

}
