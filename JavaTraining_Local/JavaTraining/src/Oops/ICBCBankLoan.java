package Oops;

public class ICBCBankLoan extends BankLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankLoan loan = new BankLoan();
		
		/* Con el "." no me va a mostrar las variables del padre, porque fuera 
		 * de esa clase no las puedo acceder. Por eso son privadas
		 */
		
		/* loan.*/
		
		loan.setAge(200);
		loan.setName("Michael John");
		loan.setAmount(10000000);
		
		System.out.println("Name is " +loan.getName());
		System.out.println("Age is " +loan.getAge());
		System.out.println("Amount is " +loan.getAmount());
	}
}
