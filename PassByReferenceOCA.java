package oca.samples;

public class PassByReferenceOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByReferenceOCA num = new PassByReferenceOCA();
		Integer[] x = new Integer[3];
		num.changeNumber(x);

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		int y[] = {1, 2, 3};

		num.changeNumber2(y);
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
	}

	private void changeNumber(Integer[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = new Integer(i);
		}

	}

	private void changeNumber2(int[] y) {
		for (int i = 0; i < y.length; i++) {
			y[i] = i*i;
		}

	}

}
