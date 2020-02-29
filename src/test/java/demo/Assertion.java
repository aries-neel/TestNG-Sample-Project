package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends BaseTest {
	
	
	@Test
	public void titleValidation() {
		String actual_title="yahoo.com";
		String expected_title="gmail.com";
		
		/*by using if else we cant report the failing or passing of the testcase 
		 * 
		 * 
		 * if(actual_title.equals(expected_title))
		{
			System.out.println("test case is pass ");
		}
		else {
			System.out.println("test case is fail ");
		}*/
		//Assert.assertEquals(actual_title, expected_title);
		Assert.fail("wantedly failed");// this is overloaded method 
	}

}
