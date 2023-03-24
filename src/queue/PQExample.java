package queue;

import java.util.Iterator;

import io.netty.util.internal.PriorityQueue;

public class PQExample {
	
	public static void main(String[] args) {
		// FIFO --> Insertion & deletion 
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pq.add(10);
		pq.add(20);
		pq.add(15);
		
		System.out.println("PQ: " +pq );
		
		// element --> throws exception if the queue is empty
		System.out.println("Head of the PQ: " +pq.element());
		System.out.println("PQ: " +pq );
		
		// peak --> returns null if the the queue is empty 
		System.out.println("\nHead of the PQ: " + pq.peek());
		
		// poll --> remove the head | returns null if the queue is empy 
		System.out.println("\npoll an emlement: " +pq.poll());
		System.out.println("PQ: " +pq );
		
		// iterator 
		System.out.println("\n Using Iterator");
		Iterator<Integer> i = pq.iterator(); 
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		// remove
		//pq.remove();
		
		// contains
		boolean n15 = pq.contains(15);
		System.out.println("Checking if 15 exists: " + n15);

	}

}
