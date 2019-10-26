package javaOOP2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Java04Calendar {

	public static void main(String[] args) {

	 Calendar c = Calendar.getInstance();
	 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	 System.out.println(sdf.format(c.getTime()));
	 System.out.println(c.get(Calendar.DAY_OF_MONTH));
	 System.out.println(c.get(Calendar.DAY_OF_YEAR));
	 System.out.println(c.get(Calendar.AM_PM));
	 

	}

}
