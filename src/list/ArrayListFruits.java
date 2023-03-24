package list;

import java.util.ArrayList;

public class ArrayListFruits {
	
	public static void main(String[] args) {
		// ArrayList fruit
		
		ArrayList <String> fruits = new ArrayList <String >();
		
		fruits.add("Orange"); // 0
		fruits.add("Apple"); 
		fruits.add("Pineapple"); 
		fruits.add("Grape"); 
		fruits.add("Mango"); 
		
		System.out.println("Fruits: " +fruits);
		
		// remove
		fruits.remove(0);
		System.out.println("Fruits: " +fruits);
		
		fruits.remove("Grape");
		System.out.println("Fruits: " +fruits);
		
		// in ArrayList: element doesn't exist will not throw exception
		fruits.remove("Strawberry"); // object 
		System.out.println("Fruits: " +fruits);
		
		// get the index: If element doesn't exist-  Index 4 out of bounds for length 3 will appear
//		fruits.remove(4); // element 
//		System.out.println("Fruits: " +fruits);
		
		// Index position 
//		System.out.println(	fruits.lastIndexOf(fruits));// If objects bypassed directly 
//		System.out.println(	fruits.lastIndexOf(2));
//		System.out.println( fruits.indexOf(2));
		
		System.out.println(fruits.get(2));
	}


}
