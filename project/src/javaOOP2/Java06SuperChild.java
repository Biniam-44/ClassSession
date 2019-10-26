package javaOOP2;

public class Java06SuperChild extends Java07SuperParent {

	String name = "Getaneh";
	public void getStringData() {
		// By default java will give priority to the local variable
		System.out.println(name);
		
		//We can use the super keyword to call from the parent class
		System.out.println(super.name);
	}
	
	
	public void getData() {
		super.getData();
		System.out.println("Getting data from childClass");
	}
	
	public Java06SuperChild(){
		super();// It should be always on the first line 
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) {
		
		Java06SuperChild cd= new Java06SuperChild();
		
		cd.getStringData();
		cd.getData();

	}

}
