package polymorphism;

public class TestParent {
	
	public static void main(String[] args) {
		// object
		
		// parent class
		Parent p = new Parent ();
		p.print();
		p.name();
		
		// child class
		Child c = new Child ();
		c.print(); // calling the overrides method of child class
		c.name(); // calling the parent method inside child class
	

	}


}
