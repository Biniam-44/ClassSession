package coreJava02;

import java.util.Date;

import java.text.SimpleDateFormat;

public class Java01Dates {

	public static void main(String[] args) {
		
		Date dt = new Date();
		
		System.out.println(dt.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf.format(dt));

	}

}
