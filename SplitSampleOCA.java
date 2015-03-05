package oca.samples;

public class SplitSampleOCA {

	/**
	 * @param args
	 */
	
	// Additional escape character is needed for every single "\" 
	public static void main(String[] args) {
		String test = "OptoinA\\OptionB";
		String myString[] = null;
		myString = test.split("\\\\");
		
		for (int i = 0; i < myString.length; i++) {
			System.out.println(myString[i]);
		}
	}

}
