package oca.samples;

public class InheritanceReferenceOCA {

	public void play() {
		System.out.println("In Employee class");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceReferenceOCA emp = new Manager();
		String str = emp.getClass().getName();
		System.out.println("emp is of type " + str);
		emp.play();
	}

}
