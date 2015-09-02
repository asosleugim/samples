package oca.samples.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<Integer,String> map = new HashMap<Integer, String>();
	map.put(5, "Five");
	map.put(3, "Three");
	map.put(1, "One");
	map.put(9, "Nine");
	
	
	String text= map.get(3);
	
	System.out.println(text);
	
	for(Map.Entry<Integer, String> entry: map.entrySet()){
		int key = entry.getKey();
		String value = entry.getValue();
		
		System.out.println(key + " " + value);
	}
	}

}
