package javaOOP;

public class Java6GrandSon extends Java5GrandFatherSon{

	public static void main(String[] args) {
		
		Java6GrandSon gs = new Java6GrandSon();
		
		//Inherited from Grand Father
		System.out.println("Grand Sons family name is: " + gs.familyName);
		
		// Inherited from father
		System.out.println("Grand Sons father's name is: " + gs.fathersName);
		
		//Inherited from Grand Father
		gs.City();
		
		//Inherited from Grand Father
		gs.Country();
		
		//Inherited from Father
		gs.SonActivities();
		
		//Inherited from Father
		gs.SonSchool();
	}

}
