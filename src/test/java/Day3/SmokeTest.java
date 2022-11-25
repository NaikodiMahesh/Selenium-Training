package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.out.println("running before method-creating browser");
		driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		
	}
	
	@AfterMethod
	public void tearnow() {
		driver.quit();
		System.out.println("runnning after method");
	}

	@Test
	public void Url() {
		Assert.assertTrue(true);
	}
	
	

}
