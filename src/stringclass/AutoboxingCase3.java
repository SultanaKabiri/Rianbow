package stringclass;

import java.util.ArrayList;

public class AutoboxingCase3 {
	
	public static void main(String[] args) {
		// Auto-boxing: automatically conversion with data structure (collection data) 
		
		// Elements: List, Set , Map --> Collection (Wrapper class): Boolean, Integer, Character, Float, Double, Byte
		ArrayList <Integer> arrayList = new ArrayList <Integer> () ;
		
		arrayList.add(1);
		arrayList.add(5);
		System.out.println("List Object: " +arrayList);
	}


}
