package oca.samples;

public class CharAtOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 6;
		String b = "conditoinal";

		if (b.charAt(a) > b.charAt(++a)) {
			System.out.println(b.charAt(a));
			System.out.println("Chart a " + a + " " + b.charAt(a) + " "
					+ b.charAt(++a) + " a " + a);

		} else {
			System.out.println(b.charAt(0));
			System.out.println("Chart a " + a + " " + b.charAt(a) + " "
					+ b.charAt(++a) + " a " + a);
		}
	}

}
