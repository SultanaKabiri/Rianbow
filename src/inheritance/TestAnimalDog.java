package inheritance;


public class TestAnimalDog {
	
	public static void main(String[] args) {
		// create an object
		
		Animal a = new Animal();
		
		// initialization of the data members
		a.name = "Cat" ; 
		a.age = 2; 
		//a.breed = "German Shepherd";
		// displaying the data members
		System.out.println("Name: "+ a.name);
		System.out.println("Age: " +a.age);
		//System.out.println("Bread: "+a.breed);
		
		// call the method 
		a.eat();
	
		
		// Create an object 
		Dog d = new Dog ();
		d.name = "Ace"; 
		d.age = 3; 
		// display
		System.out.println("\nDog Name: " + d.name);
		System.out.println("Dog Age: " + d.age);
		
		// calling the method from Dog class
		
		d.eat();
		
		// Create an object for Horse Class
		Horse h = new Horse ();
		
		// set the value
		h.name = "Horse"; 
		h.age = 10; 
		
		// display
		System.out.println("\nHorse Name: " + h.name);
		System.out.println("Horse Age: " + h.age);
		
		// call the method for horse
		h.eat();

	}

}
