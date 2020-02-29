package demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {
	
	/*this will acts as the base/ parent for all the classes which contains test fixtures methods */
	
    @BeforeSuite
	public void setUp() {
		System.out.println("Initlizing everything");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Quitting  everything");
	}
	
}
