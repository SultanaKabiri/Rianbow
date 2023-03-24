package abstraction;

public class Car extends Vehicle {

	// implement two abstract methods inside child/sub class
	
	public void start() {
		System.out.println("The car engine is starting on push button");
	}
	
	public void stop () {
		System.out.println("The car engine is stoping on push button");
	}

}
