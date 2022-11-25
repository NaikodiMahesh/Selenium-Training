package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Firstselenium2 {
	
	@Test
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Mahesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Naikodi");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("mahesh@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("mahesh@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Mahesh22@");
		Assert.assertTrue(true);
		
		//Thread.sleep(2000);
		WebElement dayDropdown=driver.findElement(By.name("birthday_day"));
		Select day=new Select(dayDropdown);
		day.selectByIndex(21);
		WebElement monDropDown=driver.findElement(By.name("birthday_month"));
		Select mon=new Select(monDropDown);
		mon.selectByIndex(1);
		WebElement yearDropDown=driver.findElement(By.name("birthday_year"));
		Select year=new Select(yearDropDown);
		year.selectByIndex(21);
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();	
		
			
	}

}
