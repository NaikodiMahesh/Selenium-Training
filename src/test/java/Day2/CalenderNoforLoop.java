package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalenderNoforLoop {
	
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		driver.findElement(By.xpath("//a[text()='24']")).click();
		//List<WebElement> allele=driver.findElement(null)
		Assert.assertTrue(true);

	}

}
