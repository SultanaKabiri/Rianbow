package reservedKeywords;

public class FinalKeyword {
	
	public static void main(String[] args) {
		// final: variable , method , class --> constants ( can not change the value )
		
		/*
		  local final variable when be declared as final must be initialized
		  a final method can be Overridden 
		  a final class can not be inherited --> extends 
		  
		 */
		
		// 1. final variable 
		
		final String name = "Mandatory"; 
		
		final int max_value = 10; 
		// max_value = 11; // re-initialize
		
		System.out.println("Max Value: " + max_value);
		
	}

}
