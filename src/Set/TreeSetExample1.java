package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
	
	public static void main(String[] args) {
		// TreeSet: contains unique element, does not allow null element , class maintains the ascending order ASC, 
		//			retrieve the data --> way faster   |     performance: slow (insert, delete, update) 
		// indexes --> String (no 0 / 1 indexes) 
		
		// creating 
		
		TreeSet <String> ts = new TreeSet <String> ();
		System.out.println("Display TreeSet: " +ts); // [ ]
		System.out.println("Size: " +ts.size()); // 0
		
		// insertion 
		ts.add("Steve"); 
		ts.add("Ahmad");
		ts.add("John");
		ts.add("Liya");
		ts.add("Tara");
		ts.add("Aahmad");
		
		System.out.println("Display TreeSet: " +ts);
		
		// null --> doesn't accepted 
//		ts.add(null);
//		System.out.println("Display TreeSet: " +ts);
		
		System.out.println("Removed Index: " +ts.remove("Steve"));
		
		// search
		Boolean j = ts.contains("John"); 
		System.out.println("Is John Exist in TreeSet: " +j);
		
		// duplicate --> overwritten
		ts.add("Steve");
		System.out.println("Display TreeSet: " +ts);
		
		// iteration 
		System.out.println("\n for-each ");
		for(String treeset: ts) {
			System.out.println("    "+treeset);
		}
		// 
		System.out.println("\n Iterator ");
		
		Iterator t = ts.iterator();
		while(t.hasNext()) {
			System.out.println("     " +t.next());
		}
		
		
		ts.clear();

	}

}
