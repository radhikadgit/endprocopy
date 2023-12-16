package qamavenproj.EndToEndProject;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScheduleAppointment {
	
	WebDriver driver;
	
	@Test
	public void validateScheduleAppointment() {
		
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).click();	
		//driver.findElement(By.xpath("//span[contains(text(),'Schedule Appointment')]")).click(); //for reusabulity put in a method
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//calling the navigateToModule method
		navigateToModule("Schedule Appointment");
		driver.findElement(By.cssSelector("input[value='Create new appointment']")).click();
		driver.findElement(By.xpath("//h4[contains(text(),'Dr.Charlie')]/ancestor::ul/following-sibling::button")).click();
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/17/2023");
		driver.switchTo().frame("myframe");
		//Date Func
		Calendar cal = Calendar.getInstance();
		cal.add(cal.DATE, 2);		
		Date d  = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String date = sdf.format(d);
		System.out.println(date);
		
		//Interacting elements in the Frame
		driver.findElement(By.id("datepicker")).sendKeys(date);
		
		System.out.println(date);
		String dateArr[] = date.split("/");
		System.out.println(dateArr[1]);
		driver.findElement(By.linkText(dateArr[1])).click();
		
		WebElement e = driver.findElement(By.id("time"));
		e.click();
		Select timeSelect = new Select(e);
		timeSelect.selectByVisibleText("12Pm");
		driver.findElement(By.id("ChangeHeatName")).click();
		
//		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
//	     WebElement givenNameWE=
//	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("sym")));		
//		 givenNameWE.sendKeys("Fever");
		 driver.findElement(By.name("sym")).sendKeys("cough");
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 
	//	 String dateOfAppointment = Utility.getFutureDate(20);   create utility class globally
		
	}
	
	public void navigateToModule(String moduleName)
	{
		System.out.println(moduleName);
		driver.findElement(By.xpath("//span[contains(text(),'"+moduleName+"')]")).click();
	}

}
