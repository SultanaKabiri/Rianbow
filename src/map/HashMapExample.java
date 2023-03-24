package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		// Map interface : abstraction classes that have methods <-- data structure (ready to use)
		// HashMap: a group objects in a map: --> storing key  & value pairs (entry)
		
		// Key: --> can not contain duplicates, Unique |  Wrapper class data --> Integer, Double, String 
		// Value: --> can contain duplicates, overwritten the values |  Wrapper class data --> Integer, Double, String 
		
		// creating HashMap
		// a map of names: Student table --> ID, Name (1 <--> John)  <-- one pair
		HashMap<Integer, String> hmap = new HashMap <Integer, String>();
		
		System.out.println("Displaing HashMap: " +hmap); // { }      |       SET / LIST --> [ ]   
		System.out.println("Size: " +hmap.size()); // 0 
		
		// Insertion : Adding  --> method .put 				|   List/Set .add
		// Insertion does not matter ---> return result an ordered
		hmap.put(1, "John"); // key is unique / value will overwritten/ replace the value
		
		System.out.println("Displaing HashMap: " +hmap); // { 1=John}   	|     String one = "John"; 
		
		hmap.put(2, "Rene");
		hmap.put(3, "Sara"); 
		hmap.put(7, "Ahmad");
		hmap.put(4, "Baseem"); 
		hmap.put(6, "Blaine");
		hmap.put(1, "Tom"); 
		hmap.put(1, "  "); // null value 
		hmap.put(5 , "Ahmad"); 
		hmap.put(null, null); // Key: one is acceptable
		hmap.put(8, null); // Value: one/multi acceptable 
		hmap.put(10, null);
		
		System.out.println("Displaing HashMap: " +hmap);
		
		// Iteration --> key & value 
		// invoking the set interface -- point on entry 
		Set hm = hmap.entrySet(); // <-- entry (key & value)
		
		Iterator i = hm.iterator();// iterator --> hasNext(); , next();
		
		while (i.hasNext()) {
			Map.Entry mEntry = (Map.Entry) i.next(); 
			
			System.out.print( mEntry.getKey() +  " = " );
			System.out.println(mEntry.getValue());
			
		}
		// Index
		String index2 = hmap.get(2); 
		System.out.println("\nIndex 2: "+ index2);
		
		System.out.println("Displaing HashMap: " +hmap);
		
		// Remove 
		String r_index2 = hmap.remove(2); 
		System.out.println("\nRemoved Index 2: " + r_index2);
		System.out.println("Displaing HashMap: " +hmap);
		
		
	}

}
