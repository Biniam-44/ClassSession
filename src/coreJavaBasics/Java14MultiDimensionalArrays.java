package coreJavaBasics;

public class Java14MultiDimensionalArrays {

	public static void main(String[] args) {
		/* 
		 2 4 5
		 
		 5 6 8
		 
		 * */
		
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 8;
		
		for (int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++) {
				//System.out.println(a[i][j]);
				
			}
			
		}
		
		int b[][] = {{1,4,5},{2,6,9}};
		for (int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++) {
				System.out.println(b[i][j]);
				
			}
			
		}

	}

}
