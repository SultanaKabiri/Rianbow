package wrapperclass;

public class Example1 {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// Primitive data type: predefined, size value, type of starts with lower case
		int i = 10; 
		float f = 10.5f; 
		double d = 45.201; 
		byte b = 123; 
		
		
		// Wrapper: crating instance (object) of the primitive data type (Start with upper case letter Integer, Boolean) 
		// Class: prototype, sketch, blueprint, design 
		// object: is an instance/sample of the class 
		
		Integer iObj = new Integer (i);
		Float fObj = new Float (f);
		Double dObj = new Double (d);
		Byte bObj = new Byte (b);
		
		System.out.println("Value as an Integer object: " + iObj);
		System.out.println("Value as an Float object: " + fObj);


	}

}
