package oca.samples;

public class Epsilon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 64;
		double epsilon = 0.00030;
		double sqrRoot = question2(a, epsilon);
		System.out.println("FINAL SQUARE ROOT " + sqrRoot);
	}

	public static double question2(double a, double epsilon) {

		int value = 1;
		a = Math.abs(a);
		double x = 0.0;
		double y = 0.0;
		double result = 0.0;
		double estimatedValue = a;
		double difference = 0.0;

		if (estimatedValue != 0) {
			while ((result < a)) {
				value++;
				result = value * value;
			}
			x = value - .5;
			System.out.println("x value: " + x);

			y = a / x;
			System.out.println("y value: " + y);

			estimatedValue = (x + y) / (2);

			System.out.println("estimated value: " + estimatedValue);
			System.out.println("square root value: " + a);
			System.out.println("Squere root approximation: " + estimatedValue
					* estimatedValue);
			difference = (estimatedValue * estimatedValue) - a;
			System.out.println("difference: " + difference);
			if (difference > epsilon) {
				System.out
						.println("epsilon accuracy of " + epsilon + " Failed");
			} else {
				System.out.println("epsilon accuracy of " + epsilon
						+ "  Passed");
			}

			
		}
		return estimatedValue;
	}

}
