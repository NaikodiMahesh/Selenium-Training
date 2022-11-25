package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSelenium {
	
	
	@Test
	
	public static void main(String[] agrs) throws InterruptedException {
		
	
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://ineuron-courses.vercel.app/login");
	Thread.sleep(5000);
	driver.findElement(By.linkText("New user?Signup")).click();
	
	WebElement statedropdwon=driver.findElement(By.id("state"));
	//Select select= new Select(statedropdown);
	
	
	WebElement username=driver.findElement(By.name("email1"));
	username.sendKeys("SapientTraining@gmail.com");
	driver.findElement(By.name("password1")).sendKeys("Abcd@1234");
	driver.findElement(By.className("submit-btn"));
	Assert.assertTrue(true);
	//String title=driver.getTitle();
	//System.out.println("Title is"+title);
	//String url=driver.getCurrentUrl();
	//System.out.println("URL IS"+url);
	//driver.quit();
	
	
	}

}
