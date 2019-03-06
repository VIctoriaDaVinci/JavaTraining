package Oops;

public class CalculateInterest {

	public static void main(String[] args) {
		AmericanExpress am = new AmericanExpress();
		BankOfAmerica BA = new BankOfAmerica();
		ICBCBank ICBC = new ICBCBank();
		
		//RunTime Polymorphism, ya que si fuera por el padre
		//todos deberían devolver 0, cambia segun el método de la clase hija que llamo
		System.out.println(am.getInterest());
		System.out.println(BA.getInterest());
		System.out.println(ICBC.getInterest());

	}

}
