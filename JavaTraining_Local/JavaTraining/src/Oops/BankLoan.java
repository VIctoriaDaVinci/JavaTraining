package Oops;

public class BankLoan {
	/* para progeter datos sencibles puedo usar "private". Otras clases no van a poder
	acceder directamente a esos valores, solamente en esta clase puedo acceder a ellas.*/
	
	private String name;
	private int age;
	private int amount;
	
	/* Para poder meterle valores necesito un método. Entonces, fuera de esta clase no se puede acceder a ese valor
	de la variable, pero si los a los métodos (que no son privados)*/
	
	// Con "SET" asignamos valores -> Si solo usamos set, la clase sería write only.
	// Dentro de un setter puedo poner restricciones, ejemplo, la edad, no pasarme de cierto rango.
	public void setName(String name){
		this.name = name;
		//this se reviere a la de esta clase.
	}
	
	public void setAge(int age){
		if(age>= 18 && age<=50){
			this.age = age;
		} else{
			System.out.println("Please enter a Valid Age");
		}
		
	}
	
	public void setAmount(int amount){
		if (amount>=1000 || amount<=10000000){
			this.amount = amount;
		}else{
			System.out.println("Please enter a Valid Amount, between $1000 - $10000000");
		}
		
	}
	
	// Con "GET" accedemos a los valores -> Si solo usamos get, la clase sería read only.
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getAmount(){
		return amount;
	}
}

/* Encapsulación, dentro de mi clase, creo todos los datos que voy a necesitar como privados, pero 
 * ademas pongo setteres  y getters para acceder a los valores, pero protejo mis datos 
 * Deberia proteger el código de errores cuando se trabaja en equipo. */
