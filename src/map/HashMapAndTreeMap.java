package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapAndTreeMap {
	
	public static void main(String[] args) {
		// <String, String>

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("VA", "Virginia");
		hm.put("TX", "Texas");
		hm.put("CA", "California");
		hm.put("AZ", "Arizona");

		// get the key
		System.out.println("HashMap: " + hm);

		System.out.println("Value to Key CA: " + hm.get("CA"));

		// red-black tree --> natural order: A - Z | 1 - 100 -- > keys & values 
		/*
		 * TreeMap: maintains the ascending order Insertion is not matter. It stores its
		 * 			elements in a red-black tree, orders its elements based on their values; it
		 * 			is substantially slower than HashMap.
		 */

		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("VA", "Virginia");
		tm.put("TX", "Texas");
		tm.put("CA", "California");
		tm.put("AZ", "Arizona");

		System.out.println("Key TX: " + tm.get("TX"));
		System.out.println("\nTreeMap: " + tm);
		
		System.out.println("\n");
		
		//TreeMap Iteration
		Set set = tm.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()){
			//.next(); boolean object
			Map.Entry mt = (Map.Entry)i.next(); 
			//System.out.println("Key: " +mt.getKey());
			System.out.println("Value: " +mt.getValue());
		}
		
		//Size
		
		System.out.println("Size: " +tm.size());
		
		// clear
		tm.clear();
		System.out.println("TreeMap: " +tm);  // --> empty { } 
		
	}


}
