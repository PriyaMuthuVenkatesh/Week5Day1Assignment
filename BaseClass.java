package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preConditions()
	{
		WebDriverManager.chromedriver().setup();

//		* 1	Launch the browser
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		* 2	Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

//		* 3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

//		* 4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@AfterMethod
	public void postConditions()
	{
		//close the browser
			driver.close();
	}
	

}
