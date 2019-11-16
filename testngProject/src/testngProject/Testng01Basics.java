package testngProject;

import org.testng.annotations.Test;

public class Testng01Basics {
	
	// Anything with @Test annotation testng assumes it as a test case
	// We can have only one test in Java but multiple test in one class in testng
	@Test
	public void FirstTestCase() {
		
		System.out.println("This is my first test case");
	}
	
	@Test
	public void SecondTestCase() {
		System.out.println("This is my second test case");
	}

}
