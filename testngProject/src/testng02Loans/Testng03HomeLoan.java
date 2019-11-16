package testng02Loans;

import org.testng.annotations.Test;

public class Testng03HomeLoan {

	@Test
	public void WebLoginHomeLoan() {
		
		System.out.println("I am logging into the home Loan Web application");
	}
	
	@Test
	public void APILoginHomeLoan() {
		
		System.out.println("I am logging into the home Loan API");
	}
	
	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("I am logging into the home Loan Moblie application");
	}
}
