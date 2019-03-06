package Oops;

public class MedicalClass implements Student{

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Hi, we are from medical");
	}

	@Override
	public void getStudentNumber() {
		// TODO Auto-generated method stub
		System.out.println("Hi, we are 140 Students");
	}

	@Override
	public void getStandard() {
		// TODO Auto-generated method stub
		System.out.println("Hi, we are from MBBS");
	}
	
	public void getUniversity(){
		System.out.println("University name is: London University");
	}
	
	public static void main(String[] args){
		EngineeringClass eng = new EngineeringClass();
		MedicalClass med = new MedicalClass();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudentNumber();
		eng.getUniversity();
		
		System.out.println("**********************************************");
		
		med.displayName();
		med.getStandard();
		med.getStudentNumber();
		med.getUniversity();
	}

	@Override
	public void getInterfaseName() {
		// TODO Auto-generated method stub
		
	}

}

/* Primero creamos la interfaz, luego la clase.. esta clase implementa la interfaz 
 * Cada uno de los métodos deben ser implementados en la clase que usa la itnerfaz.*/
