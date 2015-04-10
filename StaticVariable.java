package oca.samples;

public class StaticVariable {

	// int myVar = 2;
	static int myVar = 2;

	public static void main(String[] args) {
		// Will throw an error for trying to access a non-static variable from a
		// static context.
		// System.out.println(myVar);

		System.out.println(myVar);
	}

}
