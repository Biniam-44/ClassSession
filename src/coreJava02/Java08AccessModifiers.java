package coreJava02;

// TODO Research the difference between default and protected access modifiers 
public class Java08AccessModifiers {
	
	// If a method is public it can be accessed through out the project
	public void PublicMethod() {
		System.out.println("I am the public method of Java08AccessModifiers Class");
	}
	
	// If a method is private it can only be accessed inside the class
	private void PrivateMethod() {
		System.out.println("I am the Private method of Java08AccessModifiers Class");
	}
	
	// It can only be access from subclasses / the class which inherited the parent class
	protected void ProtectedMthod() {
		System.out.println("I am the protected method of Java08AccessModifiers Class");
	}
	
	// It can only be accessed from the classes inside the package
	void DefaultMethod() {
		System.out.println("I am the default method of Java08AccessModifiers Class");
	}

	public static void main(String[] args) {
		Java08AccessModifiers am = new Java08AccessModifiers();
		am.PrivateMethod();

	}

}

