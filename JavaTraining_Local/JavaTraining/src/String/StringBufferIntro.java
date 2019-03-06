package String;

public class StringBufferIntro {

	public static void main(String[] args) {
		
		// No va a dejar modifivar el string dentro del buffer. Ayuda en ambientes muy inseguros.
		String name = "Anshul";
		name.concat(" Chauhan");
		
		System.out.println(name);
		
		// Si puedo agregarle algo luego de usar el buffer.
		StringBuffer name1 = new StringBuffer("Anshul");
		name1.append(" Chauhan");
		
		// Se lo va a meter como si fuera un array. Lo mete en index empezando de 0 con el primer caracter.
		StringBuffer name2 = new StringBuffer("Anshul");
		name1.insert(4,  "Chauhan");
		
		System.out.println(name1);
		System.out.println(name2);
		
		// Va a reemplazar desde el index que yo le indico hasta el otro que le indique, va a reemplazar
		// los dos caracteres del medio por la palabra que le indica.
		name1.replace(1,3, "chauhan");
		System.out.println(name1);
		
		StringBuffer name3 = new StringBuffer("Anshul");
		
		name3.delete(4, 7);
		System.out.println(name3);
		
		// Sirve en entrevistas para ver si es un palindromo.
		StringBuffer name4 = new StringBuffer("Anshul");
		
		name4.reverse();
		System.out.println(name4);
		
		/* String Builder es muy parecido pero no tan seguro. Acepta los mismos métodos de 
		 * append()
		 * insert()
		 * replace()
		 * delete
		 * reverse
		 */

	}

}
