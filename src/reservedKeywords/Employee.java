package reservedKeywords;

public class Employee extends Company {
	
	// adding constructor the child class
	double salary; 
	
	Employee (int id, String name, double salary ){
		super (id, name); // we are calling the data instance from base class
		this.salary = salary; // we can also use this keyword with super inside of the constructor 
	}
	
	public void print () {
		System.out.println("ID: " + id + "\tName: " +  name + "\tSalary: " + salary);
	}
	
	// main method 
	public static void main(String[] args) {
		// Testing the above data 
		
		// object 
		Employee em = new Employee (5, "Rahul Gupta", 5100);
		em.print();
	}

}
