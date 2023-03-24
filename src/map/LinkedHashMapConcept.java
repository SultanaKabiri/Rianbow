package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapConcept {
	
	public static void main(String[] args) {
		/*
		 * LinkedHashMap: Maintains the insertion
		 * 
		 */

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(2, "Jim");
		lhm.put(1, "Tom");
		lhm.put(4, "Susan");
		lhm.put(3, "Rahul");

		System.out.println("LinkedHashMap: " + lhm);
		
		// Overwritten over values if we add the same key  | replace the value
		lhm.put(2, "Ahmad");
		System.out.println("LinkedHashMap: " + lhm);
		
		// Iteration 
		Set set = lhm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry m	= (Map.Entry) i.next(); 
			// System.out.println("Key LHM: " + m.getKey());
			System.out.println("Value LHM: "+ m.getValue());
		}
		
		
		
	// LinkedHashMap Vs HashMap
		
		
		// HashMap --> Insertion does not matter
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(2, "Jim");
		hm.put(1, "Tom");
		hm.put(4, "Susan");
		hm.put(3, "Rahul");

		System.out.println("\nHashMap: " + hm);
	}

}
