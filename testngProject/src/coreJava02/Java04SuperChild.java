package coreJava02;

// TODO Can we use super keyword on a class level
public  class Java04SuperChild extends Java05SuperParent {

	String name = "Dagem";
	
	public void getStringData() {
		// We use the super keyword to pull the name variable from the parent class
		System.out.println(super.name);
		
		// By default it will give high priority for the local variable
		System.out.println(name);
	}
	
	public void getData() {
		// We use the super keyword to pull the getData method from the parent class
		super.getData();
		//System.out.println("I'm the GetData method from Child class");
	}
	public static void main(String[] args) {
		
		Java04SuperChild sc = new Java04SuperChild();
		
		sc.getStringData();
		sc.getData();
		

	}

}
