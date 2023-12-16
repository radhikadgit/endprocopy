package javaOopsCode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FutureDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FutureDate.getFutureDate(2,"MM/d/yyyy");
		FutureDate.getFutureDate(0,"MMMM/d/yyyy");

	}
	
	public static String getFutureDate(int days, String pattern) {
		//int cal = Calendar.DATE;
		Calendar cal = Calendar.getInstance();
	//	Calendar cal1 = Calendar.getInstance();
		cal.add(cal.DATE, days);
		Date d = cal.getTime();
		SimpleDateFormat stf = new SimpleDateFormat(pattern);
		String date = stf.format(d);
		System.out.println(d);
		System.out.println(date);
		return date;
	}
	

}
