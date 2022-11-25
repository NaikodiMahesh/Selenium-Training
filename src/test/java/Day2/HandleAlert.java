package Day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert {
	
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
        
        Alert alt= wait.until(ExpectedConditions.alertIsPresent());
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//Alert alt=driver.switchTo().alert();
          String msg=alt.getText();
		
		if(msg.contains("Welcome to Selenium WebDriver Tutorials"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		alt.accept();
		Assert.assertTrue(true);
		//Alert element=driver.until(ExpectedConditions.alertIsPresent());
		
		//catch the alert and copy the alert and compare it conatins the word calle selenium
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		

	}

}
