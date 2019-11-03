package coreJava02;

public class Java03Constructors {
	
	
	
	// Constructor is always called at the creation of the object
	//Constructor have no return type
	//Default Constructor
	public Java03Constructors() {
		System.out.println("I'm the Constructor Class");
	}
	
	//Parametrized Constructor
	public Java03Constructors(int a) {
		System.out.println("I'm the constructor with the parameter " + a);
	}
	int result; 
	public Java03Constructors(int a, int b) {
		result = a + b;
		System.out.println("I'm the constructor with the parameter " + result);
	}
	
	public Java03Constructors(String a) {
		
		System.out.println("I'm the parametrized String Constructor: " + a);
		
	}
	
	public Java03Constructors(boolean a) {
		
		System.out.println("I'm the parametrized Boolean Constructor: " + a);
		
	}
	
	public void JavaMethod() {
		System.out.println("I'm the method not the Constructor");
	}
	
	public void JavaMethod(int a) {
		System.out.println("I'm the method with integer parameter not the Constructor");
	}

	public static void main(String[] args) {

		// We call the constructor when we create the object
		Java03Constructors jc = new Java03Constructors(false);
		// We have to call the method by the object we created
		//jc.JavaMethod(2);

	}

}
