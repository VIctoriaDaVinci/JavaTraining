package String;

public class StringIntro {

	public static void main(String[] args) {
		
		/* Los strings ya son una clase misma dentro de JAVA*/
		
		//Dos formas distintas de hacer un string.
		
		// Uso string literal. Dos referencias para el mismo valor. Se guarda en el 
		// string pool. El pointer de ambas variables va al mismo valor.
		String name = "Anshul Chauhan";
		String name1 = "Anshul Chauhan";
		String name2 = "Anshul chauhan";
		
		// Creo un objeto nuevo como string.
		// Son dos objetos totalmente diferentes, y usan dos lugares distintos de memoria.
		String country = new String("United States");
		String country1 = new String("United States");
		
		System.out.println(name);
		System.out.println(country);
		
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		// Ignora las mayúsculas/minúsculas
		System.out.println(name.equalsIgnoreCase(name2));
		
		//Equals aceptan tanto strings con referencia literal u objetos string.
		System.out.println(country.equals(country1));
		
		/* El == Compara referencias y no valores
		 * No se debería usar para comparar strings. 
		 * Compara la referencia y no el valor */
		System.out.println(name == name1);
		System.out.println(country == country1);
		
		//Concatenar Strings
		String finalString = name + name1 + name2; 
		System.out.println(finalString);
		// La única diferencia es que con el "+" podes poner todo en cualquier orden, en cambio en concat, 
		// obliga a poner el argumento después del de referencia.
		String secString = name.concat(name1).concat(name2);
		System.out.println(secString);
				
	}

}
