package javaOOP2;

public class Java08thisKeyword {

	
	int a= 2;
	int result;
	public void GetData() {
		
		int a = 3;
		
		result = a + this.a;
		
		System.out.println("Sum of the local and global variable is: " + result);
		
		System.out.println(a);
		
		// This refers to current object - object lies into class level
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Java08thisKeyword tk = new Java08thisKeyword();
		tk.GetData();;
	}

}
