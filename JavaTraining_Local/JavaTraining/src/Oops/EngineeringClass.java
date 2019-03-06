package Oops;

// Si o si voy a tener que implementar todos los metodos de la interfas si la implemento.
public class EngineeringClass implements Student{
		
	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Hi, we are from Engineering");
	}

	@Override
	public void getStudentNumber() {
		// TODO Auto-generated method stub
		System.out.println("We are 120 Studets");
		
	}

	@Override
	public void getStandard() {
		// TODO Auto-generated method stub
		System.out.println("We are from Computer Science");
	}

	public void getUniversity(){
		System.out.println("University name is: " + Student.university);
	}

	// hay que implementar el método que tiene la interfaz padre para que no de error
	@Override
	public void getInterfaseName() {
		// TODO Auto-generated method stub
		
	}
}
