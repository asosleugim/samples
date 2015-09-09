package oca.samples.test;

public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 7;
		String result = null;

		result = FizzBuzz(number);

		System.out.println("answer " + result);
	}

	public static String FizzBuzz(int number) {
		
		if ( number < 1 ) {
			return "Undefined";
		}

		if ((number % 3 == 0) && (number % 5 == 0)) {
			return "FizzBuzz";
		} else if ((number % 3) == 0) {
			return "Fizz";
		} else if ((number % 5) == 0) {
			return "Buzz";
		} else {
			return Integer.toString(number);
		}
	}
}