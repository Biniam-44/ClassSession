package javaOOP2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JAva03Date {

	public static void main(String[] args) {
		
		//Get Current Date and Current Time
		Date dt = new Date();
		System.out.println(dt.toString());
		
		// Get date and time in a preferred format
		// Example of different date formats
		// http://tutorials.jenkov.com/java-date-time/parsing-formatting-dates.html
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(dt));
		
	}

}
