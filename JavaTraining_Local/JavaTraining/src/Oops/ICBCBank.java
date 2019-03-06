package Oops;

public class ICBCBank extends Bank {
	/* Method overriding, tengo el mismo método que se
	 * extiende de la misma clase, pero tiene su
	 * propia implementación (non-Javadoc)
	 * @see Oops.Bank#getInterest()
	 */
	public int getInterest(){
		return 9;
	}
}
