package abstraction;

public abstract class Vehicle {
	
	// base/ super class 
	
		// abstract method does not have body
		
		String car_name = "Chevy" ;

		abstract void start(); 
		
		abstract void stop();
		
		// Concrete methods--> methods that have body, void / data_type --> return 
		
		//1. void 
		public void method1() {
			System.out.println("Any vehicle has tire");
		}
		
		//2. return 
		public String vehicle_name(String name) {
			car_name = name; 
			return car_name;
		}


}
