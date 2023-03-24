package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// calling methods in polymorphism
		System.out.println(" a * b : " + MethodOverloading.multiply(2, 5));

		System.out.println("a * b * c : " + MethodOverloading.multiply(2, 5, 10));

		System.out.println("a * b in double: " + MethodOverloading.multiply(2.5, 5.5));

	}

	// Polymorphism -- > 1. Method overloading (compile time polymorphism)

	// 1st Method
	static int multiply(int a, int b) {
		return a * b;
	}

	// 2nd Method
	static int multiply(int a, int b, int c) {
		return a * b * c;
	}

	// 3rd method
	static double multiply(double a, double b) {
		return a * b;
	}

	// same method
	static double multiply(double a, double b, double c) {
		return a * b * c;
	}

	// Object: 1. State --> data field, variable 2. behavior --> methods

}
