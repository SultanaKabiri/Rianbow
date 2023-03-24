package encapsulation;

public class EncapsulationTest {
	public static void main(String[] args) {
		// Creating an object for the class  EncapsulationExample
		
		EncapsulationExample obj = new EncapsulationExample();
		
		// setting the actual values
		//obj.setSSN(123456789);
		obj.setAge(25);
		obj.setName("Sara Khan");
	
		// to get the values --> calling the getter methods
		//System.out.println("ID: " + obj.getSSN());
		System.out.println("Age: " + obj.getAge());
		System.out.println("Name: "+ obj.getName());

	}

}
