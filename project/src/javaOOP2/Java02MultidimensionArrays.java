package javaOOP2;

public class Java02MultidimensionArrays {

	public static void main(String[] args) {
		
		//Multidimensional array 
		
		/* 
		 2  4  5
		 
		 5  6  8
		  
		 */
		
		// First way to decalre multidimentional array
		int a[][] = new int[2][3];
		
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 8;
		
		//System.out.println(a[1][2]);	
		
		for (int i = 0; i < 2; i++ ) {
			
			for (int j =0; j < 3; j++) {
				
				System.out.println(a[i][j]);
			}
			
		}
		
		//Second way to decalre multidimensional array
		int b[][] = {{1,4,5},{5,6,8}};
		
		
	}

}
