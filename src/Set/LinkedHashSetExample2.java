package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample2 {
	
	public static void main(String[] args) {
		// LinkedHashSet

		LinkedHashSet<Integer> n = new LinkedHashSet<Integer>();

		// insertion maintain
		n.add(5);
		n.add(null);
		n.add(2);
		n.add(4);
		n.add(7);
		n.add(3);
		n.add(6);
		n.add(null);// overwritten

		System.out.println("Display LinkedHashSet: " + n);

		
		// HashSet
		HashSet<Integer> h = new HashSet<Integer>();

		// insertion doesn't maintain
		h.add(5);
		h.add(null);
		h.add(2);
		h.add(4);
		h.add(7);
		h.add(3);
		h.add(6);
		h.add(null);// overwritten
		

		System.out.println("\nDisplay HashSet: " + h);

	}

}
