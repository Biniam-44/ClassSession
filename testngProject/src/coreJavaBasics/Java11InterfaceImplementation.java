package coreJavaBasics;

public class Java11InterfaceImplementation implements Java10BankInterfaceClient , Java12DomainClientInterface  {
	
	// It's the class responsibility to implement all the methods inside the interface
	public void payCreditCard() {
		
		System.out.println("Pay Credit Card is implemented");
		
	}
	
	public void transferBalance() {
		
		System.out.println("Transfer Balance is implemented");
		
	}
	
	public void checkBalance() {
		
		System.out.println("Check Balance is implemented");
		
	}
	
	public void Login() {
		System.out.println("Login is sucessfull");
	}
	
	public void GetClientDomain() {
		System.out.println("Client Domain is implemented");
	}

	public static void main(String[] args) {
		
		Java11InterfaceImplementation implement  = new Java11InterfaceImplementation();
		implement.checkBalance();
		implement.transferBalance();
		implement.payCreditCard();
		implement.Login();
		implement.GetClientDomain();
		
		
		Java10BankInterfaceClient imp = new Java11InterfaceImplementation();
		imp.checkBalance();
		imp.transferBalance();
		imp.payCreditCard();
		
		Java12DomainClientInterface im = new Java11InterfaceImplementation();
		im.GetClientDomain();
	

	}

}
