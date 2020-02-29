package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn extends BaseTest{
	
@Test(priority=1)
public void test1() {
	System.out.println("test1 executed ");
	Assert.fail("wantedly failing");
}
@Test(priority=2,dependsOnMethods="test1",alwaysRun=true)
public void test2() {
	System.out.println("test2 executed ");
}
}
