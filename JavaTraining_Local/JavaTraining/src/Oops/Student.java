package Oops;

// No es una clase, es una interfaz, son dos cosas distintas.
public interface Student extends ParentStudent{
	
	//Variable instanciada.
	public static final String university = "University of New  York";
	
	//No necesito definir la implementaci�n ni aclarar que es abstracto.
	public void displayName();
	
	public void getStudentNumber();
	
	public void getStandard();
}
/*La interfaz es 100% abstracta, ning�n m�todo tiene el body*/