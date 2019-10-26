package javaBasics;

public class Javabasics1 {

	
	//Whenever we start execution the control will start executing the code from here 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This step is to print as an output
		System.out.println("Hey My First Automation Testing");
		
		
		// Add 2 numbers
		
		int firstNumber = 10;
		int secondNumber = 20;
		int result;
		
		result = firstNumber + secondNumber;
		
		System.out.println(result);
		
		// Call Validate Header method
		
		JavaBascis2 header = new JavaBascis2();
		
		header.ValidateHeader();
		System.out.println(header.ReturnValue());
		System.out.println(header.ReturnFromParameter(65));

	}

}
