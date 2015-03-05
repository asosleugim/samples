package oca.samples;

public class EqualReferenceOCA {

	/**
	 * @param args
	 */

	// Test two references are referring to the same object
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("Testing");
		String str2 = new String("Testing");

		System.out.println(str1 == str2);

		String a = "Test";
		String b = "Test";
		
		System.out.println(a == b);

		if (a == b) {
			System.out.println("refs are equal");
		} else {
			System.out.println("refs are not equal");
		}
		if (a != b) {
			System.out.println("refs are equal");
		} else {
			System.out.println("refts are not equal");
		}

		String morning1 = "Morning";
		System.out.println("Morning" == morning1);
	}

}
