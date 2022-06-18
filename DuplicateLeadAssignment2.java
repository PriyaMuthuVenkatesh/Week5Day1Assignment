package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAssignment2 extends BaseClass {
	
	@Test

	public  void duplicateLead() throws InterruptedException {
	

	
		driver.findElement(By.linkText("CRM/SFA")).click();

		// click on leads
		driver.findElement(By.linkText("Leads")).click();

		// click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();

		// Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("pri@test.com");

		Thread.sleep(5000);
		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(5000);
		// Capture name of First Resulting lead
		String leadName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).getText();
		System.out.println("First Resulting lead is " +leadName);
		Thread.sleep(5000);

		// Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).click();
		Thread.sleep(5000);
		
		// Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		Thread.sleep(5000);
		
		// Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead"))
			System.out.println("Correct Title displayed");
		else
			System.out.println("Incorrect title displayed");

		Thread.sleep(5000);
		// Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		// Confirm the duplicated lead name is same as captured name
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (leadName.equalsIgnoreCase(firstName)) {
			System.out.println("duplicated lead name is same as captured name");
		} else
			System.out.println("duplicated lead name is not same as captured name");

		
	}

}
