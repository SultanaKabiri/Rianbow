package encapsulation;

public class TestAreaEncasulation {
	
	public static void main(String[] args) {
		// object of the class  AreaEncapsulation
		
		AreaEncapsulation a = new AreaEncapsulation();
		
		// set the actual values
		a.setHouse("Falls Church, VA");
		a.setSizeHouse(3548);
		
		// display -- > getter methods
		System.out.println("House Location: " + a.getHouse());
		System.out.println("Size House: "+ a.getSizeHouse());

	}

}
