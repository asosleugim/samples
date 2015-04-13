package oca.samples;

public class CodingTest {

	/**
	 * @param This code returns the number of square root can be used between a range of values. 
	 * 
	 * Example[4, 17]
	 * The 2^2 = 4, 3^3 = 9, 4^4 = 16. Therefore, the answer should be 3.
	 */
	public static void main(String[] args) {

		int solution = solution(4, 64);
		System.out.println("solution " + solution);
	}

	public static int solution(int A, int B) {

		double firstNum = Math.sqrt(A);
		double secondNum = Math.sqrt(B);
		int intervalNum = 0;
		double dynamicSquare = 0.0;
		System.out.println("first num " + firstNum);
		System.out.println("first num " + secondNum);

		while (dynamicSquare <= B) {
			intervalNum++;
			firstNum++;
			dynamicSquare = firstNum * firstNum;
		}

		return intervalNum;
	}

}
