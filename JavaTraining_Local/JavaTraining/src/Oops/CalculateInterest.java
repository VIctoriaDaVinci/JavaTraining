package Oops;

public class CalculateInterest {

	public static void main(String[] args) {
		AmericanExpress am = new AmericanExpress();
		BankOfAmerica BA = new BankOfAmerica();
		ICBCBank ICBC = new ICBCBank();
		
		//RunTime Polymorphism, ya que si fuera por el padre
		//todos deber�an devolver 0, cambia segun el m�todo de la clase hija que llamo
		System.out.println(am.getInterest());
		System.out.println(BA.getInterest());
		System.out.println(ICBC.getInterest());

	}

}
