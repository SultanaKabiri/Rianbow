package list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorConcept {
	
	public static void main(String[] args) {
		// Vector <-- Stack: LIFO : Last In First Out
		// Generic Data <Wrapper Class>

		Vector<String> v = new Vector<String>();

		System.out.println("Display: " + v); // --> [ ]
		System.out.println("Size: " + v.size()); // 0
		System.out.println("Capcity: " + v.capacity());

		// Add elements
		v.add("Java"); // 0
		// v.add(null);
		v.add("Python"); // 1
		v.add("JavaScript"); // 2
		v.add("React"); // 3
		v.add("TypeScript");
		v.add("C Language");
		v.add("GoLang");
		v.add("C#"); // 7
		v.add("PHP");
		// accept the duplicate --> List Interface
		// v.add("Java");

		System.out.println("Display: " + v);
		System.out.println("Size: " + v.size());

		// Capacity
		System.out.println("Capcity: " + v.capacity());

		// Index of vector elements in a list
		int first_index = v.indexOf("Java");
		System.out.println("First Index: " + first_index);

		// Index of vector elements in a list
		int last_index = v.lastIndexOf("PHP");
		System.out.println("First Index: " + last_index);

		// Enumeration --> Methods .hasMoreElements(); .nextElement();
		System.out.println("\n Enumeration ");
		Enumeration en = v.elements();

		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}

		// Sort --> Collections.sort();
		// We can not sort NULL values --> NullPointerException
		System.out.println("\n");
		Collections.sort(v);
		System.out.println("Sorted Vector: " + v);

		// for loop
		System.out.println("\n Printing with For Loop");
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		
		// remove
		System.out.println("\n");
		v.remove("React");
		System.out.println("Display Vector after remove element: " + v);
		
		// more method 
		boolean b = v.contains("Python"); 
		System.out.println(b);

	}

}
