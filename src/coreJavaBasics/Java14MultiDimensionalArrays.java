package coreJavaBasics;

public class Java14MultiDimensionalArrays {

	public static void main(String[] args) {
		/* 
		 2 4 5 7
		 
		 5 6 8 9
		 
		 7 3 2 1
		 
		 * */
		
		int a[][] = new int[3][4];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 8;
		
		for (int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++) {
				//System.out.println(a[i][j]);
				
			}
			
		}
		
		int b[][] = {{1,4,5,7},{2,6,9,3},{1,4,8,6,}};
		for (int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++) {
				System.out.println(b[i][j]);
				
			}
			
		}

	}

}
