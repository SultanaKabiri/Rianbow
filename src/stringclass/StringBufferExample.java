package stringclass;

public class StringBufferExample {

	public static void main(String[] args) {
		// 1. mutable --> changeable 
		// StringBuffer --> sequence of the characters 
		// Thread - safe 
		// object --> new StringBuffer Class 
		// Both StringBuffer and StringBuilder has methods to use it directly 
		
		// Class --> coming JRE System Library
		StringBuffer str = new StringBuffer ("Hello"); // Hello --> 5 characters 
		System.out.println("String: " +str);
		
		// size 
		int length = str.length(); // size 
		System.out.println("String Length: " + length);
		
		//Method --> .capacity ()
		int capacity = str.capacity(); // numbers
		System.out.println("String Capacity --> : " +capacity);
		
		 // beginning capacity of StringBuffer is 16 and whatever you store will shift to right plus actual literal values
		StringBuffer c = new StringBuffer("");
		int cap = c.capacity();
		System.out.println("Size String C: "+cap );
		
		//Method --> .append()
		str.append(" Rainbow"); 
		System.out.println("String with Append: " +str);
		
		// Mehtod --> .insert()
		System.out.println("String Size: " + str.length());
		str.insert(0, "h"); 
		System.out.println(str);
		
		// .delete ()
		// deleting the lower case h
		str.delete(0, 1);
		System.out.println(str);
		
		// deleting the upper case H
		str.delete(0, 1);
		System.out.println(str);
		
		// add lower h at the beginning 
		str.insert(0, "h"); 
		System.out.println(str);
		System.out.println(str.length());
		
		
		// Other methods 
		
		str.replace(10, 13, " Test");
		System.out.println(str);
		
		StringBuffer t = new StringBuffer("Java"); // JavA
		System.out.println("Java character: " + t.length());
		
		t.replace(3, 4 ,"A") ;
		System.out.println(t);
		
	}
}
