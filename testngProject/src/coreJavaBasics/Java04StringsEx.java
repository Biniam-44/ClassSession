package coreJavaBasics;



public class Java04StringsEx {

	public static void main(String[] args) {
		
		String name = "madam";
		String reverse ="";
		
		for(int i = name.length()-1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
		System.out.println(name);
	}

}
