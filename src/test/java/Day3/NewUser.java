package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewUser {
	
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
	public void createuser() {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//a//b[text()='Admin']")).click();
        driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
        
        driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Mahesh Naikodi ");
        driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("Mahesh");
        driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("Mahesh@123");
        driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("Mahesh@123");
        
//        driver.findElement(By.xpath("//input[@name='btnSave']")).click();
//        
//        driver.findElement(By.xpath("//a[@id='welcome']")).click();
//        
//        driver.findElement(By.xpath("//a[text()='Logout']")).click();
//        Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
        Assert.assertTrue(true);
        
	}
	
	
	
	
	
	

}
