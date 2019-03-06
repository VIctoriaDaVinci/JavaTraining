package String;

public class StringMethodPart1 {


	public static void main(String[] args) {
		
		String text = "Learning is the Key";
		
		//charAt: Imprime el caracter presente en el index 10
		char ch = text.charAt(12);
		System.out.println(text.charAt(10));
		System.out.println(ch);
		
		// Concat
		String text2 = text.concat(" to success").concat(" and we are learning JAVA");
		System.out.println(text2);
		
		//Contains: va a devolver True o False si el texto CONTIENE lo que yo le indico. Es case-sensitive.
		System.out.println(text.contains("is the"));
		
		//endsWith(): va a devolver True o False si el texto TERMINA con lo que yo le indico. Es case-sensitive.
		String text1 = "Hi, we are learning from easybix.com";
		System.out.println("Message is ending with .com " + text1.endsWith(".com"));
		
	}

}
