package Oops;

public class ICBCBank extends Bank {
	/* Method overriding, tengo el mismo m�todo que se
	 * extiende de la misma clase, pero tiene su
	 * propia implementaci�n (non-Javadoc)
	 * @see Oops.Bank#getInterest()
	 */
	public int getInterest(){
		return 9;
	}
}
