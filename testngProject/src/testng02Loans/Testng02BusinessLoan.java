package testng02Loans;

import org.testng.annotations.Test;

public class Testng02BusinessLoan {

	@Test
	public void WebLoginBusinessLoan() {
		
		System.out.println("I am logging into the business Loan Web application");
	}
	
	@Test
	public void APILoginBusinessLoan() {
		
		System.out.println("I am logging into the business Loan API");
	}
	
	@Test
	public void MobileLoginBusinessLoan() {
		System.out.println("I am logging into the business Loan Moblie application");
	}
}
