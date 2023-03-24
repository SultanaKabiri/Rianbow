package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {
	
	public static void main(String[] args) {
		// HashSet: contains unique, allows single null, doesn't maintain the order and return the an order set, hashing the data --> tables
		
		//create
		HashSet <Integer> hsNum = new HashSet <Integer>();
		hsNum.add(3); 
		hsNum.add(9);
		hsNum.add(1);
		hsNum.add(5);
		hsNum.add(4);
		
		System.out.println("Print the HashSet: "+hsNum);
		
		hsNum.add(2);
		hsNum.add(6);
		
		System.out.println("Print the HashSet: "+hsNum);
		
		// Not throwing error to add duplicates but overwritten the element 
		hsNum.add(9);
		System.out.println("Print the HashSet: "+hsNum);
		
		// null will be printed up in front of set 
		hsNum.add(null);
		System.out.println("Print the HashSet: "+hsNum);
		
		// Iterator
		System.out.println(" \n   Iterator    ");
		Iterator iterator = hsNum.iterator();

		while(iterator.hasNext()) {
			System.out.print("  " +iterator.next());
		}

	}

}
