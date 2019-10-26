package javaOOP;

public class Java8InterfaceImplementation implements Java7InterfaceBankClient,Java9InterfaceDomainClient {

	
	// It's this classes responsibility to implement all the methods of the interface
	
	
	public void payCreditCard() {
		System.out.println("Pay Credit card is implemented");
	}

	public void transferBalance() {
		System.out.println("Transfer balance is implemented");
	}

	public void checkBalance() {
		System.out.println("Check Balance is implemented");
	}
	public void GetDomainClient() {
		System.out.println("Domain Client IS Implemented");
	}
	public void login() {
		System.out.println("Login is sucessfull");
	}
	public static void main(String[] args) {
		
		Java8InterfaceImplementation im = new Java8InterfaceImplementation();
		im.checkBalance();
		im.payCreditCard();
		im.transferBalance();
		im.login();
		im.GetDomainClient();
		
		// Runtime polymorphism it will only return methods from the Interface client
		Java7InterfaceBankClient bc = new Java8InterfaceImplementation();
		bc.checkBalance();
		bc.payCreditCard();
		bc.transferBalance();
		
		Java9InterfaceDomainClient dc = new Java8InterfaceImplementation();
		dc.GetDomainClient();
		
	}

}
