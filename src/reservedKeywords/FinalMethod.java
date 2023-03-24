package reservedKeywords;

public class FinalMethod {
	
	// final method --> can not override final method 
		final void print() {
			System.out.println("This method is final!");
		}
		
		public static void main(String[] args) {
			
			// create object + calling the method inside the class
			
			FinalMethod fm = new FinalMethod ();
			fm.print();
		}


}
