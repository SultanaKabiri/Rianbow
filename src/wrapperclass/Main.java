package wrapperclass;

public class Main {
	
	public static void main(String[] args) {
		/*
		 
		 Primitive Type     -->     Wrapper Class (object) : 1. Auto-boxing  2. Un-boxing
		 boolean 					Boolean, Character, Byte, Short, Integer, Long, Float, Double
		 char
		 int
		 float 
		 
		 
		 
		Return to Wrapper Class: type_of_primitive_value
		 
		 --> Attribute: object (state, behavior) 
		 */
		
		// byte 
		byte b = -128; // 1 byte size: -128 up to 127
		
		// Auto boxing 
		int number = 110; 
		System.out.println("Number: " + number);
		
		// An object
		Integer objInt = Integer.valueOf(number);
		System.out.println("Object int: " +objInt);
		
		// Float
		float f = 1.5f; 
		Float objF = Float.valueOf(f); 
		System.out.println("Object F: " + f);
		
		// Class --> Library JRE : object 
		// Scanner, Math, Main
		
		// Object --> primitive data type : Converting wrapper class object into primitive data type
		
		// object: Unboxing 
		Integer obj = new Integer (100);
		System.out.println("Integer Class: " +obj);
		
		// Convert the object --> primitive
		int num = obj.intValue();
		System.out.println("Num: " +num);
		
		
		
		Integer i = 100;
		int in = i.intValue();
		System.out.println("primitive int: "+in);
		
		Double d = new Double (1.5); // object 
		System.out.println("Wrapper Clas Double: " +d);
		double d_primitive = d.doubleValue(); // primitive double data type 
		System.out.println("double primitive: " +d_primitive);
		
		
		Boolean b1 = true; 
		Character c = 'a';
		
	}

}
