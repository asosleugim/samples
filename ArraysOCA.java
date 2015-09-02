package oca.samples;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ArraysOCA {

	public static void main(String args[]) {

		try {
			FileInputStream fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList newArray = null;
		
		if ( newArray!= null){
			System.out.println(newArray);
		}

		String[] stringArray = new String[5];
		String[] students = { "Shreya", "Joseph", null };
		try {
			System.out.println(students[5].length());
			System.out.println(students[2].length());

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Exception one " + e);
		} catch (NullPointerException e) {
			System.out.println("Exception two " + e);
		} catch (Exception e) {
			System.out.println("Exception three " + e);
		}

		finally {
			System.out.println("Finally here");
		}

		for (int i = 0; i < stringArray.length; i++) {
			// way to initialize string array
			// stringArray[i] = "initial";
			// second way
			Arrays.fill(stringArray, "initial");

		}
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i] + " ");
		}

		// Throws StackOverflowError at runtime
		// myMethod();
	}

	public static void myMethod() {
		System.out.println("my method");
		myMethod();
	}
}
