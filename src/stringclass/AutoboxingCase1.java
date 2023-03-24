package stringclass;

public class AutoboxingCase1 {
	
	// static method : generic data (parameterized data) wrapper class
	
		public static void method1 (Integer number) { // object 
			System.out.println("Number: " + number); // primitive 
		}

		// primitive data type 
		public  int  method2 (int num) {
			return num;
		}
		
		// reference type 
		public String method3 (String name) {
			return name; 
		}
		
		// Main
		public static void main(String[] args) {
			// Auto-boxing: Automatically from primitive to wrapper class
			
			method1(100); // Integer 
			method1(200);
			
			// primitive 
			AutoboxingCase1 o = new AutoboxingCase1 ();
			//o.method2(1);
			System.out.println(o.method2(10));
			
			//System.out.println("int num: " +o.method2(0));

		}

}
