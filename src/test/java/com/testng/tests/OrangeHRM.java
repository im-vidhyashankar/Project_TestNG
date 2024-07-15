package com.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	@Test
	public void LaunchApp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void EnterLoginDetails() throws Exception{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void NavigateToMyInfo() throws Exception{
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
		Thread.sleep(3000);

	}
	
	@Test
	public void VerifyMyInfo() throws Exception {
		System.out.println(driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void VerifyLogin() {
		WebElement element = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
	}
}