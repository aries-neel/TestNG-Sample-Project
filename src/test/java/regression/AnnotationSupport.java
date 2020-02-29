package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSupport {
	
	
	@BeforeTest
	public void connectingDB() {
		System.out.println("connecting to DB  ");
		
	}
	
	@BeforeMethod
	public void launchinBrowser() {
		System.out.println("launchinBrowser  method");
		
	}
	
	
	@Test(priority=2)
	public void doLogin() {
		System.out.println("executing login method");
		
	}
	
	
	@Test(priority=1)
	public void doRegistration() {
		System.out.println("executing Registration method");
		
	}
	
	@AfterMethod
	public void closingBrowser() {
		System.out.println("closingBrowser  method");
		
	}
	@AfterTest
	public void closingDB() {
		System.out.println("closingDB   ");
		
	}
	
	
	
	

}
