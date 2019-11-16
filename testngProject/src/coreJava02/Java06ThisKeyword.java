package coreJava02;

public class Java06ThisKeyword {

	int a = 3;
	
	public void GetData() {
		
		// It will give a priority for the variable inside the method
		int a= 10;
		
		// this keyword will give a priority for the class variable
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		
		Java06ThisKeyword kw = new Java06ThisKeyword();
		kw.GetData();

	}

}
