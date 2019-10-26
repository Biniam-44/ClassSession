package javaOOP;

public class Java1Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// One way to define string / preferred one 
		String str =  "Payment $100 paid";
		
		// Other way to define string by creating an object of string class
		String strg = new String("Payment $100 paid");
		
		// To find the letter at the 8th index 
		char a = str.charAt(8);
		System.out.println(a);
		
		// To find the index where $ is found
		int b = str.indexOf("$");
		System.out.println(b);
		
		//Validate if the letter endswith exists and return true or false
		boolean c = str.endsWith("d");
		System.out.println(c);
		
		// Method to change the string all to upper case
		String d = str.toUpperCase();
		System.out.println(d);
		
		String e = str.substring(8);
		System.out.println(e);
		

	}

}
