package stringclass;

public class StringExample {

	// String: It is a sequence of character which come from the reference class and
	// also modified literal values
	// immutable --> not changeable

	// Memory of java --> Hello: str2

	public static void main(String[] args) {
		String str1 = "Hello"; // 0111
		String str2 = "hello"; // str2 --> 0122

		if (str1 == str2) {
			System.out.println("Str1 & Str2 is equal");
		} else {
			System.out.println("Str1 & Str2 is NOT equal");

		}

		// 2. store literal values with new keyword --> object

		String str3 = new String("Hello"); // str3 --> 01112
		String str4 = new String("Hello");

		if (str3.equals(str4)) {
			System.out.println("Str3 & Str4 is equal");
		} else {
			System.out.println("Str3 & Str4 is NOT equal");

		}

		// another example
		// String name = "Ahmad";
		String name = new String("Ahmad");
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.toUpperCase());

		// Instance Variable and Object
		String instance_variable = "Object"; // address --> 1457

		// Object : state, behavior

		// State --> Instance variable/ data members / fields

		String object = new String("Object"); // address --> 1457

		if (instance_variable.equals(object)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		// String Example
		String n = "A";
		String n3 = " B";
		String r = n + n3;
		String n1 = new String("A");
		System.out.println("N String size: " + n.length());
		System.out.println("n1 String size: " + n1.length());

	}

}
