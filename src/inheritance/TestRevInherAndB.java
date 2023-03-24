package inheritance;

public class TestRevInherAndB {
	
	public static void main(String[] args) {
		// Test RevInheritance class and B class 
		
		RevInheritance superClass = new RevInheritance ();
		
		superClass.a();
		System.out.println("Name: " + superClass.name);
		
		// creating an object for B class
		System.out.println();
		B b = new B();
		b.a();
		System.out.println("Name: " + b.name);
		
		// Creating an object C class
		System.out.println();
		C c = new C();
		System.out.println("Name: " +c.name);
		c.a();
		
		// Ojbect for Hierar inheritance
		HierarInh h = new HierarInh(); 
		System.out.println("Name: " + h.name);


	}

}
