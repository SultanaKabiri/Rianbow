package abstraction;

public class TestAnimal {
	
	public static void main(String[] args) {
		// create an object
		
		// we can not directly instantiate our object of base class
		// Animal a = new Animal ();

		// create the object with help of child class
		// new keyword is letting to instantiate the object of the class
		Animal a = new Cat ();
		a.sound();
		a.eat();
		System.out.println(a.name(""));
	}

}
