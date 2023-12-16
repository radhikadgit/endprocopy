package qamavenproj.EndToEndProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
        driver.findElement(By.xpath("//input[@name='givenName']")).sendKeys("Del");
      //driver.findElement(By.id("fr8726-field")).sendKeys("dot");
        driver.findElement(By.xpath("//input[@name='familyName']")).sendKeys("Old");
        driver.findElement(By.cssSelector("icon.fas.fa-chevron-right")).click();
        driver.findElement(By.xpath("//option[@value=\"F\"]")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("birthdateDay-field")).sendKeys("5");
       
        Select monthField = new Select(driver.findElement(By.id("birthdateMonth-field")));
        monthField.selectByIndex(2);
        
        driver.findElement(By.id("birthdateYear-field")).sendKeys("1990");
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("address1")).sendKeys("123");
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.cssSelector("i.icon-home")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul#breadcrumbs>li")));
		driver.findElement(By.cssSelector("ul#breadcrumbs>li")).click();
        driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")).click();
        driver.findElement(By.id("patient-search")).sendKeys("100KL1");
        driver.findElement(By.id("patient-search")).click(); 
        
        
	}

}
