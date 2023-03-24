package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListNames {

	public static void main(String[] args) {
		// ArrayList : dynamic list, accept duplicates, accept null values, maintain
		// insertion, resize-able

		//
		ArrayList<String> name = new ArrayList<String>();
		System.out.println("Display: " + name); // [ ]
		System.out.println("Size: " + name.size()); // 0

		name.add("Ahmad");
		// name.add(null);
		name.add("Rene");
		name.add("Jim");
		name.add("John");
		name.add("Alex");
		name.add("Sara");
		// name.add(null); // 7

		System.out.println("Display: " + name);
		System.out.println("Size: " + name.size());

		// System.out.println("Element at Position 7: " +name.get(7));

		// advanced loop
		System.out.println("\nAdvanced Loop");
		for (String n : name) {
			System.out.println("Name: " + n);
		}
		// for loop
		System.out.println("\nFor Loop");
		for (int i = 0; i < name.size(); i++) {
			System.out.println("Name: " + name.get(i));
		}

		// while loop
		System.out.println("\n While Loop");

		int count = 0;
		while (name.size() > count) {
			System.out.println("Name: " + name.get(count++)); // increment
			// count++; // increment
		}

		// Iterator --> List interface
		System.out.println("\n Iterator");
		Iterator i = name.iterator();

		// hasNext, next
		while (i.hasNext()) {
			System.out.println("Name: " + i.next());
		}

		// Sort
		Collections.sort(name);
		System.out.println("Display Names: " + name);

		// Reverse
		Collections.sort(name, Collections.reverseOrder());
		System.out.println("Display Reversed Names: " + name);

		// Copying List

		ArrayList<String> lastName = new ArrayList<String>();

		lastName.add("Walker");
		lastName.add("Ahmadi");
		System.out.println("\nLast Name: " + lastName);

		// name objects
		name.addAll(lastName);
		System.out.println("Name: " + name);

//		// lastName objects
//		lastName.addAll(name); 
//		System.out.println("Last Name: " +lastName);
//		
//		// 
//		name.addAll(lastName); 
//		System.out.println("Name: "+ name);
//		

		// adding based on position
		name.addAll(3, lastName);
		System.out.println("Name Started at index 1: " + name);
	}

}
