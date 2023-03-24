package Assignments;

public class A5Q1 {
	public static void main(String[] args) {
		// Swapping values using the third variable
		
		int x = 2; 
		int y = 3; 
		System.out.println("Before Swapping/Exchanging the values");
		System.out.println("x: " + x +"\t y: "+y);
		
		System.out.println("\n After Swapping/Exchanging the values");
		System.out.println("Using third Variable to implement the scenario");
		
		int z = x;  // 2
		x = y; // 3
		y = z; // 2
		
		System.out.println("x: " + x +"\t y: "+y);

	}

}
