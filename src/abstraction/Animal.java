package abstraction;

public abstract class Animal {
	
	//base class / super class 
	
		// Abstraction: deal with ideas rather than implementing
		
		// abstract --> reserved keyword: abstract class class_name
		
		// an abstract method does not have a body and it ends with semicolon ; 
		abstract void sound(); // --> abstract method needs to be implemented in child class. No matter whatever happens
		
		// concrete method 
		public void eat () {
			System.out.println("Animal can eat!");
		}
		
		// return type 
		public String name (String name) {
			return "Animal Name: Cat" ;
			
		}


}
