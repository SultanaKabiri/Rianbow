package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapConcept {
	
	public static void main(String[] args) {
		/*
		 * HashMap: key value pair (entry) --> all the sets -> contains unique value ->
		 * maintains no order -> one null key but it holds multiple null values
		 */

		// Create ---> Wrapper class data | generic type data <K & V>

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		// add elements to HashMap
		hmap.put(2, "two"); // key 2 --> value two <-- the method .get();
		hmap.put(1, "one");
		hmap.put(3, "three");

		// Display | Print --> curly bracket { }
		System.out.println("Display: " + hmap);

		// add same the key (UNIQUE) --> replace the value | overwritten
		hmap.put(2, "TWO");
		System.out.println("Display: " + hmap);

		// get the value from HashMap --> method .get();
		System.out.println("Get Key 2: " + hmap.get(2));

		// if the key does not exist -- > null
		System.out.println("Key not exist: " + hmap.get(5)); // null (key & value missing)

		// duplicate values --> acceptable / any number of values in Map
		hmap.put(4, "three"); // value is the same as keyValue 3
		System.out.println("\nDisplay: " + hmap);

		// Iterator

		System.out.println("\nUsing Iterator Concept");
		Set<Integer> keys = hmap.keySet();
		Iterator<Integer> i = keys.iterator();

		// .hasNext(); | .next();
		while (i.hasNext()) {
			System.out.println("Key: " + i.next());
		}

		// Keys & values
		System.out.println("\n Printing both keys & values in entry set");

		Set entrySet = hmap.entrySet();
		Iterator itr = entrySet.iterator();

		while (itr.hasNext()) {
			Map.Entry map = (Map.Entry) itr.next();

			//System.out.println("Key: " + map.getKey());
			System.out.println("Value: " +map.getValue());
		}

	}


}
