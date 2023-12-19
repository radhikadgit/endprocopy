package qamavenproj.EndToEndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginFacebk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		 WebElement txtUsername = driver.findElement(By.id("email"));

			Actions builder = new Actions(driver);
			//Object Keys;
			//Object SHIFT;
			Action seriesOfActions = builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, org.openqa.selenium.Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.keyUp(txtUsername, org.openqa.selenium.Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick()
				.build();
				
			seriesOfActions.perform() ;

		
		
		
	}

}
