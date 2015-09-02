package oca.samples.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClassesImp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		testMap(treeMap);

	}

	public static void testMap(Map<Integer, String> map) {

		map.put(9, "fox");
		map.put(6, "cat");
		map.put(2, "dog");
		map.put(7, "snake");
		map.put(1, "spider");
		map.put(8, "horse");
		map.put(4, "tiger");

		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + " " + value);
		}

	}
}
