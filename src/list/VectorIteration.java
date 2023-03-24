package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorIteration {
	
	public static void main(String[] args) {
		// Vector --> generic data: String, Integer,

		// creating a vector
		Vector<String> vector = new Vector<String>();
		System.out.println("Print Vector: " + vector); // --> [ ] <-- bracket

		vector.add("Orange");
		vector.add("Apple");
		vector.add("Grape");

		System.out.println("Print Vector: " + vector);

		// duplicate
		vector.add("Orange");
		System.out.println("Print Vector: " + vector);

		// Loop
		System.out.println("\nFor Loop");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

		// Enumeration --> Iteration | Traversing | loop --> method .elements();
		System.out.println(" \n Enumeration ");

		Enumeration en = vector.elements();

		// hasMoreElements(); nextElement();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		// Iterator
		System.out.println("\n Iterator ");

		Iterator i = vector.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// For each
		System.out.println("\n For Each ");

		for (String v : vector) {
			System.out.println(v);
		}

	}

}
