package list;

import java.util.Stack;
import java.util.stream.Stream;

public class StackIteration {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> num = new Stack<String>();
		num.push("One");
		num.push("Two");
		num.push("Three");
		num.push("Four");

		System.out.println("Display Stack: " + num);
		for (String item : num) {
			System.out.println(item);
		}

		// Stream
		System.out.println("\nPrinting with Stream Iteration");

		Stream<String> s = num.stream();
		s.forEach((item) -> {
			System.out.println(item);
		});

		System.out.println("\n another example");

		Stack<Integer> number = new Stack<Integer>();
		number.push(1);
		number.push(2);
		number.push(3);
		number.push(4);
		number.push(5);

		System.out.println("Stack of Number: " + number);

		// for each
		for (Integer n : number) {
			System.out.println("    " + n);
		}

		// Stream
		System.out.println("\n Printing with Stream  ");

		Stream<Integer> stream = number.stream();
		
		stream.forEach((element) -> {
			System.out.println("      " +  element);
		});
		

	}
}
