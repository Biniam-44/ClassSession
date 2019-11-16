package coreJavaBasics;

public class Java02Methods {
	
	// This is a method with no Return type
	public static void ValidateURL() {
		
		System.out.println("The URL validated is google.com");
	}
	
	// This is a method with integer return type
	public static int ReturnIntMethod() {
		
		return 2;
	}
	
	// This is a method with string return type
	public static String ReturnStringMethod() {
		
		return "I'm returning a string value";
	}
	
	// This is a method with Boolean Return type
	public static boolean ReturnBooleanValue() {
		return false;
	}
	
	// This is a method with an integer parameter
	public static void MethodWithParameter(int a) {
		
		System.out.println("My passed value is" + a);
	}
	
	// This is a method with a Boolean parameter
	public static boolean MethodWithBolleanRetunType(boolean value) {
		
		System.out.println("My Checkbox value is: " + value);
		return  value;
	}
	

}
