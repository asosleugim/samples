package oca.samples;

import java.util.Arrays;
import java.util.*;
import java.lang.*;

public class ArraysOCA {

	public static void main(String args[]) {

		String[] stringArray = new String[5];

		for (int i = 0; i < stringArray.length; i++) {
			// way to initialize string array
			// stringArray[i] = "initial";
			// second way
			Arrays.fill(stringArray, "initial");

		}
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i] + " ");
		}
	}
}
