
public class FirstJavaProgram {
	
	static int varSec = 98765;

	public static void firstMethod(){
		 int number = 12345;
		 String city = "newyork";
		 
		 System.out.println(number);
		 System.out.println(city);
		 System.out.println(varSec);
	}
	
	
	public static void main(String[] args) {
		FirstJavaProgram.firstMethod();
		System.out.println(varSec);
	}

}
