/*
public class StudentsDemo {

	int rollNumber;
	String name;
	String Standard;
	
	public StudentsDemo(int i, String n, String s){
		rollNumber = i;
		name = n;
		Standard = s;
	}
	
	public void display(){
		System.out.println("Student Roll Number: " + rollNumber + " name is: " + name + " and in class: " + Standard);
		
	}
	
	public static void main(String[] args) {
		
		StudentsDemo std = new StudentsDemo(10, "Frank", "2nd");
		StudentsDemo std1 = new StudentsDemo(20, "Michael", "5th");
	
		std.display();
		std1.display();
		
	}

}

Va a dar como resultado:
Student Roll Number: 10 name is: Frank and in class: 2nd
Student Roll Number: 20 name is: Michael and in class: 5th
*/

 /*
public class StudentsDemo {

	int rollNumber;
	String name;
	String Standard;
	
	public StudentsDemo(int rollNumber, String name, String Standard){
		rollNumber = rollNumber;
		name = name;
		Standard = Standard;
	}
	
	public void display(){
		System.out.println("Student Roll Number: " + rollNumber + " name is: " + name + " and in class: " + Standard);
		
	}
	
	public static void main(String[] args) {
		
		StudentsDemo std = new StudentsDemo(10, "Frank", "2nd");
		StudentsDemo std1 = new StudentsDemo(20, "Michael", "2nd");
	
		std.display();
		std1.display();
	}

}
Va a dar: 

Student Roll Number: 0 name is: null and in class: null
Student Roll Number: 0 name is: null and in class: null
x que toma la del parentesis, no la de arriba, se esta asignado a si misma su valor. por eso no toma lo de arriba donde se declara.
*/

//El correcto, para que pueda diferenciar  a donde se asigna, uso el "this", eso significa que
// tome la variable de la clase. El que lleva el "this" es el de arriba, el otro es el parámetro.
// Asigna la variable isntanciada al objeto.

public class StudentsDemo {

	int rollNumber;
	String name;
	String Standard;
	
	public StudentsDemo(int rollNumber, String name, String Standard){
		this.rollNumber = rollNumber;
		this.name = name;
		this.Standard = Standard;
	}
	
	public void display(){
		System.out.println("Student Roll Number: " + rollNumber + " name is: " + name + " and in class: " + Standard);
		
	}
	
	public static void main(String[] args) {
		
		StudentsDemo std = new StudentsDemo(10, "Frank", "2nd");
		StudentsDemo std1 = new StudentsDemo(20, "Michael", "2nd");
	
		std.display();
		std1.display();
	}

}