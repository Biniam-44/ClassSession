package coreJavaBasics;

public class Java03Strings {

	public static void main(String[] args) {
		
		//One way to define a string the preferred way to use the string is this way
		String str = "Payment $100 paid ";
		System.out.println(str);
		
		//Second way to define a string
		String strg = new String("Payment $200 Paid ");
		System.out.println(strg);
		
		// It is used to get the character on the nth index
		char a = str.charAt(8);
		System.out.println(a);
		
		// It is used to get the index on the xyz character 
		int b = str.indexOf("$");
		System.out.println(b);
		
		// It is used to check if the character exists or not and it will return a boolean
		boolean c =str.endsWith("d");
		System.out.println(c);
		
		// It will convert the string value to all upercase
		String d =str.toUpperCase();
		System.out.println(d);
		
		String e  = str.toLowerCase();
		System.out.println(e);
		
		int f = str.length();
		System.out.println(f);
		
		

	}

}
