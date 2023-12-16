package qamavenproj.EndToEndProject;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateExample {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.getDate());

		String futureDate   =getfutureDate(15,"MMMM/d/YYYY");
		System.out.println(futureDate.split("/")[0]);
		System.out.println(futureDate.split("/")[1]);
		System.out.println(futureDate.split("/")[2]);
		
	    String[] fDate = getfutureDate(12); 	
      //  System.out.println(fDate[0].split("/"));
      //  System.out.println(fDate[1]);
	    DateExample.getfutureDate(5);
	    
	    DateExample de = new DateExample();
	    de.currentTime();

	}
	public static String[] getfutureDate(int noofDays)
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,noofDays);
		System.out.println(cal.getCalendarType());
		System.out.println(cal.get(3));
		//String sc = cal.getDisplayName(12, 24, null);
	    //	System.out.println(sc);
		Date d  = cal.getTime();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String expected = sdf.format(d);
		String dateArr[] = expected.split("/");
		System.out.println(dateArr[0]);
		System.out.println(dateArr[1]);
		System.out.println(dateArr[2]);
		//System.out.println(sdf.getTimeZone());
		System.out.println("________________");
		return dateArr;
	}
	public static String getfutureDate(int count,String format)
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,count);
		Date d  = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String expected = sdf.format(d);
		System.out.println("format date: "+expected);
		System.out.println("__________________");
//		String dateArr[] = expected.split("/");
//		System.out.println(dateArr[0]);
//		System.out.println(dateArr[1]);
//		System.out.println(dateArr[2]);
		return expected;
	}
	
	public void currentTime() {
		Date dt = new Date();
		System.out.println(dt.getDate());
		System.out.println(dt.getDay());
		System.out.println(dt.getHours());

		Calendar cal1 = Calendar.getInstance();
	    Date d1 = cal1.getTime();
	    System.out.println(d1);
	    System.out.println("____________________");
	}
}


	


