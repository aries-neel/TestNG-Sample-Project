package parametrization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="getData")
	public void doLogin(String username ,String password) {
		
		System.out.println(username +""+ password);
		
	}
	
	@DataProvider
	public  Object[][]getData(){
		Object [][] data=new Object[2][2];
		data[0][0]="neelmani";
		data[0][1]="mani";
		data[1][0]="Singh";
		data[1][1]="neel";
		
		return data;
		
	}
	

}
