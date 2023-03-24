package abstraction;

public class VehicleTest {
	
	public static void main(String[] args) {
		// Abstraction: we can not instantiate/ create the object of the abstract class
		
		// Abstract: general idea but not the implementation 
		//Vehicle v = new Vehicle ();
		
		// base object_name = new child_class();
		Vehicle v = new Car ();
		
		v.start();

		v.stop();
		
		// concrete methods
		v.method1();
		
		// display
		System.out.println(v.car_name);

	}


}
