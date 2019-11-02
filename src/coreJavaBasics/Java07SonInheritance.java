package coreJavaBasics;

// We use the extends keyword to inherit from the class we want
public class Java07SonInheritance  extends Java06GFInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java07SonInheritance gf = new Java07SonInheritance();
		
		System.out.println(familyName);
		gf.City();
		gf.State();
		gf.Country();
		gf.BedRoom();
		
		Java06GFInheritance fg = new Java07SonInheritance();
		//fg.bed
		

	}
	
	public void BedRoom()
	{
		System.out.println("I'm sharing my bed room with my son");
	}
	

}
