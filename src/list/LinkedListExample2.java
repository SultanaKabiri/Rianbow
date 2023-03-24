package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
	
	public static void main(String[] args) {
		// Collections: List, Set, Queue, Map --> Generic data : Wrapper Class type --> Object: state  & behavior 
		
		// LinkedList: doubly linked:  address <-- element --> pointer, manipulation is faster in LinkedList, extends the list 
		// 			  and Queue interface --> we get all their methods
		
		//Creating with generic data
		LinkedList <Integer> ll = new LinkedList <Integer> ();
		System.out.println("Display: " + ll);// bracket / array bracket --> [ ]
		System.out.println("Size: " +ll.size()); // 0 
		
		// insert maintain 
		ll.add(2); // index 0
		ll.add(3);// index 1
		ll.add(2);
		ll.add(5);
		ll.add(1);
		ll.add(7);
		
		System.out.println("Display: " + ll);
		System.out.println("Size: " +ll.size());
		System.out.println("Retrieve Index at Position 1: " +ll.get(1)); // 3 
		
		Object element1 = ll.get(0); 
		System.out.println("Index 0: " +element1);
		
		ll.add(null);
		ll.add(null);
		
		System.out.println("Display: " +ll);
		
		// remove
		System.out.println("\nRemove the index 0: " + ll.remove(0));		
		System.out.println("Display: " +ll);
		
		System.out.println("\nRemoved first element: " +ll.removeFirst());
		System.out.println("Display: " +ll);
		
		System.out.println("\nRemoved last element: " +ll.removeLast());
		System.out.println("Display: " +ll);
		
		// loop 
		System.out.println("\n Printing with for-each  ");
		for (Integer number: ll) {
			System.out.println("    " +number);
		}
		
		// Iterator --> 1. hasNext(); (boolean)    2. next(); (check the next element in the list)
		System.out.println("\n Printing with Iterator  ");
		Iterator i = ll.iterator(); 
		while(i.hasNext()) {
			System.out.println("     " +i.next());
		}
		
		System.out.println("\n Printing with for loop  ");
		
		for(int x =0; x <ll.size(); x++ ) {
			System.out.println("    " +ll.get(x));
		}
		
		ll.peek();
		ll.pop(); // queue interface | remove and return the list 
		ll.push(6); // push/ add the element in the front
		ll.clear();
	}

}
