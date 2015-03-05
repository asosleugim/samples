package oca.samples;

import java.util.regex.Pattern;

public class PatternCommandOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] someStrings, someStrings2;
		// using command line java PatternCommandOCA Java:is:fun
		// location o starts after execution of java PatternCommandOCA
		someStrings = args[0].split(":");

		for (String string : someStrings) {
			System.out.println(string);
		}

		Pattern myPatters = Pattern.compile(":");
		someStrings2 = myPatters.split(args[0]);

		for (String string : someStrings2) {
			System.out.println(string);
		}
	}

}
