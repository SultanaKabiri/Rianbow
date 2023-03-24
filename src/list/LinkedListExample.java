package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		// LinkedList: double linked list --> head & pointer
		// Maintain insertion, accept duplicates, null values accepted, reverse and set
		// the element --> set the original list

		LinkedList<String> fruits = new LinkedList<String>();

		System.out.println("Display: " + fruits);// [] List
		System.out.println("Size: " + fruits.size()); // 0

		// add
		fruits.add("Mango");
		fruits.add(null);
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Mango");
		fruits.add(null);

		System.out.println("Display: " + fruits);
		System.out.println("Size: " + fruits.size());

		// Iteration
		System.out.println("\n For Loop");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println("Fruit: " + fruits.get(i));
		}

		// Advanced loop
		System.out.println("\n Advanced loop");
		for (String fruit : fruits) {
			System.out.println("Fruit: " + fruit);
		}

		// Iterator
		System.out.println("\n Using Iterator loop");
		Iterator i = fruits.iterator();
		while (i.hasNext()) {
			System.out.println("Fruit: " + i.next());
		}

		// while
		System.out.println("\n while loop");
		int count = 0;
		while (fruits.size() > count) {
			System.out.println("Fruit: " + fruits.get(count++));// increment
			// count++;
		}

		// add as per index
		fruits.add(1, "Strawberry");
		System.out.println("\nDisplay: " + fruits);

		// add at first
		fruits.addFirst("Peach");
		System.out.println("\nDisplay: " + fruits);

		// add at last
		fruits.addLast("Cherry");
		System.out.println("\nDisplay: " + fruits);

		// remove
		fruits.remove(); // the first element
		System.out.println("\nDisplay: " + fruits);

		Object lastElement = fruits.removeLast(); // last element
		System.out.println("\nRemoved Last Element: " + lastElement);
		System.out.println("Display: " + fruits);

		Object firstElement = fruits.removeFirst(); // first element
		System.out.println("\nRemoved First Element: " + firstElement);
		System.out.println("Display: " + fruits);

		Object remove1 = fruits.remove(1);
		System.out.println("\nRemove1: " + remove1);
		System.out.println("Display: " + fruits);

		// get
		System.out.println("First Element: " + fruits.getFirst());// Strawberry
		System.out.println("Last Element: " + fruits.getLast()); // null
		System.out.println("Index Element: " + fruits.get(2)); // Orange

		// Iterate via descending
		System.out.println("\n Reverse Order ");
		Iterator reverse = fruits.descendingIterator();
		while (reverse.hasNext()) {
			System.out.println("      " + reverse.next());
		}

		// Set --> replace the element

		fruits.set(0, "Cherry");
		System.out.println("\nDisplay: " + fruits);

		fruits.set(5, "Kiwi");
		System.out.println("\nDisplay: " + fruits);

		// if else --> to search an element 
		if (fruits.contains("Mango")) {
			System.out.println("Element Cherry is existing!");
		} else {
			System.out.println("Element does not exist! ");
		}
		
		// push --> insert the element at the front of the list 
		fruits.push("Mangoo");
		System.out.println("\nDisplay: " + fruits);
		
		fruits.add("Mangoooooo"); 
		System.out.println("\nDisplay: " + fruits);
		
		// pop --> remove and return the first element of the list
		fruits.pop();	
		System.out.println("\nDisplay: " + fruits);
		
		fruits.pop();	
		System.out.println("\nDisplay: " + fruits);
		
		//remove  and return the first element of the list
		System.out.println(fruits.remove());
		System.out.println("\nDisplay: " + fruits);
		
		// peek --> retrieve and does not remove the element 
		System.out.println("\nPeek doesn't remove: retrieving: " + fruits.peek());
		System.out.println("Display: " + fruits);
		
		System.out.println("\nPeek First: " +fruits.peekFirst());
		System.out.println("Peek Last: " +fruits.peekLast());
		System.out.println("Display: " + fruits);
		
		
		
		
		

		// remove all data
		fruits.clear();
		System.out.println("\nCleared: " + fruits);

	}

}
