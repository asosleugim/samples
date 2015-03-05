package oca.samples;

import java.util.ArrayList;

public class ArrayListIndexOfOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
ArrayList myAList = new ArrayList();
myAList.add("hello");
myAList.add("world");
myAList.add("one");
myAList.add("two");
myAList.add("three");

System.out.println(myAList.indexOf("world"));
System.out.println(myAList.indexOf("Java"));
	}

}
