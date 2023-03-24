package reservedKeywords;

public class Car extends Vehicle {
	
	// this if used inside this class
	
	int vin; 

	Car(String car_name, double car_price, String car_color, int vin) {
		
		super(car_name, car_price, car_color);
		this.vin = vin; // this should be used after super keyword 
		
		
	}
	
	public void printCarinfo () {
		System.out.println("Car Name: " +car_name + 
							"\nCar Price: "+car_price +
							"\nCar Color: " +car_color +
							"\nCar VIN: " + vin);
		
	}
	
	// Runner method 
	
	public static void main(String[] args) {
		// object car class 
		Car c = new Car ("Honda Lexus", 35000, "Dark Blue", 123456789);
		c.printCarinfo();
	}


}
