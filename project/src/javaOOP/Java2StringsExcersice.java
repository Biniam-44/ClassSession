package javaOOP;

public class Java2StringsExcersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "madam";
		String n = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			
			n = n+ s.charAt(i);
			
		}
		System.out.println(n);
		System.out.println(s);
		if (s == n) {
			
			//TODO not working as expected
			System.out.println("YAY");
		}
		

	}

}
