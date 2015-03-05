package oca.samples;

public class StaticAccessOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Test.size());
	}

}


class Test{
	// incorrect
	//int size();
 
	// correct
	// public static int size() {
	 
	static int size(){
		return 10;
	}
}

// A static mehtos is a method that belongs to the class rather than an instance
// of a class. TereforeClassName.methodName has to be static
