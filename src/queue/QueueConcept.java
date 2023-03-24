package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {
	
	public static void main(String[] args) {
		// Queue: FIFO --> First In First Out
		
		//create 
		Queue <String> q = new LinkedList<String> ();
		System.out.println("Queue : " + q); // --> List Object element [ ]
		System.out.println("Size: " +q.size()); // 0 
		
		// add
		q.add("Tom"); 
		q.add("John"); 
		q.add("Erika"); 
		
		System.out.println("Queue : " + q);
		
		// head element --> .element();  | it read only but does not remove the object element in the list 
		System.out.println("Head: " + q.element());
		
		// poll(); remove the head element 
		System.out.println("\nUsing poll method | remove element: " +q.poll() );
		System.out.println("Queue : " + q);
		
		// remove 
		

		System.out.println("\nUsing poll method | remove element: " +q.poll() );
		System.out.println("\nUsing poll method | remove element: " +q.poll() );
		
		// peak --> element method : returns null if the Queue is empty
		System.out.println("Queue : " + q);
		System.out.println("peak method: " + q.peek());
		//System.out.println("Head: " + q.element());
		
		// q.remove(); 
		//q.poll();
		System.out.println("poll from the Queue: " +q.poll());
		System.out.println("Display Queue: " +q);
		
		
		// adding an object to check the in queue 
		q.add("Ahmad");
		
		// contains 
		if (q.contains(100)) {
			System.out.println("\nThe object element exists in the Queue");
		} else {
			System.out.println("\nThe object element does NOT exist in the Queue");
		}
		
		
		// 
		
		

	}

}
