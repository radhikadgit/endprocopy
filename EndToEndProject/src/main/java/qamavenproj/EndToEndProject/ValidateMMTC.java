package qamavenproj.EndToEndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateMMTC {

	public static void main(String[] args) {
		
		validateTableData(3);

	}

	public static void validateTableData(int x) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		String actualCom = driver.findElement(By.xpath("//table[@class= 'dataTable']/tbody/tr[" + x + "]/td[1]/a"))
				.getText();
		System.out.println(actualCom);
		String expectedCom = "Jai Corp Ltd.";

		if (actualCom.trim().equals(expectedCom)) {
			System.out.println("TestCase Pass");
		} else {
			System.out.println("TestCase Fail");
		}

	}

}
