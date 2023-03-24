package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {
	
	public static void main(String[] args) {
		// LinkedHashSet: --> class contain unique elements like HashSet(doesn't
		// maintain insertion and return the ordered set), LinkedHashSet class maintain the insertion
		// set --> group of elements - duplicate not allowed

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		System.out.println("Display LHS: " + lhs); // []
		System.out.println("Size: " + lhs.size()); // 0

		// insertion
		lhs.add("B");
		lhs.add("A");
		lhs.add("E");
		lhs.add("C");
		lhs.add("C");

		System.out.println("Display LHS: " + lhs);

		// HashSet
		HashSet<String> hs = new HashSet<String>();
		// insertion
		hs.add("B");
		hs.add("C");
		hs.add("A");
		hs.add("E");
		hs.add("C");

		System.out.println("\nDisplay HashSet: " + hs);

	}

}
