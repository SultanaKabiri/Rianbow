package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample2 {
	
	public static void main(String[] args) {
		// Key: Character
		// Value: String 
		
		HashMap <Character, String> hm = new HashMap<Character, String> ();
		
		// key & value --> Map.Entry 
		hm.put('A', "Apple"); //0
		hm.put('C', "Cat"); //1 
		hm.put('E', "Egg"); //2
		hm.put('B', "Book");
		hm.put('D', "Dog");
		
		System.out.println("Displaying HashMap: " +hm);
		
		// iteration 
		Iterator i = hm.entrySet().iterator(); // keep using the dot . for methods is called chaining methods 
		while(i.hasNext()) {
			Map.Entry mi =(Map.Entry) i.next();
			System.out.println("K: " +mi.getKey() + "    V: "+ mi.getValue());
		}
		
		// index
		// Key must be  Integer 
		
		// remove  | --> Key must be Integer
		/// System.out.println("Remove Index 2: " + hm.remove(2)); 
		
		// for each 
		System.out.println("\n For Each ");
		for(Map.Entry  map : hm.entrySet()) {
			System.out.println("K: " +map.getKey() + "     V: " +map.getValue());
		}
		
		// loop
		
	}

	

}
