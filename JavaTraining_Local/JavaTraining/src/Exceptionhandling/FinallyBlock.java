package Exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try{
			String text = "Anshul";
			System.out.println(text);
			
			String text1 = null;
			System.out.println(text1.length());
			
		}catch(Exception e){
			e.printStackTrace();;
	
		} finally {
			//Finally va a correr siempre, se corra el try o no.
			System.out.println("Hi, I am inside finally block");
		}
	}

}
