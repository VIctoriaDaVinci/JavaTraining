package String;

public class StringMethodPart3 {

	public static void main(String[] args) {
		String text = "Hello Team";
		String sample = "His name is John and he is a good man";
		
		//Replace(): reemplaza el primer valor con el segundo.
		String text1 = text.replace("e", "a");
		String sample2 = sample.replace("is", "was");
		
		System.out.println(text1);
		System.out.println(sample2);
		
		//split(): Divide el string y va a devolver
		
		String[] sampletest = sample.split(" ");
		
		for (int i = 0; i < sampletest.length; i++) {
			System.out.println(sampletest[i]);
			
		//startsWith(): Verifica si el string empieza o no con determinado prefijo. Devuelve T/F
			
		System.out.println(sample.startsWith("His"));
		}
	}

}
