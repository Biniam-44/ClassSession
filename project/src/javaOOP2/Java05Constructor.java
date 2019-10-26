package javaOOP2;

public class Java05Constructor {
	
	// Default Constructor
	public Java05Constructor() {
		System.out.println("I am the constructor");
	}
	
	//Parameterized Constructor
	public Java05Constructor(int a, int b) {
		System.out.println("I am the Parametrized constructor");
	}
	public Java05Constructor(String str) {
		System.out.println("I am the String Parametrized constructor " + str);
	}
	public void getData() {
		System.out.println("I am the method");
	} 

	public static void main(String[] args) {
		
		
		// Constructor will not return a value
		// Name of the constructor is always the same with the class name
		// If a Constructor is created the compiler will call the deafult constructor 
		//Always execute a block of code when ever an object is created
		Java05Constructor cd = new Java05Constructor();
		
		//Creating an object with parameter
		Java05Constructor cdp = new Java05Constructor(4,5);
		
		Java05Constructor cdsp = new Java05Constructor("Hello");

	}

}
