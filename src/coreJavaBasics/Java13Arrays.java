package coreJavaBasics;

public class Java13Arrays {

	public static void main(String[] args) {
		
		int a[] = new int[5]; // We declared an array and allocated memory for the values
		
		a[0] = 5;
		a[1] = 10;
		a[2] = 12;
		//a[3] = 7;
		//a[4] = 6;
		//a[5] = 8;
		
		//System.out.println(a[5]);
		
		for (int i =0; i <a.length; i++)
		{
			System.out.println("Array a values are: " + a[i]);
		}
		
		// This is our preffered way of declaring arrays
		int b[] = {1,4,6,3,8,10,12,23,24,254};
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("Array a values are: " + b[i]);
		}

	}

}
