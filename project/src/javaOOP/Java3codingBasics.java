package javaOOP;

import java.util.Arrays;

public class Java3codingBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Array is a collection of objects
		// Lets sum the numbers in this array
		int a[] = {2,3,4,5,6};
		
		int b = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			b = b + a[i];
			System.out.println(b);
		}
		
		System.out.println("Second Time " + b);
		
		
		// Exercise Print the index of the desired number
		
		// Solution 1
		int z[] = {7,8,4,6,2,3,6};
		
		for(int i = 0; i < a.length; i++)
		{
			if (z[i] == 6) {
				System.out.println("Index of is " + i);
			}
			
		}
		
		// Solution 2
		int y[] = { 7, 8, 4, 2, 3, 6 };

		for (int i = 0; i < a.length; i++) {
			if (y[i] == 4) {
				System.out.println("Index of second solution is " + i);
				break;
			}
		}
		// Solution 2 break demo
		int x[] = { 7, 8, 4, 2, 3, 6 };

		for (int i = 0; i <= a.length; i++) {
			System.out.println("Value of x is " +x[i]);
			if (x[i] == 4) {
				
				//break;
			}

		}
		
	}

}
