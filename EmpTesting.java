package oca.samples;

/**
 * 
 * While every class must have at least one constructor, you do not have to
 * write a constructor yourself for every class you create. If a class has no
 * constructor, the java compiler will automatically create a no-argument,
 * default constructor for you. However, the compiler will not create the
 * default constructor if there is another constructor already defined in your
 * class.
 * 
 * In this code, a constructor is defined that accepts there arguments.
 * Therefore, when attempts to create an instance of the ConstructorOAC class
 * using the no-argument constructor, a compilation error occurs. java programs
 * will not compile if you try to instantiate a class using a constructor that
 * does not exist.
 * 
 */

public class EmpTesting {
	public static void main(String[] args) {
		// Below will be a Compilation error contructor:

		// ConstructorOAC emp1 = new ConstructorOAC();

		// Correct way of initializing Multiple constructor:
		ConstructorOAC emp1 = new ConstructorOAC("", 1, "");
		System.out.println("Name: " + emp1.name);
		System.out.println("Salary: " + emp1.salary);
		System.out.println("Dept: " + emp1.dept);
	}
}