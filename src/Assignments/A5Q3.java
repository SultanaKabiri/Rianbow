package Assignments;

import java.util.Scanner;

public class A5Q3 {
	
	/*
	 * Question 3: Write a Java method to print the entered number in reverse. 
	 * 
	 * Follow the below algorithm for reversing
	 * 
	 * Step1: Isolate the digit in number --> lastDigit = number % 10 
	 * 
	 * Step2: Append lastDigit to reverse --> reverse = (reverse * 10) + lastDigit
	 * 
	 * Step3: Remove last digit from number --> number = number / 10
	 */
	
	// main 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to reverse it for you!");
		int n = scan.nextInt();
		reverseMethod(n);
	}
	
	// reverseMethod 
	public static void reverseMethod(int number) { // 1  != 0 
		int reverseNumber = 0; 
		while (number != 0) {
			int digit = number % 10; 
			reverseNumber = (reverseNumber * 10) + digit; 
			number = number / 10; 
			
		}
		System.out.println("Your reversed number: " +reverseNumber);
		
	}
	
	// 356849

}
