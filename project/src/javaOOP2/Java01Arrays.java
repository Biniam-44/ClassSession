package javaOOP2;

public class Java01Arrays {

	public static void main(String[] args) {
	
		// Array is a container which stores multiple values of same data type
		
		int a[] = new int[5]; // Declares an array and allocated memory for the values
		
		a[0] = 5;
		a[1] = 8;
		a[2] = 9;
		a[3] = 10;
		a[4] = 4; // Initialized values into the array
		
		for (int i =0; i < a.length; i++) {
			System.out.println("Array A values: "  + a[i]); // Retrieve values present in the array
		}
		
		int b[] = {1,4,8,6,5,8};// We're allocating both memory and assign values the preferred way  
		
		for(int i = 0; i <b.length; i++) {
			System.out.println("Array B values: " + b[i]);
		}
		
	}

}
