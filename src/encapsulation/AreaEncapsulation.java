package encapsulation;

public class AreaEncapsulation {

	// fields / data members
	private String house;
	private int sizeHouse;

	// Getter & Setter Methods for each of the fields/ data members

	// Getters
	public String getHouse() { // name of the method can be anything but in encapsulation (data hiding) we add
								// get word infront method
		return house;
	}

	int getSizeHouse() {
		return sizeHouse;
	}

	// Setters
	public void setHouse(String newHouse) {
		house = newHouse;
	}

	void setSizeHouse(int newSizeHouse) {
		sizeHouse = newSizeHouse;
	}

}
