package encapsulation;

public class EncapsulationExample {
	// Encapsulation --> data hiding is used with the private reserved
	// keyword/access modifiers

	// data members/ variables/ fields / state
	private int ssn; // getter & setter
	private int age;
	private String name;

	// Create Getter & Setter methods

	// ssn --> method that has a return type
	private int getSSN() {
		return ssn;
	}

	// ssn --> method set the value
	private void setSSN(int newSSN) {
		ssn = newSSN;
	}

	// Getter & Setter method for age data member
	public int getAge() { // --> getter method
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	// Getter & Setter methods for name
	public String getName() {
		return name;

	}

	public void setName(String newName) {
		name = newName;
	}

	// main method
	public static void main(String[] args) {
		EncapsulationExample objEnc = new EncapsulationExample();
		objEnc.setSSN(987654321);
		System.out.println("Calling inside the class: " + objEnc.getSSN());
	}

}
