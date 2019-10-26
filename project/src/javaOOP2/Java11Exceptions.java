package javaOOP2;

public class Java11Exceptions {
	
	
	
	// If we feel like our code is gonna throw and error we have to have an exception handling
	// try/catch mechanism
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b= 7;
		
		int c=0;
		
		int a[] = {1,2,3,5};
		
		
		
		try {
			int k = b / c;
			System.out.println(a);
			//System.out.println(k);
		}
		catch(ArithmeticException ex){
			
			System.out.println("Arithemetic Exception Catched");
			
		}
		catch(Exception e){
			
			System.out.println("UnKnown Exception Catched");	
		}
		
		// This block is executed Irrespective of an error catched or not
		finally{
			
			
			//Example browser.close in selenium
			//The only way that finally block will not be executed is when the JVM is force stoped
			System.out.println("Finally got executed");
			
		}

	}

}
