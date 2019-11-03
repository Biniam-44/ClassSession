package coreJava02;

public  class Java07FinallyKeyword {
	
	 int b = 6;
	
	public final void GetData() {
		System.out.println("Method with final keyword");
	}
	
	public void GetData(int a) {
		System.out.println("Method without final keyword");
	}
	public static void main(String[] args) {
		
		 int a = 4;
		
		a=4;
		Java07FinallyKeyword fk = new Java07FinallyKeyword();
		fk.b = 8;	//b=8;
		fk.GetData(4);
		
		
		System.out.println(a);
		
		Java08AccessModifiers am = new Java08AccessModifiers();
		am.ProtectedMthod();
	}

}
