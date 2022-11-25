package day4;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.out.println("running before method-creating browser");
		driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@AfterMethod
	public void tearnow() {
		driver.quit();
		System.out.println("runnning after method");
	
	
	}
	
	@Test(dataProvider="testdata")
	public void logintest(String username,String password) {
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    Assert.assertEquals(driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).getText(),"Sign out");
	
	}
	
	@DataProvider(name="testdata")
	public Object[][] testDataGeneration(){
		
	
		Object [][]arr1=new Object[4][2];
		ExcelToObject c=new ExcelToObject();
		arr1=c.testDataProvider().clone();
//		arr[0][0]="samplemukesh1@gmail.com";
//		arr[0][1]="Mukesh1234";
//		arr[1][0]="samplemukesh@gmail.com";
//		arr[1][1]="Mukesh1234";
//		arr[2][0]="samplemukesh2@gmail.com";
//		arr[2][1]="Mukesh1234";
//		arr[3][0]="sample9@gmail.com";
//		arr[3][1]="Mukesh1234";
		
		return arr1;
	}
		
		
		
	}


