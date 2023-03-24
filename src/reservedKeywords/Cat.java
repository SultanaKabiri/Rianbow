package reservedKeywords;

public class Cat extends Animal {
	
	// child / base class 
	
	String color = "Yellow"; 
	
	public void printColor() {
		System.out.println("Cat Color: "+ color);// child 
		System.out.println("Animal Color: " + super.color); // parent
	}
	
	// method to use/ call the parents class method 
	
	public void eat () {
		super.eat();
	}
	
	public static void main(String[] args) {
		// object 
		Cat c = new Cat ();
		c.printColor();
		c.eat();
	}

}
