package qamavenproj.EndToEndProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenUrl {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal");
		String url = driver.findElement(By.xpath("//a[@id='error-information-button']")).getAttribute("id");
		
		// use java methods to fetch the status code
		  HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

          conn.setRequestMethod("HEAD");

          conn.connect();

          int respCode = conn.getResponseCode();

          System.out.println(respCode);
		
	}

}
