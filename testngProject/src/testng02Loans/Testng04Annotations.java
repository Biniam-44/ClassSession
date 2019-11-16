package testng02Loans;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng04Annotations {
	

	 
	@Test
	public void Method1() {
		System.out.println("I am method 1");
		
		
	}
	
	@Test
	public void Method2() {
		System.out.println("I am method 2");
	}
	
	@Test
	public void Method3() {
		System.out.println("I am method 3");
		
	}
	
	@Test
	public void Method4() {
		System.out.println("I am method 4");
	}
	
	// It will execute before all methods on the test folder
	  @BeforeTest 
	public void BeforeTest1() 
	{ 
		  System.out.println("I ran before any test excution starts"); 
	}
	  
	// It will execute after all methods on the test folder
	  @AfterTest
	  public void AfterTest1() {
		  System.out.println("I ran after all test excecution ends");
	  }
	  
	// It will execute before all methods on the class
	  @BeforeClass
	  public void BeforeClass1() {
		  System.out.println("I ran before the class execution starts");
	  }
	// It will execute after all methods on the class
	  @AfterClass
	  public void AfterClass1() {
		  System.out.println("I ran after the class execution starts");
	  }
	  
	  @BeforeMethod
	  public void BeforeMethod1() {
		  System.out.println("I ran before every method executes");
	  }
	  
	  @AfterMethod
	  public void AfterMethod1() {
		  System.out.println("I ran after every method executes");
	  }
	  
	  @BeforeSuite
	  public void BeforeSuite1() {
		  System.out.println("I ran before everything");
	  }
	  
	  @AfterSuite
	  public void AfterSuite1() {
		  System.out.println("I ran after everything");
	  }

}
