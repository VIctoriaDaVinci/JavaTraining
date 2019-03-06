package String;

public class StringMethodPart4 {

	public static void main(String[] args) {

		String text = "United State";
		
		//substring(): Devuelve un string dentro de otro, puedo pasarle uno o dos parámentros. El index inicial
		// es el obligatorio.
		System.out.println(text.substring(5));
		System.out.println(text.substring(5,9));
		
		//toCharArray(): convierte el string en un array de caracteres.
		
		char[] charArray = text.toCharArray();
		
		System.out.println("Main String is: " + text);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		// toLowerCase()/toUpperCase(): pasa todo a minúsculas/mayúsculas
		
		String text1 = "VICKY";
		String text2 = "lexxy";
		
		System.out.println(text1.toLowerCase());
		System.out.println(text2.toUpperCase());
		
		//trim(): elimina los espacios anteriores y posteriores.
		
		String text3 = "My name is                ";
		String text4 ="        Vicky";
		
		System.out.println(text3 + text4);
		System.out.println(text3.trim() + text4);
		System.out.println(text3.trim() + text4.trim());
	}

}
