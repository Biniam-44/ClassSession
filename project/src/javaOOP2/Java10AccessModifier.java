package javaOOP2;

public class Java10AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Default variable
	int i = 3;
	
	//Public variable
	public int x = 4;
	
	// Protected variable
	protected int y = 5;
	
	// Private variable
	private int z = 7;
	
	// It's a default method with no access modifier which can be accessed through classes across the package
	void defaultMethod() {
		
	}
	
	// If we assign our method as a public it can be accessed from anywhere in the project
	public void publiMethod() {
		
	}
	
	// If we assign our method as a private we cannot access it outside the class
	private void privateMethod() {
		
	}
	
	// If we assign our method as protected it can be accessed from the sub classes / the classes which inherited the class (applies to other packages)
	protected void protectedMethod() {
		
	}

}
