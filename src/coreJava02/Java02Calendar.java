package coreJava02;

import java.text.SimpleDateFormat;
import java.util.Calendar;;
public class Java02Calendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy");
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		//System.out.println(c.get(Calendar.AM));
		
		// TODO Research on AM and PM Calendar formats
		System.out.println(c.get(Calendar.AM));

	}

}
