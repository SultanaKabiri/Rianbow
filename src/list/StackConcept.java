package list;

import java.util.Stack;

public class StackConcept {
	
	public static void main(String[] args) {
		/* Stack: LIFO --> Last In First Out : linear data structure | last object element is know as element 1 (top element)
		 
		 pop: remove
		 push : insert the element
		 search : if object element exist
		 peek : fetch | select
		 size : --> 0
		    
		    plate5 // remove 
		    plate4  // 1 --> removed
		    plate3 // 1 
		    plate2
		    plate1
		    
		 */
		
		// Create Stack 
		Stack <String> stack = new Stack<String>();
		
		System.out.println("Print Stack: " + stack);
		System.out.println("Stack Size: " +stack.size());
		
		// push: insert an element on the top of the stack and returns the inserted element 
		stack.push("Plate 1"); 
		stack.push("Plate 2");
		stack.push("Plate 3");
		stack.push("Plate 4"); 
		//stack.push("Tea cup"); // pushed another object 
		stack.push("Plate 5");
		
		System.out.println("Print Stack: " +stack);
		System.out.println("Stack Size: " +stack.size());
		
		//Pop: remove the last inserted element from the stack   | if no object element exist --> exception
		
		String plateAtTop = stack.pop();
		System.out.println("Last inserted element: " + plateAtTop);
		System.out.println("Print Stack: " +stack);
		System.out.println("Stack Size: " +stack.size());
		
		// peek: returns top element from stack without removing it
		
		String topElement = stack.peek();
		System.out.println("\nPeek without removing: " +topElement);
		System.out.println("Print Stack: " +stack);
		
		// search: object element from top of the stack --> return the object element   | if not exist --> -1
		
		int index = stack.search("Plate 5"); 
		System.out.println("Search Plate 5: " +index);
		
		// empty: validate the stack has object element --> false    | if stack is empty --> true
		
//		boolean isEmpty = stack.empty();
//		System.out.println("Stack is empty: " +isEmpty);
		
		// pop the elements --> removes the object elements
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		boolean isEmpty = stack.empty();
		System.out.println("Is stack empty?: " +isEmpty);
		
		
	}

}



