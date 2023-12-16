package qamavenproj.EndToEndProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderClass {
	
	@Test(dataProvider = "driveTests")
	public void testCaseData(String str1, String str2, int integer) {
		
		System.out.println(str1+str2+integer);
	}
	
	@DataProvider(name = "driveTests")
	public Object[][] getData() {
		
		Object[][] data = {{"hello","dataProvider",1},{"object","excel",123},{"sel","obj",456}};
		return data;
	}
	
	
	
	
	

}
