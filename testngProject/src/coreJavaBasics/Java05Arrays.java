package coreJavaBasics;

public class Java05Arrays {

	public static void main(String[] args) {
		
		// Arrays are a collection of objects
		
		int a[] = {1,2,4,6,8};
		int b = 0;
		
		System.out.println(a.length);
		
		for(int i=0; i<a.length;i++)
		{
			b = b+a[i];
			
		}
		System.out.print(b);

	}

}
