package oca.samples;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");

		final int numbers[] = { 1, 2, 3, 4, 4, 5, 5, 1, 6, 7, 7, 6 };
		int newNumbers[] = question1(numbers);
		System.out.println();
		System.out.println("Displayying:");

		for (int num : newNumbers) {
			System.out.print(num + " ");
		}

	}

   static public int[] question1(final int[] values)
 {
		int uniqueNumber;
		int newArrayList[] = new int[values.length];
		int IndexSize = 0;

		for (int i = 0; i < values.length; i++) {
			boolean flag = true;
			uniqueNumber = values[i];
			for (int j = i; j < values.length; j++) {
				if (i == j)
					continue;
				if (uniqueNumber == values[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				newArrayList[IndexSize] = uniqueNumber;
				IndexSize++;
			}
		}

		int newArrayListIndex[] = new int[IndexSize];
		for (int z = 0; z < IndexSize; z++) {
			newArrayListIndex[z] = newArrayList[z];
		}
		return newArrayListIndex;
	}
   
}
