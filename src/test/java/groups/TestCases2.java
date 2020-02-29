package groups;

import org.testng.annotations.Test;

public class TestCases2 {
	
	@Test(groups= {"bvt"})
	public void test1() {
	System.out.println("test case test1 executed");	
	}
	@Test(groups= {"functional"})
	public void test2() {
		System.out.println("test case test2 executed");	
	}
	@Test(groups= {"smoke"})
	public void test3() {
		System.out.println("test case test3 executed");	
	}
}
