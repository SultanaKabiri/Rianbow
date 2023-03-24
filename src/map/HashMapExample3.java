package map;

import java.util.HashMap;

public class HashMapExample3 {
	
	public static void main(String[] args) {
		// Methods 
		
		HashMap<Integer, String > hashmap = new HashMap<Integer, String >();
		
		// Insertion 
		hashmap.put(2, "Value2"); 
		hashmap.put(1, "Value1"); 
		hashmap.put(4, "Value4"); // removed
		hashmap.put(3, "Value3"); 
		hashmap.put(6, "Value6"); 
		hashmap.put(5, "Value5"); 
		
		System.out.println("Display: " + hashmap);
		
		System.out.println("Is HashMap empty ? " + hashmap.isEmpty());// false
		
		// size
		System.out.println("Size: "+ hashmap.size());
		
		// remove --> logical 
		Object key2= hashmap.remove(2);
		System.out.println("Removed key 2: "+key2);
		
		System.out.println("Remove Key 4: "+ hashmap.remove(4));
		
		System.out.println("Removed Key 5: " + hashmap.remove(5));
		
		// Search the key exist? 
		System.out.println("\nKey 2: " + hashmap.containsKey(2));
		Boolean k2 = hashmap.containsKey(2); // removed 
		System.out.println("k2: "+k2);
		
		Boolean v2= hashmap.containsValue(2); // remove and return false
		System.out.println("v2: " +v2);
		
		
		// clear 
		hashmap.clear();
		System.out.println("\nDisplay: " + hashmap);
		
		// Empty 
		System.out.println("Is HashMap empty ? " + hashmap.isEmpty());
		
		// More methods
		hashmap.put(9, "value9"); 
		System.out.println("\nhashmap1: " +hashmap);
		
		// copying all map data into another map 
		
		HashMap <Integer, String > hashmap2 = new HashMap<Integer, String>();
		System.out.println("\nDisplay hashmap2: " +hashmap2);
 		
		//copy from one to another 
		hashmap2.putAll(hashmap);
		System.out.println("\nDisplay hashmap2: " +hashmap2);
		
		// overwritten is also happening in copying data in a map
		hashmap.putAll(hashmap2);
		System.out.println("HashMap1: " + hashmap);
	

	}

}
