package stringclass;

public class StringBuilderExampl {
	
	public static void main(String[] args) {
		// StringBuilder --> mutable, not thread safe, is faster than the StringBuffer
		
		
		// Declaration 
		StringBuffer sbf = new StringBuffer ();
		
		StringBuilder sb = new StringBuilder ("Tony");
		sb.reverse(); // ynoT
		System.out.println("Reverse Tony: "+sb);
		
	
		
		// Methods --> StringBuilder 
		
		System.out.println("Size: " + sb.length());
		
		// Set character 
		System.out.println(sb.charAt(0));
		
		sb.setCharAt(0, 'S');
		System.out.println("Set S: " +sb);
		
		// insert method 
		sb.insert (4, 's') ;
		System.out.println("Set s: " +sb);
		
		// delete method --> check the character index starting & ending arguements
		sb.delete(4, 5); 
		System.out.println("Deleting s: "+ sb);
		
		// append 
		sb.append("TV");
		System.out.println("added TV: " + sb);
		
        // Create a string and reverse the literal values 
		StringBuilder sbr = new StringBuilder ("Hello I am learing Java Core");
		System.out.println("String sbr: " +sbr);
		System.out.println("Reverse sbr: " +sbr.reverse());

	}


}
