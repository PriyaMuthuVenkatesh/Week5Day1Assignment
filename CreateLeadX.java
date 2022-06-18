package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadX extends BaseClass {
	
	@Test

	public  void createLead() {
	
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@name='companyName'][@class='inputBox']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@name='firstName'][@class='inputBox']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@name='lastName'][@class='inputBox']")).sendKeys("MV");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
