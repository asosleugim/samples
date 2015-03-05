package oca.samples;

public class OperatorsOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =3;
		int y =2;
		int z = 4;
		int total = (x++ + ++x) * (y-z);
		System.out.println(total);
		//The contents of the parenthesis increments x to 4 after use. Afterwards, the 
		//++operator increments x once again.However, it increments it before use this time.
		
//(3+5) *-2

	//(x++  + ++x) // 3 + ++4 therefore it will be 3 + 5
	}

}
