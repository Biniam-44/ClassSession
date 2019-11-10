package coreJavaBasics;

import coreJava02.*;

public class Java01Basics extends Java08AccessModifiers {

	public static void main(String[] args) {
		
		System.out.println("Myb  First Core Java Tutorial");
		
		// We decalare int data types for only whole numbers
		int firstNumber = 30;
		int secondNumber = 20;
		int result = 0;
		
		// We declare boolean data types for a values that holds true or false 
		Boolean value = true;
		
		result  = firstNumber + secondNumber;
		
		System.out.println("Result we get when we add two numbers" + " " + result);
		
		// We decalare float data types for only decimal numbers
		float firstNumberDivide = 30;
		float secondNumberDivide = 20;
		float resultDivide = 0;
		
		resultDivide  = firstNumberDivide/secondNumberDivide;
		
		System.out.println("Result we get when we divide two numbers" + " " +resultDivide);

		/* When we create an object the syntax is
		   ClassName name = new ClassName();
		*/
		Java02Methods method = new Java02Methods();
		method.ValidateURL();
		method.MethodWithParameter(100);
		method.MethodWithBolleanRetunType(false);
		System.out.println(method.ReturnStringMethod());
		Java08AccessModifiers am = new Java08AccessModifiers();
		am.PublicMethod();
		
		String name  = " \"Tom\" ";
		
		System.out.println(name);
		
	
	}

}

 
