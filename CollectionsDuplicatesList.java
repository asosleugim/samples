package oca.samples;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class CollectionsDuplicatesList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> newList = new ArrayList<>();

		newList.add(12);
		newList.add(12);
		newList.add(11);
		newList.add(10);
		
		List<Integer> newListTwo =		question1(newList);
		
		Iterator<Integer> itr = newListTwo.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next());
		}

		
	}
	
	public static List<Integer> question1(final List<Integer> values){
		 Set<Integer> set = new HashSet<Integer>(values);
		 List<Integer> newValues =  new ArrayList<Integer>();
		 
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			newValues.add(itr.next());
		}
		
		return newValues;
	}

}
