package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
		// Set: doesn't accept duplicate elements, an ordered list (doesn't maintain the insertion)
		
		HashSet <String> hs = new HashSet <String>();
		System.out.println("Display HashSet: " +hs); // [ ]
		System.out.println("Size: " +hs.size()); // 0
		
		// insert the data: add
		hs.add("Orange");
		hs.add(null);
		hs.add("Mango");
		hs.add("Fig");
		hs.add("Apple"); 
		
		System.out.println("Display HashSet: " +hs);
		
		// add a new element
		hs.add("Grape"); 
		System.out.println("Display HashSet: " +hs);
		
		// no duplicates in set interface
		hs.add("Apple"); // a duplicate element overwritten : override the element
		System.out.println("Display HashSet: " +hs);
		
		// single null --> appear in the front list
		hs.add(null);
		System.out.println("Display HashSet: " +hs);
		
		// Iteration --> hasNext();    next();
		System.out.println("\n Using Iterator ");
		
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println("    " + i.next());
		}
		
		// for each 
		System.out.println(" \n Using for-each ");
		for(String fruit : hs) {
			System.out.println("    "+fruit);
		}
		
		// methods for HashSet --> type object + dot to get the methods
		hs.addAll(hs); 
		hs.remove(0);
		
		// to search for an element
		//hs.contains("Mango"); // true 
		System.out.println("Is mango exist in Set: " + hs.contains("Strawberry"));
		
		// clear
//		hs.clear();
//		System.out.println("Display HashSet: " +hs);
	}


}
