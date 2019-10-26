package javaOOP2;

public class Java09finalKeyWord {
// If we mark class name as final we can not extend that class
// 	
	 final  void GetData() {
		System.out.println("Method with final keyword");
	}
	
	public void GetData(int i, int j ) {
		System.out.println("Method with parameter keyword");
	}
	
	public static void main(String[] args) {
		
		final int i = 4;// We will assign our property as final if we don't want it to be changed anywhere
		//i= 8;
		
		Java09finalKeyWord fk = new Java09finalKeyWord();
		fk.GetData();
		fk.GetData(1,3);
		
		

	}

}
