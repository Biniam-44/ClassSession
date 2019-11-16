package testng02Loans;

import org.testng.annotations.Test;

public class Testng01PersonalLoan {
	
	@Test
	public void WebLoginPersonalLoan() {
		
		System.out.println("I am logging into the personal Loan Web application");
	}
	
	@Test
	public void APILoginPersonalLoan() {
		
		System.out.println("I am logging into the personal Loan API");
	}
	
	@Test
	public void MobileLoginPersonalLoan() {
		System.out.println("I am logging into the personal Loan Moblie application");
	}
}
