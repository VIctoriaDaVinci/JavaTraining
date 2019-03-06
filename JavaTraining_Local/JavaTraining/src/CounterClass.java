
public class CounterClass {
	
	int i = 0;
	static int j = 0;//las cosas comunes se inicializan y se mantienen estáticas 
	
	public CounterClass(){
		i++;
		j++;	
		
		System.out.println("Value of i:" + i);
		System.out.println("Value of j:" + j);
	}
	
	public static void main(String[] args) {
		/* Va a dar error porque no se puede hacer una referencia estatiaca a 
		 * i peretnece a la clase
		 * 
		 * System.out.println(CounterClass, i);
		 * 
		 * */
		
		//Los obj se crean en la memoria
		CounterClass counter = new CounterClass();
		CounterClass counter2 = new CounterClass();
		CounterClass counter3 = new CounterClass();
		
		// la variable ahora pertenece al objeto de la clase en vez de la clase misma
		
		System.out.println(counter.i); //i se accesde desde el objeto
		System.out.println(counter2.i);
		System.out.println(counter3.i);
		
		
		//se accese al estatico. 
		System.out.println(CounterClass.j);// J se accede desde la clase, ocupa una sola vez lugar en la variable, al inicializarse
		// se supone que al ser static son más eficientes.
	}
}

/* Algo estático pertenece a la clase, no al objeto, por lo que los 
 * constructores no pueden ser estaticos*/
 