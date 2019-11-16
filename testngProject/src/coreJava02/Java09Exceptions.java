package coreJava02;

public class Java09Exceptions {

	public static void main(String[] args) {
		
		int b= 7;
		
		int c = 0;
		int a[] = {1,2,3,4,5};
		
		int result;
		
		try {
			result = b/c;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("You can not divide zero by any number");
		}
		finally {
			
			System.out.println("No matter the code got exception I get executed");
		}
		
		
		try {
		
		System.out.println(a[5]);
		
		}

		catch(ArrayIndexOutOfBoundsException exe) {
			
			System.out.println("The array value you provided exceded the index that we have");
		}
		
		catch(ArithmeticException ex){
			
			System.out.println("You can not divide zero by any number");
			
		}
		
		// Unhandled exception
		catch(Exception e) {
			System.out.println("opps something went wrong");
			
		}
		
		finally {
			
			System.out.println("No matter the code got exception I get executed");
		}
		
		

	}

}
