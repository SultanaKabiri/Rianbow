package polymorphism;

public class MO {
	
	// Method Overloading
	
		public static int add (int x, int y) {
			return x + y; 
		}
		
		public static int add (int x, int y, int z) {
			return x + y + z; 
		}
		
		static double add (double x, double y) {
			return x + y; 
		}

		public static void main(String[] args) {
			// calling methods 
			
			System.out.println(MO.add(2, 5)); // 7
			System.out.println(MO.add(2, 5, 10)); // 17
			
			System.out.println(MO.add(2.5, 2.5)); // 5.0

		}


}
