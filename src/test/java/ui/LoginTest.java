package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application");
	}
	
	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logut to application");
	}
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB connected");
	}
	
	@AfterMethod
	public void disconnectToDB() {
		System.out.println("DB disconnected");
	}
	
	
	@Test(priority =1, description ="This is Login Test")
	public void aTest1() {
		System.out.println("Test1");
	}
		
	@Test(priority =2, description ="This is Logout Test")
	public void bTest2() {
		System.out.println("Test2");
	}	
		
		

}
