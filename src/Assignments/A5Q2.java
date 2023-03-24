package Assignments;

import java.util.Scanner;

public class A5Q2 {
	
	/*
	 * Question 2: Write a Java method to compare two Strings.
	 * 
	 * Requirements: The program should contain void method with a condition of if
	 * else statement. Feel free if you want to combine it with Scanner to ask the
	 * user to enter the two Strings. You must call the method to compare it.
	 */
	
	// Str1 = Hello      Str2 = Hello
	
	// main method 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first String");
		String str1 = scan.next();
		System.out.println("Plese enter your second String");
		String str2 = scan.next();
		
		// calling the compare method for Strings
		compareString(str1, str2);
	}
	
	public static void compareString (String str1, String str2) {
		
		// if else statements
		if (str1.compareTo(str2) == 0) {
			System.out.println("The above entered Strings are equal!");
		} else {
			System.out.println("The above entered Strings are NOT equal!");
		}
		
	}
	

}
