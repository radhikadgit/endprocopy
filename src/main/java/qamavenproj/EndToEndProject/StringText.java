package qamavenproj.EndToEndProject;

public class StringText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String visitInformation="Outpatient Clinic @ 31.Oct.2023, 21:42:44";
		String str[] = visitInformation.split("\\@ ");
		System.out.println(str[0]);
		System.out.println(str[1]);
		String date[] = str[1].split("\\,");
		System.out.println(date[0]);
		System.out.println(date[1]);
		String dateSplit[] = date[0].split("\\.");
		System.out.println(dateSplit[0]);
		System.out.println(dateSplit[1]);
		System.out.println(dateSplit[2]);  
		
	//	String strInfor[] = str[1].split(" \\@ ").split(" \\. ");

	}

}
