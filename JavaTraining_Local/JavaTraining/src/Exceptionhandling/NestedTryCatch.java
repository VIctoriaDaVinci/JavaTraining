package Exceptionhandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		// Va a probar el primero, si encuentra la excepcion, la muestra. No se mete a la de adentro.
		// Si el primero no tiene excepcion, va a ir al segundo.
		try{
			
			System.out.println("First Try Block");
			String text = null;
			System.out.println(text.length());
			
			try {
				System.out.println("Second Try Block");
				
				int value = 100/0;
				
				try {
					System.out.println("Thrid Try Block");
					
					int[] array = new int[3];
					array[5] = 100;
					
				}catch(Exception e){
					System.out.println("End of third Try Block");
					e.printStackTrace();
				}
				
			}catch(Exception e){
				System.out.println("End of Second Try block");
				e.printStackTrace();
			}
			
		}catch(Exception e){
			System.out.println("End of Frist Try Block");
			e.printStackTrace();
			
			
		}

	}

}
