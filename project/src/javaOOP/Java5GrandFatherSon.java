package javaOOP;

public class Java5GrandFatherSon extends Java4GrandFatherInheritance {

	public static void main(String[] args) {
		
		Java5GrandFatherSon gfs = new Java5GrandFatherSon();
		gfs.City();
		gfs.Country();
		System.out.println(gfs.s);
		System.out.println("Fathers Last Name is: " + gfs.familyName);
	}
	String fathersName = "John";
	
	public void SonActivities() {
		System.out.println("Soccer");
		System.out.println("Swimming");
	}
	
	public void SonSchool() {
		System.out.println("Technocraft");
	}
	
	

}
