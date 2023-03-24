package Assignments;

public class A5Q01 {

	/*
	 * Question 1: Write a java method to swap/exchange the values using 3rd
	 * Variable.
	 * 
	 * Requirements: The method should be static void and contain two parameterized
	 * integers. You should able to pass different numbers and call the function of
	 * reverse method to exchange the position of numbers in variables.
	 */

	// static method
	static void swapValues(int x, int y) {
		int temp = x;
		x = y;
		y = temp;

		System.out.println("m: " + x + "\t n: " + y);
	}

	// main method
	public static void main(String[] args) {
		int x = 2;
		int y = 3;

		int m = 5;
		int n = 10;
		// calling the function/method -> swapValues (reverse the integers)
		System.out.println("After swapping values using third variables in a method");
		// swapValues (x, y);

		// m & n --> swap the values
		swapValues(m, n);
	}

}
